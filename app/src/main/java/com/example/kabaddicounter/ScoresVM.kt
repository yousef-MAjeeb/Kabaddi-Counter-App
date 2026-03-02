package com.example.kabaddicounter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoresVM: ViewModel() {
    private var _scoreA = MutableLiveData<Int>(0)
    private var _scoreB = MutableLiveData<Int>(0)

    val scoreA: LiveData<Int>
        get() = _scoreA
    val scoreB: LiveData<Int>
        get() =_scoreB

    fun incrementScoreByOne(isTeamA: Boolean){
        if (isTeamA)
            _scoreA.value = _scoreA.value?.plus(1)
        else
            _scoreB.value = _scoreB.value?.plus(1)
    }
    fun incrementScoreByTwo(isTeamA: Boolean){
        if (isTeamA)
            _scoreA.value = _scoreA.value?.plus(2)

        else
            _scoreB.value = _scoreB.value?.plus(2)
    }
    fun resetScore(isReset: Boolean){
        if (isReset){
            _scoreA.value = 0
            _scoreB.value = 0
        }
    }
}