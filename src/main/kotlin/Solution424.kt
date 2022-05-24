package main

class Solution424 {
    fun characterReplacement(s: String, k: Int): Int {
        val map = mutableMapOf<Char, Int>()
        var l = 0
        var res = 0
        var max = 0

        for (r in s.indices) {
            map[s[r]] = map.getOrDefault(s[r], 0) + 1
            max = maxOf(max, map[s[r]]!!)
            while (r - l + 1 - max > k) {
                map[s[l]] = map[s[l]]!! - 1
                l++
            }
            res = maxOf(res, r - l + 1)
        }
        return res
    }
}
