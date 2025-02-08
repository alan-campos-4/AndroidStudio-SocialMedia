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
    var favorite:Boolean,
    var favoriteDate:LocalDate?
):java.io.Serializable {
    fun changeFavorite():Boolean {
        if (!this.favorite) {
            this.favorite = true
            this.favoriteDate = LocalDate.now()
            return Constants.addFavorite(this)
        }
        else {
            this.favorite = false
            return Constants.removeFavorite(this)
        }
    }
    fun isFavorite():Boolean { return this.favorite }
}
