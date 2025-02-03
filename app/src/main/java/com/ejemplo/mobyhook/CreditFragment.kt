package com.ejemplo.mobyhook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class CreditFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_credit, container, false)
    }


    /*
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
    */

}