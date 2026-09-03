Select 
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) as 'rank'
From Scores
ORDER BY score DESC;