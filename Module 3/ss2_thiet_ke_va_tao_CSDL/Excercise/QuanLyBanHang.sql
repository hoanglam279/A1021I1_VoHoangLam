create database QuanLyBanHang;
use QuanLyBanHang;
create table Customer(
cID int not null auto_increment primary key,
cName varchar(20),
cAge int(10) 	
);
create table `Order`(
oID int not null auto_increment primary key,
cID int not null,
oDate datetime,
oTotalPrice double,
FOREIGN KEY (cID) REFERENCES Customer (cID)
);
create table Product(
pID int not null auto_increment primary key,
pName varchar(20),
pPrice double
);
create table OrderDetail(
oID int not null auto_increment primary key,
pID int not null,
odQTY int,
foreign key ( 

);