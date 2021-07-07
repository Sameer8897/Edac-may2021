create database edac;
use edac;
create table tempp
(
fir int,
sec char(15)
);

delimiter //
create procedure abc()
begin
	insert into tempp values(1,'inside abc');
end ;//
delimiter ;

call abc();
select * from tempp;

delimiter //
create procedure xyz()
begin
	declare x int;
    set x =10;
    insert into tempp values(x,'inside xyz');
    end;//
delimiter ;

call xyz ();
select * from tempp;

delimiter //
create procedure pqr()
begin
	declare x int default 20;
    insert into tempp values(x,'inside pqr');04
    end;//
delimiter ;

#hra_calc

delimiter //
create procedure hra_calc()
begin
	declare x char(15) default 'King';
    declare y float default 35000;
    declare z float default 0.4;
    declare hra float;
    set hra= y * z ;
    insert into tempp values (y,x);
    insert into tempp values (hra, 'HRA_CALC');
end; //
delimiter ;

call hra_calc();
select * from tempp;

create table Hra_calc(hra float,b char(10));

delimiter //
create procedure hra(x char(15),y float,z float)
begin 
		declare hra float;
        set hra=y*z;
        insert into hra_calc values(y,x);
        insert into hra_calc values (hra,'HRA IS');
	end ; //
    delimiter ;
    call hra('KIng',15000,0.4);
    select * from hra_calc;
    alter table hra_calc modify hra varchar(10);


call pqr();
select * from tempp;

delimiter //
create procedure tbl(num int)
begin
	declare x int default 1;
    declare y int;
    while x<=10 do
		set y=num*x;
		insert into tempp values (y,' ');
		set x= x+1;
    end while;
    end ;//
    delimiter ;
    
    call tbl(10);
    select * from tempp;
    
    delimiter //
	create procedure dowhile()
    begin 
		declare x int default 1;
        repeat
			insert into tempp values(x,'do while');
            set x=x+1;
		until x > 5 
            end repeat;
            end //
		delimiter ;
        
   drop procedure dowhile ;        
	call dowhile();
    select * from tempp;
            
            
            
		
		
    
    
    




