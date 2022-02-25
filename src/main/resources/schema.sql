
--STATEMENT
create TABLE tutorials (
  id NUMBER(10) ,
  title VARCHAR2(255),
  description VARCHAR2(255),
  published NUMBER(1) DEFAULT 0,
  PRIMARY KEY(id)
);


--Author
 create TABLE AUTHOR
   (	"ID" NUMBER(10,0) ,
	"NAME" VARCHAR2(255 BYTE),
	"TITLE" VARCHAR2(255 BYTE),
	"BRIEF_PROFILE"  VARCHAR2(4000 BYTE) DEFAULT 0,

	 PRIMARY KEY ("ID")

   );

   --Publish
   create TABLE Publish
   	(  "NAME" VARCHAR2(255 BYTE),
   	"TITLE" VARCHAR2(255 BYTE),
   	"PUBLISHYEAR"  DATE(4)
   	);

