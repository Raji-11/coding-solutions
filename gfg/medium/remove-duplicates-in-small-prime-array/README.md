# remove-duplicates-in-small-prime-array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:48:22.944Z  

```java
class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
           
        }
        
        return new ArrayList<>(hs);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-duplicates-in-small-prime-array/1)