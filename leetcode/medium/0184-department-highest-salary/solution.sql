# Write your MySQL query statement below
SELECT e.name as Employee,e.salary as Salary,d.name as Department
FROM Employee e
JOIN Department d
ON e.departmentId=d.id
Where e.salary = (
    Select max(salary)
    FROM Employee
    Where departmentId = e.departmentId
);
