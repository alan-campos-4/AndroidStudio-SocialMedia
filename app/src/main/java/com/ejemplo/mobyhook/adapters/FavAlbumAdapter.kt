package com.ejemplo.mobyhook.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ejemplo.mobyhook.Album
import com.ejemplo.mobyhook.R

class FavAlbumAdapter(
    private val albumList:List<Album>,
    private val onClickListener:(Album) -> Unit
) : RecyclerView.Adapter<FavAlbumViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavAlbumViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FavAlbumViewHolder(
            layoutInflater.inflate(R.layout.item_album_fav, parent, false)
        )
    }

    override fun getItemCount(): Int = albumList.size

    override fun onBindViewHolder(holder: FavAlbumViewHolder, position: Int) {
        val item = albumList[position]
        holder.render(item, onClickListener)
    }
}
