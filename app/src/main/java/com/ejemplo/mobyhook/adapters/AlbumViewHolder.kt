package com.ejemplo.mobyhook.adapters

import android.graphics.Color
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ejemplo.mobyhook.Album
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.databinding.ItemAlbumBinding

class AlbumViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemAlbumBinding.bind(view)

    fun render(albumModel: Album, onClickListener: (Album) -> Unit) {
        Glide.with(binding.ivAlbum.context).load(albumModel.picture).into(binding.ivAlbum)
        binding.tvAlbumName.text = albumModel.name
        binding.tvAlbumArtist.text = albumModel.artist
        binding.tvAlbumYear.text = albumModel.releaseDate.toString().split("-")[0]

        if (albumModel.isFavorite())
            binding.btnFavorite.drawable.setTint(Color.RED)
        else
            binding.btnFavorite.drawable.setTint(Color.BLACK)

        binding.btnFavorite.setOnClickListener {
            if (albumModel.changeFavorite()) {
                if (albumModel.isFavorite()) {
                    binding.btnFavorite.drawable.setTint(Color.RED)
                    showToast(getString(R.string.album_added, albumModel.name))
                }
                else {
                    binding.btnFavorite.drawable.setTint(Color.BLACK)
                    showToast(getString(R.string.album_removed, albumModel.name))
                }
            } else {
                showToast(getString(R.string.album_error))
            }
        }

        itemView.setOnClickListener {
            onClickListener(albumModel)
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(itemView.context, message, Toast.LENGTH_SHORT).show()
    }
    private fun getString(Rstring: Int): String {
        return this.itemView.context.getString(Rstring)
    }
    private fun getString(Rstring: Int, name: String): String {
        return this.itemView.context.getString(Rstring, name)
    }

}