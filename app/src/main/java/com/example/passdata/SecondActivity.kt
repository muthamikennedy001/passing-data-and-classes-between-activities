package com.example.passdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val person=intent.getSerializableExtra("EXTRA_PERSON") as Person

        var tvPerson=findViewById<TextView>(R.id.tvPerson)
        tvPerson.text=person.toString()
    }

}