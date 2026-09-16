# Most Frequent in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array  **arr[]**. You need to return the element which  **occurs maximum times**  in  **arr[]**.
 **Note:**  If multiple such elements exists return the  **maximum**  element.

 **Example:** 

```
Input: arr[] = [1, 2, 2, 2, 4, 1]
Output: 2
Explanation: 2 is most frequent element of this array with 3 occurrences.
```

```
Input: arr[] = [1, -5, 8, 1]
Output: 1
Explanation: 1 is most frequent element of this array with 2 occurrences.
```

```
Input: arr[] = [3, 0, 0, 3, 8]
Output: 3
Explanation: 0 and 3 are two most frequent elements of this array. 3 is the maximum one.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
-105 ≤ arr[i] ≤ 105

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:49:55.601Z  

```py
class Solution:
    def mostFreqEle(self, arr):
        freq = {}

        for x in arr:
            freq[x] = freq.get(x, 0) + 1

        return max(freq.keys(), key=lambda x: (freq[x], x))
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/most-frequent-element-in-an-array/1)