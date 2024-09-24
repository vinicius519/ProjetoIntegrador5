package com.example.pi_ecomove

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.pi_ecomove.R.id.btnHistorico
import com.google.android.material.snackbar.Snackbar



class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnLogin.setOnClickListener {
            // Implementar a ação de login
            Snackbar.make(it, "Login clicado!", Snackbar.LENGTH_SHORT).show()
        }

        btnRegister.setOnClickListener {
            // Implementar a ação de registro
            Snackbar.make(it, "Cadastrar clicado!", Snackbar.LENGTH_SHORT).show()
        }

        val btnFazer = findViewById<Button>(R.id.btnFazer)
        val btnReceber = findViewById<Button>(R.id.btnReceber)
        val btnHistorico = findViewById<Button>(btnHistorico)

        btnFazer.setOnClickListener {
            Snackbar.make(it, "Fazer carona clicado!", Snackbar.LENGTH_SHORT).show()
        }

        btnReceber.setOnClickListener {
            Snackbar.make(it, "Receber carona clicado!", Snackbar.LENGTH_SHORT).show()
        }

        btnHistorico.setOnClickListener {
            Snackbar.make(it, "Histórico de caronas clicado!", Snackbar.LENGTH_SHORT).show()
        }
    }
}
