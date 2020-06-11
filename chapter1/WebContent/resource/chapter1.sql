-- DROP TABLE USERINFO;
drop table USERINFO ;
CREATE TABLE USERINFO ( 
	userId          varchar(12)		NOT NULL, 
	password		varchar(12)		NOT NULL,
	name			varchar(20)		NOT NULL,
	email			varchar(50),
	adminYN			tinyint(1)      NOT NULL,
	PRIMARY KEY               (userId),  	
	INDEX USERINFO_userId_idx  (userId)
) engine=innodb default charset=euckr ;

INSERT INTO USERINFO VALUES('admin', 'admin', '관리자', 'admin@javajigi.net', 1);
INSERT INTO USERINFO VALUES('javajigi', 'javajigi', '자바지기', 'javajigi@javajigi.net', 0);

select * from userinfo ; 

ALTER DATABASE USERINFO DEFAULT CHARACTER SET utf8;