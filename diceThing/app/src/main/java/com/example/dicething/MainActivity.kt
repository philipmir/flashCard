package com.example.dicething


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var nameEditText : EditText
    lateinit var greetingView : TextView





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        nameEditText = findViewById(R.id.nameEditText)
        greetingView = findViewById(R.id.greetingTextView)

        greetingView.text = "Hej David"

        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val name = getNameFromEditText()
            setGreeting(name)
        }



    }

    fun getNameFromEditText() : String {
        val name = nameEditText.text.toString()
        return name
    }
    fun setGreeting(name : String) {
        greetingView.text = "Hej $name, välkommen!"
    }


}