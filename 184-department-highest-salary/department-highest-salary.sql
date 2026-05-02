/* Write your PL/SQL query statement below */
select d.name as Department,
e.name as Employee,
e.salary as Salary 
from Employee e
join
Department d
on e.departmentId=d.id
join
(
select departmentId,max(salary) as result from Employee
group by departmentId
) dummy
on e.departmentId=dummy.departmentId
and e.salary=dummy.result;

