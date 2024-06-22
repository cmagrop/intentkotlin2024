package com.example.intentkotlin

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.parcelize.Parcelize


@Parcelize
data class Usuario(
    val nombre:String,
    val apellido:String

):Parcelable

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado)

        //getExtras()

        val user2:String = intent.getStringExtra("user").toString()

        val user:String = intent.extras?.getString("user").toString()
        val pass:String = intent.extras?.getString("pass").toString()

        Toast.makeText(this,user+"\n"+pass,Toast.LENGTH_LONG).show()

        val userTextView = findViewById<TextView>(R.id.textViewUser)
        val passTextView = findViewById<TextView>(R.id.textViewPassword)

        userTextView.setText(user2)
        passTextView.setText(pass)
        //Parcelable
        val usuario = Usuario("Caroline","Sanchez")
        val intent = Intent(this,ResultadoParcelableActivity::class.java)
        val bundle = Bundle()
        bundle.putParcelable("objeto-usuario",usuario)
        intent.putExtra("bundle-usuario",bundle)
        startActivity(intent)

    }
}