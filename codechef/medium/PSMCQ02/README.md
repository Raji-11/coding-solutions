# PSMCQ02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Accessing Structure Members - MCQ

How do you access members of a structure in C?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T16:18:00.520Z  

```cpp
#include <stdio.h>

// Function to find maximum  element in an array using pointers
void findMax(int arr[], int size, int *max) {
   // Complete the function
   *max=arr[0];
   for(int i=1;i<size;i++){
       if(*max<arr[i]){
           *max=arr[i];
       }
   }
   
}

int main() {
    int n;
    scanf("%d", &n);
    int array[n];
    for(int i = 0; i < n; i++){
        scanf("%d", &array[i]);
    }
    int max;

    // Call the findMaxMin function
    findMax(array, n, &max);

    printf("%d\n", max); // Output the max element 

    return 0;
}


```

---

[View on CodeChef](https://www.codechef.com/problems/PSMCQ02)