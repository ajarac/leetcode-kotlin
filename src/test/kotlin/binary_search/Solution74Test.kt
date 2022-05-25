package binary_search

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Solution74Test {
    @Test
    fun test() {
        val solution = Solution74()

        assertEquals(
            true,
            solution.searchMatrix(
                arrayOf(
                    intArrayOf(1, 3, 5, 7),
                    intArrayOf(10, 11, 16, 20),
                    intArrayOf(23, 30, 34, 60)
                ), 3
            )
        )
        assertEquals(
            true,
            solution.searchMatrix(
                arrayOf(
                    intArrayOf(1, 3, 5, 7),
                    intArrayOf(10, 11, 16, 20),
                    intArrayOf(23, 30, 34, 60)
                ), 3
            )
        )
    }
}
