# Day of the Week

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a date, return the corresponding day of the week for that date.

The input is given as three integers representing the `day`, `month` and `year` respectively.

Return the answer as one of the following values `{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}`.

 **Note:**  January 1, 1971 was a Friday.

 

 **Example 1:** 

```
Input: day = 31, month = 8, year = 2019
Output: "Saturday"

```

 **Example 2:** 

```
Input: day = 18, month = 7, year = 1999
Output: "Sunday"

```

 **Example 3:** 

```
Input: day = 15, month = 8, year = 1993
Output: "Sunday"

```

 

 **Constraints:** 

- The given dates are valid dates between the years 1971 and 2100.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.3 MB (beats 85.79%)  
**Submitted:** 2026-10-02T11:45:21.620Z  

```java
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {

        int t[] = {0,3,2,5,0,3,5,1,4,6,2,4};

        String week[] = {
            "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"
        };

        year -= (month < 3) ? 1 : 0;

        int total = year + year/4 - year/100 + year/400
                  + t[month-1] + day;

        return week[total % 7];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/day-of-the-week/)