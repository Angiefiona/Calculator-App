package com.example.simplecalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import com.example.calculatorapp.R


class MainActivity : AppCompatActivity() {
    var etNum1: EditText? = null
    var etNum2: EditText? = null
    var btnadd: Button? = null
    var btnsubs: Button? = null
    var btnmultiply: Button? = null
    var btndivide: Button? = null
    var num1: Double? = null
    var num2: Double? = null
    var tvresult: TextView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNum1= findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        btnadd = findViewById(R.id.btnadd)
        btndivide = findViewById(R.id.btndivide)
        btnmultiply = findViewById(R.id.btnmultiply)
        btnsubs = findViewById(R.id.btnsubtract)
        tvresult = findViewById(R.id.tvresult)
        Clicklistener()
    }

    fun Clicklistener() {
        btnadd!!.setOnClickListener {
            num1 = etNum1!!.text.toString().toDouble()
            num2 = etNum2!!.text.toString().toDouble()
            val result = num1!! + num2!!
            tvresult!!.text = result.toString()
        }
        btnsubs!!.setOnClickListener {
            num1 = etNum1!!.text.toString().toDouble()
            num2 = etNum2!!.text.toString().toDouble()
            val result = num1!! - num2!!
            tvresult!!.text = result.toString()
        }
        btnmultiply!!.setOnClickListener {
            num1 = etNum1!!.text.toString().toDouble()
            num2 = etNum2!!.text.toString().toDouble()
            val result = num1!! * num2!!
            tvresult!!.text = result.toString()
        }
        btndivide!!.setOnClickListener {
            num1 = etNum1!!.text.toString().toDouble()
            num2 = etNum2!!.text.toString().toDouble()
            val result = num1!! / num2!!
            tvresult!!.text = result.toString()
        }
    }
}