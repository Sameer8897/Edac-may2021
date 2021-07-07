create database Practise;
use Practise;


create table emp(
EmpNo varchar(10),
EName varchar(10),
Sal int(10),
DeptNo int(4),
Job varchar(10),
Mgr char(4)
);
insert into Emp values('1','Arun',8000,1,'m','4'),
					  ('2','Ali',7000,1,'c','1'),
					  ('3','Kirun',3000,1,'c','1'),
					  ('4','Jack',9000,2,'m',null),
					  ('5','Thomas',8000,2,'c','4');
select * from emp;
create table DEPT
(
DeptNo int,
Dname varchar(10),
Loc varchar(10)
);

insert into DEPT values (1,'TRN','BBY'),
(2,'EXP','DEL'),
(3,'MKTG','CAL');
select * from DEPT;
select * from emp;
drop table DEPT;
Drop table Emp;
#Equijoint
select Dname,Ename from emp,dept
where dept.deptno=emp.deptno;
# left outer joint 
select Dname,Ename from emp
left outer join dept
ON (dept.deptno=emp.deptno)
	union
select dname,ename from emp
right outer join dept
ON (dept.deptno=emp.deptno);

#inequijoint (non Equi)
select dname,ename from emp,dept
where dept.deptno!=emp.deptno order by 1;

# OuterJoint
select dname,ename from emp,dept
where dept.deptno=emp.deptno;

insert into emp values('6','scott',6000,99,'m','4');
