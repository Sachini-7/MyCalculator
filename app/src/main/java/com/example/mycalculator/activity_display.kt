package com.example.mycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class activity_display : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val txtAnswer = findViewById<TextView>(R.id.ansTitle)
        val btnBack = findViewById<Button>(R.id.back)

        val answer = intent.getDoubleExtra("answer", 0.0)
        txtAnswer.text = answer.toString()

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}