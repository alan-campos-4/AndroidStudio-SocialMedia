package com.ejemplo.mobyhook

object Constants {
    // Arraylist and return the Arraylist
    fun getAlbumData():ArrayList<Album>{
        // create an arraylist of type employee class
        val albumsList = ArrayList<Album>()
        val emp1 = Album(
            "Nightflight to Venus",
            "Boney M.",
            1978,
            "https://en.wikipedia.org/wiki/Nightflight_to_Venus#/media/File:Boney_M._-_Nightflight_To_Venus.jpg"
        )
        albumsList.add(emp1)
        val emp2 = Album(
            "Valió la Pena",
            "Marc Anthony",
            2004,
            "https://en.wikipedia.org/wiki/Vali%C3%B3_la_Pena#/media/File:Marc_Anthony_-_Vali%C3%B3_la_Pena.png"
        )
        albumsList.add(emp2)
        val emp3 = Album(
            "An Evening with Silk Sonic",
            "Bruno Mars, Anderson .Paak",
            2021,
            "https://en.wikipedia.org/wiki/An_Evening_with_Silk_Sonic#/media/File:Silk_Sonic_-_An_Evening_with_Silk_Sonic.png"
        )
        albumsList.add(emp3)
        val emp4 = Album(
            "Invincible Shield",
            "Judas Priest",
            2024,
            "https://upload.wikimedia.org/wikipedia/en/e/e5/Judas_Priest_-_Invincible_Shield.png")
        albumsList.add(emp4)

        return albumsList
    }
    /*
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