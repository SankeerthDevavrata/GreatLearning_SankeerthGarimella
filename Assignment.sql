create database if not exists Ecommerce;
use Ecommerce;

create table if not exists supplier(
	SUPP_ID int primary key,
    SUPP_NAME varchar(50) NOT NULL,
    SUPP_CITY varchar(50) NOT NULL,
    SUPP_PHONE varchar(50) NOT NULL
);

create table if not exists customer(
	CUS_ID int primary key,
    CUS_NAME varchar(20) NOT NULL,
    CUS_PHONE varchar(10) NOT NULL,
    CUS_CITY varchar(30) NOT NULL,
    CUS_GENDER char
);

create table if not exists category(
	CAT_ID int primary key,
    CAT_NAME varchar(20) not null
);

create table if not exists product(
	PRO_ID int primary key,
    PRO_NAME VARCHAR(20) NOT NULL DEFAULT "Dummy",
    PRO_DESC varchar(60),
    CAT_ID int,
    FOREIGN KEY (CAT_ID) REFERENCES category(CAT_ID)
);

create table if not exists supplier_pricing(
	PRICING_ID int primary key,
    PRO_ID int,
    SUPP_ID int,
    SUPP_PRICE int default 0,
    FOREIGN KEY (SUPP_ID) REFERENCES supplier(SUPP_ID),
    FOREIGN KEY (PRO_ID) REFERENCES product(PRO_ID)
);

create table if not exists `order`(
	ORD_ID int primary key,
    ORD_AMOUNT int not null,
    ORD_DATE date not null,
    CUS_ID int,
    PRICING_ID int,
    FOREIGN KEY (CUS_ID) REFERENCES customer(CUS_ID),
    FOREIGN KEY (PRICING_ID) REFERENCES supplier_pricing(PRICING_ID)
);

create table if not exists rating(
	RAT_ID int primary key,
    ORD_ID int,
    RAT_RATSTARS int not null,
    FOREIGN KEY (ORD_ID) REFERENCES `order`(ORD_ID)
);

INSERT INTO supplier (SUPP_ID, SUPP_NAME, SUPP_CITY, SUPP_PHONE) VALUES
    (1, 'Rajesh Retails', 'Delhi', '1234567890'),
    (2, 'Appario Ltd.', 'Mumbai', '2589631470'),
    (3, 'Knome products', 'Banglore', '9785462315'),
    (4, 'Bansal Retails', 'Kochi', '8975463285'),
    (5, 'Mittal Ltd.', 'Lucknow', '7898456532');

INSERT INTO customer (CUS_ID, CUS_NAME, CUS_PHONE, CUS_CITY, CUS_GENDER) VALUES
    (1, 'AAKASH', '9999999999', 'DELHI', 'M'),
    (2, 'AMAN', '9785463215', 'NOIDA', 'M'),
    (3, 'NEHA', '9999999999', 'MUMBAI', 'F'),
    (4, 'MEGHA', '9994562399', 'KOLKATA', 'F'),
    (5, 'PULKIT', '7895999999', 'LUCKNOW', 'M');

INSERT INTO category (CAT_ID, CAT_NAME) VALUES
    (1, 'BOOKS'),
    (2, 'GAMES'),
    (3, 'GROCERIES'),
    (4, 'ELECTRONICS'),
    (5, 'CLOTHES');
    
INSERT INTO product (PRO_ID, PRO_NAME, PRO_DESC, CAT_ID) VALUES
    (1, 'GTA V', 'Windows 7 and above with i5 processor and 8GB RAM', 2),
    (2, 'TSHIRT', 'SIZE-L with Black, Blue and White variations', 5),
    (3, 'ROG LAPTOP', 'Windows 10 with 15inch screen, i7 processor, 1TB SSD', 4),
    (4, 'OATS', 'Highly Nutritious from Nestle', 3),
    (5, 'HARRY POTTER', 'Best Collection of all time by J.K Rowling', 1),
    (6, 'MILK', '1L Toned Milk', 3),
    (7, 'Boat Earphones', '1.5Meter long Dolby Atmos', 4),
    (8, 'Jeans', 'Stretchable Denim Jeans with various sizes and color', 5),
    (9, 'Project IGI', 'Compatible with Windows 7 and above', 2),
    (10, 'Hoodie', 'Black GUCCI for 13 yrs and above', 5),
    (11, 'Rich Dad Poor Dad', 'Written by Robert Kiyosaki', 1),
    (12, 'Train Your Brain', 'By Shireen Stephen', 1);

    
INSERT INTO SUPPLIER_PRICING (PRICING_ID, PRO_ID, SUPP_ID, SUPP_PRICE) VALUES (1,1,2,1500),
	(2,3,5,30000),
	(3,5,1,3000),
	(4,2,3,2500),
	(5,4,1,1000),
	(6,12,2,780),
	(7, 12,4,789),
	(8,3,1,31000),
	(9,1,5,1450),
	(10,4,2,999),
	(11,7,3,549),
	(12,7,4,529),
	(13,6,2,105),
	(14,6,1,99),
	(15,2,5,2999),
	(16,5,2,2999);

