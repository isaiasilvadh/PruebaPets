package com.example.pets_servicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_imc.setOnClickListener {
            val saltar: Intent = Intent(this, Imc::class.java)
            startActivity(saltar)
        }

        btn_macho.setOnClickListener {
            val saltar: Intent = Intent(this, GrasaM::class.java)
            startActivity(saltar)
        }
    }
}