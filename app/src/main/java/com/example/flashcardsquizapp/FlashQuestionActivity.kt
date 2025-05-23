package com.example.flashcardsquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class FlashQuestionActivity : AppCompatActivity() {
    private lateinit var displayText: TextView
    private lateinit var True: Button
    private lateinit var False: Button
    private lateinit var Next: Button
    private lateinit var Feedback: TextView

    private var currentQuestionIndex = 0
    private var score = 0


    companion object {
        val questions = arrayOf(
            "Hitler was the emperor of Germany in 1914",
            "The Nazis were falsely accused of using propaganda to shape a public opinion",
            "Nelson Mandela was arrested for 27 years",
            "Mahatma Gandhi was no freedom fighter, he was just touring South Africa",
            "Kaiser Wilhelm II ruled Germany in 1888"

        )

        val answers = booleanArrayOf(true, false, true, false, true)


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flash_question)

        // Input UI Elements here
        displayText = findViewById(R.id.displayText)
        True = findViewById(R.id.True)
        False = findViewById(R.id.False)
        Next = findViewById(R.id.next)
        Feedback = findViewById(R.id.Feedback)

        // The first question comes here
        displayText.text = questions[currentQuestionIndex]

        // Set the true and false buttons on click listeners
        True.setOnClickListener { check(true) }
        False.setOnClickListener { check(false) }

        // Set the next button on click listener
        Next.setOnClickListener {
            if (currentQuestionIndex < questions.size - 1) {
                currentQuestionIndex++
                displayText.text = questions[currentQuestionIndex]


            } else {
                // Link to the score screen
                val intent = Intent(this, ScoreScreenActivity::class.java)
                startActivity(intent)
                finish()   // Close the screen after this is done
            }
        }
    }

    private fun check(userAnswer: Boolean) {
        val correctionInfo = answers[currentQuestionIndex]

        if (userAnswer == correctionInfo)
            Feedback.text = "Correct!"
        else
            Feedback.text = "Incorrect!"
        score++


    }
}



















