CREATE DATABASE MovelitAgenciadeViagens;

USE Movelit;

CREATE TABLE permissoes (
id_permissao INTEGER PRIMARY KEY auto_increment,
tipo_permissao VARCHAR(20)
);

CREATE TABLE Usuarios (
id_usuario INTEGER PRIMARY KEY auto_increment,
nome_usuario VARCHAR (80),
email_usuario VARCHAR (80),
senha_usuario VARCHAR (10),
id_permissao INTEGER,
FOREIGN KEY(id_permissao) REFERENCES Permissoes (id_permissao)
);

CREATE TABLE Compra (
id_compra INTEGER PRIMARY KEY auto_increment,
data_compra DATE,
valor_compra DECIMAL (5,2),
id_usuario INTEGER,
FOREIGN KEY(id_usuario) REFERENCES Usuarios (id_usuario)
);

CREATE TABLE Itens_Compra (
qtd_itens INTEGER,
valor_itens DECIMAL (4,2),
id_usuario INTEGER,
FOREIGN KEY (id_usuario) REFERENCES Usuarios (id_usuario)
);

CREATE TABLE Agendamento (
id_agendamento INTEGER PRIMARY KEY auto_increment,
nome_lugar VARCHAR (80)
);

CREATE TABLE Lugares (
id_local INTEGER PRIMARY KEY auto_increment,
nome_local VARCHAR (40),
preco_local DECIMAL (4,2),
data_local DATE,
id_agendamento INTEGER,
FOREIGN KEY(id_agendamento) REFERENCES Agendamento (id_agendamento),
id_agendamento INTEGER,
FOREIGN KEY(id_agendamento) REFERENCES Agendamento(id_agendamento)
);

CREATE TABLE meiostiposMeiosTipos (
id_meios INTEGER PRIMARY KEY auto_increment,
nome_meiosTipos VARCHAR(80)
);

SELECT format() MeiosTipos


