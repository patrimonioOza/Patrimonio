package com.example.patrimonio2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class informacion_miradoiro_cumio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion_miradoiro_cumio)

        val facebook = findViewById<ImageView>(R.id.facebook)
        facebook.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/turismoteo/")))
        }

        val twitter = findViewById<ImageView>(R.id.twitter)
        twitter.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/turismoteo")))
        }

        val instagram = findViewById<ImageView>(R.id.instagram)
        instagram.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/turismoteo/")))
        }

        val maps = findViewById<ImageButton>(R.id.maps)
        maps.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/42%C2%B050'03.3%22N+8%C2%B032'29.4%22W/@42.8342554,-8.5436829,17z/data=!3m1!4b1!4m5!3m4!1s0x0:0x13de51623810adb7!8m2!3d42.8342554!4d-8.5414942")))
        }
    }
}