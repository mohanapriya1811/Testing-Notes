use TestDB;

Create Table Check_Table Select * From PersonTwo;

show tables;

Select * From Check_Table;

Alter table Check_Table
Add Constraint Check_Constraint check(citycode>=18);

Update Check_Table
Set citycode = 27
Where PersonId = 10;

Select Constraint_Name, Constraint_Type
From Information_Schema.Table_Constraints
Where Table_Name = "Check_Table";

Alter table Check_Table
Drop Check Check_Constraint;

Alter table Check_Table
Alter Column cityCode set Default 18; 

Alter table Check_Table
Alter Column citycode Drop default;


Create Index TableIndex on Check_Table(cityCode);
Alter table Check_Table
Drop Index TableIndex;
show indexes from Check_Table;

Explain Select * From Check_Table Where citycode = 26;

Alter table Check_Table
Add Constraint PrimaryKey primary key(citycode);
Alter table Check_Table
Modify Column citycode int Auto_Increment;

Alter table Check_Table auto_increment = 100;

Alter table Check_Table
Modify Column citycode int;

create user devesh0308@localhost identified by "K@vith@0405";

Select user from mysql.user;

Desc mysql.user;

SELECT user, host, account_locked, password_expired FROM mysql.user;  

use Testleaf;

show tables;

Create table CompanyDetails(

username varchar(255),
pwd varchar(255),
companyname varchar(255),
firstname varchar(255),
lastname varchar(255));

Insert into CompanyDetails
Values ("Demosalesmanager", "crmsfa", "Testleaf", "Hari", "Radhakrishan");

