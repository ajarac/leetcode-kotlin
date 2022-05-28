package backtracking

class Solution39 {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result = arrayListOf<List<Int>>()

        fun backtracking(index: Int, combination: ArrayList<Int>, currentSum: Int) {
            // add combination to the list
            if (currentSum == target) {
                result.add(combination.toList())
                return
            }

            // discard combination
            if (index >= candidates.size ||  currentSum > target) {
                return
            }

            // calculate next combinations
            combination.add(candidates[index])
            backtracking(index, combination, currentSum + candidates[index])
            combination.removeAt(combination.size - 1)
            backtracking(index + 1, combination, currentSum)
        }

        backtracking(0, arrayListOf(), 0)
        return result.toList()
    }
}
