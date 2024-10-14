customers table------------------------------------------------------
CREATE TABLE customers (
    customer_id VARCHAR(10) PRIMARY KEY,
    customer_name VARCHAR(20) NOT NULL,
    address VARCHAR(50),
    phone_no BIGINT,
    email_id VARCHAR(20)
);

delivery_partners table----------------------------------------------
CREATE TABLE delivery_partners (
    partner_id VARCHAR(10) PRIMARY KEY,
    partner_name VARCHAR(20) NOT NULL,
    phone_no BIGINT,
    rating INT
);

hotel_details table--------------------------------------------------
CREATE TABLE hotel_details (
    hotel_id VARCHAR(10) PRIMARY KEY,
    hotel_name VARCHAR(20) NOT NULL,
    hotel_type VARCHAR(20),
    rating INT
);

orders table with foreign key references-----------------------------
CREATE TABLE orders (
    order_id VARCHAR(10) PRIMARY KEY,
    customer_id VARCHAR(10),
    hotel_id VARCHAR(10),
    partner_id VARCHAR(10),
    order_date DATE,
    order_amount INT,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
    FOREIGN KEY (hotel_id) REFERENCES hotel_details(hotel_id),
    FOREIGN KEY (partner_id) REFERENCES delivery_partners(partner_id)
);





1-QUESTION------------------------------------------------------------
CREATE TABLE delivery_partners (
    partner_id VARCHAR(10) PRIMARY KEY,
    partner_name VARCHAR(20) NOT NULL,
    phone_no BIGINT,
    rating INT
);
SELECT partner_id, partner_name, phone_no
FROM delivery_partners
WHERE rating BETWEEN 3 AND 5
ORDER BY partner_id;



2-QUESTION-----------------------------------------------------------
CREATE TABLE customers (
    customer_id VARCHAR(10) PRIMARY KEY,
    customer_name VARCHAR(20) NOT NULL,
    address VARCHAR(50),
    phone_no BIGINT,
    email_id VARCHAR(20)
);
INSERT INTO customers (customer_id, customer_name, address, phone_no, email_id)
VALUES ('CUST1001', 'THOMAS', 'KOCHI', 9856325486, 'thomas@gmail.com'),
('CUST1002', 'CHARLES', 'ALLEPY', 9856367486, 'charles@gmail.com'),
('CUST1003', 'SUDHAKAR', 'KOCHI', 9856323869, 'sudhakar@gmail.com'),
('CUST1004', 'JAGADISH', 'ERNAKULAM', 9856326666, 'jagadish@gmail.com'),
('CUST1005', 'ALBERT', 'ALLEPY', 9856328659, 'albert@gmail.com'),
('CUST1006', 'ASHWIN DAS', 'KANNUR', 9856326659, 'ashwin@gmail.com');
UPDATE customers
SET phone_no = 9876543210
WHERE customer_id = 'CUST1004';



3-QUESTION------------------------------------------------------------
CREATE TABLE customers (
    customer_id VARCHAR(10) PRIMARY KEY,
    customer_name VARCHAR(20) NOT NULL,
    address VARCHAR(50),
    phone_no BIGINT,
    email_id VARCHAR(20)
);
SELECT customer_id, customer_name, address, phone_no
FROM customers
WHERE email_id LIKE '%@gmail.com'
ORDER BY customer_id;



4-QUESTION-----------------------------------------------------------
CREATE TABLE customers (
    customer_id VARCHAR(10) PRIMARY KEY,
    customer_name VARCHAR(20) NOT NULL,
    address VARCHAR(50),
    phone_no BIGINT,
    email_id VARCHAR(20)
);
ALTER TABLE customers
ALTER COLUMN customer_id TYPE INT USING customer_id::integer;




5-QUESTION---------------------------------------------------------
CREATE TABLE hotel_details (
    hotel_id VARCHAR(10) PRIMARY KEY,
    hotel_name VARCHAR(20) NOT NULL,
    hotel_type VARCHAR(20),
    rating INT
);
ALTER TABLE hotel_details
RENAME COLUMN rating TO hotel_rating;




6-QUESTION--------------------------------------------------------
CREATE TABLE hotel_details (
    hotel_id VARCHAR(10) PRIMARY KEY,
    hotel_name VARCHAR(20) NOT NULL,
    hotel_type VARCHAR(20),
    rating INT
);
SELECT CONCAT(hotel_name, ' is a ', hotel_type, ' hotel') AS HOTEL_INFO
FROM hotel_details
ORDER BY hotel_name DESC;





7-QUESTION-------------------------------------------------------
SELECT h.hotel_id, h.hotel_name, COUNT(o.order_id) AS NO_OF_ORDERS
FROM hotel_details h
JOIN orders o ON h.hotel_id = o.hotel_id
GROUP BY h.hotel_id, h.hotel_name
HAVING COUNT(o.order_id) > 5
ORDER BY h.hotel_id ASC;



8-QUESTION-------------------------------------------------------
SELECT h.hotel_id, h.hotel_name, h.hotel_type
FROM hotel_details h
WHERE h.hotel_id NOT IN (
    SELECT o.hotel_id
    FROM orders o
    WHERE EXTRACT(MONTH FROM o.order_date) = 5
    AND EXTRACT(YEAR FROM o.order_date) = 2019
)
ORDER BY h.hotel_id ASC;



9-QUESTION------------------------------------------------------
SELECT o.order_id, c.customer_name, h.hotel_name, o.order_amount
FROM orders o
JOIN customers c ON o.customer_id = c.customer_id
JOIN hotel_details h ON o.hotel_id = h.hotel_id
ORDER BY o.order_id ASC;



10-QUESTION-----------------------------------------------------
CREATE TABLE pizza (
    pizza_id VARCHAR(10) PRIMARY KEY,
    cust_id VARCHAR(10),
    partner_id VARCHAR(10),
    pizza_name VARCHAR(15),
    pizza_type VARCHAR(15),
    order_date DATE,
    amount BIGINT
);
UPDATE pizza
SET amount = amount * 0.97
WHERE pizza_type = 'Extra Large';




11-QUESTION----------------------------------------------------
CREATE TABLE salesman (
    salesman_id NUMERIC(5) PRIMARY KEY,
    name VARCHAR(30),
    city VARCHAR(15),
    commission DECIMAL(5,2)
);
GO
CREATE TABLE orders (
    ord_no NUMERIC(5) PRIMARY KEY,
    purch_amt DECIMAL(8,2),
    ord_date DATE,
    customer_id NUMERIC(5),
    salesman_id NUMERIC(5),
    FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)
);
GO




12-QUESTION------------------------------------------------------
CREATE TABLE Supplier (
    Supplier_id NUMERIC(5),
    Supplier_name VARCHAR(150),
    Address VARCHAR(150),
    City VARCHAR(50),
    State VARCHAR(15),
    Country VARCHAR(15),
    Contact VARCHAR(10)
);
ALTER TABLE Supplier
ADD CONSTRAINT chk_contact_length
CHECK (LENGTH(contact) = 10);



