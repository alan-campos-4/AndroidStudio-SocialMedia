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
import com.ejemplo.mobyhook.databinding.ItemAlbumBinding


class AlbumViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemAlbumBinding.bind(view)

    fun render(albumModel: Album, onClickListener: (Album) -> Unit) {
        binding.tvAlbumName.text = albumModel.name
        binding.tvAlbumArtist.text = albumModel.artist
        albumModel.year.toString().also { binding.tvAlbumYear.text = it }
        if (albumModel.favorite)
            binding.btnFavorite.setColorFilter(R.color.black)
        else
            binding.btnFavorite.setColorFilter(R.color.red)
        Glide.with(binding.ivAlbum.context).load(albumModel.picture).into(binding.ivAlbum)

        val unwrappedDrawable = AppCompatResources.getDrawable(itemView.context, R.drawable.ic_heart)
        val wrappedDrawable = DrawableCompat.wrap(unwrappedDrawable!!)
        if (albumModel.favorite)
            DrawableCompat.setTint(wrappedDrawable, Color.RED)
        else
            DrawableCompat.setTint(wrappedDrawable, Color.BLACK)

        binding.btnFavorite.setOnClickListener {
            if (!albumModel.favorite) {
                albumModel.changeFavorite()
                DrawableCompat.setTint(wrappedDrawable, Color.RED)
                Toast.makeText(itemView.context,
                    albumModel.name+" has been added to your favorites.",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else {
                albumModel.changeFavorite()
                DrawableCompat.setTint(wrappedDrawable, Color.BLACK)
                Toast.makeText(itemView.context,
                    albumModel.name+" has been removed from your favorites.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        itemView.setOnClickListener {
            onClickListener(albumModel)
        }
    }

}