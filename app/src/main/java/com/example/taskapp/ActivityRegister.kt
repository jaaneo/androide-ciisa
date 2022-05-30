package com.example.taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActivityRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRecoveryBack = findViewById<Button>(R.id.activity_register_btn_back)
        btnRecoveryBack.setOnClickListener {
            //vuelvo a la pantalla main
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnRegister = findViewById<Button>(R.id.activity_register_btn_register)
        btnRegister.setOnClickListener {
            //agrego un mensaje popup de larga duración con mensaje para usuario
            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_LONG).show()
        }
    }

}