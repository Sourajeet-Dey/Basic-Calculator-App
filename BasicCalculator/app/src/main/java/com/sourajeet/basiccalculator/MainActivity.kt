package com.sourajeet.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var button_0 : Button
    lateinit var button_1 : Button
    lateinit var button_2 : Button
    lateinit var button_3 : Button
    lateinit var button_4 : Button
    lateinit var button_5 : Button
    lateinit var button_6 : Button
    lateinit var button_7 : Button
    lateinit var button_8 : Button
    lateinit var button_9 : Button
    lateinit var button_point : Button
    lateinit var button_add : Button
    lateinit var button_subtract : Button
    lateinit var button_multiply : Button
    lateinit var button_divide : Button
    lateinit var button_modulo : Button
    lateinit var button_intdivide : Button
    lateinit var button_equal : Button
    lateinit var button_clear : Button
    lateinit var button_back : Button
    lateinit var text_question : TextView
    lateinit var text_answer : TextView

    var isAdd : Boolean = false
    var isSubtract : Boolean = false
    var isMultiply : Boolean = false
    var isDivide : Boolean = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_0 = findViewById(R.id.button_0)
        button_1 = findViewById(R.id.button_1)
        button_2 = findViewById(R.id.button_2)
        button_3 = findViewById(R.id.button_3)
        button_4 = findViewById(R.id.button_4)
        button_5 = findViewById(R.id.button_5)
        button_6 = findViewById(R.id.button_6)
        button_7 = findViewById(R.id.button_7)
        button_8 = findViewById(R.id.button_8)
        button_9 = findViewById(R.id.button_9)
        button_point = findViewById(R.id.button_point)
        button_add = findViewById(R.id.button_add)
        button_subtract = findViewById(R.id.button_subtract)
        button_multiply = findViewById(R.id.button_multiply)
        button_divide = findViewById(R.id.button_divide)
        button_modulo = findViewById(R.id.button_modulo)
        button_intdivide = findViewById(R.id.button_intdivide)
        button_equal = findViewById(R.id.button_equal)
        button_clear = findViewById(R.id.button_clear)
        button_back = findViewById(R.id.button_back)

        text_question = findViewById(R.id.text_question)
        text_answer = findViewById(R.id.text_answer)




    }
    fun appendText(view : View){
        var btn = view as Button
        var text_answer = findViewById<TextView>(R.id.text_answer)
        var question : String = text_answer.text.toString()
        when(btn.id){
            button_0.id -> question+="0"
            button_1.id -> question+="1"
            button_2.id -> question+="2"
            button_3.id -> question+="3"
            button_4.id -> question+="4"
            button_5.id -> question+="5"
            button_6.id -> question+="6"
            button_7.id -> question+="7"
            button_8.id -> question+="8"
            button_9.id -> question+="9"
            button_point.id -> question+="."
        }
        text_answer.setText(question)
    }

    fun operations(view: View){
        var btn = view as Button
        var text_answer = findViewById<TextView>(R.id.text_answer)
        var text_question = findViewById<TextView>(R.id.text_question)
        var question : String = text_question.text.toString()+text_answer.text.toString()

        when(btn.id){
            button_add.id -> isAdd = true
            button_subtract.id -> isSubtract = true
            button_multiply.id -> isMultiply = true
            button_divide.id -> isDivide = true
        }
        if(isAdd){
            text_question.setText(question+"+")
            text_answer.setText("")
            isAdd = false
        }
        else if(isSubtract){
            text_question.setText(question+"-")
            text_answer.setText("")
            isSubtract = false
        }
        else if(isMultiply){
            text_question.setText(question+"*")
            text_answer.setText("")
            isMultiply = false
        }
        else if(isDivide){
            text_question.setText(question+"/")
            text_answer.setText("")
            isDivide = false
        }
    }


}