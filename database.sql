CREATE DATABASE bankmanagementsystem;

SHOW DATABASES;

USE bankmanagementsystem;                           #using databse

CREATE TABLE signup(                                #create signup table schema
formno VARCHAR(20), 
name VARCHAR(20), 
father_name VARCHAR(20), 
dob VARCHAR(20), 
gender VARCHAR(20), 
email VARCHAR(30),
marital_status VARCHAR(20), 
address VARCHAR(40), 
city VARCHAR(25), 
pincode VARCHAR(20), 
state VARCHAR(25)
);

SHOW TABLES;

SELECT*FROM signup;                                 #viewing the data in table


CREATE TABLE signuptwo(                               #create signuptwo table schema
formno VARCHAR(20), 
religion VARCHAR(20), 
category VARCHAR(20), 
income VARCHAR(20), 
education VARCHAR(20), 
occupation VARCHAR(20), 
pan VARCHAR(20), 
aadhar VARCHAR(20), 
seniorcitizen VARCHAR(20), 
existingaccount VARCHAR(20)
);

SELECT*FROM signuptwo;

CREATE TABLE signupthree(                               #create signupthree table schema
formno VARCHAR(20), 
accountType VARCHAR(30), 
cardnumber VARCHAR(25), 
pin VARCHAR(10), 
facility VARCHAR(100)
);

SELECT*FROM signupthree;

CREATE TABLE login(
formno VARCHAR(20),
cardnumber VARCHAR(25), 
pin VARCHAR(10)
);

SELECT*FROM login;

CREATE TABLE bank( 
pin VARCHAR(10),
date VARCHAR(50),
type VARCHAR(20),
amount VARCHAR(20)
);

SELECT*FROM bank;
