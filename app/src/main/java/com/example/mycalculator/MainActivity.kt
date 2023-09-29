package com.example.mycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.mycalculator.models.Calculator

class MainActivity : AppCompatActivity() {

    lateinit var edtNum1: EditText
    lateinit var edtNum2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNum1 = findViewById(R.id.edtNum1)
        edtNum2 = findViewById(R.id.edtNum2)
    }

    fun buttonClick(v: View) {
        var ans = 0.0
        val calculator = Calculator (
            edtNum1.text.toString().toDouble(),
            edtNum2.text.toString().toDouble())

        when(v.id) {
            R.id.btnAdd -> ans = calculator.add()
            R.id.btnSub -> ans = calculator.substract()
            R.id.btnMul -> ans = calculator.multiply()
            R.id.btnDev -> ans = calculator.devide()
        }
        //println(ans)
        val intent = Intent(this, activity_display::class.java)
        intent.putExtra("answer", ans)
        startActivity(intent)
        finish()
    }
}

