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

        Button()
    }
    fun Button() {
        findViewById<Button>(R.id.button).setOnClickListener {
            showToast()
        }
    }
    fun showToast() {
        val toast = Toast.makeText(this, "토스트는 이삭이지!",Toast.LENGTH_SHORT)
        toast.show()
    }

}