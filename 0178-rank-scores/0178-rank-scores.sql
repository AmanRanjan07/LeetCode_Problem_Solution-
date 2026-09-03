-- Select 
--     score,
--     DENSE_RANK() OVER (ORDER BY score DESC) as 'rank'
-- From Scores
-- ORDER BY score DESC;


SELECT 
    s1.score,
    (
        SELECT COUNT(DISTINCT s2.score)
        from Scores s2
        WHERE s2.score >= s1.score
    ) AS 'rank'
FROM Scores s1
ORDER BY s1.score DESC;