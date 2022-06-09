package com.example.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val  txtNombre = findViewById<TextView>(R.id.lbl_nombre);
        val  txt_fecha = findViewById<TextView>(R.id.lbl_fecha);
        val  txt_phone = findViewById<TextView>(R.id.lbl_phone);
        val  txt_gender = findViewById<TextView>(R.id.lbl_genero);
        //Recuperamos la información pasada en el intent
        val bundle = this.getIntent().getExtras();
        // //Construimos el mensaje a mostrar
        txtNombre.setText(bundle?.getString("NOMBRE"));
        txt_fecha.setText(bundle?.getString("FECHA"));
        txt_phone.setText(bundle?.getString("TELEFONO"));
        txt_gender.setText(bundle?.getString("GENERO"));
    }

    fun btn_regresa_click(v: View){
        val intent = Intent(this, MainActivity::class.java);
        startActivity(intent);
    }
}