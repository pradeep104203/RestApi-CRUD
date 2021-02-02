# Sennovate-Task



Download the project(Productrestapi)  and open it in spring tool suit.
Build the project by right click on the project , run as  maven install , you will get jar file (java -jar <jarfilename>) or you can run as springboot web. 
you will get a password copy that password and  username is user  (enabled security)
Open the browser and use the below links to see the swagger ui.

create the database table before running the code by using the below:
change your password for database in application properties file.
use mydb;

create table product(
id int auto_increment PRIMARY KEY,
name varchar(20),
description varchar(100),
price decimal(8,3) 
);



http://localhost:8080/productapi/swagger-ui.html

http://localhost:8080/productapi/v2/api-docs
