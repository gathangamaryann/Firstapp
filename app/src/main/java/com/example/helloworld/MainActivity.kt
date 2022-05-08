package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnPayment:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPayment = findViewById(R.id.btnPayment)
        btnPayment.setOnClickListener {
            val intent = Intent(this,SENDMONEY::class.java)
            startActivity(intent)
        }

        }

    }
