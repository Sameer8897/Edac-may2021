#PL Excersize 2
/*1. Select from any table a number and determine whether it is within a given range (for 
example, between 1 and 10).*/
create database PL_Exe;
use PL_Exe;

/*delimiter //
#create procedure range();
begin
	select empno;
    
    
    /*2.*/
    
/*4. Write a program that Selects from any table two character strings. Your program should 
then determine if one character string exists inside another character string.*/
create table Str(name char(30),n int);
insert into str values('sameer',1),('sairaj',2),('sanket',3);
insert into str values('sai',3),('radke',5);

delimiter //
create procedure str_check()
begin
	declare  s1 char(30);
    declare s2 char(30);
    declare l int;
    select lenght(name) into l from str where n=2;
	select name into s1 from str where n=1;
     select name into s2 from str where n=2;
     if s1=substr(s2,l)then
     insert into tempp values(1)
end; //
delimiter ;
    
    
	

