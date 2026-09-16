# Longest Common Prefix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

 

 **Example 1:** 

```
Input: strs = ["flower","flow","flight"]
Output: "fl"

```

 **Example 2:** 

```
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

```

 

 **Constraints:** 

- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lowercase English letters if it is non-empty.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 59.99%)  
**Memory:** 43.1 MB (beats 82.64%)  
**Submitted:** 2026-09-16T11:21:27.394Z  

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[n-1];
        int i=0;
        while(i<first.length()&&i<last.length()&&first.charAt(i)==last.charAt(i)){
            i++;
        }
        return first.substring(0,i);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-common-prefix/)