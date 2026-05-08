# Write your MySQL query statement below
select u.name,COAlESCE(d.total,0) as travelled_distance
from Users u
left join (
select user_id,sum(distance) as total
from Rides
group by user_id
order by total desc

) d
on u.id=d.user_id
order by travelled_distance desc,u.name;