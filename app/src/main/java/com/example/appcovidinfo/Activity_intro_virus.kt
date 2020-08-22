package com.example.appcovidinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_doubt.*
import kotlinx.android.synthetic.main.activity_doubt.toolbar3
import kotlinx.android.synthetic.main.activity_intro_virus.*

class Activity_intro_virus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_virus)

        setSupportActionBar(toolbar4)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}