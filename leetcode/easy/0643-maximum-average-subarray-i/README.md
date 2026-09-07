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
**Runtime:** 5 ms (beats 32.25%)  
**Memory:** 69.8 MB (beats 10.53%)  
**Submitted:** 2026-09-07T15:27:43.983Z  

```java
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        double avg=0;
        double maxavg=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            
        }
        avg=(double)sum/k;
        maxavg=avg;
        int l=0,r=k-1;
        while(r<n-1){
            sum-=nums[l];
            l++;
            r++;
            sum=sum+nums[r];
            avg=(double)sum/k;
            maxavg=Math.max(maxavg,avg);
        }
        
        return maxavg;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-average-subarray-i/)