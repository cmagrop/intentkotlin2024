package com.example.intentkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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

        val recuperarBoton = findViewById<Button>(R.id.buttonLogin)

        recuperarBoton.setOnClickListener {


            //capturar los valores de activity_main
            //username

            val user = findViewById<EditText>(R.id.username)

            val pass = findViewById<EditText>(R.id.password)

            val userString = user.text.toString()

            val passString = pass.text.toString()


            Toast.makeText(this,userString+" "+passString,Toast.LENGTH_LONG).show()

            val intent = Intent(this,ResultadoActivity::class.java)

            intent.putExtra("user",userString)
            intent.putExtra("pass",passString)

            startActivity(intent)



        }

    }
}