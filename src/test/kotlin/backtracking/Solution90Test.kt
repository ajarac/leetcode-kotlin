package backtracking

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class Solution90Test {
    @Test
    fun test() {
        val solution = Solution90()

        val result1 = solution.subsetsWithDup(intArrayOf(1, 2, 2))
        val expected1 = listOf(
            listOf(), listOf(1), listOf(1, 2), listOf(1, 2, 2), listOf(2), listOf(2, 2)
        )
        assertTrue(result1.size == expected1.size && result1.containsAll(expected1) && expected1.containsAll(result1))

        val result2 = solution.subsetsWithDup(intArrayOf(0))
        val expected2 = listOf(listOf(), listOf(0))
        assertTrue(result2.size == expected2.size && result2.containsAll(expected2) && expected2.containsAll(result2))
    }
}
