create database exam;
use exam;
create table DEPT(
DEPTNO int,
DNAME varchar(15),
LOC	varchar(10)
);
insert into DEPT (DEPTNO,DNAME,LOC)
values (10,'ACCOUNTING','NEW YORK'),
	   (20,'RESEARCH','DALLAS'),
       (30,'SALES','CHICAGO'),
       (40,'OPERATIONS','BOSTON');
select * from DEPT;

create table EMP(
EMPNO int,
ENAME varchar(10),
JOB	varchar(9),
HIREDATE date,
SAL float,
COMM float,
DEPTNO int
);

insert into EMP(EMPNO,ENAME,JOB,HIREDATE,SAL,COMM,DEPTNO)
	values(7839,'KING','MANAGER','1991-11-17',5000,NULL,10),
			(7698,'BLAKE','CLERK','1981-05-01',2850,NULL,30),
			(7782,'CLARK','MANAGER','1981-06-09',2450,NULL,10),
			(7566,'JONES','CLERK','1981-04-02',2975,NULL,20),
			(7654,'MARTIN','SALESMAN','1981-09-28',1250,1400,30),
			(7499,'ALLEN','SALESMAN','1981-02-20',1600,300,30);
select * from EMP;
#3.Display the average SAL for all the employees whose job is CLERK.
select avg(SAL) from EMP where JOB='CLERK';

#4.Display the rows where ENAME begins with the letter ‘A’.
select * from EMP where Ename like 'A%';

#5.If all employees not receiving a commission are entitled for $300, find the net earnings (sal+comm) of each employee.

 /*6.Display the names of all employees with the initial letter only in capital.*/
 select concat(upper(substr(ENAME,1,1)),lower(substr(ENAME,2))) from EMP;
 
 #7.Find the total number of CLERKs joined after ’01-Jan-81’.
 select count(JOB)FROM EMP WHERE HIREDATE> '1981-01-01' AND job='clerk';
 
 #8.Find the names of all employees whose name ends with the letter ‘M’.
 SELECT ENAME FROM EMP WHERE ENAME LIKE '%M';
 
 #9.Display the position at which the string ‘AR’ occurs in the ename.
 SELECT instr(ENAME,'AR')FROM EMP;
 
 #10.Display the HRA for each employee given that HRA is 20% of SAL
 SELECT SAL*0.2 "HRA" from emp;
 
 #section II
 #1.
 create table TEMPP(result varchar(40));
 delimiter //
 create procedure NUM_100(num1 int,num2 int)
 begin
    declare product int ;
    set product=num1*num2;
    If product >= 100 then
    insert into TEMPP values ('equal to or greater than 100');
    else
    insert into TEMPP values ('less than 100');
    end if;
end; //
delimiter ;
call NUM_100(5,5);
select * from tempp;
    
 
 #2.
 delimiter //
 create function F2C(temp int)
 returns float 
 deterministic 
 begin
 declare c float;
 set c=(temp-32)*5/9;
 return c;
 end; //
 delimiter ;
 
 

 
 
 