# frequency-of-elements--111353

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:51:13.033Z  

```java
class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
             map.put(i, map.getOrDefault(i, 0)+1);
        }
        map.forEach((key, value)->{
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(key);
            temp.add(value);
            res.add(temp);
        });
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/frequency-of-elements--111353/1)