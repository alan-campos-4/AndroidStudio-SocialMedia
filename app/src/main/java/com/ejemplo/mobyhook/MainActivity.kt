package com.ejemplo.mobyhook

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnStart)
        val et = findViewById<EditText>(R.id.etHint)

        btn.setOnClickListener {
            if (et.text.any()) {
                val intent = Intent(this@MainActivity, CreditActivity::class.java)
                intent.putExtra("NAME", et.text.toString())
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "El EditText está vacío", Toast.LENGTH_SHORT).show()
            }
        }
    }
}