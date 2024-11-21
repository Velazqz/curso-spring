/*
REM **************************************************************************
REM Nombre del Script: @activityprojectval.sql
REM Proyecto: Capacitacion Spring Boot
REM --------------------------------------------------------------------------
REM AUDIT TRAIL: Version 1
REM Realizado por: VGVDB 15 de Noviembre 2024
*/


CREATE USER activityprojectval IDENTIFIED BY --AQUI VA EL PASSWORD
DEFAULT TABLESPACE USERS TEMPORARY
TABLESPACE TEMP
PROFILE APLICACIONES ACCOUNT UNLOCK;

GRANT CONNECT TO activityprojectval;
GRANT CREATE TABLE TO activityprojectval;
GRANT CREATE SEQUENCE TO activityprojectval;
GRANT CREATE ANY INDEX TO activityprojectval;

ALTER USER activityprojectval QUOTA UNLIMITED ON USERS;

COMMIT;