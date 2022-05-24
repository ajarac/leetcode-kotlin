package sliding_window

import main.sliding_window.Solution3
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Solution3Test {

    @Test
    fun test() {
        val solution = Solution3()
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"))
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"))
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"))
    }
}
