package com.example.unipump

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaEdicaoFichaTreino_funcionario : AppCompatActivity() {

    lateinit var btnSetaVoltar : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_edicao_ficha_treino_funcionario)


        btnSetaVoltar = findViewById(R.id.SetaVoltarTelaEdicaoFicha)

        configurarEventos()

    }

    fun configurarEventos() {

        // Definindo o clique do botão de voltar
        btnSetaVoltar.setOnClickListener {
            onBackPressed() // Isso chama o comportamento de voltar para a tela anterior
        }


    }
}