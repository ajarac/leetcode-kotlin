package stack

class Solution20 {

    private val map = mapOf<Char, Char>(Pair(')', '('), Pair('}', '{'), Pair(']', '['))

    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (char in s) {
            if (stack.isNotEmpty() && stack.last() == map[char]) {
                stack.removeLast()
            } else {
                stack.addLast(char)
            }
        }
        return stack.isEmpty()
    }
}
