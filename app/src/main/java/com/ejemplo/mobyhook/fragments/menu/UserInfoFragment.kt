package com.ejemplo.mobyhook.fragments.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.databinding.FragmentItemDetailBinding
import com.ejemplo.mobyhook.databinding.FragmentUserInfoBinding

class UserInfoFragment : Fragment() {
    private var _binding : FragmentUserInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

}