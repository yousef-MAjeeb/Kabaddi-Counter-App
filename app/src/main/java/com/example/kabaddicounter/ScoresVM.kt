package com.example.kabaddicounter

import androidx.lifecycle.ViewModel

class ScoresVM: ViewModel() {
    var scoreA = 0
    var scoreB = 0

    fun incrementScoreByOne(isTeamA: Boolean){
        if (isTeamA)
            scoreA++
        else
            scoreB++
    }
    fun incrementScoreByTwo(isTeamA: Boolean){
        if (isTeamA)
            scoreA += 2
        else
            scoreB += 2
    }
    fun resetScore(isReset: Boolean){
        if (isReset){
            scoreA = 0
            scoreB = 0
        }
    }
}