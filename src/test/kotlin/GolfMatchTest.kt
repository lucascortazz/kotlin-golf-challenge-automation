import kotlin.test.*

class GolfMatchTest {
    @Test 
    fun p1Wins (){
        val match = GolfMatch()

        listOf("P1", "P1", "P2", "P1", "P1").forEach {
            match.playHole(it)
        }

        assertEquals("P1", match.winner)
        assertEquals(4, match.p1)
        assertEquals(1, match.p2) 
    }

    @Test
    fun noWinner(){ //at 4 to 3
        val match = GolfMatch()

        listOf("P1", "P1", "P1", "P2", "P2", "P2", "P1").forEach {
            match.playHole(it)
        }

        assertNull(match.winner)
    }
}