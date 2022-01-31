package com.egeperk.calculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun topla (view: View) {


            number1 = editText.text.toString().toIntOrNull()
            number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {

            textView.text = "Değer Giriniz!"

        } else {

            result = number1!! + number2!!
            textView.text = "$result"
        }


    }

    fun cikar (view: View) {

        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {

            textView.text = "Değer Giriniz!"

        } else {

            result = number1!! - number2!!
            textView.text = "$result"
        }
    }
    fun bol (view: View) {

        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {

            textView.text = "Değer Giriniz!"

        } else {

            result = number1!! / number2!!
            textView.text = "$result"
        }
    }
    fun carp (view: View) {

        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {

            textView.text = "Değer Giriniz!"

        } else {

            result = number1!! * number2!!
            textView.text = "$result"
        }
    }
}