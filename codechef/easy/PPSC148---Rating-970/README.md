# PPSC148 - Rating 970

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Factorial using Pointer

Listen

You are given an integer $N$.
Update the function given in the IDE and use pointers to output the factorial of integer $N$.

### Sample 1:
Input
Output

```
5
```

```
120
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T16:38:31.409Z  

```c_cpp
#include <stdio.h>

void calculateFactorial(int *numPtr) {
    int result = 1;
    
    // Calculate factorial
    for (int i = 1; i <= *numPtr; ++i) {
        result *= i;
    }
    
    // Update the value through the pointer
    *numPtr = result;
}

int main() {
    int number;
    scanf("%d", &number);

    calculateFactorial(&number); // Pass the address of 'number' to the function

    printf("%d\n", number);

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PPSC148)