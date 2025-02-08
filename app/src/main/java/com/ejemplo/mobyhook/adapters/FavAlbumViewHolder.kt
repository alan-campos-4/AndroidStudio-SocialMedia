package com.ejemplo.mobyhook.adapters

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.graphics.drawable.DrawableCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ejemplo.mobyhook.Album
import com.ejemplo.mobyhook.R
import com.ejemplo.mobyhook.databinding.ItemAlbumFavBinding

class FavAlbumViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemAlbumFavBinding.bind(view)

    fun render(albumModel: Album, onClickListener: (Album) -> Unit) {
        Glide.with(binding.ivAlbum.context).load(albumModel.picture).into(binding.ivAlbum)
        binding.tvAlbumName.text = albumModel.name
        binding.tvAlbumArtist.text = albumModel.artist
        binding.tvAlbumYear.text = albumModel.releaseDate.toString()
        binding.tvFavoriteDate.text = albumModel.favoriteDate.toString()

        if (albumModel.isFavorite())
            binding.btnFavorite.drawable.setTint(Color.BLACK)
        else
            binding.btnFavorite.drawable.setTint(Color.RED)

        binding.btnFavorite.setOnClickListener {
            if (albumModel.changeFavorite()) {
                if (albumModel.isFavorite()) {
                    binding.btnFavorite.drawable.setTint(Color.BLACK)
                    Toast.makeText(itemView.context,
                        this.itemView.context.getString(R.string.album_removed, albumModel.name),
                        Toast.LENGTH_SHORT
                    ).show()
                }
                else {
                    binding.btnFavorite.drawable.setTint(Color.RED)
                    Toast.makeText(itemView.context,
                        this.itemView.context.getString(R.string.album_added, albumModel.name),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

        itemView.setOnClickListener {
            onClickListener(albumModel)
        }
    }

}