package sliding_window

import main.sliding_window.Solution424
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Solution424Test {
    @Test
    fun test() {
        val solution = Solution424()
        assertEquals(3, solution.characterReplacement("BAAA", 0))
        assertEquals(4, solution.characterReplacement("ABAB", 2))
        assertEquals(4, solution.characterReplacement("AABABBA", 1))

    }
}
