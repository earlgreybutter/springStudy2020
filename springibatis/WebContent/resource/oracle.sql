create table emp_spring (
	empno decimal(3), 
	ename varchar(20), 
	job varchar(20), 
	sal decimal(6) 
);

insert into emp_spring values (1, '홍길동', 'SALES', 250);
insert into emp_spring values (2, '이순신','ANALYST',250);
insert into emp_spring values (3, '유관순','ACCOUNTING',250);
insert into emp_spring values (4, '강감찬','ANALYST',250);

select * from emp_spring;

create table blog_user(
	user_id varchar2(10) primary key,
	user_name varchar2(20),
	role varchar2(5),
	password varchar2(10)
);