-- Active: 1687783649008@@127.0.0.1@3306@phpmyadmin
--DML

--Database
CREATE DATABASE basis_data;
SHOW DATABASES;
USE basis_data;
DROP DATABASE basis_data;

--Table
CREATE TABLE tabel (kodekolom VARCHAR(15), namakolom VARCHAR(50), angkakolom INT);
SHOW TABLES;
DESC tabel;
DESCRIPTION tabel;
DROP TABLE tabel;
INSERT INTO tabel (kodekolom, namakolom, angkakolom) VALUES ('001', 'namabaris', 20);
CREATE TABLE tabel (kodekolom VARCHAR(20) NOT NULL, namakolom VARCHAR(50) NOT NULL, angkakolom INT);
CREATE TABLE tabel (kodekolom VARCHAR(20) NOT NULL, namakolom VARCHAR(50) NOT NULL, angkakolom INT DEFAULT 0);
--Primary key
--add
CREATE TABLE tabel (kodekolom VARCHAR(20) NOT NULL, namakolom VARCHAR(50) NOT NULL, angkakolom INT, PRIMARY KEY (kodekolom));
CREATE TABLE tabel (kodekolom VARCHAR(20) NOT NULL PRIMARY KEY, namakolom VARCHAR(50) NOT NULL, angkakolom INT);
ALTER TABLE tabel ADD CONSTRAINT PK_tabel PRIMARY KEY(kodekolom);
--delete
ALTER TABLE tabel DROP PRIMARY KEY;
ALTER TABLE tabel DROP CONSTRAINT PK_tabel;
--Column
ALTER TABLE tabel ADD COLUMN kolombaru VARCHAR(15) AFTER angkakolom;
ALTER TABLE tabel MODIFY COLUMN kolombaru VARCHAR(12);
ALTER TABLE tabel CHANGE COLUMN kolombaru cn_kolom VARCHAR(25);
ALTER TABLE mahasiswa DROP COLUMN cn_kolom;
--Foreign key
ALTER TABLE nama_tabel ADD FOREIGN KEY nama_kolom REFERENCES nama_tabel_referensi (nama_kolom_referensi); 

--DML
--insert
INSERT INTO nama_tabel SELECT * FROM tabel;
INSERT INTO nama_tabel (kolom1, kolom2, ...dst.) VALUES (nilai_kolom1, nilai_kolom2, ...dst.);
INSERT INTO nama_tabel (kolom1, kolom2, ...dst.) VALUES 
(nilai_kolom1, nilai_kolom2, ...dst.)
(nilai_kolom1, nilai_kolom2, ...dst.)
(nilai_kolom1, nilai_kolom2, ...dst.);
--delete
DELETE FROM nama_tabel WHERE nama_kolom_patokan <>= nilai_patokan;
DELETE * FROM nama_tabel;
DELETE FROM nama_tabel;
--update
UPDATE nama_tabel SET nama_kolom = nilai_baru;
UPDATE nama_tabel SET nama_kolom = nilai_baru WHERE nama_kolom_patokan <>= nilai_patokan;
UPDATE nama_tabel SET nama_kolom1 = nilai_baru1, nama_kolom2 = nilai_baru2, ...dst. WHERE nama_kolom_patokan <>= nilai_patokan;


--DRL
--Query
--1. SELECT * untuk memilih semua kolom Format 
SELECT * FROM table_name; 
--2. SELECT dengan WHERE untuk menampilkan baris dengan suatu kondisi Format 
SELECT column1, column2,...
FROM table_name
WHERE condition;
--3. SELECT dengan DISTINCT untuk menampilkan data dengan eliminasi data yang sama (duplicate)
SELECT DISTINCT column FROM table_name;
--4. SELECT dengan IN untuk menampilkan data yang spesifik
SELECT column_name(s)
FROM table_name
WHERE column_name IN (value1, value2, ...);
--5. SELECT dengan BETWEEN untuk menampilkan data pada jarak (range) tertentu Format 
SELECT column_name(s)
FROM table_name
WHERE column_name BETWEEN value1 AND value2;
--6. SELECT dengan LIKE untuk menampilkan data yang memiliki kemiripan dengan keyword yang diinginkan 
SELECT column1,column2,... FROM
table_name
WHERE columnN LIKE pattern;
--7. SELECT dengan GROUP BY untuk menampilkan susunan data dalam bentuk grup 
SELECT column1, column2,... 
condition FROM table_name
GROUP BY column1, column2, ...;
--8. SELECT dengan ORDER BY untuk menampilkan baris secara spesifik dan terurut maju atau mundur  
SELECT column1, column2, ...
FROM table_name
ORDER BY column1, column2, ... ASC|DESC; 
--9. SELECT dengan AND, OR and NOT untuk menampilkan data dengan kondisi dan atau atau tidak 
AND 
SELECT column1, column2, ...
FROM table_name
WHERE condition1 AND condition2 AND condition3 ...; 
OR 
SELECT column1, column2, ...
FROM table_name
WHERE condition1 OR condition2 OR condition3 ...; 
NOT 
SELECT column1, column2, ...
FROM table_name
WHERE NOT condition; 
--10. SELECT dengan UNION, INTERSECT dan EXCEPT untuk menampikan data dengan operasi himpunan yang melibatkan lebih dari satu tabel 
UNION 
--Tanpa duplikasi 
SELECT column_name(s) FROM table1
UNION
SELECT column_name(s) FROM table2; 
--Dengan duplikasi
SELECT column_name(s) FROM table1
UNION ALL
SELECT column_name(s) FROM table2; 

