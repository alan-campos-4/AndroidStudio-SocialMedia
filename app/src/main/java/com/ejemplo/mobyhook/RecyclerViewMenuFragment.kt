package com.ejemplo.mobyhook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ejemplo.mobyhook.databinding.FragmentMenuRvBinding
import com.ejemplo.mobyhook.databinding.FragmentTabsVpBinding

class RecyclerViewMenuFragment : Fragment() {
    private var _binding : FragmentMenuRvBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuRvBinding.inflate(inflater, container, false)
        return binding.root
    }

}