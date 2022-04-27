package com.example.patrimonio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class patrimonio_eclesiastico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patrimonio_eclesiastico)

        val botonCasaReitoralDeBamonde = findViewById<Button>(R.id.botonCasaReitoralDeBamonde)
        botonCasaReitoralDeBamonde.setOnClickListener {
            val accederCasaReitoralDeBamonde = Intent(this, casaReitoralDeBamonde::class.java)
            startActivity(accederCasaReitoralDeBamonde)
        }

        val botonIgrexaCruceiroDeSantaMariaDeBamonde = findViewById<Button>(R.id.botonIgrexaCruceiroDeSantaMariaDeBamonde)
        botonIgrexaCruceiroDeSantaMariaDeBamonde.setOnClickListener {
            val accederIgrexaCruceiroDeSantaMariaDeBamonde = Intent(this, igrexaCruceiroDeSantaMariaDeBamonde::class.java)
            startActivity(accederIgrexaCruceiroDeSantaMariaDeBamonde)
        }

        val botonCapelaDeSantaAnaDeLampai = findViewById<Button>(R.id.botonCapelaDeSantaAnaDeLampai)
        botonCapelaDeSantaAnaDeLampai.setOnClickListener {
            val accederCapelaDeSantaAnaDeLampai = Intent(this, capelaDeSantaAnaDeLampai::class.java)
            startActivity(accederCapelaDeSantaAnaDeLampai)
        }

        val botonCapelaCruceiroDoEspiritoSanto = findViewById<Button>(R.id.botonCapelaCruceiroDoEspiritoSanto)
        botonCapelaCruceiroDoEspiritoSanto.setOnClickListener {
            val accederCapelaCruceiroDoEspiritoSanto = Intent(this, capelaCruceiroDoEspiritoSanto::class.java)
            startActivity(accederCapelaCruceiroDoEspiritoSanto)
        }

        val botonIgrexaDeSantaMariaDeLampai = findViewById<Button>(R.id.botonIgrexaDeSantaMariaDeLampai)
        botonIgrexaDeSantaMariaDeLampai.setOnClickListener {
            val accederIgrexaDeSantaMariaDeLampai = Intent(this, igrexaDeSantaMariaDeLampai::class.java)
            startActivity(accederIgrexaDeSantaMariaDeLampai)
        }

        val botonIgrexaDeSanMiguelDeRaris = findViewById<Button>(R.id.botonIgrexaDeSanMiguelDeRaris)
        botonIgrexaDeSanMiguelDeRaris.setOnClickListener {
            val accederIgrexaDeSanMiguelDeRaris = Intent(this, igrexaDeSanMiguelDeRaris::class.java)
            startActivity(accederIgrexaDeSanMiguelDeRaris)
        }

        val botonErmidaCruceiroDeSantaEufemia = findViewById<Button>(R.id.botonErmidaCruceiroDeSantaEufemia)
        botonErmidaCruceiroDeSantaEufemia.setOnClickListener {
            val accederErmidaCruceiroDeSantaEufemia = Intent(this, ermidaCruceiroDeSantaEufemia::class.java)
            startActivity(accederErmidaCruceiroDeSantaEufemia)
        }

        val botonIgrexaDeSantaMariaDeLuou = findViewById<Button>(R.id.botonIgrexaDeSantaMariaDeLuou)
        botonIgrexaDeSantaMariaDeLuou.setOnClickListener {
            val accederIgrexaDeSantaMariaDeLuou = Intent(this, igrexaDeSantaMariaDeLuou::class.java)
            startActivity(accederIgrexaDeSantaMariaDeLuou)
        }

        val botonIgrexaDeSantaMariaDeTeo = findViewById<Button>(R.id.botonIgrexaDeSantaMariaDeTeo)
        botonIgrexaDeSantaMariaDeTeo.setOnClickListener {
            val accederIgrexaDeSantaMariaDeTeo = Intent(this, igrexaDeSantaMariaDeTeo::class.java)
            startActivity(accederIgrexaDeSantaMariaDeTeo)
        }

        val botonIgrexadeSanSimonDeOnsCacheiras = findViewById<Button>(R.id.botonIgrexadeSanSimonDeOnsCacheiras)
        botonIgrexadeSanSimonDeOnsCacheiras.setOnClickListener {
            val accederIgrexadeSanSimonDeOnsCacheiras = Intent(this, igrexadeSanSimonDeOnsCacheiras::class.java)
            startActivity(accederIgrexadeSanSimonDeOnsCacheiras)
        }


    }
}