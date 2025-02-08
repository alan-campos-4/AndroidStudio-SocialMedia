package com.ejemplo.mobyhook.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {
    private var _binding : FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        val navFragment = childFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val navController = navFragment.navController
        binding.bottomNav.setupWithNavController(navController)
        binding.btnMenuBack.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_viewPagerFragment)
        }

        return binding.root
    }

}