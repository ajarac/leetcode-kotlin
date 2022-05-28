package graphs

class Solution200 {
    fun numIslands(grid: Array<CharArray>): Int {
        var islands = 0
        fun visitIsland(row: Int, column: Int) {
            if (grid.getOrNull(row) == null || grid[row].getOrNull(column) == null) {
                return
            }
            if (grid[row][column] == '1') {
                grid[row][column] = '0'
                visitIsland(row - 1, column)
                visitIsland(row, column - 1)
                visitIsland(row + 1, column)
                visitIsland(row, column + 1)
            }
        }

        for (row in grid.indices) {
            for (column in grid[row].indices) {
                if (grid[row][column] == '1') {
                    islands++
                    visitIsland(row, column)
                }
            }
        }

        return islands
    }
}
