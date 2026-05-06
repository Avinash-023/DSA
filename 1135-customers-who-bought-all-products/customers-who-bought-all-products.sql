# Write your MySQL query statement below

select customer_id
from (
    select distinct * from Customer
) d
group by customer_id
having count(product_key) = (

select count(*) as total
from Product
) ;