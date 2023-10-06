package com.bignerdranch.nyethack

lateinit var player: Player

fun main() {
    narrate("Welcome to NyetHack!")
    val playerName = promptHeroName()
    player = Player(playerName)
//    changeNarratorMood()
    player.prophesize()
    var currentRoom: Room = TownSquare()
    val mortality = if (player.isImmortal) "an immortal" else "a mortal"
    narrate("${player.name} of ${player.hometown}, ${player.title}, heads to the town square")
    narrate("${player.name}, $mortality, has ${player.healthPoints} health points")
    currentRoom.enterRoom()

    player.castFireball()
    player.prophesize()
}

private fun promptHeroName(): String {
    narrate("A hero enters the town of Kronstadt. What is their name?") { message ->
        //  Prints the message in yellow
        "\u001b[33;1m$message\u001b[0m"
    }
//    val heroName = readLine()
//    require(heroName != null && heroName.isNotEmpty()) {
//        "The hero must have a name"
//    }
    println("Madrigal")
    return "Madrigal"
}