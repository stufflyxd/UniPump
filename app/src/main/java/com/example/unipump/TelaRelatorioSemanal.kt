package com.example.unipump

import android.content.Intent
import android.os.Bundle
import android.widget.CalendarView
import android.widget.ListView
import android.widget.ArrayAdapter // <-- Adiciona essa linha aqui!!
import android.widget.ImageButton

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView


class TelaRelatorioSemanal : AppCompatActivity() {
    private lateinit var voltar: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_tela_relatorio_semanal)


        val voltar = findViewById<ImageButton>(R.id.SetaVoltarTelaCriarFicha)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        val calendarView = findViewById<CalendarView>(R.id.calendar_view)

        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            val selectedDate = "$dayOfMonth/${month + 1}/$year"

        }

        configEventos()

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_inicio -> {
                    val intent = Intent(this, TelaPrincipalAluno::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_treinos -> {
                    val intent = Intent(this, TelaTreinoAluno::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_config -> {
                    val intent = Intent(this, TelaConfig:: class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_chat -> {
                    // val intent = Intent(this, )
                    true
                }
                else -> false
            }
        }
    }

    fun configEventos(){
        voltar.setOnClickListener{
            val intent = Intent(this, TelaPrincipalAluno::class.java)
            startActivity(intent)
        }
    }






}
