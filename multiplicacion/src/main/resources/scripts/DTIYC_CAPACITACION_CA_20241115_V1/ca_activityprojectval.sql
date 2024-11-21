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

COMMIT;