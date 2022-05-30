package com.example.taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvToRecoveryPassword = findViewById<TextView>(R.id.activity_login_tv_recovery_password)

        tvToRecoveryPassword.setOnClickListener {
            val intent = Intent(this, ActivityRecoveryPassword::class.java)
            startActivity(intent)
        }

        val btnRegister = findViewById<Button>(R.id.activity_login_btn_register)
        btnRegister.setOnClickListener {
            //Me lleva a la ActivityRegister
            val intent = Intent(this, ActivityRegister::class.java)
            startActivity(intent)
        }
    }
}