package com.app.passdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btn:Button
    lateinit var firstName: TextView
    lateinit var secondName: TextView
    lateinit var location: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.moveButton)
        firstName = findViewById(R.id.firstName)
        secondName = findViewById(R.id.lastName)
        location = findViewById(R.id.location)

        val firstNameItem = "John"
        val lastNameItem = "Doe"
        val locationItem = "Saudi"

        firstName.text = firstNameItem
        secondName.text = lastNameItem
        location.text = locationItem

        btn.setOnClickListener {
            val intent : Intent
            intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("firstName1", firstNameItem)
            intent.putExtra("lastName2", lastNameItem)
            intent.putExtra("location", locationItem)
            startActivity(intent)
        }
    }
}