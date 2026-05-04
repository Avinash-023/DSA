/* Write your PL/SQL query statement below */
select s.score, d.rank
from Scores s
join
(

select ROWNUM as rank,score from (
select distinct score from Scores
order by score desc
) 
) d
 on s.score=d.score;
