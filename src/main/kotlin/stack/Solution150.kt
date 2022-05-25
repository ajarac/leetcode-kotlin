package stack

class Solution150 {
    val setOp = setOf<String>("+", "-", "*", "/")
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()

        for (token in tokens) {
            if (setOp.contains(token)) {
                val b = stack.removeLast()
                val a = stack.removeLast()
                stack.addLast(operate(a, b, token))
            } else {
                stack.addLast(token.toInt())
            }
        }

        return stack[0]
    }

    private fun operate(a: Int, b: Int, op: String): Int {
        return when (op) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> a / b
            else -> 0
        }
    }
}
