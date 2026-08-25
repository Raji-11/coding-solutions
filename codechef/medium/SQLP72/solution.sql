-- your code goes here
-- your code goes here
SELECT 
    member_name,
    CASE 
    
        WHEN address LIKE '%Delhi%' THEN 'Delhi Resident'
        ELSE 'Other City'
    END AS city_status
FROM Members;
   