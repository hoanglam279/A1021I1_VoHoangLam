create database DEMO;
use DEMO;

create table Product(Id int,
productCode varchar(40),
productName varchar(40),
productPrice varchar(45),
productAmount varchar(45),
productDescription varchar(45),
productStatus varchar(45));
insert into Product (id, productCode, productName, productPrice, productDescription, productStatus) values (1, 'ID', 'Wrapsafe', '06-292-8412', '0.98', 'Fuscia');
insert into Product (id, productCode, productName, productPrice, productDescription, productStatus) values (2, 'OM', 'Cardify', '97-834-2356', '6.30', 'Crimson');
insert into Product (id, productCode, productName, productPrice, productDescription, productStatus) values (3, 'CO', 'Quo Lux', '00-207-5241', '5.1.1', 'Aquamarine');
insert into Product (id, productCode, productName, productPrice, productDescription, productStatus) values (4, 'ID', 'Tempsoft', '96-261-3902', '6.69', 'Yellow');
insert into Product (id, productCode, productName, productPrice, productDescription, productStatus) values (5, 'CN', 'Konklux', '58-509-1337', '0.65', 'Puce');
insert into Product (id, productCode, productName, productPrice, productDescription, productStatus) values (6, 'PT', 'Stronghold', '65-597-3266', '0.66', 'Maroon');


ALTER TABLE Product ADD index index_product (productCode);

create view product_view as 
select productCode, productName, productPrice, productStatus
from Product;

select * from product_view;

drop view product_view;


-- store procedured
DELIMITER //

CREATE PROCEDURE findAllProducts()

BEGIN

  SELECT * FROM Product;

END //

DELIMITER ;

call findAllProducts();