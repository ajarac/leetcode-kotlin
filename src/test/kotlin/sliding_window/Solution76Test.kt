package sliding_window

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Solution76Test {
    @Test
    fun test() {
        val solution = Solution76()
        assertEquals("baca", solution.minWindow("acbbaca","aba"))
        assertEquals("aa", solution.minWindow("aa", "aa"))
        assertEquals("BANC", solution.minWindow("ADOBECODEBANC", "ABC"))
        assertEquals("a", solution.minWindow("a", "a"))
        assertEquals("", solution.minWindow("a", "aa"))
    }
}
