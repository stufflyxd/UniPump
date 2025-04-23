package com.example.unipump

import android.content.Intent
import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class TelaFuncionario : AppCompatActivity() {

    private lateinit var gridLayout: GridLayout
    private lateinit var btnNavegacao : BottomNavigationView
    private lateinit var btnNotificacao : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_funcionario)

        btnNavegacao = findViewById(R.id.bottom_navigation)
        gridLayout = findViewById(R.id.gridLayoutListaAlunos)
        btnNotificacao = findViewById(R.id.btn_notificacao)

        configurarEventos()

    }

    fun configurarEventos(){
        for (i in 0 until gridLayout.childCount) {
            val child = gridLayout.getChildAt(i)
            child.setOnClickListener {
                val intent = Intent(this, GerenciamentoDoAluno_Funcionario::class.java)
                intent.putExtra("user_id", i) // Passando o ID do usuário como exemplo
                startActivity(intent)
            }

        }

        btnNotificacao.setOnClickListener {
            val intent = Intent(this, TelaNotificacao_funcionario::class.java)
            startActivity(intent)
        }


        btnNavegacao.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_inicio -> {
                    // O que acontece quando o item "Início" é clicado (permanece na tela atual)
                    true
                }

                R.id.nav_chat -> {
                    // Abre a tela de chat
                    val intent = Intent(this, TelaChat_funcionario::class.java)
                    startActivity(intent)
                    true
                }

                R.id.nav_config -> {
                    // Abre a tela de configurações
                    val intent = Intent(this, TelaConfiguracao_funcionario::class.java)
                    startActivity(intent)
                    true
                }

                else -> false
            }
        }
    }


}