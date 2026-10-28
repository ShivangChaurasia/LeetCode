# Write your MySQL query statement below

select a.customer_id, count(*) as count_no_trans
from Visits as a
left Join Transactions as b
ON a.visit_id = b.visit_id
    where b.transaction_id is null
Group by a.customer_id;

