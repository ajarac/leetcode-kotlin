package backtracking

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class Solution39Test {
    @Test
    fun test() {
        val solution = Solution39()


        val result1 = solution.combinationSum(intArrayOf(2, 3, 6, 7), 7)
        val expected1 = listOf(
            listOf(2, 2, 3),
            listOf(7)
        )
        assertTrue(result1.size == expected1.size && result1.containsAll(expected1) && expected1.containsAll(result1))
        val result2 = solution.combinationSum(intArrayOf(2, 3, 5), 8)
        val expected2 = listOf(
            listOf(2, 2, 2, 2),
            listOf(2, 3, 3),
            listOf(3, 5)
        )
        assertTrue(result2.size == expected2.size && result2.containsAll(expected2) && expected2.containsAll(result2))

        val result3 = solution.combinationSum(intArrayOf(2), 1)
        val expected3 = listOf<List<Int>>()
        assertTrue(result3.size == expected3.size && result3.containsAll(expected3) && expected3.containsAll(result3))
    }
}

