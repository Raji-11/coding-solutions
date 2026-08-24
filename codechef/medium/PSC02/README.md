# PSC02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a C program to reverse a given string using pointers.

### Input Format
- The first and only line of input contains a single string $S$ - The string which needs to be reversed.
### Output Format
- Output on a single line, the reversed string.
### Sample 1:
Input
Output

```
codechef
```

```
fehcedoc
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T16:58:55.752Z  

```c_cpp
#include <stdio.h>
#include <string.h>

// Function to reverse a string using pointers
void reverseString(char *str) {
   // Complete the function 
   char *left=str;
   char *right=str+strlen(str)-1;
   while(left<right){
       int temp=*left;
       *left=*right;
       *right=temp;
       
       left++;
       right--;
   }
   
}

int main() {
    char str[100];

    scanf("%s", &str);

    // Call the reverseString function
    reverseString(str);

    printf("%s\n", str);

    return 0;
}



```

---

[View on CodeChef](https://www.codechef.com/problems/PSC02)