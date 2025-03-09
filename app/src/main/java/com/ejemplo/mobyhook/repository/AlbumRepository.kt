package com.ejemplo.mobyhook.repository

import com.ejemplo.mobyhook.Album
import java.time.LocalDate

class AlbumRepository {

    private val _favList : MutableList<Album> = mutableListOf<Album>()

    private val _albumList : MutableList<Album> = mutableListOf<Album>(
        Album(
            1,
            "News of the World",
            "Queen",
            LocalDate.parse("1977-10-28"),
            11,
            listOf("Hard Rock", "Arena Rock"),
            "EMI Records",
            "https://upload.wikimedia.org/wikipedia/en/e/ea/Queen_News_Of_The_World.png",
            listOf("Freddie Mercury", "Brian May", "Roger Taylor", "John Deacon"),
            true,
            null
        ),
        Album(
            2,
            "Nightflight to Venus",
            "Boney M.",
            LocalDate.parse("1978-06-23"),
            10,
            listOf("Eurodisco", "Reggae", "Funk"),
            "Atlantic Records",
            "https://upload.wikimedia.org/wikipedia/en/8/86/Boney_M._-_Nightflight_To_Venus.jpg",
            listOf("Liz Mitchell", "Marcia Barrett", "Maizie Williams", "Bobby Farrell"),
            false,
            null
        ),
        Album(
            3,
            "Valió la Pena",
            "Marc Anthony",
            LocalDate.parse("2004-07-27"),
            8,
            listOf("Salsa", "Tropical"),
            "Sony US Latin",
            "https://upload.wikimedia.org/wikipedia/en/6/6c/Marc_Anthony_-_Vali%C3%B3_la_Pena.png",
            listOf("Marc Anthony"),
            false,
            null
        ),
        Album(
            4,
            "Marvin's Marvelous Mechanical Museum",
            "Tally Hall",
            LocalDate.parse("2005-10-24"),
            17,
            listOf("Alternative Rock", "Garage Rock"),
            "Quack! Media",
            "https://upload.wikimedia.org/wikipedia/en/a/a0/Tally_Hall_Marvin%27s_Marvelous_Mechanical_Museum_2005.png",
            listOf("Rob Cantor", "Joey Hawley", "Zubin Sedghi", "Andrew Horowitz", "Ross Federman"),
            true,
            null
        ),
        Album(
            5,
            "Immortalized",
            "Disturbed",
            LocalDate.parse("2015-08-21"),
            16,
            listOf("Heavy Metal", "Alternative Metal"),
            "Reprise Records",
            "https://upload.wikimedia.org/wikipedia/en/0/0b/Disturbed_immortalized_cover.jpg",
            listOf("David Draiman", "Dan Donegan", "Mike Wengren", "John Moyer"),
            true,
            null
        ),
        Album(
            6,
            "An Evening with Silk Sonic",
            "Bruno Mars, Anderson .Paak",
            LocalDate.parse("2021-11-12"),
            10,
            listOf("R&B", "Soul", "Funk", "Pop"),
            "Aftermath Entertainment",
            "https://s3.amazonaws.com/media.thecrimson.com/photos/2021/12/30/211516_1353599.jpg",
            listOf("Bruno Mars", "Anderson .Paak"),
            false,
            null
        ),
        Album(
            7,
            "Invincible Shield",
            "Judas Priest",
            LocalDate.parse("2024-03-06"),
            14,
            listOf("Heavy Metal"),
            "Columbia Records",
            "https://upload.wikimedia.org/wikipedia/en/e/e5/Judas_Priest_-_Invincible_Shield.png",
            listOf("Rob Halford", "Glen Tipton", "Richie Faulkner", "Ian Hill", "Scott Travis"),
            false,
            null
        )
    )

    val albumList get() = _albumList

    fun resetList() : MutableList<Album> {
        _albumList.shuffle()
        return albumList
    }
}