package main

class Solution567 {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) {
            return false
        }
        val countS1 = MutableList(26) { 0 }
        val countS2 = MutableList(26) { 0 }

        for (i in s1.indices) {
            countS1[s1[i].code - 'a'.code] = countS1[s1[i].code - 'a'.code] + 1
            countS2[s2[i].code - 'a'.code] = countS2[s2[i].code - 'a'.code] + 1
        }

        var matches = 0
        for (i in 0 until 26) {
            if (countS1[i] == countS2[i]) {
                matches++
            }
        }

        for ((l, r) in (s1.length until s2.length).withIndex()) {
            if (matches == 26) {
                return true
            }

            var index = s2[r].code - 'a'.code
            countS2[index]++
            if (countS1[index] == countS2[index]) {
                matches++
            } else if (countS1[index] + 1 == countS2[index]) {
                matches--
            }

            index = s2[l].code - 'a'.code
            countS2[index]--
            if (countS1[index] == countS2[index]) {
                matches++
            } else if (countS1[index] - 1 == countS2[index]) {
                matches--
            }
        }

        return matches == 26
    }
}
