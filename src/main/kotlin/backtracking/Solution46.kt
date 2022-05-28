package backtracking

class Solution46 {

    fun permute(nums: IntArray): List<List<Int>> {
        val result = arrayListOf<List<Int>>()

        if (nums.size == 1) {
            return listOf(listOf(nums[0]))
        }

        val queue = ArrayDeque<Int>()
        nums.forEach { queue.add(it) }

        for (index in nums.indices) {
            val root = queue.removeFirst()

            val permutations = permute(queue.toIntArray())

            for (permutation in permutations) {
                val mutableList = permutation.toMutableList()
                mutableList.add(root)
                result.add(mutableList)
            }

            queue.add(root)
        }
        return result.toList()
    }
}
