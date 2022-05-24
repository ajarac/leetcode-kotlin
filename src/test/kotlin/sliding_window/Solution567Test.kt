package sliding_window

import main.sliding_window.Solution567
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Solution567Test {
    @Test
    fun test() {
        val solution = Solution567()

        assertEquals(false, solution.checkInclusion("ab", "a"))
        assertEquals(true, solution.checkInclusion("adc", "dcda"))
        assertEquals(true, solution.checkInclusion("ab", "eidbaooo"))
        assertEquals(false, solution.checkInclusion("ab", "eidboaoo"))
    }
}
