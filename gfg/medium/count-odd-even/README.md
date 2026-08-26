# count-odd-even

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T01:01:23.357Z  

```java
class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int a[]=new int[2];
        int e=0;
        int o=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
            e++;
            a[1]=e;
            
        }else{
            o++;
            a[0]=o;
          }
        }
        
        
        return a;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-odd-even/1)