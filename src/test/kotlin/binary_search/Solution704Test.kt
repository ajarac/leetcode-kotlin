package binary_search

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Solution704Test {
    @Test
    fun test() {
        val solution = Solution704()

        assertEquals(4, solution.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
        assertEquals(-1, solution.search(intArrayOf(-1, 0, 3, 5, 9, 12), 2))
    }
}
