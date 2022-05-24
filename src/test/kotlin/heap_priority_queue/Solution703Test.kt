package heap_priority_queue

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Solution703Test {
    @Test
    fun test() {
        val solution = Solution703(3, intArrayOf(4, 5, 8, 2))
        assertEquals(4, solution.add(3))
        assertEquals(5, solution.add(5))
        assertEquals(5, solution.add(10))
        assertEquals(8, solution.add(9))
        assertEquals(8, solution.add(4))
    }

}
