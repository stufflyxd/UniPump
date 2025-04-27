package com.example.unipump

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaExercicio1 : AppCompatActivity() {

    private lateinit var proximo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_tela_exercicio1)

        proximo = findViewById(R.id.btnProximo)

        onClickProx()
    }

    private fun onClickProx(){
        proximo.setOnClickListener {
            val intent = Intent(this, TelaExercicio2::class.java)
            startActivity(intent)
        }

    }
}