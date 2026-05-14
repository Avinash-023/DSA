# Write your MySQL query statement below
select user_id,
count(*) as prompt_count,ROUND(avg(tokens),2) as avg_tokens
from prompts
group by user_id
having max(tokens) >avg_tokens
and prompt_count>=3
ORDER BY avg_tokens desc ,user_id;