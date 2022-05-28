package backtracking

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class Solution40Test {
    @Test
    fun test() {
        val solution = Solution40()
        val result1 = solution.combinationSum2(intArrayOf(10, 1, 2, 7, 6, 1, 5), 8)
        val expected1 = listOf(
            listOf(1, 1, 6),
            listOf(1, 2, 5),
            listOf(1, 7),
            listOf(2, 6)
        )
        Assertions.assertTrue(
            result1.size == expected1.size && result1.containsAll(expected1) && expected1.containsAll(
                result1
            )
        )
        val result2 = solution.combinationSum2(intArrayOf(2, 5, 2, 1, 2), 5)
        val expected2 = listOf(listOf(1, 2, 2), listOf(5))
        Assertions.assertTrue(
            result2.size == expected2.size && result2.containsAll(expected2) && expected2.containsAll(
                result2
            )
        )
    }
}
