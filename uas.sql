-- Active: 1687783649008@@127.0.0.1@3306@phpmyadmin
CREATE DATABASE db_pegawai_ujian;
SHOW DATABASES;
USE db_pegawai_ujian;
SHOW TABLES;
DROP DATABASE db_pegawai_ujian;
CREATE TABLE T_Pegawai (nopeg CHAR(4) PRIMARY KEY, nama VARCHAR(25), golongan SMALLINT, alamat VARCHAR(50), masakerja SMALLINT);
DROP TABLE T_Gaji;
CREATE TABLE T_Gaji (nopeg CHAR(4) NOT NULL, bulan SMALLINT, tahun SMALLINT, gaji_pokok BIGINT, tunjangan BIGINT);
ALTER TABLE T_Gaji ADD FOREIGN KEY (nopeg) REFERENCES T_Pegawai (nopeg);
ALTER TABLE T_Gaji ADD PRIMARY KEY (nopeg, bulan, tahun);
CREATE TABLE T_Absensi (nopeg CHAR(4), bulan SMALLINT, tahun SMALLINT, sakit SMALLINT, ijin SMALLINT, alpha SMALLINT);
ALTER TABLE T_Absensi
ADD FOREIGN KEY (nopeg, bulan, tahun) REFERENCES T_Gaji (nopeg, bulan, tahun);
INSERT INTO T_Pegawai (nopeg, nama, golongan, alamat, masakerja) VALUES 
(0101, 'Ahmad Irsyad', 3, 'Sambi-Ringinrejo-Kediri', 18),
(0102, 'Ridwan Kamil', 5, 'Sambi-Ringinrejo-Kediri', 12),
(0103, 'Bagus Sujiwo', 2, 'Sambi-Ringinrejo-Kediri', 15),
(0104, 'Budi Prakoso', 7, 'Sambi-Ringinrejo-Kediri', 8),
(0105, 'Lailatul Husna', 4, 'Sambi-Ringinrejo-Kediri', 12);

INSERT INTO T_Gaji (nopeg, bulan, tahun, gaji_pokok, tunjangan) VALUES 
(0101, 1, 2013, 3000000, 1500000),
(0101, 2, 2013, 4000000, 1000000),
(0101, 3, 2013, 4000000, 2000000),
(0101, 4, 2013, 5000000, 1000000),
(0101, 5, 2013, 5000000, 1000000),
(0101, 6, 2013, 6000000, 2000000),
(0102, 1, 2013, 4000000, 1000000),
(0102, 2, 2013, 4000000, 2000000),
(0102, 3, 2013, 5000000, 1000000),
(0102, 4, 2013, 6000000, 1500000),
(0102, 5, 2013, 6000000, 1500000),
(0102, 6, 2013, 5000000, 1000000),
(0103, 1, 2013, 6000000, 1000000),
(0103, 2, 2013, 5000000, 1000000),
(0103, 3, 2013, 5000000, 1500000),
(0103, 4, 2013, 5000000, 1500000),
(0103, 5, 2013, 4000000, 2000000),
(0103, 6, 2013, 4000000, 1000000),
(0104, 1, 2013, 4000000, 2000000),
(0104, 2, 2013, 5000000, 2000000),
(0104, 3, 2013, 6000000, 1000000),
(0104, 4, 2013, 5000000, 2000000),
(0104, 5, 2013, 6000000, 2000000),
(0104, 6, 2013, 4000000, 1000000),
(0105, 1, 2013, 6000000, 1000000),
(0105, 2, 2013, 5000000, 2000000),
(0105, 3, 2013, 7000000, 1000000),
(0105, 4, 2013, 8000000, 2000000),
(0105, 5, 2013, 7000000, 2000000),
(0105, 6, 2013, 4000000, 1000000);

INSERT INTO T_Absensi (nopeg, bulan, tahun, sakit, ijin, alpha) VALUES 
(0101, 1, 2013, 2, 3, 1),
(0101, 2, 2013, 4, 0, 4),
(0101, 3, 2013, 1, 2, 2),
(0101, 4, 2013, 1, 5, 1),
(0101, 5, 2013, 0, 4, 0),
(0101, 6, 2013, 0, 2, 1),
(0102, 1, 2013, 0, 2, 0),
(0102, 2, 2013, 3, 1, 1),
(0102, 3, 2013, 1, 0, 0),
(0102, 4, 2013, 3, 0, 2),
(0102, 5, 2013, 0, 2, 1),
(0102, 6, 2013, 3, 4, 3),
(0103, 1, 2013, 2, 5, 0),
(0103, 2, 2013, 0, 2, 0),
(0103, 3, 2013, 0, 4, 1),
(0103, 4, 2013, 0, 5, 2),
(0103, 5, 2013, 3, 1, 1),
(0103, 6, 2013, 0, 1, 0),
(0104, 1, 2013, 3, 2, 1),
(0104, 2, 2013, 3, 4, 2),
(0104, 3, 2013, 0, 2, 1),
(0104, 4, 2013, 0, 3, 2),
(0104, 5, 2013, 1, 1, 0),
(0104, 6, 2013, 0, 4, 0),
(0105, 1, 2013, 3, 4, 1),
(0105, 2, 2013, 2, 5, 3),
(0105, 3, 2013, 3, 2, 2),
(0105, 4, 2013, 1, 1, 2),
(0105, 5, 2013, 2, 1, 1),
(0105, 6, 2013, 3, 2, 0);
DELETE FROM T_Gaji;

SELECT * FROM T_Pegawai WHERE masakerja < 10;

SELECT p.nopeg,p.nama, SUM(a.sakit)'tot_sakit',SUM(a.ijin)'tot_ijin',SUM(a.alpha)'tot_alpha'
FROM t_absensi a 
INNER join t_pegawai p on p.nopeg=a.nopeg
WHERE tahun=2013
GROUP BY nama; 

SELECT p.nama, SUM(a.sakit*20000)'denda_sakit',SUM(a.ijin*50000)'denda_ijin',SUM(a.alpha*10000)'denda_alpha',SUM((a.sakit*20000)+(a.ijin*50000)+(a.alpha*10000))'total_denda', 
sum((g.gaji_pokok+g.tunjangan)-((a.sakit*20000)+(a.ijin*50000)+(a.alpha*10000)))'total gaji'
FROM t_absensi a 
INNER join t_pegawai p on p.nopeg=a.nopeg
INNER join t_gaji g on g.nopeg=a.nopeg
GROUP BY nama;
