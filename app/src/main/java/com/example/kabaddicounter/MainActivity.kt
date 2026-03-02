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
import com.example.kabaddicounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val viewModel: ScoresVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //team A
//        binding.tvTeamAScore.text = viewModel.scoreA.toString()

        binding.add1BtnA.setOnClickListener {
            viewModel.incrementScoreByOne(true)
            binding.tvTeamAScore.text = viewModel.scoreA.toString()
        }

        binding.add2BtnA.setOnClickListener {
            viewModel.incrementScoreByTwo(true)
            binding.tvTeamAScore.text = viewModel.scoreA.toString()
        }

        //team B
//        binding.tvTeamBScore.text = viewModel.scoreB.toString()

        binding.add1BtnB.setOnClickListener {
            viewModel.incrementScoreByOne(false)
            binding.tvTeamBScore.text = viewModel.scoreB.toString()

        }

        binding.add2BtnB.setOnClickListener {
            viewModel.incrementScoreByTwo(false)
            binding.tvTeamBScore.text = viewModel.scoreB.toString()

        }

        val resetBtn: Button = findViewById(R.id.resetBtn)
        resetBtn.setOnClickListener {
            viewModel.resetScore(true)
            binding.tvTeamBScore.text = viewModel.scoreB.toString()
            binding.tvTeamBScore.text = viewModel.scoreB.toString()
        }
    }
}