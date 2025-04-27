package com.example.unipump

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class TelaEdicaoFichaTreino_funcionario : AppCompatActivity() {

    lateinit var btnSetaVoltar: ImageButton

    lateinit var btnAddExercio1: ImageButton
    lateinit var btnAddExercio2: ImageButton


    lateinit var btnLixeiraExercio1: ImageButton
    lateinit var btnLixeiraExercio2: ImageButton
    lateinit var btnLixeiraExercio3: ImageButton

    lateinit var buttonExcluirSerie1: ImageButton
    lateinit var buttonExcluirSerie2: ImageButton
    lateinit var buttonExcluirSerie3: ImageButton
    lateinit var buttonExcluirSerie4: ImageButton
    lateinit var buttonExcluirSerie5: ImageButton
    lateinit var buttonExcluirSerie6: ImageButton
    lateinit var buttonExcluirSerie7: ImageButton
    lateinit var buttonExcluirSerie8: ImageButton
    
    lateinit var exercio1: LinearLayout
    lateinit var exercio2: LinearLayout
    lateinit var exercio3: LinearLayout

    lateinit var serie1: LinearLayout
    lateinit var serie2: LinearLayout
    lateinit var serie3: LinearLayout
    lateinit var serie4: LinearLayout
    lateinit var serie5: LinearLayout
    lateinit var serie6: LinearLayout
    lateinit var serie7: LinearLayout
    lateinit var serie8: LinearLayout
            
            
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_edicao_ficha_treino_funcionario)

        btnSetaVoltar = findViewById(R.id.SetaVoltarTelaEdicaoFicha)

        btnAddExercio1 = findViewById(R.id.btnAddExercio1)
        btnAddExercio2 = findViewById(R.id.btnAddExercio2)

        btnLixeiraExercio1 = findViewById(R.id.btnLixeiraExercio1)
        btnLixeiraExercio2 = findViewById(R.id.btnLixeiraExercio2)
        btnLixeiraExercio3 = findViewById(R.id.btnLixeiraExercio3)

        buttonExcluirSerie1 = findViewById(R.id.buttonExcluirSerie1)
        buttonExcluirSerie2 = findViewById(R.id.buttonExcluirSerie2)
        buttonExcluirSerie3 = findViewById(R.id.buttonExcluirSerie3)
        buttonExcluirSerie4 = findViewById(R.id.buttonExcluirSerie4)
        buttonExcluirSerie5 = findViewById(R.id.buttonExcluirSerie5)
        buttonExcluirSerie6 = findViewById(R.id.buttonExcluirSerie6)
        buttonExcluirSerie7 = findViewById(R.id.buttonExcluirSerie7)
        buttonExcluirSerie8 = findViewById(R.id.buttonExcluirSerie8)

        
        exercio1 = findViewById(R.id.exercio1)
        exercio2 = findViewById(R.id.exercio2)
        exercio3 = findViewById(R.id.exercio3)

        serie1 = findViewById(R.id.serie1)
        serie2 = findViewById(R.id.serie2)
        serie3 = findViewById(R.id.serie3)
        serie4 = findViewById(R.id.serie4)
        serie5 = findViewById(R.id.serie5)
        serie6 = findViewById(R.id.serie6)
        serie7 = findViewById(R.id.serie7)
        serie8 = findViewById(R.id.serie8)
        
        configurarEventos()
    }

    fun configurarEventos() {

        btnAddExercio1.setOnClickListener {
            val intent = Intent(this, TelaCriarFichaTreino_Funcionario::class.java)
            intent.putExtra("ficha" , "A")
            intent.putExtra("nomeFicha", "Costas e Bíceps")
            startActivity(intent)
        }

        btnAddExercio2.setOnClickListener {
            val intent = Intent(this, TelaCriarFichaTreino_Funcionario::class.java)
            intent.putExtra("ficha" , "B")
            intent.putExtra("nomeFicha", "Peito e Tríceps")
            startActivity(intent)
        }




        // Definindo o clique do botão de voltar
        btnSetaVoltar.setOnClickListener {
            onBackPressed() // Isso chama o comportamento de voltar para a tela anterior
        }


        btnLixeiraExercio1.setOnClickListener {
            excluirLinearLayout(exercio1)
        }

        btnLixeiraExercio2.setOnClickListener {
            excluirLinearLayout(exercio2)
        }

        btnLixeiraExercio2.setOnClickListener {
            excluirLinearLayout(exercio3)
        }


        // Configurando os botões de excluir série
        buttonExcluirSerie1.setOnClickListener {
            excluirLinearLayout(serie1)
        }

        buttonExcluirSerie2.setOnClickListener {
            excluirLinearLayout(serie2)
        }

        buttonExcluirSerie3.setOnClickListener {
            excluirLinearLayout(serie3)
        }

        buttonExcluirSerie4.setOnClickListener {
            excluirLinearLayout(serie4)
        }

        buttonExcluirSerie5.setOnClickListener {
            excluirLinearLayout(serie5)
        }

        buttonExcluirSerie6.setOnClickListener {
            excluirLinearLayout(serie6)
        }

        buttonExcluirSerie7.setOnClickListener {
            excluirLinearLayout(serie7)
        }

        buttonExcluirSerie8.setOnClickListener {
            excluirLinearLayout(serie8)
        }

    }

    // Função para excluir o LinearLayout pai
    fun excluirLinearLayout(linearLayout: LinearLayout) {
        // Verifica se o parent é um ViewGroup e então remove a View
        (linearLayout.parent as? ViewGroup)?.removeView(linearLayout)
    }
}
