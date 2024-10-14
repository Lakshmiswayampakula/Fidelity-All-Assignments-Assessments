# CREATING DATABASE-----------------------------------------

CREATE DATABASE Orders;
GO
USE Orders;

# First Table-----------------------------------------------

CREATE TABLE tblCustomers (
    CustomerID INT PRIMARY KEY,
    CompanyName NVARCHAR(50) NOT NULL,
    ContactName NVARCHAR(50),
    ContactTitle NVARCHAR(30),
    Address NVARCHAR(100),
    City NVARCHAR(50),
    Region NVARCHAR(50),
    PostalCode NVARCHAR(20),
    Country NVARCHAR(50) DEFAULT 'Canada',
    Phone NVARCHAR(20),
    Fax NVARCHAR(20)
);

# Second Table---------------------------------------------

CREATE TABLE tblSupplier (
    SupplierID INT PRIMARY KEY,
    Name NVARCHAR(50) NOT NULL,
    Address NVARCHAR(100),
    City NVARCHAR(50),
    Province NVARCHAR(50)
);

# Third Table---------------------------------------------

CREATE TABLE tblShippers (
    ShipperID INT PRIMARY KEY,
    CompanyName NVARCHAR(50) UNIQUE NOT NULL
);

# Fourth Table-------------------------------------------

CREATE TABLE tblProducts (
    ProductID INT PRIMARY KEY,
    SupplierID INT FOREIGN KEY REFERENCES tblSupplier(SupplierID),
    CategoryID INT,
    ProductName NVARCHAR(50) NOT NULL,
    EnglishName NVARCHAR(50),
    QuantityPerUnit NVARCHAR(20),
    UnitPrice DECIMAL(10, 2),
    UnitsInStock INT,
    UnitsOnOrder INT,
    ReorderLevel INT,
    Discontinued BIT
);

# Fifth Table--------------------------------------------

CREATE TABLE tblOrders (
    OrderID INT PRIMARY KEY,
    CustomerID INT FOREIGN KEY REFERENCES tblCustomers(CustomerID),
    EmployeeID INT,
    ShipName NVARCHAR(50),
    ShipAddress NVARCHAR(100),
    ShipCity NVARCHAR(50),
    ShipRegion NVARCHAR(50),
    ShipPostalCode NVARCHAR(20),
    ShipCountry NVARCHAR(50),
    ShipVia INT FOREIGN KEY REFERENCES tblShippers(ShipperID),
    OrderDate DATE,
    RequiredDate DATE,
    ShippedDate DATE CHECK (ShippedDate > OrderDate),
    Freight DECIMAL(10, 2)
);


# Sixth Table--------------------------------------------

CREATE TABLE tblOrderDetails (
    OrderID INT FOREIGN KEY REFERENCES tblOrders(OrderID),
    ProductID INT FOREIGN KEY REFERENCES tblProducts(ProductID),
    UnitPrice DECIMAL(10, 2),
    Quantity INT CHECK (Quantity > 0),
    Discount DECIMAL(4, 2),
    PRIMARY KEY (OrderID, ProductID)
);



