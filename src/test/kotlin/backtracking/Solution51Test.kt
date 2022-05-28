package backtracking

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class Solution51Test {
    @Test
    fun test() {
        val solution = Solution51()

        val expected1 = listOf(
            listOf(".Q..", "...Q", "Q...", "..Q."),
            listOf("..Q.", "Q...", "...Q", ".Q..")
        )
        val result1 = solution.solveNQueens(4)

        assertTrue(expected1.size == result1.size && expected1.containsAll(result1) && result1.containsAll(expected1))

        val expected2 = listOf(
            listOf("Q"),
        )
        val result2 = solution.solveNQueens(1)
        assertTrue(expected2.size == result2.size && expected2.containsAll(result2) && result2.containsAll(expected2))
    }
}
