# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 26.67%)  
**Memory:** 46.5 MB (beats 34.01%)  
**Submitted:** 2026-09-09T10:34:53.474Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        int slen=s.length();
        int tlen=t.length();
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(int i=0;i<slen;i++){
            char ch1=s.charAt(i);
            hm1.put(ch1,hm1.getOrDefault(ch1,0)+1);
        }
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<tlen;i++){
            char ch2=t.charAt(i);
            hm2.put(ch2,hm2.getOrDefault(ch2,0)+1);
        }
        return hm1.equals(hm2);
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)