-- your code goes here
SELECT 
    title,
    author,
    CASE
        WHEN genre = 'Computer Science' THEN 'CS Book'
        ELSE 'Other Book'
    END AS category
FROM Books;
   