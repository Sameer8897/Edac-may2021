create database sameer;
use sameer;
 create table SEMP(
EMPNO char(4),
EMPNAME varchar(20),
BASIC float(9,2),
DEPTNO char(2),
DEPTHEAD char(4)
);

create table SDEPT(
DEPTNO char(2),
DEPTNAME char(20)
);

use sameer;
insert into SDEPT
values(10,'Devlopment'),
		(20,'DeptNo');
show tables;
insert into semp values('0001','SUNIL',6000,'10',null),
						('0002','HIREN',8000,'20',null),
                        ('0003','ALI',4000,'10','0001'),
						('0004','GEORGE',6000,null,'0002');
       show tables;
       select *from semp;
       use sameer;
       
       
