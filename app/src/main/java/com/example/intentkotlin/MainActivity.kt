package com.example.intentkotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Captura boton
        val recuperarBoton = findViewById<Button>(R.id.buttonLogin)

        recuperarBoton.setOnClickListener {


            //capturar los valores de activity_main
            //username

            val user = findViewById<EditText>(R.id.username)

            val pass = findViewById<EditText>(R.id.password)

            val userString = user.text.toString()

            val passString = pass.text.toString()


            //Toast.makeText(this,userString+" "+passString,Toast.LENGTH_LONG).show()

            val intent = Intent(this,ResultadoActivity::class.java)

            intent.putExtra("user",userString)
            intent.putExtra("pass",passString)

            startActivity(intent)



        }

        val visitanosRecuperacion = findViewById<TextView>(R.id.visitanos)
        visitanosRecuperacion.setOnClickListener {

            Toast.makeText(this,"Google Maps",Toast.LENGTH_LONG).show()
            val gmmIntentUri = Uri.parse("geo:0,0?q=Nataniel Cox 456 Santiago Chile")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)

        }

    }
}