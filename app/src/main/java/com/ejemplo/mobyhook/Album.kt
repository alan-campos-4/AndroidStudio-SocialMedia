package com.ejemplo.mobyhook

import java.time.LocalDate

data class Album (
    val id:Int,
    val name:String,
    val artist:String,
    val releaseDate:LocalDate,
    val numTracks:Int,
    val genres:List<String>,
    val label:String,
    val picture:String,
    val members:List<String>,
    var favoriteDate:LocalDate?
):java.io.Serializable {
    fun changeFavorite():Boolean {
        if (this.isFavorite()) {
            return Constants.removeFavorite(this)
        }
        else {
            this.favoriteDate = LocalDate.now()
            return Constants.addFavorite(this)
        }
    }

    fun isFavorite():Boolean {
        if (Constants.getFavorites().isNotEmpty()) {
            for (album in Constants.getFavorites()) {
                if (album.id == this.id) {
                    return true
                }
            }
        }
        return false
    }
}
