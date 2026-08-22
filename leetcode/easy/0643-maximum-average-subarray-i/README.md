# Maximum Average Subarray I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums` consisting of `n` elements, and an integer `k`.

Find a contiguous subarray whose  **length is equal to**  `k` that has the maximum average value and return  *this value*. Any answer with a calculation error less than `10-5` will be accepted.

 

 **Example 1:** 

```
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

```

 **Example 2:** 

```
Input: nums = [5], k = 1
Output: 5.00000

```

 

 **Constraints:** 

- n == nums.length
- 1 <= k <= n <= 105
- -104 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.80%)  
**Memory:** 69.1 MB (beats 96.54%)  
**Submitted:** 2026-08-22T05:01:00.841Z  

```java
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=sum;
        for(int i=k;i<n;i++){
            sum=sum-nums[i-k]+nums[i];
            max=Math.max(max,sum);
        }
       
        return (double) max/k;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-average-subarray-i/)