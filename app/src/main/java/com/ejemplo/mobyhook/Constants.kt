package com.ejemplo.mobyhook

object Constants {
    private val albumsList = listOf<Album>(
        Album(
            1,
            "News of the World",
            "Queen",
            1977,
            11,
            "Hard Rock, Arena Rock",
            "EMI Records",
            "https://upload.wikimedia.org/wikipedia/en/e/ea/Queen_News_Of_The_World.png",
            true
        ),
        Album(
            2,
            "Nightflight to Venus",
            "Boney M.",
            1978,
            10,
            "Eurodisco, Reggae, Funk",
            "Atlantic Records", //needs new link
            "https://en.wikipedia.org/wiki/Nightflight_to_Venus#/media/File:Boney_M._-_Nightflight_To_Venus.jpg",
            false
        ),
        Album(
            3,
            "Valió la Pena",
            "Marc Anthony",
            2004,
            8,
            "Salsa, Tropical",
            "Sony US Latin", //needs new link
            "https://en.wikipedia.org/wiki/Vali%C3%B3_la_Pena#/media/File:Marc_Anthony_-_Vali%C3%B3_la_Pena.png",
            false
        ),
        Album(
            4,
            "Marvin's Marvelous Mechanical Museum",
            "Tally Hall",
            2005,
            17,
            "Alternative Rock, Garage Rock",
            "Quack! Media",
            "https://upload.wikimedia.org/wikipedia/en/a/a0/Tally_Hall_Marvin%27s_Marvelous_Mechanical_Museum_2005.png",
            false
        ),
        Album(
            5,
            "Inmortalized",
            "Disturbed",
            2015,
            16,
            "Heavy Metal, Alternative Metal",
            "Reprise Records",
            "https://upload.wikimedia.org/wikipedia/en/0/0b/Disturbed_immortalized_cover.jpg",
            false
        ),
        Album(
            6,
            "An Evening with Silk Sonic",
            "Bruno Mars, Anderson .Paak",
            2021,
            10,
            "R&B, Soul, Funk, Pop",
            "Aftermath Entertainment", //needs new link
            "https://en.wikipedia.org/wiki/An_Evening_with_Silk_Sonic#/media/File:Silk_Sonic_-_An_Evening_with_Silk_Sonic.png",
            true
        ),
        Album(
            7,
            "Invincible Shield",
            "Judas Priest",
            2024,
            14,
            "Heavy Metal",
            "Columbia Records",
            "https://upload.wikimedia.org/wikipedia/en/e/e5/Judas_Priest_-_Invincible_Shield.png",
            true
        )
    )

    fun changeFavorite(album: Album) {
        if (album.favorite)
            album.favorite = false
        else
            album.favorite = true
    }

    fun getAll():List<Album> { return albumsList }

    fun getFavorites():List<Album> {
        val favAlbumsList = ArrayList<Album>()
        for (album in getAll()) {
            if (album.favorite)
                favAlbumsList.add(album)
        }
        return favAlbumsList
    }
}