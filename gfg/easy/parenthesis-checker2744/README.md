# Parenthesis Checker

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**, composed of different combinations of '(', ')', '{', '}', '[', ']'. Determine whether the Expression is  **balanced** or not.
An expression is balanced if:

- Each opening bracket has a corresponding closing bracket of the same type.
- Opening brackets must be closed in the correct order.

 **Examples :** 

```
Input: s = "[{()}]"
Output: true
Explanation: All the brackets are well-formed.
```

```
Input: s = "[()()]{}"
Output: true
Explanation: All the brackets are well-formed.

```

```
Input: s = "([]"
Output: false
Explanation: The expression is not balanced as there is a missing ')' at the end.

```

```
Input: s = "([{]})"
Output: false
Explanation: The expression is not balanced as there is a closing ']' before the closing '}'.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T17:48:33.150Z  

```java
class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack <Character> st = new Stack<>();
        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i++)
        {
            char ch = str[i];
            if(ch == '('||ch=='{'||ch=='[')
            {
              st.push(ch);
            }
            else if(ch==')'||ch=='}'||ch==']')
            {
            if(st.isEmpty())
            {
                return false;
            }
            char top = st.pop();
            if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='['))
            {
                return false;
            }
            }
        }
        return st.isEmpty();
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1)