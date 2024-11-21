/*
 REM **************************************************************************
 REM Nombre del Script: ca_activityprojectval.sql
 REM Proyecto: Capacitacion Spring Boot
 REM --------------------------------------------------------------------------
 REM AUDIT TRAIL: Version 1
 REM Realizado por: VGVDB  15 de Noviembre de 2024
 */



CREATE TABLE activityprojectval.users
  (id RAW(16) default SYS_GUID()
    ,name VARCHAR2(35) CONSTRAINT users_name_nn NOT NULL
    ,last_name VARCHAR2(70) CONSTRAINT users_last_name_nn NOT NULL
    ,email VARCHAR2(255) CONSTRAINT users_email_nn NOT NULL
    ,enabled NUMBER(1,0) default 1
    ,role VARCHAR2(15)
    ,vacation_start TIMESTAMP(3)
    ,vacation_ending TIMESTAMP(3)
    ,creation_date TIMESTAMP(3) default LOCALTIMESTAMP(3)
    ,modification_date TIMESTAMP default LOCALTIMESTAMP(3)
    ,CONSTRAINT users_id_pk PRIMARY KEY(id)
    ,CONSTRAINT users_email_uk UNIQUE(email)
    ,CONSTRAINT users_role_ck CHECK(role IN ('ADMINISTRATOR','DEVELOPER'))
    ,CONSTRAINT users_enabled CHECK(enabled IN (0,1))
  );
  
  CREATE TABLE activityprojectval.employees
    ( employee_id    NUMBER(6)
    , first_name     VARCHAR2(20)
    , last_name      VARCHAR2(25)
	 CONSTRAINT     emp_last_name_nn  NOT NULL
    , email          VARCHAR2(25)
	CONSTRAINT     emp_email_nn  NOT NULL
    , phone_number   VARCHAR2(20)
    , hire_date      DATE
	CONSTRAINT     emp_hire_date_nn  NOT NULL
    , job_id         VARCHAR2(10)
	CONSTRAINT     emp_job_nn  NOT NULL
    , salary         NUMBER(8,2)
    , commission_pct NUMBER(2,2)
    , manager_id     NUMBER(6)
    , department_id  NUMBER(4)
    , CONSTRAINT     emp_salary_min
                     CHECK (salary > 0) 
    , CONSTRAINT     emp_email_uk
                     UNIQUE (email)
    ) ;

COMMIT;