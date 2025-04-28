package com.example.unipump

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaFichaTreino : AppCompatActivity() {

    private lateinit var bntComecar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_tela_ficha_treino)

        bntComecar = findViewById(R.id.buttonStart)

        onClickStart()
    }

    private fun onClickStart(){
        bntComecar.setOnClickListener {
            val intent = Intent(this, TelaExercicioFinalizado:: class.java)
            startActivity(intent)
        }
    }


}