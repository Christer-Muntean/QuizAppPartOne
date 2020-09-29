package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var questionsList = listOf(
        "How big is an elephant?",
        "Who is CEO of Tesla?",
        "Who is the girlfriend of Mikkey Mouse?"
    )

    val optionOne = listOf(
        "4",
        "Elon Musk",
        "Minnie mouse"
    )

    val optionTwo = listOf(
        "3",
        "Elton John",
        "Donald Duck"
    )

    var answersList = listOf(
        "3",
        "Elon Musk",
        "Minnie Mouse"
    )

    var currentQuestion = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        question_textView.text = questionsList[currentQuestion]
        alternative_one_textView.text = "Alternative A: ${optionOne[currentQuestion]}"
        alternative_two_textView.text = "Alternative B: ${optionTwo[currentQuestion]}"

        answer_button.setOnClickListener {

            if(answer_editText.text.toString().toLowerCase() == answersList[currentQuestion].toLowerCase()){
                status_textView.text = "Correct!"

                if(currentQuestion < questionsList.size - 1){
                    currentQuestion++

                    question_textView.text = questionsList[currentQuestion]
                    alternative_one_textView.text = "Alternative A: ${optionOne[currentQuestion]}"
                    alternative_two_textView.text = "Alternative B: ${optionTwo[currentQuestion]}"
                }

            }else {
                status_textView.text = "Wrong Answer :("
            }
        }

    }
}