package com.ridhamsharma.relativelayout2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var tvNumber: TextView? = null
    var btnMinus: Button? = null
    var btnPlus: Button? = null
    var btnMult: Button? = null
    var btnDiv: Button? = null
    var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPlus = findViewById(R.id.btnPlus)
        btnMinus = findViewById(R.id.btnMinus)
        btnDiv = findViewById(R.id.btnDiv)
        btnMult = findViewById(R.id.btnMult)
        tvNumber = findViewById(R.id.tvNumber)
        btnPlus?.setOnClickListener {
            number += 2
            tvNumber?.setText(number.toString())

        }
        btnMinus?.setOnClickListener {
            number -= 2
            tvNumber?.setText(number.toString())
        }
        btnDiv?.setOnClickListener {
            number /= 2
            tvNumber?.setText(number.toString())
        }
        btnMult?.setOnClickListener {
            number *= 2
            tvNumber?.setText(number.toString())
        }
    }
}
