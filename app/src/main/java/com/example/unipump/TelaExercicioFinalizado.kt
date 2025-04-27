package com.example.unipump

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaExercicioFinalizado : AppCompatActivity() {
    private lateinit var finalizar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_exercicio_finalizado)

        finalizar = findViewById(R.id.btnFinalizar)

        onClickFinalizar()
    }

    private fun onClickFinalizar(){

        finalizar.setOnClickListener {
            val intent = Intent(this, TelaTreinoAluno:: class.java)
            startActivity(intent)
        }

    }
}