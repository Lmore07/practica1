package com.example.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btn_enviar_click(view: View) {
        val intent = Intent(this, MainActivity2::class.java);
        val txtNombre = findViewById<EditText>(R.id.txt_nombre);
        val txt_fecha = findViewById<EditText>(R.id.txt_date);
        val rbt_masc = findViewById<RadioButton>(R.id.rbt_masc)
        val rbt_fem = findViewById<RadioButton>(R.id.rbt_fem);
        val txt_phone = findViewById<EditText>(R.id.txt_phone);

        val b = Bundle();
        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("FECHA", txt_fecha.getText().toString());
        if(rbt_masc.isChecked){
            b.putString("GENERO", rbt_masc.getText().toString());
        }else{
            b.putString("GENERO", rbt_fem.getText().toString());
        }
        b.putString("TELEFONO", txt_phone.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
}