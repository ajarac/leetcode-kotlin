package backtracking

class Solution90 {

    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        if (nums.isEmpty()) {
            return listOf()
        }
        nums.sort()
        val result = arrayListOf<List<Int>>()

        fun backtracking(i: Int, subset: ArrayList<Int>) {
            var index = i;
            if (index == nums.size) {
                result.add(subset.clone() as List<Int>)
                return
            }
            subset.add(nums[index])
            backtracking(index + 1, subset)
            subset.removeAt(subset.size - 1)
            while (index + 1 < nums.size && nums[index] == nums[index + 1]) {
                index++
            }
            backtracking(index + 1, subset)
        }
        backtracking(0, arrayListOf())
        return result.toList()
    }
}
