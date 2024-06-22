package com.example.intentkotlin

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultadoParcelableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado_parcelable)

        val bundle = intent.getBundleExtra("bundle-usuario")

        val usuario = bundle?.getParcelable<Usuario>("objeto-usuario")

        val user = usuario.toString()//recuperando el objeto

        val nombreUser = usuario?.nombre.toString();
        val apellidoUser = usuario?.apellido.toString()

        Toast.makeText(this,nombreUser+" "+apellidoUser,Toast.LENGTH_LONG).show()



    }
}