CREATE SEQUENCE "SEQ_ID" MINVALUE 1 MAXVALUE 9999999999
INCREMENT BY 1 START WITH 1 ;

CREATE TABLE "SPRING_BOARD" 
(
	"ID" NUMBER(10,0) NOT NULL, 
	"SUBJECT" VARCHAR2(50), 
	"NAME" VARCHAR2(50), 
	"CREATED_DATE" DATE, 
	"MAIL" VARCHAR2(50), 
	"MEMO" VARCHAR2(200), 
	"HITS" NUMBER(10,0),
	PRIMARY KEY ("ID") ENABLE
);