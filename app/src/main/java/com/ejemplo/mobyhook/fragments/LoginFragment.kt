package com.ejemplo.mobyhook.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.ejemplo.mobyhook.ItemViewModel
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding : FragmentLoginBinding ? = null
    private val binding get() = _binding!!
    private val viewModel: ItemViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener {
            if (binding.etHint.text.isNotEmpty()) {
                viewModel.setItem(binding.etHint.text.toString())
                findNavController().navigate(R.id.action_loginFragment_to_viewPagerFragment)
            }
            else
                Toast.makeText(view.context, getString(R.string.name_needed_message), Toast.LENGTH_SHORT).show()
        }
    }

}