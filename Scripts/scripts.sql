--Group by/Having
SELECT
    count(employee_id) AS "No. of Employees",
    job_title,
    manager_id
FROM
    employees
GROUP BY
    job_title,
    manager_id
HAVING
    manager_id < '20'
ORDER BY
      job_title desc,
    manager_id ;

--Union/Union-All

select employees.employee_id ID from employees

union

select customers.customer_id id  from customers;


select employees.employee_id ID,employees.first_name name from employees

union all

select customers.customer_id id , name from customers;

--Joins

select * from customers c join orders o on c.customer_id = o.customer_id
order by c.customer_id;

select * from customers c left outer join orders o on c.customer_id = o.customer_id
order by c.customer_id;

select * from customers c right outer join orders o on c.customer_id = o.customer_id
order by c.customer_id;

select o.order_date,c.customer_id from customers c full outer join orders o on c.customer_id = o.customer_id
order by c.customer_id;

select * from customers c inner join customers o on c.customer_id = o.customer_id
order by c.customer_id;