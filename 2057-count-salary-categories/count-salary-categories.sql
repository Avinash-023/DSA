# Write your MySQL query statement below
select d1.category,COALESCE(d2.accounts_count,0) as accounts_count
from(

select 'High Salary' as category
UNION
select 'Average Salary'
UNION 
select 'Low Salary'
) d1 
left join
(

select 
case 
when income < 20000 then "Low Salary"
 
when income >= 20000 and income <=50000 then "Average Salary"

when income > 50000 then "High Salary"
end
as category ,
count(*) as accounts_count
from Accounts
group by category
) d2 
on d1.category=d2.category;



