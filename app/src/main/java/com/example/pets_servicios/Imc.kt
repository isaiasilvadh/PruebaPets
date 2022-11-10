package com.example.pets_servicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_imc.*
import kotlinx.android.synthetic.main.activity_main.*

class Imc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        btn_calc.setOnClickListener {
            val saltar: Intent = Intent(this, Res_Imc::class.java)
            startActivity(saltar)
        }
    }
}