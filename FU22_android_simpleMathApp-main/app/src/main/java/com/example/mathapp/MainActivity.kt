package com.example.mathapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var questionTextView : TextView
    lateinit var answerView : EditText

    var firstNumber = 0
    var secondNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionTextView = findViewById(R.id.textView)
        answerView = findViewById(R.id.answerEditText)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            checkAnswerAndStartAnswerActivity()
        }

        setNewQuestion()
    }

    override fun onResume() {
        super.onResume()

        answerView.setText("")
        setNewQuestion()
    }


    fun checkAnswerAndStartAnswerActivity() {
        val answerText = answerView.text.toString()
        val answer = answerText.toIntOrNull()
        val correctAnswer = firstNumber + secondNumber

        var answeredCorrect = false
        if(answer == correctAnswer) {
            answeredCorrect = true
        }

        // skapa ett intent-objekt, i detta objekt skickar vi in vilken klass
        // vår nya aktivitet är av
        val intent = Intent(this, AnswerActivity::class.java)

        //lägg in extra information i intentet
        intent.putExtra("answeredCorrect", answeredCorrect)

        // starta den nya aktivteten med hjälp av intetntet
        startActivity(intent)
    }



    fun setNewQuestion() {
        firstNumber = (1..10).random()
        secondNumber = (1..10).random()

        questionTextView.text = "$firstNumber + $secondNumber"

    }


}