use TestDB;
show tables;

Select * From Person;

Alter table Person
Add Constraint Primary Key(PersonID);

Alter table Person
Drop Index Unique_PK;

Select Constraint_Name, Constraint_Type
From Information_Schema.Table_Constraints
Where Table_Name = 'Person';

Alter table Person
Drop Primary Key;
Insert into Person
Values(3, "Thenmozhi", "Vedhagiri", "Chennai", "India", 9292917191);

Select * from Person;
Alter Table Person
Add Primary Key(PersonID);

Update Person
Set PersonID = 4
WHERE FirstName = 'Thenmozhi';

Select * From Person;

Alter table Person
Add Constraint PK_Key Primary Key(PersonID, PhoneNumber);

Select Constraint_Name, Constraint_Type
From Information_Schema.Table_Constraints
Where Table_Name = 'Person';

Create Table OrderDetails(
PersonID int,
FirstName varchar(255),
LastName varchar(255),
CompanyName varchar(255),
OrderID int,
OrderItem varchar(255),
Foreign Key(PersonID) references Person(PersonID)
);

Select * From OrderDetails;

Insert into OrderDetails
Values(1, "Akshinth", "Madhi", "ABC Limited", 5, "Phone"),
(2, "Kavi", "Vedhagiri", "Google Limited", 10, "Watch"),
(3, "Madhi", "Kalaivanam", "Tech Mahindra", 8, "Laptp");

Insert into Person
Values(5, "Vishali", "Balasundara,", "Kanchipuram", "India", 9223249121);

Insert into OrderDetails
Values(5, "Vishali", "Balasundara,", "TCS Limited", 3, "Refrigerator");

