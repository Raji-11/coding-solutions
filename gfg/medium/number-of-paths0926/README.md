# Count Paths from Top Left to Bottom Right

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers  **m**  and  **n**  representing the number of rows and columns of a grid, respectively, find the number of distinct paths from the top-left cell (0, 0) to the bottom-right cell (m - 1, n - 1). From any cell, you can move only right or down.

 **Note:**  The answer is guaranteed to fit within a 32-bit integer.

 **Examples:** 

```
Input: m = 2, n = 3
Output: 3
Explanation: There are three distinct paths from the top-left cell to the bottom-right cell.
 
```

```
Input: m = 1, n = 4
Output: 1
Explanation: There is only one possible path from the top-left cell to the bottom-right cell.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T11:02:15.048Z  

```java
class Solution {
    public int numberOfPaths(int m, int n) {
        // code here
        int f[][]=new int[m][n];
        for(int i=0;i<m;i++){
            f[i][0]=1;
        }
        for(int i=0;i<n;i++){
            f[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                f[i][j]=f[i-1][j]+f[i][j-1];
            }
        }
        return f[m-1][n-1];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/number-of-paths0926/1)