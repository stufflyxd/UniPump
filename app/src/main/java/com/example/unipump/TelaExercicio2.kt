package com.example.unipump

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaExercicio2 : AppCompatActivity() {

    private lateinit var proximo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_exercicio2)

        proximo = findViewById(R.id.btnProximo)
        onClickFinalizar()
    }


    private fun onClickFinalizar(){
        proximo.setOnClickListener {
            val intent = Intent(this, TelaExercicioFinalizado:: class.java)
            startActivity(intent)
        }
    }
}