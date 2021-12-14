package com.app.passdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    lateinit var firstNameDD: TextView
    lateinit var secondNameDD: TextView
    lateinit var locationDD: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar!!.setDisplayShowTitleEnabled(true)
        supportActionBar!!.title = "SecondActivity"

        firstNameDD = findViewById(R.id.firstNameD)
        secondNameDD = findViewById(R.id.lastNameD)
        locationDD = findViewById(R.id.locationD)


       val firstName =  intent.getStringExtra("firstName1")
        val secondName = intent.getStringExtra("lastName2")
        val location = intent.getStringExtra("location")

        firstNameDD.text = firstName
        secondNameDD.text = secondName
        locationDD.text = location
    }
}