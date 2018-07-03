
/*
create database if not exists tebusco;

use tebusco;

DROP TABLE IF EXISTS personas;
create table if not exists personas(

	id_persona int auto_increment primary key,
	nombre varchar(100) not null,
   	gender varchar(100) not null,
  	descripcion varchar(1000) not null,
  	date_birthday varchar(12) not null,
  	date_disappearance varchar(12) not null,
   	image varchar(100) not null,
	name_PB varchar(100) not null,
	phone_PB varchar(12) not null,
	cedula_PB varchar(12) not null
)
DELIMITER //
CREATE PROCEDURE insertPersona(
	IN _nombre varchar(100),
   	   _gender varchar(100),
  	   _descripcion varchar(1000),
  	   _date_birthday varchar(12),
  	   _date_disappearance varchar(12),
   	   _image varchar(100),
	   _name_PB varchar(100),
	   _phone_PB varchar(12),
	   _cedula_PB varchar(12)

)BEGIN
INSERT INTO personas(nombre,gender,descripcion,date_birthday,date_disappearance,image,name_PB,phone_PB,cedula_PB) VALUES (_nombre, _gender,_descripcion,_date_birthday,_date_disappearance,_image,_name_PB,_phone_PB,_cedula_PB);
END
//DELIMITER ; 

call insertPersona("Cristian Leonardo Fonseca Soto","Hombre","Descripcion generica","27/09/1998","2/07/2018","1.jpg","Paula Andrea Fonseca Soto","3114798837","1057607303");

DELIMITER //
CREATE PROCEDURE selectAllPersonas(
)BEGIN
SELECT * FROM personas;
END
//DELIMITER ;

DELIMITER //
CREATE PROCEDURE getID_persona(
)BEGIN
SELECT id_persona FROM personas;
END
//DELIMITER ;
*/
select * from personas