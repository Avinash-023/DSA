CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
    select salary
    from
    (

    SELECT salary,
    ROW_NUMBER() OVER() AS rn
    from
    (

    SELECT  DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    ) d
    ) d2
    where rn=N
    
  );
END;


