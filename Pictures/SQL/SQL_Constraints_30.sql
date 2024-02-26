use TestDB;


show tables;
Select * From Person;

Alter table Person
Add Column cityCode int;

Update Person
Set cityCode = 101;


Select Constraint_Name, Constraint_Type From
Information_Schema.Table_Constraints
Where Table_Name = 'Person';

Alter Table OrderDetails
Drop Foreign Key OrderDetails_ibfk_1;

Alter Table Person
Drop Primary Key;

Select * From Person;

Select Column_Name, Data_Type from
Information_Schema.Columns
Where Table_Name = 'Person';

Alter table Person
Modify Column PhoneNumber long Not Null;

Alter table Person
Add Primary Key(cityCode);

Select Constraint_Name, Constraint_Type
From Information_Schema.Table_Constraints
Where Table_Name = 'Person';

Alter Table Person
Drop Primary Key;

Alter table Person
Add Constraint PK_Key Primary Key(PersonID, FirstName);

Alter Table Person
Drop Primary Key;

