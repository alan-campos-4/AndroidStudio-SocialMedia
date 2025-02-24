package com.ejemplo.mobyhook.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.databinding.FragmentCreditBinding

class CreditFragment : Fragment() {
    private var _binding : FragmentCreditBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreditBinding.inflate(inflater, container, false)

        val btn = binding.btnSendEmail
        btn.setOnClickListener{
            val i = Intent(Intent.ACTION_SEND)
            i.setType("message/rfc822")
            i.putExtra(Intent.EXTRA_CC, binding.etEmailRecipient.text)
            i.putExtra(Intent.EXTRA_SUBJECT, binding.etEmailSubject.text)
            i.putExtra(Intent.EXTRA_TEXT, binding.etEmailBody.text)
            startActivity(Intent.createChooser(i, "Send mail..."))
        }
        binding.btnEmailReturn.setOnClickListener{
            findNavController().navigateUp()
        }

        return binding.root
    }
}