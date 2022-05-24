package heap_priority_queue

import java.util.*

class Solution703(private val k: Int, nums: IntArray) {

    private val kManager  = PriorityQueue<Int>()

    init {
        for (element in nums) {
            add(element)
        }
    }

    fun add(`val`: Int): Int {
        kManager.offer(`val`)
        if (kManager.size > k) {
            kManager.poll()
        }

        return kManager.peek();
    }
}
