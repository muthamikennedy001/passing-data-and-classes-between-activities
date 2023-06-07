package com.example.passdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnApply:Button=findViewById(R.id.btnApply)
        btnApply.setOnClickListener {
            val name=findViewById<EditText?>(R.id.etName).text.toString()
            val age=findViewById<EditText?>(R.id.etAge).text.toString().toInt()
            val country=findViewById<EditText?>(R.id.etCountry).text.toString()
            val person=Person(name,age,country)
            Intent(this,SecondActivity::class.java).also{
               it.putExtra("EXTRA_PERSON",person)
                startActivity(it)
            }
        }
    }

}