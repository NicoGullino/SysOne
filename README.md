# Spring Boot with REST API with MySQL
Requires JDK 8, MAVEN 3 and MySQL 5
# Change DATABASE in the file application.properties
# If you have una SQL Exception by Time Zone, run this code
<br>
<code>
  -- SABER LA VERSION DE MI MYSQL
SELECT version ();
-- DEFINIR LAS ZONA HORARIA
SET @@global.time_zone = '+00:00';
SET @@session.time_zone = '+00:00';
-- VER MI CONFIGURACION DE ZONA HORARIA
SELECT @@global.time_zone, @@session.time_zone;
 </code
