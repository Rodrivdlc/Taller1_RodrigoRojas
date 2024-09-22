package com.example.prueba

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.app.Activity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val saveButton: Button = findViewById(R.id.saveButton)
        val nameTextView: TextView = findViewById(R.id.nameTextView)
        val navigateButton: Button = findViewById(R.id.navigateButton)

        saveButton.setOnClickListener {
            val name = nameEditText.text.toString()
            nameTextView.text = name
        }

        navigateButton.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}