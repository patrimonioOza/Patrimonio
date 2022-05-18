package com.example.patrimonio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class patrimonio_arqueoloxico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patrimonio_arqueoloxico)

        val botonMarcoDaAgrela = findViewById<ImageButton>(R.id.botonMarcoDaAgrela)
        botonMarcoDaAgrela.setOnClickListener {
            val accederMarcoDaAgrela = Intent(this, marcoDaAgrela::class.java)
            startActivity(accederMarcoDaAgrela)
        }

        val botonAreaArqueoloxicaDoMontePiquinho = findViewById<ImageButton>(R.id.botonAreaArqueoloxicaDoMontePiquinho)
        botonAreaArqueoloxicaDoMontePiquinho.setOnClickListener {
            val accederAreaArqueoloxicaDoMontePiquinho = Intent(this, areaArqueoloxicaDoMontePiquinho::class.java)
            startActivity(accederAreaArqueoloxicaDoMontePiquinho)
        }

        val botonPetroglifoDaPenaBicudaDeLoureiro = findViewById<ImageButton>(R.id.botonPetroglifoDaPenaBicudaDeLoureiro)
        botonPetroglifoDaPenaBicudaDeLoureiro.setOnClickListener {
            val accederPetroglifoDaPenaBicudaDeLoureiro = Intent(this, petroglifoDaPenaBicudaDeLoureiro::class.java)
            startActivity(accederPetroglifoDaPenaBicudaDeLoureiro)
        }

        val botonPetroglifoDoOuteiroDoCorno = findViewById<ImageButton>(R.id.botonPetroglifoDoOuteiroDoCorno)
        botonPetroglifoDoOuteiroDoCorno.setOnClickListener {
            val accederPetroglifoDoOuteiroDoCorno = Intent(this, petroglifoDoOuteiroDoCorno::class.java)
            startActivity(accederPetroglifoDoOuteiroDoCorno)
        }

        val botonPetroglifoDoRioAngueiraOuDoMonteDeCornide = findViewById<ImageButton>(R.id.botonPetroglifoDoRioAngueiraOuDoMonteDeCornide)
        botonPetroglifoDoRioAngueiraOuDoMonteDeCornide.setOnClickListener {
            val accederPetroglifoDoRioAngueiraOuDoMonteDeCornide = Intent(this, petroglifoDoRioAngueiraOuDoMonteDeCornide::class.java)
            startActivity(accederPetroglifoDoRioAngueiraOuDoMonteDeCornide)
        }


    }
}