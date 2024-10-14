set search_path to sample
create table Workers (
first_name VARCHAR(50),
salary INT,
worker_title VARCHAR(50)
);
insert into Workers(first_name, salary, worker_title)
values
('Niharika', 80000, 'executive'),
('geetika', 90000, 'executive'),
('vivek', 500000, 'Manager'),
('Amitabh', 500000, 'Asst.Manager'),
('satish', 75000, 'Executive'),
('vipul', 2000000, 'lead'),
('vehal', 3000000, 'lead');
CREATE OR REPLACE FUNCTION count_workers_nth_highest_salary(n INT)
RETURNS INT AS $$ 
DECLARE
nth_salary BIGINT;
worker_count INT;
BEGIN
SELECT DISTINCT salary
into nth_salary
FROM Workers
ORDER BY salary DESC
OFFSET n - 1 LIMIT 1;
SELECT COUNT(*)
INTO worker_count
From Workers
WHERE salary = nth_salary;
RETURN worker_count;
EXCEPTION
WHEN NO_DATA_FOUND THEN
RETURN 0;
END;
$$ LANGUAGE PLPGSQL;
SELECT count_workers_nth_highest_salary(1);
select * from salary