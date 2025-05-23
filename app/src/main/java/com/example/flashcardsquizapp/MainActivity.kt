package com.example.flashcardsquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var displayTxt: TextView
    private lateinit var startBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // Input UI Elements here
        displayTxt = findViewById(R.id.displayTxt)
        startBtn = findViewById(R.id.startBtn)

        // Set the starting button on click listener
        startBtn.setOnClickListener {

            // Link going to the next screen
            val intent = Intent(this,FlashQuestionActivity::class.java)
            startActivity(intent)





        }


    }
}