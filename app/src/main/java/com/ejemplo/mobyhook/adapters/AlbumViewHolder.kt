package com.ejemplo.mobyhook.adapters

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ejemplo.mobyhook.Album
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.databinding.ItemAlbumBinding

class AlbumViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemAlbumBinding.bind(view)

    fun render(albumModel: Album, onClickListener: (Album) -> Unit) {
        binding.tvAlbumName.text = albumModel.name
        binding.tvAlbumArtist.text = albumModel.artist
        albumModel.year.toString().also { binding.tvAlbumYear.text = it }
        Glide.with(binding.ivAlbum.context).load(albumModel.picture).into(binding.ivAlbum)

        renderFavoriteIcon(albumModel)
        binding.btnFavorite.setOnClickListener {
            albumModel.changeFavorite();
            renderFavoriteIcon(albumModel)
        }

        itemView.setOnClickListener {
            onClickListener(albumModel)
        }
    }

    fun renderFavoriteIcon(album: Album) {
        if (album.favorite)
            binding.btnFavorite.setColorFilter(ContextCompat.getColor(itemView.context, R.color.red))
        else
            binding.btnFavorite.setColorFilter(ContextCompat.getColor(itemView.context, R.color.black))
    }
}