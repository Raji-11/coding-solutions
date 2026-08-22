# Find All Anagrams in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

```

 **Example 2:** 

```
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

```

 

 **Constraints:** 

- 1 <= s.length, p.length <= 3 * 104
- s and p consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 34.95%)  
**Memory:** 46.9 MB (beats 46.36%)  
**Submitted:** 2026-08-22T05:04:29.892Z  

```java
class Solution{
    public List<Integer> findAnagrams(String s,String p){
        List<Integer> res=new ArrayList<>();
        if(p.length()>s.length()) return res;
        int[] freq=new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }
        int l=0,count=p.length();
        for(int r=0;r<s.length();r++){
            if(freq[s.charAt(r)-'a']>0){
                count--;
            }
            freq[s.charAt(r)-'a']--;
            if(r-l+1>p.length()){
                if(freq[s.charAt(l)-'a']>=0)count++;
                freq[s.charAt(l)-'a']++;
                l++;
            }
            if(r-l+1==p.length()&&count==0)res.add(l);
        }
        return res;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/)