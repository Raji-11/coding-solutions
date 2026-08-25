# SQLP72

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### SQL Case Condition Library Query - 2

 **Case Study:**  A Library Management System is a software application that helps manage the various activities and operations of a library. The primary goal of this system is to efficiently organize and track books, members, loans, and reservations within the library. The library contains books from different genres, and members can borrow and reserve books.

- Data-set for a Library Management System, consisting of five tables: Books Table, Authors Table, Members Table, Loans Table and Reservations Table.
### Task
- Display the member names and their corresponding addresses from the "Members" table. If the address contains the word 'Delhi', display 'Delhi Resident', else display 'Other City'.
- Use CASE WHEN.
- You can refer to the dataset here: “here”
### Expected Output Format

 **member_name** 
 **city_status**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T07:24:22.882Z  

```sql
-- your code goes here
-- your code goes here
SELECT 
    member_name,
    CASE 
    
        WHEN address LIKE '%Delhi%' THEN 'Delhi Resident'
        ELSE 'Other City'
    END AS city_status
FROM Members;
   
```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP72)