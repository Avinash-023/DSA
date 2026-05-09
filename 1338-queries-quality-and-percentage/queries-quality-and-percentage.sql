SELECT 
    d1.query_name,
    ROUND(d1.quality, 2) AS quality,
    ROUND((COALESCE(d2.num,0) / d1.total) * 100, 2) AS poor_query_percentage
FROM
(
    SELECT 
        query_name,
        SUM(rating / position) / COUNT(*) AS quality,
        COUNT(*) AS total
    FROM Queries
    GROUP BY query_name
) d1
LEFT JOIN
(
    SELECT 
        query_name,
        COUNT(rating) AS num
    FROM Queries
    WHERE rating < 3
    GROUP BY query_name
) d2
ON d1.query_name = d2.query_name;