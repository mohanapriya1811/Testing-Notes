Alter table Person
Modify Column PhoneNumber int(10);

Alter table Person
Modify Column PhoneNumber BIGINT;

Insert into Person (PersonId, FirstName, LastName, City, Country, PhoneNumber) 
Values (1, "Akshinth", "Madhi", "Chennai", "India", 9212455422);


Select * From Person;

Insert into Person
Values (2, "Kavi", "Vedhagiri", "IOWA", "USA", 9837272832),
(3, "Madhi", "Kalaivanam", "Chennai", "India", 7200643110);

Update Person 
Set  PhoneNumber = 7829291232, City = "Anakaputhur"
Where FirstName = 'Madhi';

SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE
FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS
WHERE TABLE_NAME='Person';

Alter table Person
Modify Column PersonID int NOT NULL;

Alter table Person
Add Constraint Unique(PersonID);

Alter table Person
Drop Index PersonID;

Alter table Person
Add Constraint Unique_PK  Unique(PersonID, PhoneNumber);

Alter table Person
Drop Unique_PK;
