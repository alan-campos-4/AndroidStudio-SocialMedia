package com.ejemplo.mobyhook

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ejemplo.mobyhook.Album
import com.ejemplo.mobyhook.databinding.ItemAlbumBinding

class AlbumViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemAlbumBinding.bind(view)

    fun render(album:Album, onClickListener: (Album) -> Unit) {
        binding.tvAlbumName.text = album.name
        binding.tvAlbumArtist.text = album.artist
        binding.tvAlbumYear.text = album.year.toString()
        Glide.with(binding.ivAlbum.context).load(album.picture).into(binding.ivAlbum)
        itemView.setOnClickListener {
            onClickListener(album)
        }
        binding.ivAlbum.setOnClickListener {
            Toast.makeText(
                binding.ivAlbum.context,
                album.name,
                Toast.LENGTH_SHORT
            ).show()
        }
        itemView.setOnClickListener {
            Toast.makeText(
                binding.ivAlbum.context,
                album.name,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}

/*
package com.example.ejemplorecyclerview.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ejemplorecyclerview.Equipo
import com.example.ejemplorecyclerview.databinding.ItemEquiposBinding

class EquipoViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemEquiposBinding.bind(view)

    fun render(equipoModel:Equipo, onClickListener: (Equipo) -> Unit){
        binding.tvEquipoName.text = equipoModel.equipo
        binding.tvEquipoLiga.text = equipoModel.liga
        binding.tvEquipoEstadio.text = equipoModel.estadio
        Glide.with(binding.ivEquipo.context)
            .load(equipoModel.foto).into(binding.ivEquipo)
        itemView.setOnClickListener{
            onClickListener(equipoModel)
        }
        /**
        binding.ivEquipo.setOnClickListener{
            Toast.makeText(
                binding.ivEquipo.context,
                equipoModel.equipo,
                Toast.LENGTH_SHORT
            ).show()
        }
        itemView.setOnClickListener{
            Toast.makeText(
                binding.ivEquipo.context,
                equipoModel.equipo,
                Toast.LENGTH_SHORT
            ).show()
        }*/
    }

}
* */