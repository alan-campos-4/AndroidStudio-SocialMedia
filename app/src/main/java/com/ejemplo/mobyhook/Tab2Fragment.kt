package com.ejemplo.mobyhook

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.ejemplo.mobyhook.databinding.FragmentTab2Binding
import androidx.appcompat.app.AppCompatActivity


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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.btnTab2.setOnClickListener {
            replaceFragment(RecyclerViewMenuFragment())
        }
    }
    private fun replaceFragment(fragment: Fragment) {
        //val fragmentManager = supportFragmentManager
        //val fragmentTransaction = fragmentManager.beginTransaction()
        //fragmentTransaction.replace(R.id.recyclerViewMenuFragment, fragment)
        //fragmentTransaction.commit()
    }

/*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnTab2.setOnClickListener {
            findNavController().navigate(R.id.action_tab2Fragment_to_recyclerViewMenuFragment)
        }
    }
*/

}