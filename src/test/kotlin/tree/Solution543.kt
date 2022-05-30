package tree

class Solution543 {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        var result = 0

        fun dfs(node: TreeNode?): Int {
            if (node == null) {
                return -1
            }

            val left = dfs(node.left)
            val right = dfs(node.right)
            result = Math.max(result, 2 + left + right)

            return 1 + Math.max(left, right)
        }
        dfs(root)
        return result
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
