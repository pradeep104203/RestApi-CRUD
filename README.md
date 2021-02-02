# Sennovate-Task

Download the project and open it in spring tool suit
Build the project by right click on the project , run as  maven install , you will get jar file or you can run as springboot web. 
you will get a password copy that password || username :user 
Open the browser and usebthe below links to see the swagger ui.

create the database table using the below:
use mydb;

create table product(
id int auto_increment PRIMARY KEY,
name varchar(20),
description varchar(100),
price decimal(8,3) 
);



http://localhost:8080/productapi/swagger-ui.html

http://localhost:8080/productapi/v2/api-docs
