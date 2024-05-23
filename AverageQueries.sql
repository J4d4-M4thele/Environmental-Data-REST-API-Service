-- Average amount of Recyclables in tonnes
SELECT AVG(CAST(recyclables AS INT)) AS average_recyclables
FROM WASTE_DATA;

-- Average amount of Organics in tonnes
SELECT AVG(CAST(organics AS INT)) AS average_organics
FROM WASTE_DATA;

-- Average amount of Builders Rubble in tonnes
SELECT AVG(CAST(builders_rubble AS INT)) AS average_builders_rubble
FROM WASTE_DATA;