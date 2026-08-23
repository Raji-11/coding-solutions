# Write your MySQL query statement below
SELECT  p.firstname, p.lastname, A.city, A.state 
FROM Person p 
LEFT JOIN Address A 
ON p.personId=A.personId;


