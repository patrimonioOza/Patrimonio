package com.example.patrimonio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class patrimonio_natural : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patrimonio_natural2)

        val boton4 = findViewById<Button>(R.id.boton4)
        boton4.setOnClickListener {
            val accederMiradoiroCumio = Intent(this, informacion_miradoiro_cumio::class.java)
            startActivity(accederMiradoiroCumio)
        }
        val boton5 = findViewById<Button>(R.id.boton5)
        boton5.setOnClickListener {
            val accederMiradoiroPena = Intent(this, informacion_miradoiro_pena_agrela::class.java)
            startActivity(accederMiradoiroPena)
        }
        val boton6 = findViewById<Button>(R.id.boton6)
        boton6.setOnClickListener {
            val accederCarballeiraFrancos = Intent(this, informacion_carballeira_francos::class.java)
            startActivity(accederCarballeiraFrancos)
        }
        val boton7 = findViewById<Button>(R.id.boton7)
        boton7.setOnClickListener {
            val accederSistemaFluvialUllaDeza =
                Intent(this, informacion_sistema_fluvial_ulla_deza::class.java)
            startActivity(accederSistemaFluvialUllaDeza)
        }
        val boton8 = findViewById<Button>(R.id.boton8)
        boton8.setOnClickListener {
            val accederCoutopescaXirimbao = Intent(this, informacion_couto_pesca::class.java)
            startActivity(accederCoutopescaXirimbao)
        }
        val boton9 = findViewById<Button>(R.id.boton9)
        boton9.setOnClickListener {
            val accederAreaReacreativaXirimbao =
                Intent(this, informacion_area_recreativa_xirimbao::class.java)
            startActivity(accederAreaReacreativaXirimbao)
        }
        val boton10 = findViewById<Button>(R.id.boton10)
        boton10.setOnClickListener {
            val accederFragaSestelo = Intent(this, informacion_fraga_sestelo::class.java)
            startActivity(accederFragaSestelo)
        }
        val boton11 = findViewById<Button>(R.id.boton11)
        boton11.setOnClickListener {
            val accederDevesaAgromaior = Intent(this, informacion_devesa_agromaior::class.java)
            startActivity(accederDevesaAgromaior)

        }
    }
}