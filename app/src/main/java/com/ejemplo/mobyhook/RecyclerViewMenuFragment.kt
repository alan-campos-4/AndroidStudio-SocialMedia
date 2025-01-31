package com.ejemplo.mobyhook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.fragment.app.Fragment
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.ejemplo.mobyhook.AlbumAdapter
import com.ejemplo.mobyhook.databinding.FragmentMenuRvBinding

class RecyclerViewMenuFragment : Fragment() {
    ///*
    private var _binding : FragmentMenuRvBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuRvBinding.inflate(inflater, container, false)
        return binding.root
    }

//*/


    /*
    private lateinit var binding : FragmentMenuRvBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //setContentView(R.layout.activity_main)
        binding = FragmentMenuRvBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun initRecyclerView(){
        //val manager = GridLayoutManager(this, 1)
        val manager = LinearLayoutManager(activity)
        binding.recyclerLaLiga.layoutManager = manager
        binding.recyclerLaLiga.adapter = AlbumAdapter(
            AlbumProvider.albumList) { album -> onItemSelected(album)  }
    }
    private fun onItemSelected(album: Album){
        Toast.makeText(
            context,
            album.name,
            Toast.LENGTH_SHORT
        ).show()
    }
    */

}