--INTERSECT 
--Tanpa duplikasi
SELECT column_name(s) FROM table1
INTERSECT
SELECT column_name(s) FROM table2; 
--Dengan duplikasi
SELECT column_name(s) FROM table1
INTERSECT ALL
SELECT column_name(s) FROM table2; 
EXCEPT 
--Tanpa duplikasi
SELECT column_name(s) FROM table1
EXCEPT
SELECT column_name(s) FROM table2; 
--Dengan duplikasi
SELECT column_name(s) FROM table1
EXCEPT ALL
SELECT column_name(s) FROM table2; 

--Sub-Query
--Untuk test keanggotaan 
SELECT column_name(s)
FROM table_name
WHERE column_name IN (SELECT STATEMENT); 
--atau 
SELECT column_name(s)
FROM table_name 
GROUP BY column1, column2...;
HAVING column_name IN (SELECT STATEMENT); 
--Untuk perbandingan himpunan
SELECT column_name(s)
FROM table_name 
operator
(SELECT STATEMENT);

--Func Aggregate
 
--1. AVG untuk menghitung rata-rata 
Format 
SELECT AVG(column_name) 
FROM table_name
WHERE condition; 
--2. MAX untuk mencari nilai tertinggi
SELECT MAX(column_name) 
FROM table_name
WHERE condition;
--3. MIN untuk mencari nilai terendah 
SELECT MIN(column_name) 
FROM table_name
WHERE condition;
--4. SUM untuk menjumlahkan sekumpulan nilai 
SELECT SUM(column_name) 
FROM table_name
WHERE condition;
--5. COUNT() untuk menunjukkan jumlah baris pada kolom yang diinginkan
SELECT COUNT(column_name) 
FROM table_name
WHERE condition;


--Multi-Tabel
--Inner Join
SELECT tabel.namakolom, tabel2.namakolom2
FROM tabel
INNER JOIN tabel2 ON tabel.kodekolom = tabel2.kodekolom;
SELECT t.namakolom, t2.namakolom2
FROM tabel t
INNER JOIN tabel2 t2 ON t.kodekolom = t2.kodekolom;
SELECT
j.kode_jadwal,
d.nama_dosen,
k.nama_kelas,
h.nama_hari
FROM jadwal j 
INNER JOIN dosen d ON d.kode_dosen = j.kode_dosen
INNER JOIN kelas k ON k.kode_kelas = j.kode_kelas
INNER JOIN hari h ON h.kode_hari = j.kode_hari;
SELECT t.namakolom, t2.namakolom2
FROM tabel t
INNER JOIN tabel2 t2 ON t.kodekolom = t2.kodekolom
WHERE t.namakolom LIKE '%A';

--Outer Join
--Left Outer Join
SELECT tabel.namakolom, tabel2.namakolom2
FROM tabel
LEFT OUTER JOIN tabel2 ON tabel.kodekolom = tabel2.kodekolom;
SELECT t.namakolom, t2.namakolom2
FROM tabel t
INNER JOIN tabel2 t2 ON t.kodekolom = t2.kodekolom
WHERE t2.kodekolom IS NULL;
--Right Outer Join
SELECT tabel.namakolom, tabel2.namakolom2
FROM tabel
RIGHT OUTER JOIN tabel2 ON tabel.kodekolom = tabel2.kodekolom;
--Left + Right
SELECT tabel.namakolom, tabel2.namakolom2
FROM tabel
LEFT OUTER JOIN tabel2 ON tabel.kodekolom = tabel2.kodekolom
UNION ALL
SELECT tabel.namakolom, tabel2.namakolom2
FROM tabel
RIGHT OUTER JOIN tabel2 ON tabel.kodekolom = tabel2.kodekolom;

--Inner Join Implicit
SELECT tabel.namakolom, tabel2.namakolom2
FROM tabel, tabel2
WHERE tabel.kodekolom = tabel2.kodekolom;
SELECT t.namakolom, t2.namakolom2
FROM tabel t, tabel2 t2
WHERE t.kodekolom = t2.kodekolom;

--Cross Join Explicit
SELECT t.namakolom, t2.namakolom2
FROM tabel t CROSS JOIN tabel2 t2;

--Cross Join Implicit
SELECT t.namakolom, t2.namakolom2
FROM tabel t, tabel2 t2;