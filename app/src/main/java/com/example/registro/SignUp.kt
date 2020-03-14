package com.example.registro

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.DatePicker
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_sign_up.*
import java.util.*

class SignUp: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sign_up)

        val c = Calendar.getInstance()
        val year= c.get(Calendar.YEAR)
        val month= c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        btn_Fecha.setOnClickListener{
            val dpd= DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener{
                        view: DatePicker?, mYear: Int, mMonth: Int, mDay: Int ->
                    btn_Fecha.setText("" + mDay + "/" + (mMonth+1) + "/" + mYear)
                },
                year,
                month,
                day
            )
            dpd.show()

        }

        btn_ir_inicioSesion.setOnClickListener {
            val intent = Intent (this@SignUp, Login::class.java )
            startActivity(intent)
        }


    }



}