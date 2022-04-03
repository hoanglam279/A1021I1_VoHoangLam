create database quanlybanhang;
use quanlybanhang;

create table product(
pID int primary key,
pName varchar(45),
pPrice double);

create table customer(
cID int primary key,
cName varchar(45),
cAge int
);
create table `order`(
oID int primary key,
cID int,
oDate datetime,
oTotalPrice double,
foreign key(cID) references customer(cID)
);	
create table orderDetail(
oID int,
pID int,
odQTY varchar(45),
primary key(oID,pID),
foreign key(oID) references `order`(oID),
foreign key(pID) references product(pID)
);

insert into customer values(1,"Minh Quan",10),(2,"Ngoc Oanh",20),(3,"Hong Ha",50);


insert into `order` values(1,1,"2006-3-21",Null),
(2,2,"2006-3-23",Null),
(3,1,"2006-3-16",Null);

insert into product values(1,"May Giat",3),
(2,"Tu Lanh",5),
(3,"Dieu Hoa",7),
(4,"Quat",1),
(5,"Bep Dien",2);

insert into orderDetail values(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

-- truy van

select oID, oDate, oTotalPrice
from `order`;

select  customer.cName,product.pName
from customer inner join
`order` on customer.cID=`order`.cID inner join
orderDetail on `order`.oID=orderDetail.oID inner join
product on orderDetail.pID=product.pID;

select * from customer c where c.cID not in(
	select o.cID from `order` o
);

select o.oID,o.oDate, sum(od.odQTY * p.pPrice) as Total_price
from `order` o inner join
orderDetail od on o.oID=od.oID inner join
product p on od.pID=p.pID
group by oID;