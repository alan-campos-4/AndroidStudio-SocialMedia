package com.ejemplo.mobyhook.fragments.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.ejemplo.mobyhook.ItemViewModel
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.databinding.FragmentUserInfoBinding

class UserInfoFragment : Fragment() {
    private var _binding : FragmentUserInfoBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ItemViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUserInfoBinding.inflate(inflater, container, false)

        val username = viewModel.getItem()
        binding.tvUserInfo.text = getString(R.string.user_message, username)

        return binding.root
    }
}