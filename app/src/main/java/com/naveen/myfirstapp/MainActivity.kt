package com.naveen.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val MyTextView = findViewById<TextView>(R.id.textView)
        // holds the amount of click on the button
        var timesClicked = 0
          btnClickMe.setOnClickListener {
//              btnClickMe.text = "HaHa You Clicked Me"
              timesClicked = timesClicked + 1

              MyTextView.text = timesClicked.toString()
              Toast.makeText(this, "Hey Iam a Toast !", Toast.LENGTH_LONG).show()
          }



    }
}