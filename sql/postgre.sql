-- SELECT
SELECT column_name
FROM table_name;

SELECT *
FROM Test;

-- SELECT DISTINCT
-- returns unique data
SELECT DISTINCT(column_name)
FROM table_name;

SELECT DISTINCT column_name
FROM table_name;

-- COUNT
SELECT COUNT(column_name)
FROM table_name;

SELECT COUNT(DISTINCT name)
FROM table_name;

-- WHERE
SELECT column1,
    column2
FROM table_name
WHERE conditions;

SELECT column1,
    column2
FROM table_name
WHERE surname = 'name'
    AND age = '4'
    OR mail = 'test@test.com'
    OR rating != 1;

-- ORDER BY
-- by default ASC
SELECT column1,
    column2
FROM table_name
ORDER BY column1 ASC / DESC;

-- LIMIT
SELECT column1,
    column2
FROM table_name
ORDER BY column1
LIMIT 10;

-- BETWEEN
SELECT *
FROM table_name
WHERE column_name BETWEEN 1 AND 10;

SELECT *
FROM table_name
WHERE column_name NOT BETWEEN 1 AND 10;

-- this would result upto 15th but not 15th
SELECT *
FROM table_name
WHERE column_name NOT BETWEEN '2020-12-10' AND '2020-12-15';

-- IN
-- check if value is included
SELECT column_name
FROM table_name
WHERE column_name IN ('red', 'blue');

-- LIKE & ILIKE
-- for pattern matching
-- % - for any sequence of characters
-- _ - for any single character
-- LIKE is case-sensitive
-- ILIKE is case-insensitive
SELECT column_name
FROM table_name
WHERE color LIKE 'r%';

-- Aggregation Methods
-- MIN
-- MAX
-- AVG
-- ROUND(result, 2)
-- SUM
SELECT MAX(column_name)
FROM table_name;

SELECT ROUND(AVG(column_name), 2)
FROM table_name;

-- GROUP BY
-- colums must either have an aggregate function or be in group by call
SELECT catory_column,
    AGG(data_col)
FROM table_name
GROUP BY catory_column;

SELECT column1,
    column2,
    SUM(column3)
FROM table_name
GROUP BY column1,
    column2;

-- the where should not refer to the aggregation result
SELECT column1,
    column2,
    SUM(column3)
FROM table_name
WHERE column2 IN ('something')
GROUP BY column1,
    column2;

-- to sort result based on aggregation result we need to reference the entire function
SELECT column1,
    column2,
    SUM(column3)
FROM table_name
GROUP BY column1,
    column2
ORDER BY SUM(column3);

-- HAVING
-- allows to filter after an aggregation has already taken place
SELECT column1,
    SUM(column2)
FROM table_name
GROUP BY column1
HAVING SUM(column2) > 1000;

-- JOINS
-- INNER JOIN -> show common data from two tables, INNER is optional
SELECT *
FROM table_a
    INNER JOIN table_b on table_a.col_match = table_b.col_match;

-- FULL OUTER JOIN
SELECT *
FROM table_a
    FULL OUTER JOIN table_b on table_a.col_match = table_b.col_match;

SELECT *
FROM table_a
    FULL OUTER JOIN table_b on table_a.col_match = table_b.col_match
WHERE table_a.col_match IS null
    OR table_b.col_match IS null;

-- LEFT OUTER JOIN -> everything from table_a and common
SELECT *
FROM table_a
    LEFT OUTER JOIN table_b on table_a.col_match = table_b.col_match;

-- RIGHT OUTER JOIN -> everything from table_a and common
SELECT *
FROM table_a
    RIGHT OUTER JOIN table_b on table_a.col_match = table_b.col_match;

-- SELF JOIN -> joining table with itself
SELECT table_a.col,
    table_b.col
FROM some_table AS table_a
    JOIN some_table AS table_b on table_a.some_col = table_b.other_col;

-- TIMESTAMPS
-- to extract parts from timestamp like YEAR, MONTH, QUARTER
SELECT EXTRACT(
        YEAR
        FROM column
    )
from some_table;

-- To calculate age
SELECT AGE(column)
from some_table;

-- TO_CHAR
-- timestamp to string formatting
SELECT TO_CHAR(timestamp_column, 'MONTH')
from some_table;

-- Conditional expressions and operators
-- CASE -> only execute if certain conditions are met
CASE
    WHEN condition1 THEN result1
    WHEN condition2 THEN result2
    ELSE some_other_result
END AS column_name;

-- COALESCE -> takes in unilimited args and return first non null else null,
-- useful to replace null with default value
SELECT item, (price - COALESCE(discount, 0)) from products;

-- CAST
SELECT CAST('5' AS INTEGER);

-- Postgres specific
SELECT '5'::INTEGER;

-- NULLIF -> returns null if both args are null, if not then returns first args
SELECT NULLIF(0, 0);

-- VIEW -> instead of running specific combinations of tables and conditions we can create a view
-- we can see the query as if it's a table that exists
-- ex. we have a joins query between 2 tables, we can say select * from view
-- it's a stored query and is maintained as a virtual table
CREATE VIEW some_name AS some_big_query;
