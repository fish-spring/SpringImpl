create database if not exists spring_manual;
use spring_manual;

create table user(
  id int unsigned primary key auto_increment,
  name char(10) not null ,
  password char(30) not null
);
select * from user;

update user set name = 'Jan' where id = 2;
