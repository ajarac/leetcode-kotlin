package heap_priority_queue

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Solution1046Test {
    @Test
    fun test() {
        val solution = Solution1046()

        assertEquals(1, solution.lastStoneWeight(intArrayOf(2, 7, 4, 1, 8, 1)))
        assertEquals(1, solution.lastStoneWeight(intArrayOf(1)))
    }
}
