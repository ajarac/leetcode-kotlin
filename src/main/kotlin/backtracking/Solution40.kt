package backtracking

class Solution40 {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val result = arrayListOf<List<Int>>()
        candidates.sort()
        val map = hashMapOf<Int, Int>()
        candidates.forEach { map[it] = map.getOrDefault(it, 0) + 1 }

        fun backtracking(i: Int, combination: ArrayList<Int>, mapUsed: HashMap<Int, Int>, currentSum: Int) {
            var index = i

            // add combination to the list
            if (currentSum == target) {
                result.add(combination.toList())
                return
            }

            // discard combination
            if (index >= candidates.size || currentSum > target) {
                return
            }

            // if we have already used more times that num
            if (mapUsed.getOrDefault(candidates[index], 0) > map[candidates[index]]!!) {
                return
            }

            // calculate next combinations
            // 1 - adding new value
            combination.add(candidates[index])
            mapUsed[candidates[index]] = mapUsed.getOrDefault(candidates[index], 0) + 1
            backtracking(index + 1, combination, mapUsed, currentSum + candidates[index])

            // 2 - skipping new value
            combination.removeAt(combination.size - 1)
            mapUsed[candidates[index]] = mapUsed.getOrDefault(candidates[index], 0) - 1
            while (index + 1 < candidates.size && candidates[index] == candidates[index + 1]) {
                index++
            }
            backtracking(index + 1, combination, mapUsed, currentSum)
        }
        backtracking(0, arrayListOf(), hashMapOf(), 0)
        return result
    }
}
