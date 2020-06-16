create table emp_spring (
	empno decimal(3), 
	ename varchar(20), 
	job varchar(20), 
	sal decimal(6) 
);

insert into emp_spring values (1, 'íê¸¸ë', 'SALES', 250);
insert into emp_spring values (2, 'ì´ìì ','ANALYST',250);
insert into emp_spring values (3, 'ì ê´ì','ACCOUNTING',250);
insert into emp_spring values (4, 'ê°ê°ì°¬','ANALYST',250);

select * from emp_spring;

create table blog_user(
	user_id varchar2(10) primary key,
	user_name varchar2(20),
	role varchar2(5),
	password varchar2(10)
);


create table guestbook (
	idx number constraint pk_guestbook_idx primary key, 
	password varchar2(10), 
	name varchar2(20), 
	subject varchar2(100), 
	content varchar2(500), 
	write_date varchar2(20)
);

create sequence guestbook_idx_seq start with 1 increment by 1;

insert into guestbook values 
(guestbook_idx_seq.nextval, '1111', '홍길동', '연습', '연습입니다.', to_char(sysdate, 'yyyymmdd'));

select * from guestbook;