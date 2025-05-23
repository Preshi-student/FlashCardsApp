package com.example.flashcardsquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class ScoreScreenActivity : AppCompatActivity() {
    private lateinit var scoreTxt: TextView
    private lateinit var reviewBtn: Button
    private lateinit var exitBtn: Button
    private lateinit var feedback: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score_screen2)

        // Input UI Elements here
        scoreTxt = findViewById(R.id.scoreTxt)
        reviewBtn = findViewById(R.id.reviewBtn)
        exitBtn = findViewById(R.id.exitBtn)
        feedback = findViewById(R.id.feedBack)

        val score = intent.getIntExtra("score",0)
        scoreTxt.text = "Your score: $score/S"

        val feedbackTxt = if (score >=3) {   // If user got more than 3 questions right then
            "Welldone!"                      // he/she did well
        } else {
            "Don't give up! Try till you get it right!" // If the user got 3 or less questions right
                                                     // Encourage them to do better

        }
        feedback.text = feedbackTxt

        // Set the review button here on click listener
        reviewBtn.setOnClickListener{
            // Link to the ReviewActivity screen
            val intent = Intent(this,ReviewActivity::class.java)
            // Getting questions from the FlashQuestionActivity screen
            intent.putExtra("questions",FlashQuestionActivity.questions)
            // Getting answers from the FlashQuestionActivity screen
            intent.putExtra("questions", FlashQuestionActivity.answers)
            startActivity(intent)



        }
        exitBtn.setOnClickListener{
            finish() // This particular activity can be stopped
            exitProcess(0)
        }





    }
}