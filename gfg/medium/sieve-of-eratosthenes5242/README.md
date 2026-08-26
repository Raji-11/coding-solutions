# Sieve of Eratosthenes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a positive integer  **n**, calculate and return all primes less than or equal to n using the Sieve of Eratosthenes algorithm.

 **Examples:** 

```
Input: n = 10
Output: [2, 3, 5, 7]
Explanation: Prime numbers less than equal to 10 are 2, 3, 5 and 7.
```

```
Input: n = 35
Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
Explanation: Prime numbers less than equal to 35 are 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 and 31.
```

 **Constraints:** 
1 ≤ n ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T01:49:31.524Z  

```java
class Solution {
    public ArrayList<Integer> sieve(int n) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        boolean p[]=new boolean[n+1];
        
        for(int i=2;i<=n;i++){
            p[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(p[i]){
                for(int j=i*i;j<=n;j=j+i){
                    p[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(p[i]==true){
                al.add(i);
            }
        }
        return al;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1)