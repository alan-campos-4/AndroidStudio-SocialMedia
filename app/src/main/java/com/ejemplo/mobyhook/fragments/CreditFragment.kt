package com.ejemplo.mobyhook.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.databinding.FragmentCreditBinding
import com.ejemplo.mobyhook.databinding.FragmentItemDetailFavBinding

class CreditFragment : Fragment() {
    private var _binding : FragmentCreditBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreditBinding.inflate(inflater, container, false)
        return binding.root
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