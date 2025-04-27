package com.example.unipump

import android.content.ClipData.Item
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class TelaPrincipalAluno : AppCompatActivity() {

    private lateinit var visualizar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal_aluno)

        // 1. Acessar o BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)


        // 2. Visualizar

        visualizar = findViewById(R.id.btn_visualizar)

        onClickVisualizar()

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_inicio -> {
                    // Já está na tela de Início, talvez não precise fazer nada
                    true
                }

                R.id.nav_treinos -> {
                    // Ir para a tela de treinos
                    val intent = Intent(this, TelaTreinoAluno::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_config -> {
                    val intent = Intent(this, TelaConfig::class.java)
                    startActivity(intent)
                    true

                }

                R.id.nav_chat -> {
                    //
                    true
                }

                else -> {
                    false
                }
            }
        }
    }
    
    private fun onClickVisualizar(){
        visualizar.setOnClickListener {
            val intent = Intent(this, TelaFichaTreino:: class.java)
            startActivity(intent)
        }
    }
}