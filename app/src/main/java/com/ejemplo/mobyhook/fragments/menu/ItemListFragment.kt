package com.ejemplo.mobyhook.fragments.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.ejemplo.mobyhook.Album
import com.ejemplo.mobyhook.Constants
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.adapters.AlbumAdapter
import com.ejemplo.mobyhook.databinding.FragmentItemListBinding

class ItemListFragment : Fragment() {
    private var _binding : FragmentItemListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentItemListBinding.inflate(inflater, container, false)
        initRecyclerView()
        return binding.root
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(binding.rvItemList.context)
        binding.rvItemList.layoutManager = manager
        binding.rvItemList.adapter = AlbumAdapter(
            Constants.getAll()) { album -> onItemSelected(album)  }
    }

    private fun onItemSelected(album: Album) {
        val request = ItemListFragmentDirections.actionItemListFragmentToDetailItemFragment(idAlbum = album.id)
        findNavController().navigate(request)
    }

}