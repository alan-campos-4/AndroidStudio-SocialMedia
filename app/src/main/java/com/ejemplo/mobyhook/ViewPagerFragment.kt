package com.ejemplo.mobyhook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ejemplo.mobyhook.databinding.FragmentTabsVpBinding
import com.google.android.material.tabs.TabLayoutMediator

class ViewPagerFragment : Fragment() {
    private var _binding : FragmentTabsVpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTabsVpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewPager.adapter = NoticeAdapter(this)
        TabLayoutMediator(binding.TabNotice, binding.viewPager) {
            tab, position ->
                when (position) {
                    0 -> {
                        tab.text = getString(R.string.tab1_name)
                        //tab.setIcon(R.drawable.ic_home)
                    }
                    1 -> {
                        tab.text = getString(R.string.tab2_name)
                        //tab.setIcon(R.drawable.ic_menu)
                    }
                }
        }.attach()
    }
}

class NoticeAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2
    override fun createFragment(position: Int): Fragment {
        val fragment =
            if (position==0)
                Tab1Fragment()
            else
                Tab2Fragment()
        return fragment
    }
}