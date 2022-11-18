drop database if exists paqueteViaje;
create database paqueteViaje;
use paqueteViaje;


CREATE TABLE IF NOT EXISTS cliente (
  idCliente INT auto_increment NOT NULL,
  nombres VARCHAR(45) NOT NULL,
  apellidos VARCHAR(45) NOT NULL,
  direccion VARCHAR(45) NOT NULL,
  dni INT NOT NULL,
  email VARCHAR(45) NOT NULL,
  telefono INT NOT NULL,
  PRIMARY KEY (idCliente)
);

insert into cliente values("Daniel", "Camilo", "Juarez 5435", 53456345, "danielccamilo@gmail.com", 1132423544);
insert into cliente values("Jose", "Rodrigo", "Felipe Vallese 1423", 23450904, "j0serodr1go@gmail.com", 15234523456);
insert into cliente values("Axel", "Mamani", "Hidalgo 4232", 14235783, "mamaniax3l@gmail.com", 11234573463);
insert into cliente values("Miguel", "Torres", "Franklin 2342", 13425232, "miguelttorres@gmail.com", 11234634634);
insert into cliente values("Luis", "Mondaca", "Méndez de Andes 4324", 453558768, "luism0ndaca@gmail.com", 11342546344);
insert into cliente values("Javier", "Romero", "Primera Junta 6346", 45234536, "javierr0mer0@gmail.com", 1523402395);
insert into cliente values("Diego", "Messi", "Moldes 6346", 45030485, "diegomessi@gmail.com", 1134259322);
insert into cliente values("Kiara", "Romero", "Rojas 7454", 45125672, "kiar4r0mero@gmail.com", 1502938234);
insert into cliente values("Agustin", "Hernandez", "Culpina 3852", 431344924 , "agushernand3z@gmail.com", 1183950243);
insert into cliente values("Martin", "Sanchez", "Fraga 2983", 45939802, "mart1nsancheez@gmail.com", 1109235013);
insert into cliente values("Ricardo", "Laurito", "Carbajal 4035",45982340 , "ricardol4uri7o@gmail.com", 1598340123);

CREATE TABLE IF NOT EXISTS hospedaje (
  idHospedaje INT auto_increment NOT NULL,
  pais VARCHAR(45) NOT NULL,
  cuidad VARCHAR(45) NOT NULL,
  direccion VARCHAR(45) NOT NULL,
  tipoEstablecimiento VARCHAR(45) NOT NULL,
  PRIMARY KEY (idHospedaje)
);

insert into hospedaje values("Argentina","Buenos Aires","Urquiza","Casa");
insert into hospedaje values("Argentina","Mendoza","Aristóbulo del Valle","Casa");
insert into hospedaje values("Holanda","Limburgo","Tienrayseweg","Hotel");
insert into hospedaje values("Holanda","Zelanda","Anthony Fokkerstraat","Hotel");
insert into hospedaje values("","","","");
insert into hospedaje values("","","","");
insert into hospedaje values("","","","");
insert into hospedaje values("","","","");
insert into hospedaje values("","","","");
insert into hospedaje values("","","","");
insert into hospedaje values("","","","");
insert into hospedaje values("","","","");
insert into hospedaje values("","","","");
insert into hospedaje values("","","","");

CREATE TABLE IF NOT EXISTS vendedor (
  idVendedor INT auto_increment NOT NULL,
  nombres VARCHAR(45) NOT NULL,
  apellidos VARCHAR(45) NOT NULL,
  direccion VARCHAR(45) NOT NULL,
  dni INT NOT NULL,
  email VARCHAR(45) NOT NULL,
  telefono INT NOT NULL,
  PRIMARY KEY (idVendedor)
);


CREATE TABLE IF NOT EXISTS transporte (
  idTransporte INT auto_increment NOT NULL,
  tipo VARCHAR(45) NOT NULL,
  PRIMARY KEY (idTransporte)
);


CREATE TABLE IF NOT EXISTS paqueteViaje (
  idPaqueteViaje INT auto_increment NOT NULL,
  origen VARCHAR(45) NOT NULL,
  destino VARCHAR(45) NOT NULL,
  fechaInicio DATE NOT NULL,
  fechaFin DATE NOT NULL,
  metodoPago VARCHAR(45) NOT NULL,
  precioFinal DOUBLE NOT NULL,
  idCliente INT NOT NULL,
  idHospedaje INT NOT NULL,
  idVendedor INT NOT NULL,
  idTransporte INT NOT NULL,
  PRIMARY KEY (idPaqueteViaje),
    FOREIGN KEY (idCliente)
    REFERENCES cliente (idCliente),
    FOREIGN KEY (idHospedaje)
    REFERENCES hospedaje (idHospedaje),
    FOREIGN KEY (idVendedor)
    REFERENCES vendedor (idVendedor),
    FOREIGN KEY (idTransporte)
    REFERENCES transporte (idTransporte)
);

