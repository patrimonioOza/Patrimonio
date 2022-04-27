package com.example.patrimonio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class patrimonio_etnografico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patrimonio_etnografico)

        val boton12 = findViewById<Button>(R.id.boton12)
        boton12.setOnClickListener {
            val accederCruceiroTribaldes = Intent(this, informacion_cruceiro_tribaldes::class.java)
            startActivity(accederCruceiroTribaldes)
        }
        val boton13 = findViewById<Button>(R.id.boton13)
        boton13.setOnClickListener {
            val accederBurgaXermeade = Intent(this, informacion_burga_xermeade::class.java)
            startActivity(accederBurgaXermeade)
        }
        val boton14 = findViewById<Button>(R.id.boton14)
        boton14.setOnClickListener {
            val accederCrucerioGoticoFrancos = Intent(this, informacion_cruceiro_gotico_francos::class.java)
            startActivity(accederCrucerioGoticoFrancos)
        }
        val boton15 = findViewById<Button>(R.id.boton15)
        boton15.setOnClickListener {
            val accederMarcoMedievalPorto = Intent(this, informacion_marco_medieval_porto::class.java)
            startActivity(accederMarcoMedievalPorto)
        }
        val boton16 = findViewById<Button>(R.id.boton16)
        boton16.setOnClickListener {
            val accederPonteMedievalPontevea = Intent(this, informacion_ponte_medieval_pontevea::class.java)
            startActivity(accederPonteMedievalPontevea)
        }
        val boton17 = findViewById<Button>(R.id.boton17)
        boton17.setOnClickListener {
            val accederPonteParadela = Intent(this, informacion_ponte_paradela::class.java)
            startActivity(accederPonteParadela)
        }
        val boton18 = findViewById<Button>(R.id.boton18)
        boton18.setOnClickListener {
            val accederPousadaSanAntoniño = Intent(this, informacion_pousada_san_antoninho::class.java)
            startActivity(accederPousadaSanAntoniño)
        }
        val boton19 = findViewById<Button>(R.id.boton19)
        boton19.setOnClickListener {
            val accederEscolaFrancos = Intent(this, informacion_escola_francos::class.java)
            startActivity(accederEscolaFrancos)
        }
        val boton20 = findViewById<Button>(R.id.boton20)
        boton20.setOnClickListener {
            val accederPonteLavadoiroRioTinto = Intent(this, informacion_ponte_lavadoiro_rio_tinto::class.java)
            startActivity(accederPonteLavadoiroRioTinto)
        }
        val boton21 = findViewById<Button>(R.id.boton21)
        boton21.setOnClickListener {
            val accederLavadoiroFrancos = Intent(this, informacion_lavadoiro_francos::class.java)
            startActivity(accederLavadoiroFrancos)
        }
        val boton22 = findViewById<Button>(R.id.boton22)
        boton22.setOnClickListener {
            val accederPonteColganteXirimbao = Intent(this, informacion_ponte_colgante_xirimbao::class.java)
            startActivity(accederPonteColganteXirimbao)
        }
        val boton23 = findViewById<Button>(R.id.boton23)
        boton23.setOnClickListener {
            val accederLavadoiroCasalonga = Intent(this, informacion_lavadoiro_casalonga::class.java)
            startActivity(accederLavadoiroCasalonga)
        }
        val boton24 = findViewById<Button>(R.id.boton24)
        boton24.setOnClickListener {
            val accederFonteLavadoiroFlorida = Intent(this, informacion_fonte_lavadoiro_florida::class.java)
            startActivity(accederFonteLavadoiroFlorida)
        }
        val boton25 = findViewById<Button>(R.id.boton25)
        boton25.setOnClickListener {
            val accederNucleoradicionalPontevea =
                Intent(this, informacion_nucleo_tradicional_pontevea::class.java)
            startActivity(accederNucleoradicionalPontevea)
        }
        val boton26 = findViewById<Button>(R.id.boton26)
        boton26.setOnClickListener {
            val accederPonteNovaRaris = Intent(this, informacion_ponte_nova_raris::class.java)
            startActivity(accederPonteNovaRaris)
        }
        val boton27 = findViewById<Button>(R.id.boton27)
        boton27.setOnClickListener {
            val accederTunelFaramello = Intent(this, informacion_tunel_faramello::class.java)
            startActivity(accederTunelFaramello)
        }
        val boton28 = findViewById<Button>(R.id.boton28)
        boton28.setOnClickListener {
            val accederFonteEscolaCasalonga = Intent(this, informacion_escola_casalonga::class.java)
            startActivity(accederFonteEscolaCasalonga)
        }
    }
}