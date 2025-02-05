package com.ejemplo.mobyhook

import android.content.Context
import android.widget.Toast

data class Album (
    val id:Int,
    val name:String,
    val artist:String,
    val year:Int,
    val numTracks:Int,
    val genres:String,
    val label:String,
    val picture:String,
    var favorite:Boolean):java.io.Serializable
{
    fun changeFavorite(context: Context) {
        if (favorite) {
            favorite = false
            if (Constants.removeFavorite(this)) {
                Toast.makeText(context,
                    this.name+" has been added to your favorites.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        else {
            favorite = true
            if (Constants.addFavorite(this)) {
                Toast.makeText(context,
                    this.name+" has been removed from your favorites.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
