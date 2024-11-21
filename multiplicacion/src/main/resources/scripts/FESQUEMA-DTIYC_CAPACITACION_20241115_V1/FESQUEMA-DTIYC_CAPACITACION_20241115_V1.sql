REM FESQUEMA-DTIYC_CAPACITACION_20241115_V1.sql
REM ***************************************************************************
prompt nombre del script: FESQUEMA-DTIYC_CAPACITACION_20241115_V1.sql
prompt proyecto: Capacitacion Spring Boot
prompt Realizado: VGVDB 15 de Noviembre 2024
prompt Descripcion: Create activityprojectval schema
REM ***************************************************************************

SPOOL FESQUEMA-DTIYC_CAPACITACION_20241115_V1.log

ACCEPT BANINST1_PASSWORD PROMPT 'BANINST1 Password: ' HIDE
CONNECT BANINST1/&&BANINST1_PASSWORD

prompt *********************************************************************
SELECT 'Fecha de ejecuci?n: ' || TO_CHAR(SYSDATE,'DD-MON-YYYY HH24:MI') Fecha_Ejecucion FROM DUAL;

SET ECHO ON
SET VERIFY ON

prompt * Create activityprojectval schema*

@activityprojectval.sql

SET ECHO OFF
SET VERIFY OFF