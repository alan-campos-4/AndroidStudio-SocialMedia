package com.ejemplo.mobyhook

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
    fun changeFavorite() {
        if (favorite)
            favorite = false
        else
            favorite = true
    }
}
