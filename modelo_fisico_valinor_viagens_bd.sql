use valinor_viagens;
/* Lógico_1: */

CREATE TABLE Cliente (
    id_cliente INT PRIMARY KEY auto_increment,
    Nome VARCHAR (50),
    CPF VARCHAR (11),
    Endereco VARCHAR (50),
    Telefone VARCHAR (11),
    fk_Login_Login_PK INT
);

CREATE TABLE Destino (
    codigo_destino INT PRIMARY KEY auto_increment,
    Cidade VARCHAR (50),
    Regiao VARCHAR (50),
    Atrativos VARCHAR (50),
    fk_Passagem_tx_id INT
);

CREATE TABLE Passagem (
    Valor VARCHAR (10),
    Promocao VARCHAR (10),
    Cupom VARCHAR (50),
    tx_id INT PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE Viagem (
    Data_ida DATE,
    Data_volta DATE,
    Aguia VARCHAR (50),
    Classe VARCHAR (5),
    id_viagem INT PRIMARY KEY AUTO_INCREMENT,
    fk_Passagem_tx_id INT
);
 
ALTER TABLE Cliente ADD CONSTRAINT FK_Cliente_2
    FOREIGN KEY (fk_Login_Login_PK)
    REFERENCES Login (Login_PK)
    ON DELETE SET NULL;
 
ALTER TABLE Destino ADD CONSTRAINT FK_Destino_2
    FOREIGN KEY (fk_Passagem_tx_id)
    REFERENCES Passagem (tx_id)
    ON DELETE CASCADE;
 
ALTER TABLE Viagem ADD CONSTRAINT FK_Viagem_2
    FOREIGN KEY (fk_Passagem_tx_id)
    REFERENCES Passagem (tx_id)
    ON DELETE RESTRICT;
    
select * from cliente;