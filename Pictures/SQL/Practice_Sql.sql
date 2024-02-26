use Testing_DB;

show tables;


Select CustomerName, Count(*) From Customers
Group By CustomerName Having Count(*)>1;

Select * From Customers
Where City = 'São Paulo' AND Country = 'Brazil';

Select * From Customers
Where Country = 'Spain' AND (CustomerName Like 'G%' OR CustomerName Like 'R%');

Select * From Customers
Where Country = 'Spain' AND CustomerName Like 'G%' OR CustomerName Like 'R%';

Select * From Customers
Where Country = 'Spain' Or Country ='Germany'
Order By Country;

Select * From Customers
Where City = 'Berlin' OR (CustomerName Like 'G%' OR Country = 'Norway');

Select * From Customers
Where NOT Country = 'Spain'
Order By Country;

Select CustomerName, ContactName, Address
From Customers
Where Address Is  NUll;



Select CustomerName, ContactName, Address
From Customers
Where Address Is NOT NUll;

Select * From Customers
Limit 10;

Select  Min(Price) As SmallestPrice  From Products;

Select Max(price) As HighestPrice From Products
Where Price < ((Select Max(price) As HighestPrice From Products
Where Price < (Select Max(price) As HighestPrice From Products)));

Select * From Products
Order By Price Desc;

Select Avg(Price) From Products;

use Testleaf;
show tables;

Select * From CompanyDetails;

Insert into CompanyDetails
Values("DemoCSR2", "crmsfa", "Queagle", "Aravid", "R");
