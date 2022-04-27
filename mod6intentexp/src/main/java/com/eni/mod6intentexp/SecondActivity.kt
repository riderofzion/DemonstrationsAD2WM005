package com.eni.mod6intentexp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val prenom = intent.getStringExtra("prenom")
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Hello $prenom"
    }
}