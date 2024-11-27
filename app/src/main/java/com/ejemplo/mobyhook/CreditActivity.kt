package com.ejemplo.mobyhook

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class CreditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_credit)

        val name = intent.getStringExtra("NAME")
        val tvGreeting = findViewById<TextView>(R.id.tvMessage)
        tvGreeting.apply { text = getString(R.string.Credit, name, getString(R.string.app_name)) }

        val btn = findViewById<Button>(R.id.btnContact)
        btn.setOnClickListener{
            val i = Intent(Intent.ACTION_SEND)
            i.setType("message/rfc822")
            i.putExtra(Intent.EXTRA_SUBJECT, "Contacto")
            i.putExtra(Intent.EXTRA_TEXT, "Consulta de la app ${getString(R.string.app_name)}")
            startActivity(Intent.createChooser(i, "Send mail..."))
        }
    }
}