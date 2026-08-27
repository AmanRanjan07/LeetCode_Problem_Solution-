# Write your MySQL query statement below
Select p.firstName, p.lastName, a.city,a.state
from Person p left join Address a
on p.personId = a.personId


-- Why LEFT JOIN? The question says:
-- Return every person from the Person table, even if that person does not have an address.