INSERT INTO `order` (ORD_ID, ORD_AMOUNT, ORD_DATE, CUS_ID, PRICING_ID) VALUES
    (101, 1500, '2021-10-06', 2, 1),
    (102, 1000, '2021-10-12', 3, 5),
    (103, 30000, '2021-09-16', 5, 2),
    (104, 1500, '2021-10-05', 1, 1),
    (105, 3000, '2021-08-16', 4, 3),
    (106, 1450, '2021-08-18', 1, 9),
    (107, 789, '2021-09-01', 3, 7),
    (108, 780, '2021-09-07', 5, 6),
    (109, 3000, '2021-09-10', 5, 3),
    (110, 2500, '2021-09-10', 2, 4),
    (111, 1000, '2021-09-15', 4, 5),
    (112, 789, '2021-09-16', 4, 7),
    (113, 31000, '2021-09-16', 1, 8),
    (114, 1000, '2021-09-16', 3, 5),
    (115, 3000, '2021-09-16', 5, 3),
    (116, 99, '2021-09-17', 2, 14);

INSERT INTO rating (RAT_ID, ORD_ID, RAT_RATSTARS) VALUES
    (1, 101, 4),
    (2, 102, 3),
    (3, 103, 1),
    (4, 104, 2),
    (5, 105, 4),
    (6, 106, 3),
    (7, 107, 4),
    (8, 108, 4),
    (9, 109, 3),
    (10, 110, 5),
    (11, 111, 3),
    (12, 112, 4),
    (13, 113, 2),
    (14, 114, 1),
    (15, 115, 1),
    (16, 116, 0);

-- query : Display the total number of customers based on gender who have placed orders of worth at least Rs.3000.

Select count(c.cus_id) as 'Count' ,c.cus_gender 
from `order` ord
inner join customer c on c.cus_id=ord.cus_id
where ord.ord_amount>=3000
group by c.cus_gender;

-- query :  Display all the orders along with product name ordered by a customer having Customer_Id=2

select ord.cus_id,prd.pro_name,prd.pro_desc from `order` ord 
inner join supplier_pricing sp on sp.pricing_id=ord.pricing_id
inner join product prd on prd.pro_id=sp.pro_id
where ord.cus_id=2;

-- query :  Display the Supplier details who can supply more than one product.

select sup.*,count(sp.supp_id) as TotalProducts 
from supplier sup
inner join supplier_pricing sp on sup.supp_id=sp.supp_id
group by sp.supp_id
having count(sp.supp_id)>1;

--   Find the least expensive product from each category and print the table with category id, name, and price of the product

select cat.cat_id,cat.cat_name,min(MinPrice_ProCategory.LeastExpensive) as MinPrice
from category cat 
inner join(
	select prd.pro_name,prd.cat_id,MinPrice_ProId.* from product prd
	inner join (
		select sp.pro_id ,min(sp.supp_price) as LeastExpensive from supplier_pricing sp
		group by sp.pro_id
	) as MinPrice_ProId on prd.pro_id=MinPrice_ProId.pro_id
) as MinPrice_ProCategory on cat.cat_id=MinPrice_ProCategory.cat_id
group by MinPrice_ProCategory.cat_id 
having min( MinPrice_ProCategory.LeastExpensive)
order by cat.cat_id asc;

-- query different style for same question
 
SELECT cat.cat_id, cat.cat_name, MinPrice_ProCategory.LeastExpensive
FROM category cat 
INNER JOIN (
    SELECT prd.cat_id, MIN(sp.supp_price) AS LeastExpensive
    FROM product prd
    INNER JOIN supplier_pricing sp ON prd.pro_id = sp.pro_id
    GROUP BY prd.cat_id
) AS MinPrice_ProCategory ON cat.cat_id = MinPrice_ProCategory.cat_id;

--  Display the Id and Name of the Product ordered after “2021-10-05”. 

 select p.pro_id,p.pro_name,ord.ord_date from `order` ord 
 inner join supplier_pricing sp on sp.pricing_id=ord.pricing_id
 inner join product p on p.pro_id=sp.pro_id
 where ord.ord_date>'2021-10-05';

-- Display customer name and gender whose names start or end with character 'A'.

select cus_name ,cus_gender from customer
where cus_name like '%a' or cus_name like 'a%' ;

-- Create a stored procedure to display supplier id, name, rating and Type_of_supplier. If rating >4 then “Genuine Supplier” if rating >2 
-- “Average Supplier” else “Supplier should not be considered”.

DELIMITER //
CREATE PROCEDURE SupplierRatingReview()
BEGIN
	SELECT report.supp_id,report.supp_name,report.rating,
	CASE 
		WHEN report.rating>4 THEN "Genuine Supplier"
		WHEN report. rating>2 THEN "Average Supplier"
		ELSE "Supplier should not be considered"
		END as type_of_Supplier
	FROM
	(
		SELECT s.supp_id, s.supp_name, v.avg as rating FROM SUPPLIER s
		INNER JOIN
		(
			SELECT sp.supp_id, AVG(rt.rat_ratstars) as avg
			from `order` ord
			inner join rating rt ON rt.ord_id = ord.ord_id
			inner join SUPPLIER_PRICING sp ON sp.pricing_id=ord.pricing_id
			GROUP BY sp.supp_id
		) as v ON v. supp_id=s. supp_id 
	) as report;
END //

DELIMITER ;

call SupplierRatingReview()



