package com.example.resourcesintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var greetingView : TextView
    val name = "David"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingView = findViewById(R.id.textView)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            handleButtonPress()
        }
    }

    fun handleButtonPress() {
        //greetingView.text = "Bra tryckt $name! "
        greetingView.text = getString(R.string.button_pressed_text, name)
    }


}