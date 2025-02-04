package com.ejemplo.mobyhook.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding : FragmentLoginBinding ? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener {
            if (binding.etHint.text.isNotEmpty())
                findNavController().navigate(R.id.action_loginFragment_to_viewPagerFragment)
            else
                Toast.makeText(view.context, "Debes introducir un nombre.", Toast.LENGTH_SHORT).show()
        }
    }

}