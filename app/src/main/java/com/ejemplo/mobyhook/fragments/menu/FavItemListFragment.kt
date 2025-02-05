package com.ejemplo.mobyhook.fragments.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ejemplo.mobyhook.Album
import com.ejemplo.mobyhook.Constants
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.adapters.AlbumAdapter
import com.ejemplo.mobyhook.adapters.FavAlbumAdapter
import com.ejemplo.mobyhook.databinding.FragmentItemListFavBinding

class FavItemListFragment : Fragment() {
    private var _binding : FragmentItemListFavBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentItemListFavBinding.inflate(inflater, container, false)
        initRecyclerView()
        return binding.root
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(binding.rvFavItemList.context)
        binding.rvFavItemList.layoutManager = manager
        binding.rvFavItemList.adapter = AlbumAdapter(
            Constants.getFavorites()) { album -> onItemSelected(album) }
    }

    private fun onItemSelected(album: Album) {
        //
    }
}