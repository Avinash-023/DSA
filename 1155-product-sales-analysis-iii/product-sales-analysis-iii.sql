# Write your MySQL query statement below
select d.product_id,d.first_year,Sales.quantity,Sales.price from Sales
join  (

select product_id,
min(year) as first_year
from Sales
group by product_id
) d
on Sales.year=d.first_year
and Sales.product_id=d.product_id;