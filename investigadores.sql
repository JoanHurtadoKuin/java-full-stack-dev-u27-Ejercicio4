create database investigadores;

use investigadores;

create table facultad(
codigo int auto_increment primary key,
nombre varchar(100)
);


create table investigadores(
dni varchar(8) primary key,
nom_apels varchar(255),
codigo_facultad int,
key(codigo_facultad),
foreign key(codigo_facultad) references facultad(codigo)
on delete restrict on update cascade
);

create table equipos(
num_serie char(4) primary key,
nombre varchar(255),
codigo_facultad int,
key(codigo_facultad),
foreign key(codigo_facultad) references facultad(codigo)
on delete restrict on update cascade
);

create table reserva(
codigo int auto_increment primary key,
comienzo datetime,
fin datetime,
dni varchar(8),
num_serie char(4),
Key(dni),
foreign key(dni) references investigadores(dni)
on delete restrict on update cascade,
Key(num_serie),
foreign key(num_serie) references equipos(num_serie)
on delete restrict on update cascade
);