# java-exception-handling-1606978567

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T17:38:11.584Z  

```java
class Solution {
    public int findMin(int a, int b) {
        // code here
        int result = a + b;

                try {
                    if (a - b < result) {
                        result = a - b;
                    }

                    if (a * b < result) {
                        result = a * b;
                    }

                    int div = a / b;

                    if (div < result) {
                        result = div;
                    }
                } catch (ArithmeticException e) {
                    // Division by zero occurred
                }

                return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-exception-handling-1606978567/1)