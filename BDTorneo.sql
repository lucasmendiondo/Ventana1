SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Partido_Equipo;
DROP TABLE IF EXISTS Equip_Torneo;
DROP TABLE IF EXISTS Estadio_Torneo;
DROP TABLE IF EXISTS Medio_Torneo;
DROP TABLE IF EXISTS Patro_Torneo;
DROP TABLE IF EXISTS Torneo;
DROP TABLE IF EXISTS Partido;
DROP TABLE IF EXISTS Arbitro;
DROP TABLE IF EXISTS Patro_Equipo;
DROP TABLE IF EXISTS Equipo;
DROP TABLE IF EXISTS Entrenador;
DROP TABLE IF EXISTS Estadio;
DROP TABLE IF EXISTS Jugador_Patroc;
DROP TABLE IF EXISTS Jugador;
DROP TABLE IF EXISTS MedioComunicacion;
DROP TABLE IF EXISTS Patrocinador;
DROP TABLE IF EXISTS Premio;
DROP TABLE IF EXISTS Presidente;
DROP TABLE IF EXISTS Proveedor;




/* Create Tables */

CREATE TABLE Arbitro
(
	Num_Arbitro int NOT NULL,
	Cuenta_Bancaria varchar(20),
	Nombre varchar(20),
	Apellido varchar(20),
	PRIMARY KEY (Num_Arbitro)
);


CREATE TABLE Entrenador
(
	DNI int NOT NULL,
	Nombre varchar(20),
	Apellido varchar(20),
	Telefono varchar(20),
	PRIMARY KEY (DNI)
);


CREATE TABLE Equipo
(
	Cod_Equipo int NOT NULL,
	Nom_Equipo varchar(20),
	Ano_fundacion date,
	Cod_Jugador int NOT NULL,
	DNI int NOT NULL,
	Cod_Presidente int NOT NULL,
	Cod_Estadio int NOT NULL,
	Cod_Patrocinador int NOT NULL,
	PRIMARY KEY (Cod_Equipo)
);


CREATE TABLE Equip_Torneo
(
	Cod_Equipo int NOT NULL,
	Cod_Torneo int NOT NULL
);


CREATE TABLE Estadio
(
	Cod_Estadio int NOT NULL,
	Nom_Estadio varchar(20),
	Lugar varchar(20),
	Aforo varchar(20),
	PRIMARY KEY (Cod_Estadio)
);


CREATE TABLE Estadio_Torneo
(
	Cod_Estadio int NOT NULL,
	Cod_Torneo int NOT NULL
);


CREATE TABLE Jugador
(
	Cod_Jugador int NOT NULL,
	Nombre varchar(20),
	Apellido varchar(20),
	Nacionalidad varchar(20),
	PRIMARY KEY (Cod_Jugador)
);


CREATE TABLE Jugador_Patroc
(
	Cod_Jugador int NOT NULL,
	Cod_Patrocinador int NOT NULL
);


CREATE TABLE MedioComunicacion
(
	Cod_Medio_Comu int NOT NULL,
	Nom_Medio_Comu varchar(20),
	PRIMARY KEY (Cod_Medio_Comu)
);


CREATE TABLE Medio_Torneo
(
	Cod_Medio_Comu int NOT NULL,
	Cod_Torneo int NOT NULL
);


CREATE TABLE Partido
(
	Cod_Partido int NOT NULL,
	Fecha_Partido date,
	Hora_Partido varchar(20),
	Num_Arbitro int NOT NULL,
	Cod_Estadio int NOT NULL,
	PRIMARY KEY (Cod_Partido)
);


CREATE TABLE Partido_Equipo
(
	Cod_Equipo int NOT NULL,
	Cod_Partido int NOT NULL
);


CREATE TABLE Patrocinador
(
	Cod_Patrocinador int NOT NULL,
	Nom_Patrocinador varchar(20),
	Cod_Jugador int NOT NULL,
	PRIMARY KEY (Cod_Patrocinador)
);


CREATE TABLE Patro_Equipo
(
	Cod_Patrocinador int NOT NULL,
	Cod_Equipo int NOT NULL
);


CREATE TABLE Patro_Torneo
(
	Cod_Patrocinador int NOT NULL,
	Cod_Torneo int NOT NULL
);


