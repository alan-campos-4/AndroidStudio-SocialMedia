package com.ejemplo.mobyhook.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ejemplo.mobyhook.Album
import com.ejemplo.mobyhook.R

class AlbumAdapter(
    private val albumList:List<Album>,
    private val onClickListener:(Album) -> Unit
) : RecyclerView.Adapter<AlbumViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AlbumViewHolder(
            layoutInflater.inflate(R.layout.item_album, parent, false)
        )
    }

    override fun getItemCount(): Int = albumList.size

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val item = albumList[position]
        holder.render(item, onClickListener)
    }
}
