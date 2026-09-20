# Minimum Insertion Steps to Make a String Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string `s`. In one step you can insert any character at any index of the string.

Return  *the minimum number of steps*  to make `s` palindrome.

A  **Palindrome String**  is one that reads the same backward as well as forward.

 

 **Example 1:** 

```
Input: s = "zzazz"
Output: 0
Explanation: The string "zzazz" is already palindrome we do not need any insertions.

```

 **Example 2:** 

```
Input: s = "mbadm"
Output: 2
Explanation: String can be "mbdadbm" or "mdbabdm".

```

 **Example 3:** 

```
Input: s = "leetcode"
Output: 5
Explanation: Inserting 5 characters the string becomes "leetcodocteel".

```

 

 **Constraints:** 

- 1 <= s.length <= 500
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 26 ms (beats 59.05%)  
**Memory:** 47.3 MB (beats 58.57%)  
**Submitted:** 2026-09-20T13:28:12.466Z  

```java
class Solution {
    public int minInsertions(String s) {
        int str=s.length();
        return (str-longestPalindromeSubseq(s));
        
    }
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

[View on LeetCode](https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/)