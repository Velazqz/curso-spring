REM ***************************************************************************************
PROMPT Nombre del Script: DTIYC_CAPACITACION_IU_20241115_V1.sql
PROMPT Proyecto: Capacitacion Spring Boot
PROMPT VGVDB 15 de Noviembre de 2024
PROMPT Descripcion: Se insertan registros en las tablas users y employees
REM ***************************************************************************************

SET ECHO OFF
SET VERIFY OFF

SPOOL DTIYC_CAPACITACION_IU_20241115_V1.log

ACCEPT BANINST1_PASSWORD PROMPT 'BANINST1 Password: ' HIDE
CONNECT BANINST1/&&BANINST1_PASSWORD

PROMPT *************************************************************************************

SELECT 'Fecha de ejecucion: ' || TO_CHAR(SYSDATE,'DD-MON-YYYY HH24:MI') Fecha_Ejecucion FROM DUAL;

PROMPT *Se insertan registros en las tablas users y employees*

@iu_activityprojectval.sql

SHOW ERRORS

COMMIT;

PROMPT Close output file.
SPOOL OFF

EXIT;