-- Active: 1684285236998@@127.0.0.1@3306@siresto
CREATE DATABASE SiResto;
USE SiResto;
CREATE TABLE Karyawan (Id CHAR(5) PRIMARY KEY, Nama VARCHAR(50) NOT NULL, TglLahir DATE, No_KTP CHAR(16) NOT NULL UNIQUE, Posisi VARCHAR(18) NOT NULL);
CREATE TABLE Koki (Id CHAR(5) PRIMARY KEY, FOREIGN KEY (Id) REFERENCES Karyawan(Id), Sertifikasi VARCHAR(50) NOT NULL);
CREATE TABLE Supplier (Id CHAR(5) PRIMARY KEY, Nama VARCHAR(50) NOT NULL, Telepon VARCHAR(15) NOT NULL, Email TEXT);
CREATE TABLE Kategori (Id CHAR(5) PRIMARY KEY, Nama VARCHAR(50) NOT NULL);
CREATE TABLE Menu (Nama VARCHAR(50) PRIMARY KEY, Harga INTEGER NOT NULL, IdKategori CHAR(5) NOT NULL, FOREIGN KEY (Idkategori) REFERENCES Kategori(Id));
CREATE TABLE Bahan_Baku (Nama VARCHAR(50) PRIMARY KEY, Stok SMALLINT NOT NULL, Satuan VARCHAR(10) NOT NULL);
CREATE TABLE Pembelian_Bahan_Baku (Nota VARCHAR(10) PRIMARY KEY, NamaBahan VARCHAR(50) NOT NULL, FOREIGN KEY (NamaBahan) REFERENCES Bahan_Baku (Nama), Jumlah SMALLINT NOT NULL, Satuan VARCHAR(10) NOT NULL, HargaSatuan INTEGER NOT NULL, Waktu DATE NOT NULL, IdSupplier CHAR(5), FOREIGN KEY (IdSupplier) REFERENCES Supplier (Id), IdKaryawan Char(5), FOREIGN KEY (IdKaryawan) REFERENCES Karyawan (Id));
CREATE TABLE Menu_Harian (NamaMenu VARCHAR(50), Tanggal DATE, IdKoki CHAR(5), Jumlah SMALLINT NOT NULL, 
PRIMARY KEY (NamaMenu, Tanggal, IdKoki), 
FOREIGN KEY (NamaMenu) REFERENCES Menu (Nama),
FOREIGN KEY (IdKoki) REFERENCES Koki (Id));
CREATE TABLE Bahan_Baku_Menu (NamaMenu VARCHAR(50), NamaBahan VARCHAR(50), Jumlah SMALLINT NOT NULL, Satuan VARCHAR(10) NOT NULL,
PRIMARY KEY (NamaMenu, NamaBahan),
FOREIGN KEY (NamaMenu) REFERENCES Menu (Nama),
FOREIGN KEY (NamaBahan) REFERENCES Bahan_Baku(Nama));
SELECT Karyawan.Nama, Pembelian_Bahan_Baku.NamaBahan
FROM Karyawan LEFT OUTER JOIN Pembelian_Bahan_Baku 
ON Karyawan.Id = Pembelian_Bahan_Baku.IdKaryawan;

SELECT DISTINCT Karyawan.Nama, Karyawan.Id
FROM Karyawan
LEFT OUTER JOIN Koki ON Karyawan.Id = Koki.Id 
WHERE Karyawan.Id != Koki.Id
AND EXISTS (
    SELECT *
    FROM Pembelian_Bahan_Baku
    WHERE Pembelian_Bahan_Baku.NamaBahan IS NULL
);

SELECT DISTINCT Karyawan.Nama
FROM Karyawan
INNER JOIN Koki ON Karyawan.Id = Koki.Id
INNER JOIN Menu_Harian ON Koki.Id = Menu_Harian.IdKoki
WHERE Menu_Harian.NamaMenu = 'Bebek Goreng Mentega';


SELECT Menu.Nama, Kategori.Nama, Menu_Harian.Tanggal
FROM Menu
INNER JOIN Kategori ON Menu.IdKategori = Kategori.Id
INNER JOIN Menu_Harian ON Menu_Harian.NamaMenu = Menu.Nama
WHERE DATE_FORMAT(Menu_Harian.Tanggal, '%Y-%m') = '2016-07';

SELECT Karyawan.Nama, Menu_Harian.NamaMenu
FROM Karyawan
INNER JOIN Koki ON Karyawan.Id = Koki.Id
INNER JOIN Menu_Harian ON Menu_Harian.IdKoki = Koki.Id
INNER JOIN Bahan_Baku_Menu ON Menu_Harian.NamaMenu = Bahan_Baku_Menu.NamaMenu
WHERE Bahan_Baku_Menu.NamaBahan = 'Air' AND Karyawan.Nama = 'Hermione Ferguson';

SELECT Menu.Nama
FROM Menu
INNER JOIN Bahan_Baku_Menu ON Menu.Nama = Bahan_Baku_Menu.NamaMenu
GROUP BY Menu.Nama
HAVING COUNT(DISTINCT Bahan_Baku_Menu.NamaBahan) = 3;

SELECT Nama, TglLahir, Posisi, No_KTP
FROM Karyawan
WHERE No_KTP LIKE '9%';

SELECT Supplier.Nama, Supplier.Telepon
FROM Supplier
INNER JOIN Pembelian_Bahan_Baku ON Supplier.Id = Pembelian_Bahan_Baku.IdSupplier
GROUP BY Supplier.Id
HAVING COUNT(DISTINCT Pembelian_Bahan_Baku.NamaBahan) = 1;

SELECT Supplier.Nama
FROM Supplier
WHERE Email IS NULL
AND EXISTS (
    SELECT *
    FROM Pembelian_Bahan_Baku
    WHERE Pembelian_Bahan_Baku.IdSupplier = Supplier.Id
    AND Pembelian_Bahan_Baku.NamaBahan IN ('Telur', 'Tepung')
);


SELECT Karyawan.Nama
FROM Karyawan
INNER JOIN Koki ON Karyawan.Id = Koki.Id
INNER JOIN Menu_Harian ON Menu_Harian.IdKoki = Koki.Id
GROUP BY Karyawan.Nama, Menu_Harian.Tanggal
HAVING COUNT(DISTINCT Menu_Harian.NamaMenu) > 1
ORDER BY Karyawan.Nama ASC;




SELECT s.Nama
FROM Supplier s
WHERE s.Email IS NULL
AND (
    SELECT COUNT(*)
    FROM Pembelian_Bahan_Baku pbb
    WHERE pbb.IdSupplier = s.Id
) = 1;
