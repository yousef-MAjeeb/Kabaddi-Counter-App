package com.example.kabaddicounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.kabaddicounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val viewModel: ScoresVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.viewModelVar = viewModel
        binding.lifecycleOwner = this

        //team A
//        viewModel.scoreA.observe(this, Observer { newValue ->
//            binding.tvTeamAScore.text = newValue.toString()
//        })

        binding.add1BtnA.setOnClickListener {
            viewModel.incrementScoreByOne(true)
        }

        binding.add2BtnA.setOnClickListener {
            viewModel.incrementScoreByTwo(true)
        }

        //team B
//        viewModel.scoreB.observe(this, Observer { newValue ->
//            binding.tvTeamBScore.text = newValue.toString()
//        })

        binding.add1BtnB.setOnClickListener {
            viewModel.incrementScoreByOne(false)

        }

        binding.add2BtnB.setOnClickListener {
            viewModel.incrementScoreByTwo(false)
        }

        //reset Button
        binding.resetBtn.setOnClickListener {
            viewModel.resetScore(true)
        }
    }
}