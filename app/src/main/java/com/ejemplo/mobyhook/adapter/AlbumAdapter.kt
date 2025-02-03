package com.ejemplo.mobyhook.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ejemplo.mobyhook.Album
import com.ejemplo.mobyhook.databinding.ItemAlbumBinding

class ViewBindingAdapter(private var albumList: List<Album>) :
    RecyclerView.Adapter<ViewBindingAdapter.BindingViewHolder>() {

    inner class BindingViewHolder(private val bindingAdapter: ItemAlbumBinding):
        RecyclerView.ViewHolder(bindingAdapter.root) {
            fun bind(album: Album){
                bindingAdapter.tvAlbumName.setText(album.name)
                bindingAdapter.tvAlbumArtist.setText(album.artist)
                bindingAdapter.tvAlbumYear.setText(album.year)
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {
        val binding = ItemAlbumBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BindingViewHolder(binding)
    }

    override fun getItemCount(): Int = albumList.size

    override fun onBindViewHolder(holder: BindingViewHolder, position: Int) {
        val albumItem = albumList[position]
        holder.bind(albumItem)
    }
}

/*
RecyclerView.Adapter<Adapter.MyViewHolder>() {

    // This method creates a new ViewHolder object for each item in the RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate the layout for each item and return a new ViewHolder object
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_album, parent, false)
        return MyViewHolder(itemView)
    }

    // This method returns the total number of items in the data set
    override fun getItemCount(): Int = albumList.size

    // This method binds the data to the ViewHolder object for each item in the RecyclerView
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentAlbum = albumList[position]
        holder.name.text = currentAlbum.name
        holder.artist.text = currentAlbum.artist
        holder.year.text = currentAlbum.year.toString()
    }

    // This class defines the ViewHolder object for each item in the RecyclerView
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tvAlbumName)
        val artist: TextView = itemView.findViewById(R.id.tvAlbumArtist)
        val year: TextView = itemView.findViewById(R.id.tvAlbumYear)
    }
*/


/*
class AlbumAdapter (
    private val albumList:List<Album>,
    private val onClickListener:(Album) -> Unit
) : RecyclerView.Adapter<AlbumViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AlbumViewHolder(
            layoutInflater.inflate(
                R.layout.item_album, parent, false)
        )
    }

    override fun getItemCount(): Int = albumList.size

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val itemAlbum = albumList[position]
        holder.render(itemAlbum,onClickListener)
    }
}
*/

/*
package com.example.ejemplorecyclerview.adapter

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplorecyclerview.Equipo
import com.example.ejemplorecyclerview.R

class EquipoAdapter(
        private val equiposLista:List<Equipo>,
        private val onClickListener: (Equipo) -> Unit
    ) : RecyclerView.Adapter<EquipoViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EquipoViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return EquipoViewHolder(
                layoutInflater.inflate(
                    R.layout.item_equipos, parent, false)
            )
    }

    override fun getItemCount(): Int = equiposLista.size

    override fun onBindViewHolder(holder: EquipoViewHolder, position: Int) {
        val itemEquipo = equiposLista[position]
        holder.render(itemEquipo,onClickListener)
    }
}
* */