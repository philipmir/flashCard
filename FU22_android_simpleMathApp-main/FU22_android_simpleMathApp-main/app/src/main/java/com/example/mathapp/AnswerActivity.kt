package com.example.mathapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class AnswerActivity : AppCompatActivity() {

    lateinit var resultView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        resultView = findViewById(R.id.answerView)

        //plocka ut den information som vi la in i intentet
        val answeredCorrect = intent.getBooleanExtra("answeredCorrect", false)
        Log.d("!!!", "Rätt? $answeredCorrect")

        if (answeredCorrect) {
            resultView.text = "Rätt!!"
        } else {
            resultView.text = "Fel!!"
        }
    }
}