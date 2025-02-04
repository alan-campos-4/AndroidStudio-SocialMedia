package com.ejemplo.mobyhook.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.databinding.FragmentMenuBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuFragment : Fragment() {
    private var _binding : FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)

        //val navHostFragment = binding.fragmentContainer as NavHostFragment
        //val navController = navHostFragment.navController

        return binding.root
    }

}