create database DAIRY;
use DAIRY;

create table Coustomer_Detail(
	Id int primary key,
    NAME varchar(50),
    MOBILE_NO int,
    Email_Id varchar(30),
    Registration_Dt date,
    Updatation_Dt date
);
 insert into Coustomer_Detail values (101,'Kiran',1223456755 ,'kiran12@gmail.com','2015-04-01','2021-02-12'),
 (102,'Pranay',1456345675,'pranay11@gmail.com','2016-02-12','2020-04-03'),
 (103,'Shruti',1256745675 ,'shruti14@gmail.com','2016-02-12','2020-01-01'),
 (104,'Komal',1223456990 ,'komal18@gmail.com','2018-02-12','2021-04-01');
 
 select * from Coustomer_Detail;
# drop table Coustomer_Detail;
 
 
create table Product_Detail(
   Id int primary key,
   Product_NAME varchar(50),
   Product_MRP int,
   Manufacture_Dt date,
   Expiry_Dt date
);
insert into Product_Detail values 
(101,'MiLK_POWDER',250,'2020-12-03','2021-05-02'),
(102,'ICE_CREAM',100,'2020-04-02','2022-12-02'),
(103,'AMUL_GHEE',200,'2020-08-04','2021-10-10'),
(104,'AMUL_MILK',100,'2020-08-08','2022-05-01');

select * from Product_Detail;

create table Orders_Table(
   Id int primary key,
   Name varchar(50),
   Contact_No varchar(30),
   Product_Purches varchar(50),
   Product_Quantity float,
   Payment_Mode varchar(30),
   Bill_No varchar(30),
   Order_Date  varchar(30)
);
insert into Orders_Table values
 (101,'Kiran',1223456755,'MiLK_POWDER',40,'cash','ABC1234','2015-04-01'),
 (102,'pranay',1456345675,'ICE_CREAM',50,'G-pay','DFR456','2015-04-03'),
 (103,'shruti',1256745675,'AMUL_GHEE',23,'CASH','RFG543','2015-04-07'),
 (104,'Komal',1223456990,'AMUL_GHEE',12 ,'BHIM','UKJ897','2015-04-09');
 
 select * from Orders_Table;
 #drop table Orders_Table;

 create table Product_Category(
 Id int,
 Category_Name varchar(30),
 Category_code int,
 Posting_date varchar(30)
 );
 alter table Product_Category modify Posting_date date;
 desc Product_Category;
 
 insert into Product_Category(Id , Category_Name,Category_code, Posting_date)values
(111,'MILK',001,'2020-02-23'),
(112,'POWDER',002,'2020-05-05'),
(113,'ICE_CREAM',003,'2020-04-01'),
(114,'GHEE',004,'2020-04-02');
 select * from Product_Category;
 
create table Nutrients(
  Id int primary KEY ,
  Energy float,
  Luctose float,
  fats float,
  sugar float,
  Protein float
);
insert into Nutrients ( Id,Energy,Luctose,fats,sugar,Protein)values
(101,15.5,12.5,2.5,0.2,35.0),
(102,25.75,7.5,15.0,25.5,32.0),
(103,18,34.0,17.2,20.0,30.0),
(104,15.5,45.0,2.5,30.5,45.0);

select * from Nutrients;
desc nutrients;
#DROP TABLE Nutrients;
show tables;

select * from coustomer_detail;
select * from nutrients;
select * from orders_table;
select * from product_category;
select * from product_detail;


# write a query to display customers table whoes registrated in between 2015-2016;
select * from Coustomer_Detail where Registration_Dt between '2015-01-01' and '2016-01-01';

# Display the customes NAME where NAME begins with the letter ‘K’.
select * from coustomer_detail where NAME like 'K%';

# write a query to display Name,EMAIL_ID and MOBILE_NO whoes Payment_mode is cash.
select coustomer_detail.name,Email_Id,MOBILE_NO from coustomer_detail,orders_table
where coustomer_detail.Id=orders_table.Id and orders_table.Payment_Mode='CASH';

#  write a query to display Product_NAME,Energy,Product_MRP having MAximun Energy .
select Product_NAME,Energy,Product_MRP from product_detail,nutrients
where energy =(select max(Energy) from nutrients) And nutrients.id= product_detail.Id;

# write a query to display the Product_Purches is 'AMUL_GHEE'.
select * from orders_table where Product_Purches='AMUL_GHEE';

# select Product_NAME,Manufacture_Dt,Expiry_Dt who is Ordered .
select orders_table.Name,Product_NAME,Manufacture_Dt,Expiry_Dt from orders_table,product_detail
where product_detail.Id=orders_table.Id ;













