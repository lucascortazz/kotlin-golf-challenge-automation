class GolfMatch {
    var p1 = 0
    var p2 = 0
    var winner: String? = null
        private set
    
    fun playHole(player: String) {
        if (winner != null) return
        if (player == "P1") p1++ else if (player == "P2") p2++
        else throw IllegalArgumentException("Invalid player")

        if (p1 >= 4 && p1 - p2 >= 2) winner = "P1"
        if (p2 >= 4 && p2 - p1 >= 2) winner = "P2"
    }
}