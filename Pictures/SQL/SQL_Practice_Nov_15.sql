use TestDB;

Select Constraint_Name, Constraint_Type
From Information_Schema.Table_Constraints
Where Table_Name = 'PersonTwo';

Select * From PersonTwo;

Alter table PersonTwo
Add Constraint cityCheck Check (CityCode >=18);

Alter table PersonTwo
Drop Check cityCheck;

Alter table PersonTwo
Alter cityCode Set Default 18;

Alter table PersonTwo
Alter cityCode Drop default;

Alter table PersonTwo
Add Primary Key(PersonID);

Alter table PersonTwo
Drop Primary Key;

Alter table PersonTwo 
Modify Column PersonID Auto_Increment;

Insert into PersonTwo(PersonId, FirstName, LastName, City, Country, PhoneNumber, citycode)
Values(7, "Bumra", "Jasprit", "Delhi", "India", 3632829111, 19);

Insert into PersonTwo(FirstName, LastName, City, Country, PhoneNumber, citycode)
Values("Dhoni", "Mahendra", "Delhi", "India", 8393237323, 19);

Insert into PersonTwo(FirstName, LastName, City, Country, PhoneNumber, citycode)
Values("Rinku", "Singh", "Maharashtra", "India", 8393237233, 18);