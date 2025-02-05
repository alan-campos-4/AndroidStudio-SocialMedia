package com.ejemplo.mobyhook.adapters

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ejemplo.mobyhook.Album
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.databinding.ItemAlbumFavBinding

class FavAlbumViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemAlbumFavBinding.bind(view)

    fun render(albumModel: Album, onClickListener: (Album) -> Unit) {
        binding.tvAlbumName.text = albumModel.name
        binding.tvAlbumArtist.text = albumModel.artist
        albumModel.year.toString().also { binding.tvAlbumYear.text = it }
        Glide.with(binding.ivAlbum.context).load(albumModel.picture).into(binding.ivAlbum)

        itemView.setOnClickListener {
            onClickListener(albumModel)
        }
    }
}