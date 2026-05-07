# Write your MySQL query statement below
select u.user_id as buyer_id,u.join_date,COALESCE(d.total,0) as orders_in_2019
from Users u
left join (

select buyer_id,count(order_date) as total
from Orders
where year(order_date)=2019
group by buyer_id
) d
on u.user_id=d.buyer_id;