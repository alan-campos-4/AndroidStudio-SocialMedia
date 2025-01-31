package com.ejemplo.mobyhook

class AlbumProvider {
    companion object{
        val albumList = listOf<Album>(
            Album(
                "An Evening with Silk Sonic",
                "Bruno Mars, Anderson .Paak",
                2021,
                "https://en.wikipedia.org/wiki/An_Evening_with_Silk_Sonic#/media/File:Silk_Sonic_-_An_Evening_with_Silk_Sonic.png"
            ),
            Album(
                "Nightflight to Venus",
                "Boney M.",
                1978,
                "https://en.wikipedia.org/wiki/Nightflight_to_Venus#/media/File:Boney_M._-_Nightflight_To_Venus.jpg"
            ),
            Album(
                "Invincible Shield",
                "Judas Priest",
                2024,
                "https://upload.wikimedia.org/wikipedia/en/e/e5/Judas_Priest_-_Invincible_Shield.png"
            )
        )
    }
}