# Write your MySQL query statement below
Select e.name As Employee 
from Employee e join Employee m
on e.managerId = m.id
where e.salary > m.salary;
