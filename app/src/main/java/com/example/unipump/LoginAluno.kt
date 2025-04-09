package com.example.unipump

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginAluno : AppCompatActivity() {

    private lateinit var btnVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("CicloDeVida", "LoginAluno - onCreate chamado")
        setContentView(R.layout.activity_login_aluno)

        // Inicializa a UI
        btnVoltar = findViewById(R.id.btnVoltar)

        // Configura eventos
        configurarEventos()
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloDeVida", "LoginAluno - onStart chamado")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CicloDeVida", "LoginAluno - onResume chamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CicloDeVida", "LoginAluno - onPause chamado")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CicloDeVida", "LoginAluno - onStop chamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloDeVida", "LoginAluno - onDestroy chamado")
    }

    private fun configurarEventos() {
        btnVoltar.setOnClickListener {
            val intent = Intent(this, TelaInicial::class.java)
            startActivity(intent)
        }
    }
}
