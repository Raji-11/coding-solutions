# PPSC228 - Rating 1018

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Coding problem - 1

Listen

You run the library at your college.
Since you are an avid programmer, you decided to use your recent knowledge of Structures to update the catalog of books present in the library.

You have been provided some data about the purchasing sequence of the books and their addition to the library. Note that the same book could have been purchased in different lots

Check the sample input / output and update the template code to output the following

- Book name
- Count of books
### Input Format
- The first line of input will contain a single integer $T$, denoting the number of books present in the library.
- Information about each book consists of 3 lines of input. The first line contains the name of the book The second line contains the Purchase order number - PO number The third line contains the quantity of the book purchased
### Output Format

Output the following for the books present in the library

- Book name
- Count of books
### Sample 1:
Input
Output

```
3
Science
1001
30
Maths
1003
20
Science
1002
20
```

```
Science 50
Maths 20
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T16:11:14.655Z  

```c_cpp
#include <stdio.h>
#include <string.h>

struct Book {
    char name[100];
    int totalCount;
};

int main() {
    int T;
    scanf("%d", &T);

    struct Book books[T];
    int numBooks = 0; // Number of unique books in the array

    for (int i = 0; i < T; i++) {
        char bookName[100];
        scanf(" %s", bookName);

        int bookIndex = -1; // Index of the book in the array, -1 if not found
        for (int j = 0; j < numBooks; j++) {
            if (strcmp(bookName, books[j].name) == 0) {
                bookIndex = j;
                break;
            }
        }

        if (bookIndex == -1) {
            strcpy(books[numBooks].name, bookName);
            int numOrders, totalQuantity = 0;
            scanf("%d", &numOrders);
            int quantity;
            scanf("%d", &quantity);
            totalQuantity += quantity;
            books[numBooks].totalCount = totalQuantity;
            numBooks++;
        } else {
            int numOrders, totalQuantity = 0;
            scanf("%d", &numOrders);
            int quantity;
            scanf("%d", &quantity);
            books[bookIndex].totalCount += quantity;
            }
        }

    // Output book names and counts
    for (int i = 0; i < numBooks; i++) {
        printf("%s %d\n", books[i].name, books[i].totalCount);
    }

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PPSC228)