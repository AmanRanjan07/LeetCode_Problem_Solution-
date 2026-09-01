CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    set N = N-1;
  RETURN (
      # Write your MySQL query statement below.
    Select distinct salary
    From Employee
    order by salary desc
    limit N,1
  );
END