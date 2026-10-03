# Count Subarrays with k Odds

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array  **arr[]**  of positive integers and an integer  **k**. You have to  **count** the number of subarrays that contain exactly k  **odd numbers**.

 **Examples:** 

```
Input: arr[] = [2, 5, 6, 9], k = 2
Output: 2
Explanation: There are 2 subarrays with 2 odds: [2, 5, 6, 9] and [5, 6, 9].
```

```
Input: arr[] = [2, 2, 5, 6, 9, 2, 11], k = 2
Output: 8
Explanation: There are 8 subarrays with 2 odds: [2, 2, 5, 6, 9], [2, 5, 6, 9], [5, 6, 9], [2, 2, 5, 6, 9, 2], [2, 5, 6, 9, 2], [5, 6, 9, 2], [6, 9, 2, 11] and [9, 2, 11].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T10:30:50.903Z  

```java
class Solution {
    public int countSubarrays(int[] arr, int k) {
        return atMost(arr,k)-atMost(arr,k-1);
    }

    private int atMost(int[] arr,int k){
        int l=0,count=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]%2==1){
                k--;
            }
            while(k<0){
                if (arr[l] % 2 == 1){
                    k++;
                }
                l++;
            }
            count+=(r-l+1);
        }
        return count;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-subarray-with-k-odds/1)