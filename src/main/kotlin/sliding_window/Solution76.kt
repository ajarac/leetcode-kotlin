package sliding_window

class Solution76 {

    fun minWindow(s: String, t: String): String {
        val countT = HashMap<Char, Int>()
        t.forEach { countT[it] = countT.getOrDefault(it, 0) + 1 }
        var have = 0
        val needed = t.length
        var l = 0
        val window = HashMap<Char, Int>()
        var res = IntRange(-1, -1)
        var resLength = Integer.MAX_VALUE

        for (r in s.indices) {
            val c = s[r]
            window[c] = window.getOrDefault(c, 0) + 1

            if (countT.contains(c) && countT[c] == window[c]) {
                have += countT[c]!!
            }

            while (have == needed) {
                if (r - l + 1 < resLength) {
                    res = IntRange(l, r)
                    resLength = r - l + 1
                }
                window[s[l]] = window[s[l]]!! - 1
                if (countT.contains(s[l]) && window[s[l]]!! < countT[s[l]]!!) {
                    have -= countT[s[l]]!!
                }
                l++
            }
        }
        return if (resLength != Integer.MAX_VALUE) {
            s.slice(res)
        } else {
            ""
        }
    }
}
