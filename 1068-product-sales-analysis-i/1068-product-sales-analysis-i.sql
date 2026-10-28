# Write your MySQL query statement below
select a.product_name, b.year, b.price 
from product as a
Inner Join sales as b
ON a.product_id = b.product_id;