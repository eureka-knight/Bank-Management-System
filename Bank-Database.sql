create database bank_system;
use bank_system;
create table signup(form_no varchar(20),name varchar(20),Father_name varchar(20),DOB varchar(30),gender varchar(15),email varchar(40),Married_status varchar(20),address varchar(40),city varchar(30),pincode varchar(20),state varchar(30),country varchar(30));
select * from signup;
use bank_system;

create table signuptwo(form_no varchar(20),religion varchar(25),category varchar(20),income varchar(30),education varchar(25),occupation varchar(30),pan varchar(20),aadhar varchar(30),seniorcitizen varchar(20),existing_account varchar(20));
select * from signuptwo;

create table signupthree(form_no varchar(20), account_type varchar(40), card_number varchar(30), pin varchar(30),facility varchar(200));
select * from signupthree;

create table login(form_no varchar(20),cvarcharard_number varchar(30),pin varchar(30));
select * from login;
desc login;
create table bank(pin varchar(10),date varchar(50),type varchar(20),amount varchar(40));
select * from bank;
