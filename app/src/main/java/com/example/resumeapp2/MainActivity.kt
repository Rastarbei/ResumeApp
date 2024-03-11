package com.example.resumeapp2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 =  findViewById<Button>(R.id.button4)
        button1.setOnClickListener{
            // open educ background button
        val intent = Intent(this, EducBackground::class.java)
        startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button5)
        button2.setOnClickListener{
            // open educ background button
            val intent = Intent(this, PerDetails::class.java)
            startActivity(intent)
        }
        val button3 = findViewById<Button>(R.id.button6)
        button3.setOnClickListener{
            // open educ background button
            val intent = Intent(this, Skills::class.java)
            startActivity(intent)
        }
        val button4 = findViewById<Button>(R.id.button7)
        button4.setOnClickListener{
            // open educ background button
            val intent = Intent(this, Projects::class.java)
            startActivity(intent)
        }

    }
}