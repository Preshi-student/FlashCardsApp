package com.example.flashcardsquizapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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
        val questions = intent.getStringExtra("questions") // Array of the questions
        val answers = intent.getBooleanArrayExtra("answers") // Array of boolean answers true/false

        val Review = StringBuilder()
        if (questions != null && questions != null&& answers.size == answers.size ) {
            for (i in questions.indices) {
                Review.append("${i+1}. ${questions[i]}\n")
                Review.append("  Answer: ${if  ( answers[i])     "True"  else "False"  }\n\n ")



            }


    }
}