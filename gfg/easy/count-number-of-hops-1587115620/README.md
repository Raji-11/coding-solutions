# Count Ways with 3 Moves

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time. Return the of count how many possible ways the child can run up the stairs.

 **Examples:** 

```
Input: n = 3
Output: 4
Explanation: The following are 4 different ways
1 step + 1 step + 1 step 
1 step + 2 steps 
2 steps + 1 step 
3 steps
```

```
Input: n = 4
Output: 7
Explanation: Below are the 7 ways to reach 4th step:
1 step + 1 step + 1 step + 1 step
1 step + 2 steps + 1 step
2 step + 1 step + 1 step
1 step + 1 step + 2 steps
2 steps + 2 steps
3 steps + 1 step
1 step + 3 steps
```

```
Input: n = 1
Output: 1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T17:46:13.270Z  

```java
class Solution {

    static int countWays(int n) {
        // add your code here
        if(n==0) return 0;
        if(n<=2) return n; 
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=2;
        dp[2]=4;
        for(int i=3;i<n;i++){
            dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
        }
        return dp[n-1];
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-number-of-hops-1587115620/1)