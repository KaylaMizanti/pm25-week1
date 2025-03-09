package com.example.latihan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //binding objek
        val inputNama : EditText = findViewById(R.id.inputNama)
        val btn : Button = findViewById(R.id.btn)
        val hasilNama : TextView = findViewById(R.id.hasilNama)

        btn.setOnClickListener {
            var str : String = inputNama.text.toString()
            hasilNama.setText("Hello, $str")
        }
    }
}