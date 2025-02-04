package com.ejemplo.mobyhook

object Constants {
    fun getData():ArrayList<Album> {
        val albumsList = ArrayList<Album>()
        albumsList.add(Album(
            "News of the World",
            "Queen",
            1977,
            11,
            "Hard rock, arena rock",
            "EMI Records",
            "https://upload.wikimedia.org/wikipedia/en/e/ea/Queen_News_Of_The_World.png"
        ))
        albumsList.add(Album(
            "Nightflight to Venus",
            "Boney M.",
            1978,
            10,
            "Eurodisco, Reggae, Funk",
            "Atlantic Records",
            "https://en.wikipedia.org/wiki/Nightflight_to_Venus#/media/File:Boney_M._-_Nightflight_To_Venus.jpg",
        ))
        albumsList.add(Album(
            "Valió la Pena",
            "Marc Anthony",
            2004,
            8,
            "Salsa, Tropical",
            "Sony US Latin",
            "https://en.wikipedia.org/wiki/Vali%C3%B3_la_Pena#/media/File:Marc_Anthony_-_Vali%C3%B3_la_Pena.png",
        ))
        albumsList.add(Album(
            "Inmortalized",
            "Disturbed",
            2015,
            16,
            "Heavy metal, Alternative Metal",
            "Reprise Records",
            "https://upload.wikimedia.org/wikipedia/en/0/0b/Disturbed_immortalized_cover.jpg",
        ))
        albumsList.add(Album(
            "An Evening with Silk Sonic",
            "Bruno Mars, Anderson .Paak",
            2021,
            10,
            "R&B, Soul, Funk, Pop",
            "Aftermath Entertainment",
            "https://en.wikipedia.org/wiki/An_Evening_with_Silk_Sonic#/media/File:Silk_Sonic_-_An_Evening_with_Silk_Sonic.png",
        ))
        albumsList.add(Album(
            "Invincible Shield",
            "Judas Priest",
            2024,
            14,
            "Heavy metal",
            "Columbia Records",
            "https://upload.wikimedia.org/wikipedia/en/e/e5/Judas_Priest_-_Invincible_Shield.png",
        ))

        return albumsList
    }
    /*
    https://www.youtube.com/watch?v=aJb_g5YKyhQ

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
    * */
}