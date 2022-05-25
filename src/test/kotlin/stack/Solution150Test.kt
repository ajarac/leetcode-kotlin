package stack

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Solution150Test {
    @Test
    fun test() {
        val solution = Solution150()

        assertEquals(9, solution.evalRPN(arrayOf("2", "1", "+", "3", "*")))
        assertEquals(6, solution.evalRPN(arrayOf("4", "13", "5", "/", "+")))
        assertEquals(22, solution.evalRPN(arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")))
    }
}
