CREATE DATABASE Vault;

USE Vault;

create table Conta(
	ID int not null auto_increment primary key,
	plataforma varchar(60),
    email varchar(100),
    usuario varchar(50),
    senha varchar(100)
);

select * from Conta;
