# Write your MySQL query statement below


select distinct d1.employee_id,COALESCE(d2.department_id,d1.department_id) as department_id
from Employee d1 
left join (

select employee_id,department_id
from Employee
where primary_flag='Y'
group by employee_id
) d2 
on d1.employee_id=d2.employee_id;