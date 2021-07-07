#exercise 4
use Asses;
select * from s;
# 1. Display the minimum Status in the Supplier table.
select min(status) from s;
#2.Display the maximum Weight in the Parts table. 
select max(weight) from p;
#3.Display the average Weight of the Parts. 
select avg(weight) from p;
# 4. Display the total Quantity sold for part ‘P1’.
select sum(Qty)from spj where pno='p1';
#5. Display the total Quantity sold for each part. 
select pno,sum(Qty) from spj group by Pno;
#6. Display the average Quantity sold for each part.
select Pno, avg(Qty) from spj group by Pno order by Pno ;
#7. Display the maximum Quantity sold for each part, provided the maximum Quantity 
#is greater than 800.
insert into spj values(1004,'p4',51,1000);
select Pno, avg(Qty) from spj 
	where Qty>800 group by Pno;
#8. Display the Status and the count of Suppliers with that Status. 
select status,count(S_No) from s group by status;
#9.Display the count of Projects going on in different cities. 
select city,count(J_No) from j group by city;
#10.What is the difference between COUNT(Status) and COUNT(*) ? 
select count(status),Count(*) from s;
/*11.11. Display the Status and the Count of Suppliers with that Status in the following format 
as shown below:- 
Status Count 
Ten 1 
Twenty 2 
Thirty 3 */
select 
case 
when status='10' then 'Ten'
when status='20' then 'Twenty'
when status='30' then 'Thirty'
else 'other'
end "status",count(S_no) group by status;
