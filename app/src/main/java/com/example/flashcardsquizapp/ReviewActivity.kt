package com.example.flashcardsquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge
import kotlin.system.exitProcess

class ReviewActivity : AppCompatActivity() {
    private lateinit var Review: TextView
    private lateinit var Restart: Button
    private lateinit var Exit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_review)

        // Input UI Elements here
        Review = findViewById(R.id.Review)
        Restart = findViewById(R.id.Restart)
        Exit = findViewById(R.id.Exit)

        // Fetch questions and answers from the Scorescreen
        val questions = intent.getStringArrayExtra("questions") // Array of the questions
        val answers = intent.getBooleanArrayExtra("answers")    // Array of boolean answers true/false

        if (questions != null && answers != null && questions.size == answers.size) {
            val reviewBuilder = StringBuilder()
            for (i in questions.indices) {
                // Parallel arrays of questions and answers
                reviewBuilder.append("${i + 1}. ${questions[i]}\n")
                reviewBuilder.append("  Answer: ${if (answers[i]) "True" else "False"}\n\n")
            }
            Review.text = reviewBuilder.toString()
        }else{
            Review.text = "There was an error that occured when trying to load the review data"

        }
        // Set restart button on click listener
        Restart.setOnClickListener{
            // Link to the previous Flashquestions screen
            val intent = Intent(this,FlashQuestionActivity::class.java)
            startActivity(intent)
        }
        Exit.setOnClickListener{
            finish()
            exitProcess(0)   // Close the app
        }
    }
}
