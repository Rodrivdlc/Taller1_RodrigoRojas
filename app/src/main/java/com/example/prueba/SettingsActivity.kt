package com.example.prueba

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.app.Activity
import androidx.core.content.ContextCompat

class SettingsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val redRadioButton: RadioButton = findViewById(R.id.redRadioButton)
        val blueRadioButton: RadioButton = findViewById(R.id.blueRadioButton)
        val greenRadioButton: RadioButton = findViewById(R.id.greenRadioButton)
        val backButton: Button = findViewById(R.id.backButton)

        redRadioButton.setOnClickListener { setBackgroundColor(R.color.red) }
        blueRadioButton.setOnClickListener { setBackgroundColor(R.color.blue) }
        greenRadioButton.setOnClickListener { setBackgroundColor(R.color.green) }

        backButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setBackgroundColor(colorResId: Int) {
        val rootView = findViewById<View>(android.R.id.content)
        rootView.setBackgroundColor(ContextCompat.getColor(this, colorResId))
    }
}
