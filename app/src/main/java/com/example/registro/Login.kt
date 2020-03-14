package com.example.registro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_login.*


class Login: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        btn_ir_crearCuenta.setOnClickListener {

            val intent = Intent(this@Login, SignUp::class.java)
            startActivity(intent)
        }


    }



}