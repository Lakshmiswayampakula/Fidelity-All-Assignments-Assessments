set search_path to sample
create table Worker (
WORKER_ID INT primary key,
FIRST_NAME VARCHAR(50),
LAST_NAME VARCHAR(50),
SALARY INT,
JOINING_DATE DATE,
DEPARTMENT VARCHAR(50)
);
select * from worker
create table Title (
worker_ref_id INT,
Worker_Title VARCHAR(50),
affected_from DATE,
FOREIGN KEY (worker_ref_id) references worker(worker_id)
);
create table bonus (
worker_ref_id INT,
bonus_amount INT,
bonus_date date,
FOREIGN KEY (worker_ref_id) references worker(worker_id)
);

insert into Worker (worker_id, first_name, last_name, salary, joining_date, department)
values
-- (1, 'mounika', 'arora', 100000, '2020-02-14', 'HR'),
(2, 'niharika', 'verma', 80000, '2011-02-14', 'admin'),
(3,'vishal', 'singhal',300000, '2020-02-14', 'HR'),
(4, 'amitabh', 'singh', 500000, '2020-02-14', 'admin'),
(5, 'vivek', 'bhati', 500000, '2011-06-14', 'admin'),
(6, 'vipul', 'diwan', 200000, '2011-06-14', 'account'),
(7, 'satish', 'kumar', 75000, '2020-01-14', 'account'),
(8, 'geetika', 'chauhan', 90000, '2011-04-14', 'admin');

insert into Title(worker_ref_id, Worker_Title, affected_from)values
(1, 'manager', '2016-02-20'),
(2, 'executive', '2016-06-11'),
(3, 'lead', '2016-06-11'),
(4, 'Asst.manager', '2016-06-11'),
(5, 'manager', '2016-06-11'),
(6, 'lead', '2016-06-11'),
(7, 'executive', '2016-06-11'),
(8, 'executive', '2016-06-11');

insert into bonus(worker_ref_id, bonus_amount, bonus_date) values
(1, 5000, '2020-02-16'),
(2, 3500, '2011-06-16'),
(3, 4000, '2020-02-16'),
(4, 4500, '2020-02-16'),
(5, 3500, '2011-06-16');


select 
w.first_name,
w.salary,
t.Worker_Title
From
Worker w
join
Title t
on 
w.worker_id= t.worker_ref_id;




