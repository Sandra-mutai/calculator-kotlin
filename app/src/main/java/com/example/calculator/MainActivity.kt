package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etnum1 = findViewById<EditText>(R.id.etnum1)
        val etnum2 = findViewById<EditText>(R.id.etnum2)
        val btnplus = findViewById<TextView>(R.id.btnplus)
        val btnminus = findViewById<TextView>(R.id.btnminus)
        val btnply = findViewById<TextView>(R.id.btnply)
        val btndiv = findViewById<TextView>(R.id.btndiv)
        val btnmod = findViewById<TextView>(R.id.btnmod)
        val tvAnswer = findViewById<TextView>(R.id.tvAnswer)
        btnplus.setOnClickListener {
            if (etnum1.text.toString() == ""){
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            }
            else if (etnum2.text.toString() == ""){
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            }
            else {
                val num1 = etnum1.text.toString().toInt()
                val num2 = etnum2.text.toString().toInt()
                val plusAnswer = num1 + num2
                tvAnswer.text = "answer:${plusAnswer}"

            }
        }
        btnminus.setOnClickListener {
            if (etnum1.text.toString() == "" ){
                Toast.makeText(baseContext, "Enter a number".toString(), Toast.LENGTH_LONG).show()
            }
            else if (etnum2.text.toString() == ""){
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
                }
            else {
                var num1 = etnum1.text.toString().toInt()
                var num2 = etnum2.text.toString().toInt()
                var minusAnswer = num1 - num2
                tvAnswer.text = "Total:${minusAnswer}"
    }
}
        btnply.setOnClickListener {
            if (etnum1.text.toString() == ""){
                Toast.makeText(baseContext, "Enter a number".toString(), Toast.LENGTH_LONG).show()
            }
            else if (etnum2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            }
            else {
                var num1 = etnum1.text.toString().toInt()
                var num2 = etnum2.text.toString().toInt()
                var plyAnswer = num1 * num2
                tvAnswer.text = "Answer:${plyAnswer}"
            }
        }
        btndiv.setOnClickListener {
            if (etnum1.text.toString() == "" ){
                Toast.makeText(baseContext, "Enter a number".toString(), Toast.LENGTH_LONG).show()
            }
            else if (etnum2.text.toString() == ""){
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
                }
            else {
                var num1 = etnum1.text.toString().toInt()
                var num2 = etnum2.text.toString().toInt()
                var divAnswer = num1 / num2
                tvAnswer.text = "Answer:${divAnswer}"

            }
        }
        btnmod.setOnClickListener {
            if (etnum1.text.toString() == ""){
                Toast.makeText(baseContext, "Enter a number".toString(), Toast.LENGTH_LONG).show()
            }
            else if (etnum2.text.toString() == ""){
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
                }

            else {
                var num1 = etnum1.text.toString().toInt()
                var num2 = etnum2.text.toString().toInt()
                var modAnswer = num1 % num2
                tvAnswer.text = "Answer:${modAnswer}"
            }
        }
        }}







