# Longest Palindromic Subsequence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find  *the longest palindromic  **subsequence** 's length in*  `s`.

A  **subsequence**  is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

 

 **Example 1:** 

```
Input: s = "bbbab"
Output: 4
Explanation: One possible longest palindromic subsequence is "bbbb".

```

 **Example 2:** 

```
Input: s = "cbbd"
Output: 2
Explanation: One possible longest palindromic subsequence is "bb".

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s consists only of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 61 ms (beats 21.89%)  
**Memory:** 63.9 MB (beats 48.03%)  
**Submitted:** 2026-09-20T13:09:45.470Z  

```java
class Solution {
    public int longestCommonSubseq(String s,String t,int m,int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=n;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public int longestPalindromeSubseq(String s) {
        String t=new StringBuilder(s).reverse().toString();
        int m=s.length();
        int n=t.length();
        return longestCommonSubseq(s,t,m,n);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindromic-subsequence/)