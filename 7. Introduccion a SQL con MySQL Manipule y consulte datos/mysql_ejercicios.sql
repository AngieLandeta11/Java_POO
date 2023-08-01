CREATE DATABASE jugos;
USE jugos;
/*CREATE SCHEMA `jugos2` DEFAULT CHARACTER SET utf8 ; -> Con asistente*/
DROP SCHEMA jugos;
/*
Desde consola
C:\Program Files\MySQL\MySQL Server 8.0\bin
dir mysql.exe
mysql -h localhost -u root -p
CREATE DATABASE jugos;
exit
*/

/* Tipos de datos
Números enteros:

TINYINT: Entero pequeño con un rango de -128 a 127 (signed) o 0 a 255 (unsigned).
SMALLINT: Entero corto con un rango de -32,768 a 32,767 (signed) o 0 a 65,535 (unsigned).
INT o INTEGER: Entero normal con un rango de -2,147,483,648 a 2,147,483,647 (signed) o 0 a 4,294,967,295 (unsigned).
BIGINT: Entero grande con un rango de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 (signed) o 0 a 18,446,744,073,709,551,615 (unsigned).
Números decimales:

FLOAT: Número decimal de precisión simple (4 bytes).
DOUBLE: Número decimal de precisión doble (8 bytes).
DECIMAL: Número decimal exacto, se especifica con precisión y escala.
Texto:

CHAR: Cadena de longitud fija con una longitud máxima específica.
VARCHAR: Cadena de longitud variable con una longitud máxima específica.
TEXT: Texto de longitud variable para contenido más largo.
Fecha y hora:

DATE: Fecha en formato 'YYYY-MM-DD'.
TIME: Hora en formato 'HH:MM:SS'.
DATETIME: Fecha y hora combinadas en formato 'YYYY-MM-DD HH:MM:SS'.
TIMESTAMP: Fecha y hora con zona horaria en formato 'YYYY-MM-DD HH:MM:SS'.
YEAR: Año en formato 'YYYY' o 'YY'.
Otros:

BOOL o BOOLEAN: Valor booleano, puede ser 0 (false) o 1 (true).
ENUM: Lista de valores permitidos.
SET: Conjunto de valores permitidos.
*/

USE jugos;

CREATE TABLE TBCLIENTES(
DNI VARCHAR(20),
NOMBRE VARCHAR(150),
DIRECCION1 VARCHAR(150),
DIRECCION2 VARCHAR(150),
BARRIO VARCHAR(50),
CIUDAD VARCHAR(50),
ESTADO VARCHAR(50),
CP VARCHAR(10),
EDAD SMALLINT,
SEXO VARCHAR(1),
LIMITE_CREDITO FLOAT,
VOLUMEN_COMPRA FLOAT,
PRIMERA_COMPRA BIT(1)

);
CREATE TABLE TBVENDEDORES(
MATRICULA VARCHAR(50),
NOMBRE VARCHAR(150),
COMISION FLOAT);

/*
ELIMINAR TABLA

DROP TABLE NOMBRE DE LA TABLA;
*/
-- INSERTAR DATOS
INSERT INTO tbproductos(PRODUCTO,NOMBRE,ENVASE,VOLUMEN,SABOR,PRECIO) 
VALUES('23452','PEPSI','VIDRIO','1 LITRO','ORIGINAL',35.90);
INSERT INTO tbproductos(PRODUCTO,NOMBRE,ENVASE,VOLUMEN,SABOR,PRECIO) 
VALUES('23453','COCA COLA','LATA','1.5 LITRO','ORIGINAL',38.90);
INSERT INTO tbproductos(PRODUCTO,NOMBRE,ENVASE,VOLUMEN,SABOR,PRECIO) 
VALUES('23454','JUGO','LATA','1 LITRO','MANZANA',12.90);
INSERT INTO tbproductos(PRODUCTO,NOMBRE,ENVASE,VOLUMEN,SABOR,PRECIO)
VALUES('23458','LECHE','TETRAPACK','1 LITRO','CHOCOLATE',25.90);
INSERT INTO tbproductos(PRODUCTO,NOMBRE,ENVASE,VOLUMEN,SABOR,PRECIO) 
VALUES('23456','PEPSI','LATA','1 LITRO','LIMON',34.90);
INSERT INTO tbproductos(PRODUCTO,NOMBRE,ENVASE,VOLUMEN,SABOR,PRECIO) 
VALUES('23457','PEPSI','LATA','1 LITRO','MANZANA',23.90);

INSERT INTO tbvendedores(MATRICULA,NOMBRE,COMISION)
VALUES('00233','Joan Geraldo de la Fonseca',10.0);
INSERT INTO tbvendedores(MATRICULA,NOMBRE,COMISION)
VALUES('00235','Márcio Almeida Silva',8.0);
INSERT INTO tbvendedores(MATRICULA,NOMBRE,COMISION)
VALUES('00236','Cláudia Morais',8.0);

-- MOSTRAR TABLA
SELECT * FROM tbvendedores;
SELECT * FROM tbproductos;

-- ACTUALIZAR REGISTROS
UPDATE tbvendedores set NOMBRE='Juan Geraldo de la Fonseca Junior' WHERE MATRICULA='00223';
UPDATE tbvendedores SET COMISION='0.11' WHERE MATRICULA='00236';
-- ELIMINAR REGISTROS
DELETE FROM tbproductos WHERE PRODUCTO='23454';
DELETE FROM tbvendedores where MATRICULA='00223';

-- AGREGAR LLAVE PRIMARIA
ALTER TABLE tbproductos ADD PRIMARY KEY(PRODUCTO);
ALTER TABLE tbclientes ADD PRIMARY KEY(DNI);
ALTER TABLE tbclientes ADD COLUMN(FECHA_NACIMIENTO DATE);
INSERT INTO tbclientes(
DNI,NOMBRE,DIRECCION1, DIRECCION2, BARRIO,CIUDAD,ESTADO, CP,EDAD,SEXO,LIMITE_CREDITO,
VOLUMEN_COMPRA,PRIMERA_COMPRA, FECHA_NACIMIENTO) VALUES('23424','JULIAN MENDOZA','CALLE SOL',
'CALLE ROSAS','BENITO JUAREZ','TAMAULIPAS','TAMAULIPAS','45634',23,'M',100000,2000,0,'2000-11-12');

-- MOSTRAR DATOS DE LA TABLA
SELECT DNI,NOMBRE,EDAD FROM tbclientes;
-- CREANDO ALIAS
SELECT DNI AS IDENTIFICACION,NOMBRE AS NOMBRE_COMPLETO FROM tbclientes;
-- LIMIT 
SELECT PRODUCTO, NOMBRE FROM tbproductos LIMIT 2;

-- FILTRANDO DATOS
SELECT * FROM tbvendedores WHERE NOMBRE = 'Claudia Morais';

SELECT NOMBRE, PRECIO FROM tbproductos WHERE PRECIO < 30.0;
SELECT NOMBRE, PRECIO FROM tbproductos WHERE PRECIO > 30.0;
SELECT * FROM tbproductos WHERE PRECIO < NOMBRE = 'LECHE';

SELECT * FROM tbproductos WHERE PRECIO > 20 AND PRECIO < 30;
SELECT * FROM tbproductos WHERE ENVASE ='LATA' OR ENVASE = 'VIDRIO';







