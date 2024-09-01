package com.example.calculadorasimples

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referências aos elementos da interface
        val editTextNumero1 = findViewById<EditText>(R.id.editTextNumero1)
        val editTextNumero2 = findViewById<EditText>(R.id.editTextNumero2)
        val buttonSomar = findViewById<Button>(R.id.buttonSomar)
        val buttonSubtrair = findViewById<Button>(R.id.buttonSubtrair)
        val textViewResultado = findViewById<TextView>(R.id.textViewResultado)

        // Função para somar os números
        buttonSomar.setOnClickListener {
            val num1Str = editTextNumero1.text.toString()
            val num2Str = editTextNumero2.text.toString()

            if (num1Str.isNotEmpty() && num2Str.isNotEmpty()) {
                val num1 = num1Str.toDouble()
                val num2 = num2Str.toDouble()
                val resultado = num1 + num2

                textViewResultado.text = "Resultado: $resultado"
            } else {
                textViewResultado.text = "Por favor, insira ambos os números."
            }
        }

        // Função para subtrair os números
        buttonSubtrair.setOnClickListener {
            val num1Str = editTextNumero1.text.toString()
            val num2Str = editTextNumero2.text.toString()

            if (num1Str.isNotEmpty() && num2Str.isNotEmpty()) {
                val num1 = num1Str.toDouble()
                val num2 = num2Str.toDouble()
                val resultado = num1 - num2

                textViewResultado.text = "Resultado: $resultado"
            } else {
                textViewResultado.text = "Por favor, insira ambos os números."
            }
        }
    }
}