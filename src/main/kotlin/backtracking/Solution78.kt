package backtracking

class Solution78 {
    fun subsets(nums: IntArray): List<List<Int>> {
        val res = arrayListOf<List<Int>>()
        fun dfs(index: Int, subSet: List<Int>) {
            if (index == nums.size) {
                res.add(subSet)
                return
            }
            dfs(index + 1, subSet)
            val newSubSet = subSet.toMutableList()
            newSubSet.add(nums[index])
            dfs(index + 1, newSubSet)
        }
        dfs(0, listOf())
        return res
    }
}
