package backtracking

class Solution51 {
    fun solveNQueens(n: Int): List<List<String>> {
        val columns = HashSet<Int>()
        val positiveDiagonals = HashSet<Int>() // row + column
        val negativeDiagonals = HashSet<Int>() // row - column

        val result = arrayListOf<List<String>>()
        val board = arrayListOf<Int>()
        fun backtracking(row: Int) {
            println(board)
            if (row == n) {
                result.add(buildSolution(board))
                return
            }
            for (column in 0 until n) {
                if (
                    columns.contains(column) ||
                    positiveDiagonals.contains(row + column) ||
                    negativeDiagonals.contains(row - column)
                ) {
                    continue
                }

                columns.add(column)
                positiveDiagonals.add(row + column)
                negativeDiagonals.add(row - column)
                board.add(column)
                backtracking(row + 1)

                columns.remove(column)
                positiveDiagonals.remove(row + column)
                negativeDiagonals.remove(row - column)
                board.removeAt(board.size - 1)
            }
        }

        backtracking(0)
        return result
    }

    private fun buildSolution(board: ArrayList<Int>): List<String> {
        val solution = arrayListOf<String>()
        board.forEach { column ->
            val rowBuilder = StringBuilder()
            repeat(board.size) { rowBuilder.append(".") }
            rowBuilder[column] = 'Q';
            solution.add(rowBuilder.toString())
        }
        return solution
    }
}
