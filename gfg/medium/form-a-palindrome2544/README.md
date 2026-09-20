# Minimum Insertions for Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s**, the task is to find the minimum number of characters to be inserted to convert it to a palindrome.

 **Examples:** 

```
Input: s = "abcd"
Output: 3
Explanation: Here we can append 3 characters in the beginning and the resultant string will be a palindrome "dcbabcd".
```

```
Input: s = "aba"
Output: 0
Explanation: Given string is already a pallindrome hence no insertions are required.
```

 **Constraints:** 
1 ≤ s.size() ≤ 500

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T13:29:20.128Z  

```java
class Solution {
    public int findMinInsertions(String s) {
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

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/form-a-palindrome2544/1)