CREATE TABLE Premio
(
	Descri_Premio int NOT NULL,
	Valor_Premio float,
	PRIMARY KEY (Descri_Premio)
);


CREATE TABLE Presidente
(
	Cod_Presidente int NOT NULL,
	Nombre varchar(20),
	Apellido varchar(20),
	Equipo varchar(20),
	PRIMARY KEY (Cod_Presidente)
);


CREATE TABLE Proveedor
(
	CIF int NOT NULL,
	Nombre varchar(20),
	Direccion varchar(20),
	Producto varchar(20),
	PRIMARY KEY (CIF)
);


CREATE TABLE Torneo
(
	Cod_Torneo int NOT NULL,
	Pais varchar(20),
	Nombre varchar(20),
	Tipo varchar(20),
	Cod_Equipo int NOT NULL,
	Descri_Premio int NOT NULL,
	Cod_Estadio int NOT NULL,
	CIF int NOT NULL,
	Cod_Patrocinador int NOT NULL,
	Cod_Partido int NOT NULL,
	Cod_Medio_Comu int NOT NULL,
	PRIMARY KEY (Cod_Torneo)
);



/* Create Foreign Keys */

ALTER TABLE Partido
	ADD FOREIGN KEY (Num_Arbitro)
	REFERENCES Arbitro (Num_Arbitro)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Equipo
	ADD FOREIGN KEY (DNI)
	REFERENCES Entrenador (DNI)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Equip_Torneo
	ADD FOREIGN KEY (Cod_Equipo)
	REFERENCES Equipo (Cod_Equipo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Partido_Equipo
	ADD FOREIGN KEY (Cod_Equipo)
	REFERENCES Equipo (Cod_Equipo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Patro_Equipo
	ADD FOREIGN KEY (Cod_Equipo)
	REFERENCES Equipo (Cod_Equipo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Equipo
	ADD FOREIGN KEY (Cod_Estadio)
	REFERENCES Estadio (Cod_Estadio)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Estadio_Torneo
	ADD FOREIGN KEY (Cod_Estadio)
	REFERENCES Estadio (Cod_Estadio)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Partido
	ADD FOREIGN KEY (Cod_Estadio)
	REFERENCES Estadio (Cod_Estadio)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Equipo
	ADD FOREIGN KEY (Cod_Jugador)
	REFERENCES Jugador (Cod_Jugador)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Jugador_Patroc
	ADD FOREIGN KEY (Cod_Jugador)
	REFERENCES Jugador (Cod_Jugador)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Medio_Torneo
	ADD FOREIGN KEY (Cod_Medio_Comu)
	REFERENCES MedioComunicacion (Cod_Medio_Comu)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Partido_Equipo
	ADD FOREIGN KEY (Cod_Partido)
	REFERENCES Partido (Cod_Partido)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Torneo
	ADD FOREIGN KEY (Cod_Partido)
	REFERENCES Partido (Cod_Partido)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Jugador_Patroc
	ADD FOREIGN KEY (Cod_Patrocinador)
	REFERENCES Patrocinador (Cod_Patrocinador)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Patro_Equipo
	ADD FOREIGN KEY (Cod_Patrocinador)
	REFERENCES Patrocinador (Cod_Patrocinador)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Patro_Torneo
	ADD FOREIGN KEY (Cod_Patrocinador)
	REFERENCES Patrocinador (Cod_Patrocinador)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Torneo
	ADD FOREIGN KEY (Descri_Premio)
	REFERENCES Premio (Descri_Premio)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Equipo
	ADD FOREIGN KEY (Cod_Presidente)
	REFERENCES Presidente (Cod_Presidente)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Torneo
	ADD FOREIGN KEY (CIF)
	REFERENCES Proveedor (CIF)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Equip_Torneo
	ADD FOREIGN KEY (Cod_Torneo)
	REFERENCES Torneo (Cod_Torneo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Estadio_Torneo
	ADD FOREIGN KEY (Cod_Torneo)
	REFERENCES Torneo (Cod_Torneo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Medio_Torneo
	ADD FOREIGN KEY (Cod_Torneo)
	REFERENCES Torneo (Cod_Torneo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Patro_Torneo
	ADD FOREIGN KEY (Cod_Torneo)
	REFERENCES Torneo (Cod_Torneo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



