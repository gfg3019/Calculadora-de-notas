package com.calculadora.calculadoranotasdealuno

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = btnCalcular
        val resultado: TextView = resultado

        btnCalcular.setOnClickListener{
            val nota1:Double = nota1.text.toString().toDouble()
            val nota2:Double = nota2.text.toString().toDouble()
            val media:Double = (nota1 + nota2) / 2
            val faltas:Int = Integer.parseInt(faltas.text.toString())
            if(media >= 6 && faltas <= 10){
                resultado.setText("Aluno foi aprovado!!!\nNota Final: $media\nFaltas: $faltas")
                resultado.setTextColor(Color.GREEN)
            }else{
                resultado.setText("Aluno foi reprovado!!!\nNota Final: $media\nFaltas: $faltas")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}