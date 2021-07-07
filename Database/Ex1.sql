create database Assignment1;
use Assignment1;
create table SALESPEOPLE(
Snum integer(4),
Sname varchar(10),
City varchar(10),
Comm float(3,2)
);
insert into SALESPEOPLE values(1001,'Peel','London',.12),
							  (1002,'Serres','San Jose',.13),

                              (1004,'Motika','London',.11),
                              (1007,'Rifkin','Barcelona',.15),
                              (1003,'Axelrod','New York',.10);
select * from Salespeople;

create table CUSTOMERS(
Cnum integer(4),
Cname varchar(10),
City varchar(10),
Rating int(4),
Snum integer(4)
);

insert into CUSTOMERS values(2001,'Hoffman','London',100,1001),
							(2003,'Liu','San Jose',200,1002),
                            (2004, 'Grass','Berlin',300,1002),
                            (2006,'Clemens','London',100,1001),
							(2008, 'Cisneros', 'SanJose', 300,1007),
							(2007,'Pereira', 'Rome', 100, 1004);
select* from customers;

create table ORDERS(
Onum int(4),
Amt float(4,2),
Odate date,
Cnum int(4),
Snum int(4)
);

#Retrieving Information from Tables.
#1) Write a select command that produces the order number, amount, and date for all 
#rows in the Orders table.
#2) Write a query that produces all rows from the Customers table for which the 
#salesperson’s number is 1001.
#Answer
select * from Customers
	where Snum=1001;

#3) Write a query that displays the Salespeople table with the columns in the 
#following order: city, sname, snum, comm.
#answer
select City ,Sname,Snum,Comm
from salespeople;
	
#4) Write a select command that produces the rating followed by the name of each 
#customer in San Jose.
select rating ||' '||Cname "customers rating"
	from customers
	where city='San Jose';

5) Write a query that will produce the snum values of all salespeople (suppress the 
duplicates) with orders in the Orders table