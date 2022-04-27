package com.example.patrimonio2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class igrexaDeSantaMariaDeTeo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_igrexa_de_santa_maria_de_teo)

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
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es/maps/place/42%C2%B045'58.3%22N+8%C2%B030'58.5%22W/@42.7661935,-8.5249884,15z/data=!3m1!4b1!4m5!3m4!1s0x0:0xd1ade5efd78336d6!8m2!3d42.7661938!4d-8.5162551")))
        }
    }
}