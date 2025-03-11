package com.ejemplo.mobyhook.fragments.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.ejemplo.mobyhook.Album
import com.ejemplo.mobyhook.Constants
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.databinding.FragmentItemDetailBinding

class DetailItemFragment : Fragment() {
    private var _binding : FragmentItemDetailBinding? = null
    private val binding get() = _binding!!
    private val args:DetailItemFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentItemDetailBinding.inflate(inflater, container, false)
        val album: Album? = Constants.getAll().find { it.id == args.idAlbum }
        if (album != null) {
            Glide.with(binding.headerImage.context).load(album.picture).into(binding.headerImage)
            binding.tvShowName.text = album.name
            binding.tvShowArtist.text = album.artist
            binding.tvShowYear.text = album.releaseDate.toString()
            binding.tvShowLabel.text = getString(R.string.display_label, album.label)
            binding.tvShowTracks.text = getString(R.string.display_track, album.numTracks.toString())
            binding.tvShowGenre.text = getString(R.string.display_genre, album.genres)
            binding.btnBack.setOnClickListener{
                findNavController().navigateUp()
            }
        }
        return binding.root
    }

}