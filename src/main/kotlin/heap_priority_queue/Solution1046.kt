package heap_priority_queue

import java.util.*

class Solution1046 {
    fun lastStoneWeight(stones: IntArray): Int {
        val maxHeap = PriorityQueue<Int>()
        for (stone in stones) {
            maxHeap.add(-stone)
        }
        while (maxHeap.size > 1) {
            val stoneOne = -maxHeap.remove()
            val stoneTwo = -maxHeap.remove()
            if (stoneOne != stoneTwo) {
                maxHeap.add(-(stoneOne - stoneTwo))
            }
        }
        return if (maxHeap.isEmpty()) 0 else -maxHeap.remove()
    }
}
