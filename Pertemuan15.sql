-- Active: 1684285236998@@127.0.0.1@3306@phpmyadmin
CREATE DATABASE McD_Kacong;
USE mcd_kacong;
CREATE TABLE Menu (
    IdMenu CHAR(4) NOT NULL PRIMARY KEY,
    NamaMenu VARCHAR(30),
    HargaMenu INT
);
CREATE TABLE Antrian (
    NoAntri CHAR(4) PRIMARY KEY,
    Nama VARCHAR(30),
    Tanggal DATE
);
CREATE TABLE Pesanan (
    NoAntri CHAR(4), 
    FOREIGN KEY (NoAntri) REFERENCES Antrian(NoAntri),
    IdMenu CHAR(4), 
    FOREIGN KEY (IdMenu) REFERENCES Menu(IdMenu),
    Qty INT
);
CREATE TABLE Bayar (
    NoAntri CHAR(4),
    FOREIGN KEY (NoAntri) REFERENCES Antrian(NoAntri),
    Cash INT,
    Cashless INT
);
INSERT INTO Antrian VALUES('3194','Kacong','2019-04-27');
INSERT INTO Bayar VALUES('3194', 19500, 50000);
INSERT INTO Menu VALUES
('MCD1','HM Cheeseburger', 34000),
('MCD2', 'Teh Botol Kotak', 1500),
('MCD3', 'HM Toys', 0),
('MCD4', 'Double Choco Pie', 14000),
('MCD5', 'Iced Strawberry Tea R', 20000);
INSERT INTO Pesanan VALUES
('3194','MCD1', 1),
('3194','MCD2', 1),
('3194','MCD3', 1),
('3194','MCD4', 1),
('3194','MCD5', 1);
SELECT * FROM Antrian;
SELECT * FROM Menu;
SELECT * FROM Bayar;
SELECT * FROM Pesanan;
SELECT Pesanan.NoAntri, Menu.NamaMenu, Pesanan.Qty, Menu.HargaMenu
FROM Pesanan
INNER JOIN Menu ON Menu.IdMenu = Pesanan.IdMenu;
SELECT Bayar.Cash, Bayar.Cashless, SUM(Menu.HargaMenu) 'Take-Out Tot (INC Pajak)',
SUM(Menu.HargaMenu*1/1.1) 'Net Sales', SUM(Menu.HargaMenu*0.1/1.1) 'Pajak Yang Berlaku'
FROM Menu, Bayar;