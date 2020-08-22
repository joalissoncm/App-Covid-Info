package com.example.appcovidinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_virus = findViewById<ImageButton>(R.id.btn_virus)

        btn_virus.setOnClickListener{
            val intent = Intent(this, Activity_intro_virus::class.java)

            startActivity(intent)}

        val btn_covid = findViewById<ImageButton>(R.id.btn_covid)

        btn_covid.setOnClickListener{
            val intent = Intent(this, Activity_covid::class.java)

            startActivity(intent)}

        val btn_protec = findViewById<ImageButton>(R.id.btn_protec)

        btn_protec.setOnClickListener{
            val intent = Intent(this, Activity_care::class.java)

            startActivity(intent)}

        val btn_drugs = findViewById<ImageButton>(R.id.btn_drugs)

        btn_drugs.setOnClickListener{
            val intent = Intent(this, Activity_cure::class.java)

            startActivity(intent)}

        val btn_doubt = findViewById<ImageButton>(R.id.btn_doubt)

        btn_doubt.setOnClickListener{
            val intent = Intent(this, Activity_doubt::class.java)

            startActivity(intent)}

        val btn_about = findViewById<ImageButton>(R.id.btn_about)

        btn_about.setOnClickListener{
            val intent = Intent(this, Activity_about::class.java)

            startActivity(intent)}

    }
}