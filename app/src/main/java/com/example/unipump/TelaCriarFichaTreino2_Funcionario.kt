package com.example.unipump

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaCriarFichaTreino2_Funcionario : AppCompatActivity() {

    lateinit var btnSetaVoltar: ImageButton

    lateinit var textLetraFicha: TextView
    lateinit var textNomeFicha: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_criar_ficha_treino2_funcionario)

        btnSetaVoltar = findViewById(R.id.SetaVoltarTelaCriarFicha2)

        textLetraFicha = findViewById(R.id.letraFicha)
        textNomeFicha = findViewById(R.id.nomeFicha)


        configurarEventos()

        val tipoFicha = intent.getStringExtra("ficha")
        val nomeFicha = intent.getStringExtra("nomeFicha")

        when (tipoFicha) {
            "A" -> textLetraFicha.text = "A" // Se for A, exibe A
            "B" -> textLetraFicha.text = "B"  // Se for B, exibe B
        }

        // Atualiza o TextView nomeFicha com o nome recebido da Intent
        textNomeFicha.text = nomeFicha

    }



    fun configurarEventos() {
        // Definindo o clique do botão de voltar
        btnSetaVoltar.setOnClickListener {
            onBackPressed() // Isso chama o comportamento de voltar para a tela anterior
        }
    }



}