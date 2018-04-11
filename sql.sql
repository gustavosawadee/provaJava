DROP DATABASE IF EXISTS provaJava;
CREATE DATABASE IF NOT EXISTS provaJava;
USE provaJava;
CREATE TABLE Assalariados(
	pk_idAssalariados INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30),
    sobrenome VARCHAR(30),
    cpf VARCHAR(30),
    salario DOUBLE
)