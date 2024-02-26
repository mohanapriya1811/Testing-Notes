use TestDB;

Select * From Person;

Select Constraint_Name, Constraint_Type
From Information_Schema.Table_Constraints
Where Table_Name = 'PersonTwo';
Select Constraint_Name, Constraint_Type
From Information_Schema.Table_Constraints
Where Table_Name = 'OrderDetails';
Select Column_Name, Data_Type
From Information_Schema.Columns
Where Table_Name ='Person';


Select * From Person;

Alter table Person
Add Column OrderID int;

Create table PersonTwo (Select * From Person);

Select * From PersonTwo;


Drop table PersonTwo;

Truncate table PersonTwo;

Select * From PersonTwo;

Alter table PersonTwo
Add Primary Key(PersonID);

Alter table PersonTwo
Drop Primary Key;

Alter table PersonTwo
Add Constraint Primary Key(OrderID, PersonID);

Alter Table OrderDetails
Add Constraint Foreign Key(OrderID) References PersonTwo(OrderID);


Alter table OrderDetails
Drop Foreign Key OrderDetails_ibfk_1;

truncate OrderDetails;

Select * From OrderDetails;

Alter table PersonTwo
Drop Column OrderID;

Alter table Person
Drop Primary Key;

Alter table Person
Drop Column OrderID;

Insert into PersonTwo 
Select * From Person
Where FirstName = "Madhi" ;

Select * From PersonTwo;

Insert into PersonTwo
Values("1", "Devesh", "Madhi", "Chennai", "India", 727292992, 18);

Alter table PersonTwo
Add Check(citycode>= 18);

Select * From PersonTwo;

Insert into PersonTwo
Values("2", "Virat", "Kohli", "Delhi", "India",  8229929232, 20);

Insert into PersonTwo
Values("4", "Rohit", "Sharma", "Mumbai", "India",  82292229232, 18);

ALter table PersonTwo
Drop Check PersonTwo_chk_1;


