# Write your MySQL query statement below
select b.unique_id, a.name 
from Employees as a
left Join EmployeeUNI as b
ON a.id = b.id;