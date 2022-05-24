package main.sliding_window

class Solution3 {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = HashSet<Char>()
        var left = 0
        var result = 0

        for (r in s.indices) {
            while (set.contains(s[r])) {
                set.remove(s[left])
                left++
            }
            set.add(s[r])
            result = Math.max(result, r - left  + 1)
        }
        return result
    }

}
