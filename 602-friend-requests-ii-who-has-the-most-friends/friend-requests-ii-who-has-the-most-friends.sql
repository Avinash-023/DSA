# Write your MySQL query statement below
select requester_id as id,sum(total) as num from(

select requester_id,count(accepter_id)as total from RequestAccepted
group by requester_id
union all
select accepter_id,count(requester_id) as total from RequestAccepted
group by accepter_id

) as dummy
group by id
order by num desc limit 1;

