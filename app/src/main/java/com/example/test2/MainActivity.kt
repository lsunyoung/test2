package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val aaa = 1
    val bbb = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onButton1Clicked()

        findViewById<Button>(R.id.button).setOnClickListener {
            onButton1Clicked()
        }
    }

    public fun onButton1Clicked() {
        Toast.makeText(this, "버튼이 눌렸어요.",Toast.LENGTH_LONG).show()
    }

}