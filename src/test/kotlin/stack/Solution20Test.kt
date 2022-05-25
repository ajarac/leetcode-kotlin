package stack

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Solution20Test {
    @Test
    fun test() {
        val solution = Solution20()
        assertEquals(false, solution.isValid("([)]"))
        assertEquals(true, solution.isValid("()"))
        assertEquals(true, solution.isValid("()[]{}"))
        assertEquals(false, solution.isValid("(]"))
    }
}
