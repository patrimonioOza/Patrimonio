package com.example.patrimonio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class miradoiro_cumio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_miradoiro_cumio)

        val breveDescripcioMiradoiroCumio= findViewById<TextView>(R.id.breveDescripcionPonteNovaRaris)
        val imagenCabeceraMiradoiroCumio=findViewById<ImageView>(R.id.imagenCabeceraPonteNovaRaris)
        val descripcionMiradoiroCumio=findViewById<TextView>(R.id.descripcionPonteNovaRaris)

    }
}