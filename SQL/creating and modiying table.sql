create table petdetail(
petid  int not null,
petname varchar(14),
pettypeid int,
petage int,);



insert into petdetail values(10 ,'puppy',22,3);
insert into petdetail values(11 ,'gimmy',23,4);
insert into petdetail values(12 ,'nobal',22,2);
insert into petdetail values(13 ,'bell',23,2);
insert into petdetail values (14 ,'tommy',23,3);

create table pettype(
pettypeid int,
petype  varchar(4),);



 insert into pettype values (22,'CAT');
 insert into pettype values(23,'dog');

 create table procedured(
procedureid int not null,
proceduren  varchar(23),);



insert into procedured values(77,'rabbis vaccination');
insert into procedured values(75,'General chekup');

 create table visit(

petid int not null,
visitdate date,
procedureid int not null,);




insert into visit values(10 , '12-nov-2000',77);
insert into visit values(11 , '13-dec-2001',77);
insert into visit values(12 , '14-jan-2002',75);
insert into visit values(13 , '22-feb-2003', 75);
insert into visit values(14 ,'23-feb-2000',77);



 




