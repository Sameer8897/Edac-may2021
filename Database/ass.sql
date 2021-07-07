create database Asses;
use Asses;
create table s(
S_NO char(4),
Sname varchar(20),
Status char(10),
city char(10));

insert into s values('1001','tata','10','mumbai'),
					('1002','mahindra','20','pune'),
                    ('1003','bajaj','30','banglore');
select * from s;

create table P(
P_No char(2),
Pname varchar(20),
Colour char(10),
Weight int,
City char(15));
insert into p values('11','p1','red',101,'London'),
					('12','p2','blue',102,'Paris'),
                    ('13','p3','green',103,'Athens');
select * from p;

update p 
	set Pname='spro';
update p 
	set Pname='Ppro'
    where P_No='12';
update p 
	set Pname='qpro'
    where P_no='13';
create table j(
J_No char(4),
J_Name varchar(10),
city varchar(20));
insert into j values('21','j1','city1'),
					('31','j2','city2'),
                    ('41','j3','city');
   select *from j;   
   
select * from s;
select S_NO,Sname from s;
select Pname,Colour from p
	where city='London';
select * from s
	where city='London';
select *from s 
	where city='paris' or city='London';
select * from p
	where city='Athens';
select *from p
where weight>=12 and weight<=14;
select *from  s
	where status>='20'; 
select * from s
	where city!='London';
select city from s;

select weight*1000 'milligram',
    weight/1000 'kilogran'
    from p;
    
#Exercise 2;
#1. Display the Supplier table in the descending order of CITY. 
select * from s
	order by city desc;
#2. Display the Part Table in the ascending order of CITY and within the city in 
#-the ascending order of Part names.
select Pname from p
	order by city;
#3. Display all the Suppliers with a status between 10 and 20
select * from s
	where status>=10 & status<=20;
    
#4 Display all the Parts and their Weight, which are not in the range of 10 and 15
select * from p
	where Weight not between 10 and 15;
#5. Display all the Part names starting with the letter ‘S
select *from p
	where Pname like 'S%';
#6. Display all the Suppliers, belonging to cities starting with the letter ‘L’
select * from s
	where city like 'L%';
#7. Display all the Projects, with the third letter in JNAME as ‘n
select * from p 
where pname like '__n%';

/*exercse 3
1. Display all the Supplier names with the initial letter capital.*/
select Sname from s
	where ASCII(Sname) between 65 AND 97;

update s
	 set Sname='Avff'
     where Sname='tata';

#2. Display all the Supplier names with the initial letter capital. */
select * from s;
select upper(Sname) from s;
#3. Display all the Supplier names in lower case.
select lower(Sname) from s;
#4. Display all the Supplier names padded to 25 characters, with spaces on the left
select rpad(Sname,25,'*') from s;
select (rtrim(Sname))from s;
#5 
select replace(Sname,'aj','ro') from s;

#6 Implement the above command such that ‘l’ is replaced with ‘r’ and ‘a’ is replaced with ‘o
select replace(replace(sname,'l','r'),'a','o') from s;

#7.Display the Supplier names and the lengths of the names. 
select sname,length(Sname) from s;
#8.Use the soundex function to search for a supplier by the name of ‘BLOKE’.
select sname from s
	where soundex(sname)=soundex('BLOCK');
#9.Display the Supplier name and the status (as Ten, Twenty, Thirty, etc.). 
select sname,Status from s;
#10. Display the current day (e.g. Thursday).
select DAYNAME('2021-06-25');

