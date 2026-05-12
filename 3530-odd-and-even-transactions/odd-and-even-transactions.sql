# Write your MySQL query statement below

-- select transaction_date,sum(amount)
-- from transactions
-- where amount%2=1
-- group by transaction_date
select transaction_date,
COALESCE(sum(
    CASE
        when amount%2=1 then amount
        else 0
    END
),0)as odd_sum,
COALESCE(sum(
    CASE
        when amount%2=0 then amount
        else 0
    END
),0)as even_sum

from transactions

group by transaction_date
order by transaction_date;