package com.example.taskapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class ActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tilEmail = findViewById<TextInputLayout>(R.id.activity_login_til_email)
        val tilPassword = findViewById<TextInputLayout>(R.id.activity_login_til_password)
        val btnLogin = findViewById<Button>(R.id.activity_login_btn_login)

        btnLogin.setOnClickListener {
            val email = tilEmail.editText?.text
            val password = tilPassword.editText?.text
          //  Toast.makeText(this, "The email: $email, the Password: $password", Toast.LENGTH_LONG).show()

            if (email.isNullOrEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches() ){
                tilEmail.error = "El dato es inválido"
            } else{
                tilEmail.error = null
                tilEmail.isErrorEnabled = false
            }
        }

    }
}