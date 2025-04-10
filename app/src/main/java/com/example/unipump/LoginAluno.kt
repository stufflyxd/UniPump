package com.example.unipump

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginAluno : AppCompatActivity() {

    private lateinit var btnVoltar: Button
    private lateinit var text_esqueceu_senha: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("CicloDeVida", "LoginAluno - onCreate chamado")
        setContentView(R.layout.activity_login_aluno)

        // Inicializa a UI
        btnVoltar = findViewById(R.id.btnVoltar)
        text_esqueceu_senha = findViewById(R.id.tvEsqueceuSenha)

        // Configura eventos
        configurarEventos()
    }

    private fun configurarEventos() {
        btnVoltar.setOnClickListener {
            val intent = Intent(this, TelaInicial::class.java)
            startActivity(intent)
        }

        // Evento de clique para o texto "Esqueceu sua senha?"
        text_esqueceu_senha.setOnClickListener {
            val intent = Intent(this, TelaEsqueceuSenha::class.java)
            startActivity(intent)
        }
    }

    // Ciclo de vida da Activity
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
}
