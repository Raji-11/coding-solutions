# First Unique Character in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, find the  **first**  non-repeating character in it and return its index. If it  **does not**  exist, return `-1`.

 

 **Example 1:** 

 **Input:**  s = "leetcode"

 **Output:**  0

 **Explanation:** 

The character `'l'` at index 0 is the first character that does not occur at any other index.

 **Example 2:** 

 **Input:**  s = "loveleetcode"

 **Output:**  2

 **Example 3:** 

 **Input:**  s = "aabb"

 **Output:**  -1

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 32 ms (beats 30.79%)  
**Memory:** 46.8 MB (beats 84.76%)  
**Submitted:** 2026-09-09T17:01:02.595Z  

```java
class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n;i++){
            if(hm.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/first-unique-character-in-a-string/)