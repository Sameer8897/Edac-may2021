use Assignment;
select * from employees;
select * from countries;
select * from departments;
select * from jobs;
select * from locations;
select * from job_history;

#1.Write a query to find the addresses (location_id, street_address, city, state_province, country_name) of all the departments.
/*select location.location_id,street_address,city,state_province,country_name from locations,countries,departments,
where departments.LOCATION_ID=locations.LOCATION_ID and locations.country_id=countries.country_id group by 1;*/

SELECT location_id, street_address, city, state_province, country_name
FROM locations
NATURAL JOIN countries;

#2.	Write a query to find the name (first_name, last name),
# department ID and name of all the employees.
SELECT 
    employees.EMPLOYEE_ID,
    employees.first_name,
    employees.last_name,
    departments.DEPARTMENT_ID,
    departments.DEPARTMENT_NAME
FROM
    employees,
    departments
WHERE
    employees.DEPARTMENT_ID = departments.DEPARTMENT_ID;


#3 Write a query to find the name (first_name, last_name), job,
# department ID and name of the employees who works in London.
SELECT 
    first_name,
    last_name,
    job_title,
    departments.department_id,
    department_name,
    locations.city
FROM
    jobs,
    departments,
    locations,
    employees
WHERE
    employees.DEPARTMENT_ID = departments.DEPARTMENT_ID
        AND employees.JOB_ID = jobs.JOB_ID
        AND locations.LOCATION_ID = departments.LOCATION_ID
        AND locations.city = 'London';


#4.Write a query to find the employee id, name (last_name) along with 
#their manager_id and name (last_name).
SELECT  emp.employee_id,emp.last_name, mgr.employee_id as 'manager_id', mgr.last_name
FROM employees as emp, employees as mgr 
WHERE  mgr.employee_id = emp.manager_id;

#5.Write a query to find the name (first_name, last_name) and hire date of the employees who was hired after 'Jones.
SELECT 
    comp.first_name, comp.last_name
FROM
    employees Sort,
    employees comp
WHERE
    comp.hire_date > sort.hire_date
        AND sort.last_name = 'Jones';


#6.	Write a query to get the department name and 
# number of employees in the department.
select department_name,departments.department_id,count(employees.department_id)
from employees,departments
where departments.department_id=employees.department_id 
group by department_name;

#7.Write a query to find the employee ID, job title, number of days between ending
# date and starting date for all jobs in department 90.
select employees.employee_id,employees.department_id, job_title, datediff(end_date , start_date) as 'Number of days'
 from job_history, employees, jobs
 where employees.job_id = jobs.job_id and 
 employees.EMPLOYEE_ID= job_history.EMPLOYEE_ID
 and 
employees.DEPARTMENT_ID=90;
#8.	Write a query to display the department ID and name and first name of manager. 
select * from employees;
select * from countries;
select * from departments;
select * from jobs;
select * from locations;
select * from job_history;

select a.department_id, b.first_name from employees a,employees b
where a.MANAGER_ID=b.EMPLOYEE_ID;

#9.	Write a query to display the department name, manager name, and city.
select department_name,first_name,last_name,city 
from employees,departments,locations
where employees.department_id=departments.department_id and 
locations.location_id=departments.location_id;

#10.Write a query to display the job title and average salary of employees.
select first_name,job_title from employee,jobs
where employees.JOB_ID=jobs.JOB_ID;

#11.Write a query to display job title, employee name, and the difference 
#between salary of the employee and minimum salary for the job.
select job_title,first_name,last_name, (SALARY-MIN_SALARY) as diffsal from employees,jobs
where employees.JOB_ID=jobs.JOB_ID;

#12.Write a query to display the job history that were done by any employee
# who is currently drawing more than 10000 of salary
select first_name, employees.job_id, job_history.
*from employees, job_history
where employees.employee_id = job_history.employee_id;

#13.Write a query to display department name, name (first_name, last_name),
#hire date, salary of the manager for all managers whose experience is more than 15 years.