package binary_search

class Solution74 {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        // first find row
        val rowLength = matrix[0].size
        var left = 0
        var right = matrix.size - 1
        var row = -1
        while (left <= right) {
            val mid = (left + right) / 2
            if (matrix[mid][0] <= target && target <= matrix[mid][rowLength - 1]) {
                row = mid
                break
            } else if (matrix[mid][0] < target) {
                left = mid + 1
            } else if (matrix[mid][0] > target) {
                right = mid - 1
            }
        }

        if (row == -1) {
            return false
        }
        left = 0
        right = rowLength - 1
        // then find the target in our row
        while (left <= right) {
            val mid = (left + right) / 2
            if (matrix[row][mid] == target) {
                return true
            } else if (matrix[row][mid] < target) {
                left = mid + 1
            } else if (matrix[row][mid] > target) {
                right = mid - 1
            }
        }

        return false
    }
}
