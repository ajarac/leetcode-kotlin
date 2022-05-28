package backtracking

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class Solution46Test {
    @Test
    fun test() {
        val solution = Solution46()

        val result1 = solution.permute(intArrayOf(1, 2, 3))
        val expected1 = listOf(
            listOf(1, 2, 3),
            listOf(1, 3, 2),
            listOf(2, 1, 3),
            listOf(2, 3, 1),
            listOf(3, 1, 2),
            listOf(3, 2, 1)
        )
        assertTrue(result1.size == expected1.size && result1.containsAll(expected1) && expected1.containsAll(result1))


        val result2 = solution.permute(intArrayOf(0, 1))
        val expected2 = listOf(
            listOf(0, 1),
            listOf(1, 0),
        )
        assertTrue(result2.size == expected2.size && result2.containsAll(expected2) && expected2.containsAll(result2))

        val result3 = solution.permute(intArrayOf(1))
        val expected3 = listOf(
            listOf(1),
        )
        assertTrue(result3.size == expected3.size && result3.containsAll(expected3) && expected3.containsAll(result3))
    }
}
