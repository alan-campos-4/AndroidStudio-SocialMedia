package com.ejemplo.mobyhook

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }




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

    private fun initRecyclerView() {
        //val manager = GridLayoutManager(this, 1)
        val manager = LinearLayoutManager(this)
        binding.recyclerLaLiga.layoutManager = manager
        binding.recyclerLaLiga.adapter = AlbumAdapter(
            AlbumProvider.albumList) { album -> onItemSelected(album)  }
    }
    private fun onItemSelected(album: Album) {
        Toast.makeText(
            this,
            album.name,
            Toast.LENGTH_SHORT
        ).show()
    }
    */



}