package com.example.patrimonio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1 = findViewById<Button>(R.id.boton1)
        boton1.setOnClickListener {
            val accederPatrimonio = Intent(this, tipos_patrimonio::class.java)
            startActivity(accederPatrimonio)
        }
    }
}