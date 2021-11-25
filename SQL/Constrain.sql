select*from petdetail;

alter table petdetail
add constraint petdetails_petid_pk primary key(petid);

select * from visit;

alter table visit
add constraint visit_petid_fk foreign key(petid)references petdetail(petid);
 

select*from procedured;

alter table procedured
add constraint procedured_procedureid_pk primary key(procedureid);

alter table visit
add constraint visit_procedureid_fk foreign key(procedureid)references procedured(procedureid);