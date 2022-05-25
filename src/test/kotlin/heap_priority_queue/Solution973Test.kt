package heap_priority_queue

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class Solution973Test {
    @Test
    fun test() {
        val solution = Solution973()

        assertArrayEquals(
            arrayOf(intArrayOf(-2, 2)),
            solution.kClosest(arrayOf(intArrayOf(1, 3), intArrayOf(-2, 2)), 1)
        )
        assertArrayEquals(
            arrayOf(intArrayOf(3, 3), intArrayOf(-2, 4)),
            solution.kClosest(arrayOf(intArrayOf(3, 3), intArrayOf(5, -1), intArrayOf(-2, 4)), 2)
        )
    }
}
