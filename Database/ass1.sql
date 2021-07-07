create database Transction;
use Transction;
create table ATM(
id int,
name varchar(10),
city varchar(20)
);
show tables;
insert into atm values (101,'sam','san');
update atm 
 set id=100,name='pooja', city='bang';
select * from atm;
insert into atm values (105,'sam','san');
insert into atm values (102,'sam','HHJK');
savepoint abc;
insert into atm values (106,'sammm','sannn');
insert into atm values (101,'sajbjbf','sgvjb');
commit;
rollback;