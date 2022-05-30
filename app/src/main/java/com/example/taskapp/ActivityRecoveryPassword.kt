package com.example.taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ActivityRecoveryPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery_password)

        val btnRecoveryPassword = findViewById<Button>(R.id.activity_recovery_password_btn_recovery)
        btnRecoveryPassword.setOnClickListener {
            //agrego un mensaje popup de larga duración con mensaje para usuario
            Toast.makeText(this, "Revisa tu casilla de correo", Toast.LENGTH_LONG).show()
        }

        val btnRecoveryBack = findViewById<Button>(R.id.activity_recovery_password_btn_back)
        btnRecoveryBack.setOnClickListener {
            //vuelvo a la pantalla main
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}