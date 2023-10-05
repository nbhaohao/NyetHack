val player = Player()

fun main() {
//    changeNarratorMood()
    narrate("${player.name} is ${player.title}")
    player.changeName("Aurelia")
    narrate("${player.name}, ${player.title}, heads to the town square")
    visitTavern()
    player.castFireball()
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