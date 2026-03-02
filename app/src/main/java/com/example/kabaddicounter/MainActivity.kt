package com.example.kabaddicounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kabaddicounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val viewModel: ScoresVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //team A
        val scoreA: TextView = findViewById(R.id.tvTeamAScore)
        val addOneBtnA: Button = findViewById(R.id.add1BtnA)
        val addTwoBtnA: Button = findViewById(R.id.add2BtnA)
        scoreA.text = "0"
        addOneBtnA.setOnClickListener {
            viewModel.incrementScoreByOne(true)
            scoreA.text = viewModel.scoreA.toString()
        }
        addTwoBtnA.setOnClickListener {
            viewModel.incrementScoreByTwo(true)
            scoreA.text = viewModel.scoreA.toString()
        }

        //team B
        val scoreB: TextView = findViewById(R.id.tvTeamBScore)
        val addOneBtnB: Button = findViewById(R.id.add1BtnB)
        val addTwoBtnB: Button = findViewById(R.id.add2BtnB)
        scoreB.text = "0"
        addOneBtnB.setOnClickListener {
            viewModel.incrementScoreByOne(false)
            scoreB.text = viewModel.scoreB.toString()
        }
        addTwoBtnB.setOnClickListener {
            viewModel.incrementScoreByTwo(false)
            scoreB.text = viewModel.scoreB.toString()
        }

        val resetBtn: Button = findViewById(R.id.resetBtn)
        resetBtn.setOnClickListener {
            viewModel.resetScore(true)
            scoreA.text = "0"
            scoreB.text = "0"
        }
    }
}