package backtracking

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class Solution78Test {
    @Test
    fun test() {
        val solution = Solution78()

        val subSet1 = solution.subsets(intArrayOf(1, 2, 3))
        val expected1 =
            listOf(listOf(), listOf(1), listOf(2), listOf(1, 2), listOf(3), listOf(1, 3), listOf(2, 3), listOf(1, 2, 3))
        assertTrue(
            subSet1.size == expected1.size && subSet1.containsAll(expected1) && expected1.containsAll(subSet1)
        )

        val subSet2 = solution.subsets(intArrayOf(0))
        val expected2 = listOf(listOf(), listOf(0))
        assertTrue(subSet2.size == expected2.size && subSet2.containsAll(expected2) && expected2.containsAll(subSet2))
    }
}

