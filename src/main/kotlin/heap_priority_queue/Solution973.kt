package heap_priority_queue

import java.util.*
import kotlin.math.sqrt

class Solution973 {

    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        val heap = PriorityQueue<IntArray>(compareBy { sqrt(it[0] * it[0].toDouble() + it[1] * it[1].toDouble()) })

        for (point in points) {
            heap.add(point)
        }
        val res = arrayListOf<IntArray>()
        var kk = k
        while (kk > 0) {
            res.add(heap.poll())
            kk--
        }

        return res.toTypedArray()
    }
}
