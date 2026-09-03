# Maximum Product Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, find a subarray that has the largest product, and return  *the product*.

The test cases are generated so that the answer will fit in a  **32-bit**  integer.

 **Note**  that the product of an array with a single element is the value of that element.

 

 **Example 1:** 

```
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

```

 **Example 2:** 

```
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

```

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- -10 <= nums[i] <= 10
- The product of any subarray of nums is guaranteed to fit in a 32-bit integer.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 93.16%)  
**Memory:** 47.6 MB (beats 15.81%)  
**Submitted:** 2026-09-03T16:14:02.366Z  

```java
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int leftproduct=1;
        int rightproduct=1;
        int ans=nums[0];
        for(int i=0;i<n;i++){
            if(leftproduct==0){
                leftproduct=1;
            }
            if(rightproduct==0){
                rightproduct=1;
            }   

            leftproduct*=nums[i];
            rightproduct*=nums[n-1-i];

            ans=Math.max(ans,Math.max(leftproduct,rightproduct));
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-subarray/)