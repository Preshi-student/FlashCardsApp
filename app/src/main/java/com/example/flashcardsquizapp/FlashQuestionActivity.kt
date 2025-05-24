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

        val answers = booleanArrayOf(false, false, true, false, true)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flash_question)

        displayText = findViewById(R.id.displayText)
        True = findViewById(R.id.True)
        False = findViewById(R.id.False)
        Next = findViewById(R.id.next)
        Feedback = findViewById(R.id.Feedback)

        // The first question goes here
        displayText.text = questions[currentQuestionIndex]

        // Set the true and false buttons on click listeners
        True.setOnClickListener { check(true) }
        False.setOnClickListener { check(false) }

        // Set next button listener
        Next.setOnClickListener {
            if (currentQuestionIndex < questions.size - 1) {
                currentQuestionIndex++ // Move to next question
                displayText.text = questions[currentQuestionIndex]
                Feedback.text = "" // Clear previous feedback
            } else {
                val intent = Intent(this, ReviewActivity::class.java)
                intent.putExtra("questions", questions) // Pass questions array
                intent.putExtra("answers", answers) // Pass answers array
                intent.putExtra("score", score) // Send final score
                startActivity(intent)



                displayText.text = "Quiz completed! Your score: $score"
                True.isEnabled = false
                False.isEnabled = false
                Next.isEnabled = false
            }
        }
    }

    // Separate function outside onCreate()
    private fun check(userAnswer: Boolean) {
        val correctAnswer = answers[currentQuestionIndex]

        if (userAnswer == correctAnswer) {
            Feedback.text = "Correct!"
            score++
        } else {
            Feedback.text = "Incorrect!"
        }
    }
}













