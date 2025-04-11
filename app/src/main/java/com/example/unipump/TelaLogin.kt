package com.example.unipump

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class TelaLogin : AppCompatActivity() {

    private lateinit var btnVoltar: Button
    private lateinit var textEsqueceuSenha: TextView
    private lateinit var edtEmail: EditText
    private lateinit var edtSenha: EditText
    private lateinit var btnEntrar: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("CicloDeVida", "TelaLogin - onCreate chamado")
        setContentView(R.layout.activity_tela_login)

        // Inicializa os componentes da UI
        btnVoltar = findViewById(R.id.btnVoltar)
        textEsqueceuSenha = findViewById(R.id.tvEsqueceuSenha)
        edtEmail = findViewById(R.id.etEmail)
        edtSenha = findViewById(R.id.etSenha)
        btnEntrar = findViewById(R.id.btnEntrar)

        // Configura os eventos
        configurarEventos()

        // Ajustar o título de acordo com o tipo de usuário
        val tipo = intent.getStringExtra("tipo")
        if (tipo == "aluno") {
            // Caso seja aluno, manter o padrão de login com email
            edtEmail.hint = "Digite seu e-mail"
        } else if (tipo == "funcionario") {
            // Caso seja funcionário, mudar o hint para ID
            edtEmail.hint = "Digite seu ID"
        }
    }

    private fun configurarEventos() {
        btnVoltar.setOnClickListener {
            val intent = Intent(this, TelaInicial::class.java)
            startActivity(intent)
        }

        textEsqueceuSenha.setOnClickListener {
            val intent = Intent(this, TelaEsqueceuSenha::class.java)
            startActivity(intent)
        }

        // Evento do botão de login
        btnEntrar.setOnClickListener {
            onEntrarClick()
        }
    }

    // Função de login
    private fun onEntrarClick() {
        val usuario = edtEmail.text.toString()
        val senha = edtSenha.text.toString()

        // Verifica se os campos não estão vazios
        if (usuario.isNotEmpty() && senha.isNotEmpty()) {
            // Lógica para autenticação (Exemplo com credenciais fixas)
            if (usuario == "aluno@exemplo.com" && senha == "12345") {
                // Redireciona para a tela do aluno
                val intent = Intent(this, TelaAluno::class.java)
                startActivity(intent)
            } else if (usuario == "funcionario123" && senha == "12345") {
                // Redireciona para a tela do funcionário
                val intent = Intent(this, TelaFuncionario::class.java)
                startActivity(intent)
            } else {
                // Mensagem de erro (pode ser exibido um Toast ou Log)
                Log.d("Login", "Usuário ou senha inválidos.")
            }
        } else {
            // Mensagem de erro caso os campos estejam vazios
            Log.d("Login", "Por favor, preencha todos os campos.")
        }
    }

    // Ciclo de vida da Activity
    override fun onStart() {
        super.onStart()
        Log.d("CicloDeVida", "TelaLogin - onStart chamado")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CicloDeVida", "TelaLogin - onResume chamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CicloDeVida", "TelaLogin - onPause chamado")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CicloDeVida", "TelaLogin - onStop chamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloDeVida", "TelaLogin - onDestroy chamado")
    }
}
