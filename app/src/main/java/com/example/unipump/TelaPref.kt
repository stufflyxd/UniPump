package com.example.unipump

import android.os.Bundle
import android.widget.ImageView
import android.widget.ImageButton
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TelaPref : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_pref)

        val backButton: ImageView = findViewById(R.id.back_button)
        val languageOption: TextView = findViewById(R.id.language_option)
        val themeSwitch: Switch = findViewById(R.id.theme_switch)
        val aboutOption: TextView = findViewById(R.id.about_option)
        val clearCacheOption: TextView = findViewById(R.id.clear_cache_option)

        // Botao voltar
        backButton.setOnClickListener {
            finish()
        }

        // Idioma
        languageOption.setOnClickListener {
            Toast.makeText(this, "Idioma selecionado", Toast.LENGTH_SHORT).show()
            // abrir uma de selecionar o idioma
        }

        // Switch tema
        themeSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Tema Escuro ativado", Toast.LENGTH_SHORT).show()
                // alterar tema escuro
            } else {
                Toast.makeText(this, "Tema Claro ativado", Toast.LENGTH_SHORT).show()
                // tema claro
            }
        }

        // sobre
        aboutOption.setOnClickListener {
            // abrir tela de sobre o app
        }

        // limpar cache
        clearCacheOption.setOnClickListener {
            Toast.makeText(this, "Cache limpo", Toast.LENGTH_SHORT).show()
            // implementar a limpeza do cache
        }
    }
}