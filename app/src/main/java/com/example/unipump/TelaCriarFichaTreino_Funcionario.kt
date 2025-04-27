package com.example.unipump

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class TelaCriarFichaTreino_Funcionario : AppCompatActivity() {

    lateinit var btnSetaVoltar: ImageButton
    lateinit var spinnerGrupoMuscular: Spinner // Declarando o Spinner

    lateinit var btnAddExercio1: ImageButton
    lateinit var btnAddExercio2: ImageButton
    lateinit var btnAddExercio3: ImageButton

    lateinit var textLetraFicha: TextView
    lateinit var textNomeFicha: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_criar_ficha_treino_funcionario)

        // Inicializando os componentes
        btnSetaVoltar = findViewById(R.id.SetaVoltarTelaCriarFicha)
        spinnerGrupoMuscular = findViewById(R.id.spinnerGrupoMuscular) // Inicializando o Spinner

        btnAddExercio1 = findViewById(R.id.btnAddExercio1_telaCriar)
        btnAddExercio2 = findViewById(R.id.btnAddExercio2_telaCriar)
        btnAddExercio3 = findViewById(R.id.btnAddExercio3_telaCriar)

        textLetraFicha = findViewById(R.id.letraFicha)
        textNomeFicha = findViewById(R.id.nomeFicha)



        val tipoFicha = intent.getStringExtra("ficha")
        val nomeFicha = intent.getStringExtra("nomeFicha")
        // Verificando o tipo de ficha e alterando os TextViews

        if (tipoFicha == "A") {
            textLetraFicha.text = "A"  // Atualiza o TextView letraFicha com "A"
            intent.putExtra("ficha" , "A")
        } else if (tipoFicha == "B") {
            textLetraFicha.text = "B"  // Atualiza o TextView letraFicha com "A"
            intent.putExtra("ficha" , "B")
        }

        /*when (tipoFicha) {
            "A" -> textLetraFicha.text = "A" // Se for A, exibe A
            "B" -> textLetraFicha.text = "B"  // Se for B, exibe B
        }*/

        // Atualiza o TextView nomeFicha com o nome recebido da Intent
        textNomeFicha.text = nomeFicha
        intent.getStringExtra(nomeFicha)


        configurarEventos()




        // Configurando o Spinner com os dados
        val gruposMusculares = listOf("Peito", "Costas", "Bíceps", "Tríceps", "Pernas")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, gruposMusculares)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerGrupoMuscular.adapter = adapter
    }

    fun configurarEventos() {
        // Definindo o clique do botão de voltar
        btnSetaVoltar.setOnClickListener {
            onBackPressed() // Isso chama o comportamento de voltar para a tela anterior
        }

        btnAddExercio1.setOnClickListener {
            val intent = Intent(this, TelaCriarFichaTreino2_Funcionario::class.java)
            startActivity(intent)
        }
        btnAddExercio2.setOnClickListener {
            val intent = Intent(this, TelaCriarFichaTreino2_Funcionario::class.java)
            startActivity(intent)
        }
        btnAddExercio3.setOnClickListener {
            val intent = Intent(this, TelaCriarFichaTreino2_Funcionario::class.java)
            startActivity(intent)
        }
    }
}
