package com.ejemplo.mobyhook.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.databinding.FragmentTab2Binding

class Tab2Fragment : Fragment() {
    private var _binding : FragmentTab2Binding ? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTab2Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnTab2.setOnClickListener {
            //Toast.makeText(view.context,"Hola",Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_viewPagerFragment_to_menuFragment)
        }
    }

}