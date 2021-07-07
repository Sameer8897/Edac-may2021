use Assignment;
select * from employees;
select * from countries;
select * from departments;
select * from jobs;
#
select * from employees;
#select location_id, street_address, city, state_province, country_name from employee
#select 
#2.	Write a query to find the name (first_name, last name), department ID and name of all the employees.
#3.Write a query to find the name (first_name, last_name) of the employees who have a manager and worked in a USA based department
select first_name,last_name from employees where manager_id !=0 and manager_id
in(select manager_id from departments where location_id
in(select location_id from locations where country_id='US'));
#4.	Write a query to find the employee id, name (last_name) along with their manager_id and name (last_name).
select first_name,last_name from employees
where employee_id in (select distinct (manager_id) from employees);
#5.Write a query to find the name (first_name, last_name), and salary of the employees whose salary is greater than the average salary
select first_name,last_name,salary from employees
 where salary >(select avg(salary) from employees);
 
 #6Write a query to find the name (first_name, last_name), and salary of the employees whose salary is equal to the minimum salary for their job grade.
 select first_name, last_name,job_id,salary from employees where salary in
 (select min_salary from jobs where employees.job_id=jobs.job_id);
 
 #7.Write a query to find the name (first_name, last_name), and salary of the employees who earns more than the average salary and works in any of the IT departments.
select first_name, last_name, salary from employees where department_id in 
(select department_id from departments where 
department_name like 'IT') and salary >
(select avg(salary) from employees) ;

#8.Write a query to find the name (first_name, last_name), and salary of the employees who earns more than the earning of Mr. Bell.
select first_name, last_name,salary from employees
where salary > (select salary from employees where last_name='Bell');

