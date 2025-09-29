# Post-test-4-pbo


## Post-test-1-pbo

Nama : Ahmad Samsul Arifin

Nim : 2409116113

****DESKRIPSI****

Program ini dibuat menggunakan bahasa pemrograman Java untuk mengelola data ruangan rawat di rumah sakit. Konsep yang digunakan adalah CRUD (Create, Read, Update, Delete) sehingga data ruangan dapat ditambahkan, ditampilkan, diubah, maupun dihapus sesuai kebutuhan. Data yang dikelola mencakup nomor ruangan, tipe ruangan (VIP, Kelas 1, 2, 3), serta status ruangan (Kosong/Terisi). Struktur data yang digunakan adalah ArrayList untuk menyimpan dan memproses seluruh informasi ruangan. Pengguna berinteraksi dengan program melalui menu berbasis teks yang menerima input langsung dari keyboard. Dengan adanya program ini, pengelolaan ruangan rawat menjadi lebih terstruktur, sederhana, dan mudah dijalankan.


****Alur Program :****



<img width="420" height="129" alt="image" src="https://github.com/user-attachments/assets/2d48d878-8072-46fa-bbcf-970688510c30" />

Saat pertama kali dijalankan programnya terdapat 5 menu yaitu :


Tambah Ruangan

Lihat Semua Ruangan

Ubah Data Ruangan

Hapus Ruangan

Keluar


<img width="608" height="91" alt="image" src="https://github.com/user-attachments/assets/12490a9e-176d-4256-a4c8-f144e14d4080" />




Menu pertama yaitu menambah ruangan Pada menu ini, pengguna dapat menambahkan data ruangan baru. Data yang dimasukkan meliputi nomor ruangan, tipe ruangan, dan status ruangan. Data yang sudah dimasukkan akan disimpan ke dalam ArrayList sebagai wadah penyimpanan sementara.




<img width="363" height="46" alt="image" src="https://github.com/user-attachments/assets/22f90218-b276-4649-a2e0-a88f39e51f67" />












<img width="583" height="53" alt="image" src="https://github.com/user-attachments/assets/738afd08-7ace-4ecc-ba15-24ef54e683f1" />




Kemudian yang kedua yaitu melihat data ruangan nenu ini menampilkan seluruh data ruangan yang telah tersimpan dalam bentuk daftar. Apabila belum terdapat data sama sekali, sistem akan menampilkan pesan: Belum ada data ruangan.




<img width="429" height="93" alt="image" src="https://github.com/user-attachments/assets/3d2fc448-8dec-41ed-92cc-7b3cc38fc9ab" />












<img width="435" height="116" alt="image" src="https://github.com/user-attachments/assets/9328829c-e713-49b6-ad34-94c646fb25c4" />




Kemudian yang ketiga yaitu mengubah data ruangan pada menu ini, pengguna dapat melakukan perubahan data ruangan. Langkahnya adalah pengguna memilih nomor urut ruangan dari daftar yang ditampilkan, kemudian memasukkan data baru berupa nomor, tipe, dan status. Setelah itu, data lama akan diperbarui sesuai dengan data baru yang diinputkan.


<img width="422" height="60" alt="image" src="https://github.com/user-attachments/assets/00b175f8-b6a9-49de-82de-12946de23cc3" />



Kemudian yang keempat yaitu menghapus data ruangan pada menu ini, pengguna dapat menghapus data ruangan yang tidak diperlukan. Caranya adalah dengan memilih nomor urut ruangan dari daftar, kemudian sistem akan menghapus data ruangan tersebut dari ArrayList.



<img width="657" height="125" alt="image" src="https://github.com/user-attachments/assets/82b45053-2e5e-4af3-998e-bb347d540dd0" />



Kemudian yang terakhir yaitu keluar program menu ini digunakan untuk mengakhiri jalannya program. Apabila pengguna memilih menu keluar, maka sistem akan berhenti dan aplikasi ditutup.







****Program****


<img width="1157" height="561" alt="image" src="https://github.com/user-attachments/assets/f72d99bc-de8d-4453-a52e-3e2a7d27f314" />
<img width="1163" height="565" alt="image" src="https://github.com/user-attachments/assets/812d2507-ed89-4e5f-a67d-ad9f94cbc4bf" />
<img width="1139" height="567" alt="image" src="https://github.com/user-attachments/assets/485284dd-6d90-413d-ab6a-b24c8d63f70d" />
<img width="914" height="450" alt="image" src="https://github.com/user-attachments/assets/f538e9db-82ea-412f-94a3-89f8266d731c" />


## Post-test-2-pbo

## Deskripsi Singkat 


Program ini merupakan aplikasi sederhana berbasis Java yang mengimplementasikan konsep CRUD (Create, Read, Update, Delete) untuk mengelola data ruangan rumah sakit. Data yang dikelola meliputi nomor ruangan, tipe ruangan, dan status ruangan.Struktur program dibuat dengan memisahkan class sesuai fungsinya, menggunakan constructor, access modifier, serta penerapan packages (main, model, service) untuk mendukung konsep MVC (Model-View-Controller).

## Class


<img width="330" height="153" alt="image" src="https://github.com/user-attachments/assets/6808b765-19ad-4469-a7bc-20894d319c25" />


Disini kita terdapat 3 class yaitu
class Ruangan = berfungsi menyimpan struktur data
class RuanganService = Berfungsi untuk menyimpan logika CRUD (Create, Read, Update, Delete).
class Main = menu utama (tempat user memilih apakah ingin menambah data, menampilkan data, mengedit data, menghapus data, mencari, dll).


## Properties


<img width="661" height="193" alt="image" src="https://github.com/user-attachments/assets/a6810a65-9ee2-43e4-93d9-bc7b0ffdd068" />


Di dalam program ini, setiap class model harus memiliki minimal 3 properti (atribut). Class Ruangan digunakan sebagai model untuk menyimpan informasi data ruangan. 3 properti terdiri dari :

Nomor ruangan
tipe ruangan
status

## Constructor


<img width="588" height="132" alt="image" src="https://github.com/user-attachments/assets/5ea5f5ec-f0ee-44cc-9b0c-765264d9c611" />


Constructor adalah method khusus dalam Java yang dipanggil secara otomatis saat sebuah objek dibuat dari sebuah class. Didalam program ini diterapkan pada class Ruangan di dalam package model. Ketika akan membuat objek baru dari class Ruangan, constructor ini akan langsung dipanggil untuk mengisi nilai dari nomor, tipe, dan status.


## Access Modifier


<img width="977" height="361" alt="image" src="https://github.com/user-attachments/assets/b98e7a6e-f540-4296-a6d0-1a74d1074782" />


Dalam program CRUD ini, sudah menerapkan access modifier private pada properti class Ruangan, serta public pada constructor, getter, dan setter.


## Packages


<img width="330" height="148" alt="image" src="https://github.com/user-attachments/assets/7ef8a226-bc96-4083-8490-ddda7eee1147" />


Dalam program ini terdapat 3 packages untuk memisahkan class
packages main > terdapat class main yang isinya adalah kode yang menyimpan menu user
packages service > terdapat class ruanganservice yang berfungsi menyimpan kode logika CRUD
packages model > terdapat class ruangan untuk menyimpan struktur data seperti atribut dan constructor

## Mvc


<img width="331" height="150" alt="image" src="https://github.com/user-attachments/assets/bb5b3e3d-8024-4446-907f-a5d221e042a4" />


Program ini sudah menerapkan pola MVC (Model - View - Controller) dengan pemisahan kode ke dalam 3 packages berbeda agar lebih rapi, mudah dipahami, dan terstruktur.

Struktur packages :

Model → Class Ruangan yang merepresentasikan struktur data dengan properti, constructor, getter, dan setter.
View → Class Main yang menangani tampilan menu utama pengguna serta input/output.
Controller (Service) → Class RuanganService yang menangani logika bisnis, validasi input, dan operasi CRUD.

## Validasi input


<img width="539" height="77" alt="image" src="https://github.com/user-attachments/assets/a5d43d56-ffa7-48c6-ac58-f82a5ac9782f" />


Program menambahkan validasi agar data yang dimasukkan user sesuai aturan. Dalam program ini saya menambahkan tipe ruangan hanya boleh yang tertera di atas selain itu maka inputan tidak valid, dan juga saya menambahkan status itu hanya boleh terisi dan kosong jika lain dari kedua tersebut maka harus mengisi kembali.

## Fitur search.


<img width="532" height="116" alt="image" src="https://github.com/user-attachments/assets/e3a6ae4e-dedf-41a6-bfb3-c74faa7e844b" />


Di dalam program ini fitur search ini memungkinkan user bisa mencari ruangan berdasarkan nomor dan tipe.

## Alur Program

Program ini memiliki 7 menu 


<img width="1016" height="243" alt="image" src="https://github.com/user-attachments/assets/4436b521-0609-43a5-be82-ec4c09a62864" />




1. menu pertama yaitu menambah data, pada bagian ini user bakal diminta untuk mengisi data data seperti nomor ruangan,tipe ruangan, dan status.


<img width="977" height="229" alt="image" src="https://github.com/user-attachments/assets/87638fbb-dc61-428c-9b36-f39418e74f29" />



2. menu kedua yaitu menampilkan semua ruangan, dimenu ini program bakal menampilkan semua ruangan yang sudah di tambahkan.


<img width="973" height="187" alt="image" src="https://github.com/user-attachments/assets/e43b31b7-54a1-4a4e-a72e-82fc8ac0bf3e" />



3. menu ketiga yaitu mengupdate atau mengubah data, jadi pada menu ini user memilih mana yang akan diubah datanya.


<img width="965" height="238" alt="image" src="https://github.com/user-attachments/assets/536f8f17-0a7e-4cc7-a288-22256863a4ba" />



4. menu keempat yaitu menghapus ruangan, jadi dimenu ini user dapat menghapus data dengan memilih nomor yang ingin dihapus.


<img width="982" height="206" alt="image" src="https://github.com/user-attachments/assets/580a0c35-7f0f-4e41-99ae-9957628fc633" />



5. menu kelima yaitu mencari ruangan bedasarkan nomor, jadi dimenu ini user harus memasukkan nomor mana yang ingin di cari


<img width="580" height="211" alt="image" src="https://github.com/user-attachments/assets/e18bfac2-02f7-4937-9e99-fb6ee716ce1c" />



6. menu keenam yaitu mencari ruangan bedasarkan tipe, jadi dimenu ini user harus memasukkan tipe ruangan apa yang ingin di cari


<img width="971" height="197" alt="image" src="https://github.com/user-attachments/assets/4498f69a-5167-4799-8fe8-11174d374c0c" />



7. menu ketujuh yaitu keluar dari program


<img width="975" height="289" alt="image" src="https://github.com/user-attachments/assets/dc8b1d98-67c0-4220-9274-e89e21009658" />


## Post-test-3-pbo

## Encapsulation (Getter & Setter)

Encapsulation adalah konsep membungkus data sensitif berupa atribut dan method dalam sebuah class agar terlindungi dari akses class lain. Untuk mengakses class tersebut, harus menetapkan access modifier ‘private’ pada atribut, lalu data bisa diakses melalui method getter (penginisialisasian)/setter (pengaksesan) yang bersifat ‘public’.


<img width="1066" height="507" alt="image" src="https://github.com/user-attachments/assets/1801c642-ec0b-43f6-a300-e47773d5f609" />


<img width="1053" height="161" alt="image" src="https://github.com/user-attachments/assets/9ef8edb9-ebc7-4874-ad2c-f8ff830fd771" />

Ini ada contoh penerapan encapsulation pada class ruangan


## Inheritance 

Inheritance merupakan salah satu pilar utama dalam Pemrograman Berorientasi Objek yang memungkinkan suatu class (child/anak) mewarisi atribut dan method dari class lain (parent/induk). Artinya, subclass dapat menggunakan kembali atribut dan method dari superclass, serta dapat menambahkan fitur baru atau mengubah perilaku yang sudah ada.
Superclass (parent class) → kelas induk yang mewariskan atribut dan method.
Subclass (child class) → kelas turunan yang mewarisi semua atribut dan method dari superclass, serta dapat menambahkan atribut dan method baru.

<img width="249" height="91" alt="image" src="https://github.com/user-attachments/assets/46e26d9e-e07e-4307-80cc-09cfdd807256" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/0eb05b89-616a-44f5-b806-43c2aee80556" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/955a0017-5a9f-4996-9ddc-575848242622" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/1a52001b-ed30-4a46-9da7-4d34d9e7116e" />

Disini saya menambahkan subclass kelas dan laboratorium dari superclass ruangan


## Overriding
Overriding adalah kemampuan subclass untuk menimpa (override) method yang sudah ada di superclass dengan implementasi yang berbeda. 

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/c73e8711-5fc3-4322-adfd-9d31cd5ca362" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/d8cc6fc6-b7d2-49b2-9812-b5a895790948" />

<img width="836" height="128" alt="image" src="https://github.com/user-attachments/assets/3b5f5fdc-e708-426e-bb77-b4ff8d1b61d9" />

<img width="1022" height="168" alt="image" src="https://github.com/user-attachments/assets/6101237e-508b-4023-922f-9b8d2df33d1e" />

Dalam kode ini overriding digunakan untuk menulis ulang method toString() milik superclass Ruangan. Ruangan hanya menampilkan nomor, tipe, dan status ruangan, sedangkan subclass Kelas dan Laboratorium menambahkan informasi khusus—Kelas menambah mata kuliah dan Laboratorium menambah jenis lab. Akibatnya, ketika objek dicetak dengan System.out.println(), Java otomatis memanggil toString() versi subclass sehingga informasi tambahan tampil sesuai tipe objeknya.




## Alur Program

Program ini memiliki 7 menu 


<img width="1016" height="243" alt="image" src="https://github.com/user-attachments/assets/4436b521-0609-43a5-be82-ec4c09a62864" />


1. menu pertama yaitu menambah data, pada bagian ini user bakal diminta untuk mengisi data data seperti nomor ruangan,tipe ruangan, dan status.


<img width="977" height="229" alt="image" src="https://github.com/user-attachments/assets/87638fbb-dc61-428c-9b36-f39418e74f29" />


2. menu kedua yaitu menampilkan semua ruangan, dimenu ini program bakal menampilkan semua ruangan yang sudah di tambahkan.


<img width="973" height="187" alt="image" src="https://github.com/user-attachments/assets/e43b31b7-54a1-4a4e-a72e-82fc8ac0bf3e" />


3. menu ketiga yaitu mengupdate atau mengubah data, jadi pada menu ini user memilih mana yang akan diubah datanya.


<img width="965" height="238" alt="image" src="https://github.com/user-attachments/assets/536f8f17-0a7e-4cc7-a288-22256863a4ba" />


4. menu keempat yaitu menghapus ruangan, jadi dimenu ini user dapat menghapus data dengan memilih nomor yang ingin dihapus.


<img width="982" height="206" alt="image" src="https://github.com/user-attachments/assets/580a0c35-7f0f-4e41-99ae-9957628fc633" />


5. menu kelima yaitu mencari ruangan bedasarkan nomor, jadi dimenu ini user harus memasukkan nomor mana yang ingin di cari


<img width="580" height="211" alt="image" src="https://github.com/user-attachments/assets/e18bfac2-02f7-4937-9e99-fb6ee716ce1c" />


6. menu keenam yaitu mencari ruangan bedasarkan tipe, jadi dimenu ini user harus memasukkan tipe ruangan apa yang ingin di cari


<img width="971" height="197" alt="image" src="https://github.com/user-attachments/assets/4498f69a-5167-4799-8fe8-11174d374c0c" />


7. menu ketujuh yaitu keluar dari program


<img width="975" height="289" alt="image" src="https://github.com/user-attachments/assets/dc8b1d98-67c0-4220-9274-e89e21009658" />



8. Tampilan setelah menu keluar adalah penerapan Overriding


<img width="1022" height="168" alt="image" src="https://github.com/user-attachments/assets/6101237e-508b-4023-922f-9b8d2df33d1e" />



## Post test 4 pbo

## Abstraction 
Abstraction adalah konsep dalam object-oriented programming (OOP) yang bertujuan untuk menyederhanakan kompleksitas sistem dengan menyembunyikan detail-detail teknis yang tidak perlu. Dalam java abstraction dapat dilakukan dengan:
1. Abstract Class: class yang tidak bisa dibuat objek secara langsung, tetapi bisa diwariskan ke class lain. Di dalamnya bisa ada method abstrak (tanpa isi) dan method biasa.
2. Interface: berisi kumpulan method abstrak yang harus diimplementasikan oleh class yang menggunakannya.





A. Abstract Class
Abstract Class adalah class yang tidak bisa dibuat objek secara langsung, tetapi bisa diwariskan ke class lain. Di dalamnya bisa ada method abstrak (tanpa isi) dan method biasa.


<img width="1078" height="625" alt="image" src="https://github.com/user-attachments/assets/3e5a2eb5-42dc-4abb-a92a-64dfb7c2390b" />


<img width="1095" height="623" alt="image" src="https://github.com/user-attachments/assets/783ab4e7-5224-419b-b3df-74ee20c4d804" />


<img width="1091" height="593" alt="image" src="https://github.com/user-attachments/assets/4a3f3089-d8f2-46ee-98d8-e617ee52dce9" />


Gambar diatas menunjekkan ruangan adalah abstract class yang ditandai dengan adanya keyword abstract. Di dalamnya terdapat method abstrak tanpa body yaitu inforuangan(). class laboratorium dan class kamar inap mewarisi class ruangan dan wajib mengimplementasikan method inforuangan().




B. Interface
Interface adalah sebuah kontrak atau kerangka kerja dalam OOP yang hanya berisi deklarasi method (tanpa implementasi). Setiap class yang mengimplementasikan interface wajib mendefinisikan semua method yang ada di dalamnya. Berbeda dengan abstract class, interface tidak memiliki implementasi method, dan sebuah class dapat mengimplementasikan lebih dari satu interface sekaligus.


<img width="1088" height="578" alt="image" src="https://github.com/user-attachments/assets/819c634b-fe1e-48d9-aa43-eae99c834a1b" />


<img width="1077" height="592" alt="image" src="https://github.com/user-attachments/assets/9b994b4f-83b7-408f-8957-d799f0303eaf" />


<img width="1093" height="603" alt="image" src="https://github.com/user-attachments/assets/e07e13d4-20ba-4b3c-8a2b-1410e8966ad0" />


Gambar diatas menunjukkan reservasi adalah interface yang hanya bisa mendefinisikan method pesan() dan batalkan() tanpa implementasi. class kamar inap dan laboratorium mengimplementasikan interface reservasi dan wajib memberikan implementasi dari kedua method yang ada.


## Polymorphism 
Polymorphism berasal dari bahasa Yunani, yaitu poly (banyak) dan morph (bentuk). Dalam OOP, polymorphism adalah kemampuan suatu method dengan nama yang sama untuk memiliki lebih dari satu perilaku atau kegunaan. Polymorphism dibagi menjadi dua bentuk:
1. Overloading: method dengan nama sama tapi berbeda parameter/tipe data.
2. Overriding: method di subclass menimpa method dari superclass dengan perilaku berbeda.




A. Overloading
Overloading adalah kemampuan dalam OOP yang memungkinkan suatu class memiliki beberapa method dengan nama yang sama, namun dibedakan berdasarkan:
▪ Jumlah parameter
▪ Tipe data parameter
▪ Urutan parameter


<img width="1094" height="475" alt="image" src="https://github.com/user-attachments/assets/3684ab97-56c2-46a5-8955-c45628b6626d" />



class Ruangan service memiliki dua method dengan nama sama, yaitu cari ruangan. Method pertama mencari dengan tipe data parameter string nomor. Method kedua mencari dengan tipe data parameter string tipe dan boolean bytipe . Inilah contoh overloading, yaitu satu nama method dengan tipe data parameter berbeda.





B. Overriding
Overriding adalah kemampuan subclass untuk menimpa (override) method yang sudah ada di superclass dengan implementasi yang berbeda. Ciri-cirinya:
▪ Nama method sama
▪ Parameter sama


<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/587a6471-536e-42fb-be4f-a31d10800cc7" />


<img width="1078" height="639" alt="image" src="https://github.com/user-attachments/assets/1e226e6c-af53-42cd-9cbf-c77050e8a564" />


<img width="1093" height="565" alt="image" src="https://github.com/user-attachments/assets/3e23a11f-8afa-4af3-87f8-3c8d98d4cd4e" />


<img width="1076" height="257" alt="image" src="https://github.com/user-attachments/assets/d4c74dec-c76c-4075-903c-45fade7058d5" />


Dalam program manajemen rumah sakit ini, penerapan overriding terlihat pada class kamar inap dan laboratorium yang merupakan subclass dari ruangan. Kedua class tersebut melakukan overriding terhadap method abstrak Inforuangan() dari superclass ruangan. Walaupun nama method sama, isi implementasinya berbeda sesuai dengan jenis ruangan. Pada kamar inap, method ini menambahkan informasi tentang nomor,tipe, dan status sedangkan pada Ikan, method ini menambahkan informasi sama tapi dengan no ruangan itu berbeda k1 dan l1, tipe nya sendiri juga berbeda,dan statusnya juga bisa berbeda asal kita ubah antara kosong atau terisi. Dengan demikian, ketika method Inforuangan() dipanggil melalui objek kamar inap atau laboratorium, hasil keluaran menyesuaikan dengan implementasi masing-masing subclass.


## Nilai tambah


Kombinasi abstract class dan interface digunakan secara bersamaan pada class laboratorium dan kamar inap. Kedua class ini mewarisi sifat umum dari abstract class ruangan sekaligus mengimplementasikan interface reservasi. Dengan cara ini, kamar inap dan laboratorium tidak hanya memiliki struktur dasar yang sama seperti atribut nomor,tipe, dan status dari ruangan, tetapi juga dipaksa untuk memberikan implementasi khusus terhadap aturan reservasi yang ditetapkan di interface reservasi.


<img width="1102" height="579" alt="image" src="https://github.com/user-attachments/assets/cffb3c8e-8f21-409d-9d4d-8eff398fa057" />


<img width="1103" height="639" alt="image" src="https://github.com/user-attachments/assets/ed380689-a657-4cb0-9c33-c208f94a0b60" />



## Alur Program

Program ini memiliki 7 menu 


<img width="1016" height="243" alt="image" src="https://github.com/user-attachments/assets/4436b521-0609-43a5-be82-ec4c09a62864" />


1. menu pertama yaitu menambah data, pada bagian ini user bakal diminta untuk mengisi data data seperti nomor ruangan,tipe ruangan, dan status.


<img width="977" height="229" alt="image" src="https://github.com/user-attachments/assets/87638fbb-dc61-428c-9b36-f39418e74f29" />


2. menu kedua yaitu menampilkan semua ruangan, dimenu ini program bakal menampilkan semua ruangan yang sudah di tambahkan.


<img width="973" height="187" alt="image" src="https://github.com/user-attachments/assets/e43b31b7-54a1-4a4e-a72e-82fc8ac0bf3e" />


3. menu ketiga yaitu mengupdate atau mengubah data, jadi pada menu ini user memilih mana yang akan diubah datanya.


<img width="965" height="238" alt="image" src="https://github.com/user-attachments/assets/536f8f17-0a7e-4cc7-a288-22256863a4ba" />


4. menu keempat yaitu menghapus ruangan, jadi dimenu ini user dapat menghapus data dengan memilih nomor yang ingin dihapus.


<img width="982" height="206" alt="image" src="https://github.com/user-attachments/assets/580a0c35-7f0f-4e41-99ae-9957628fc633" />


5. menu kelima yaitu mencari ruangan bedasarkan nomor, jadi dimenu ini user harus memasukkan nomor mana yang ingin di cari


<img width="580" height="211" alt="image" src="https://github.com/user-attachments/assets/e18bfac2-02f7-4937-9e99-fb6ee716ce1c" />


6. menu keenam yaitu mencari ruangan bedasarkan tipe, jadi dimenu ini user harus memasukkan tipe ruangan apa yang ingin di cari


<img width="971" height="197" alt="image" src="https://github.com/user-attachments/assets/4498f69a-5167-4799-8fe8-11174d374c0c" />


7. menu ketujuh yaitu keluar dari program


<img width="975" height="289" alt="image" src="https://github.com/user-attachments/assets/dc8b1d98-67c0-4220-9274-e89e21009658" />



8. Tampilan setelah menu keluar adalah penerapan Overriding


<img width="1060" height="243" alt="image" src="https://github.com/user-attachments/assets/db618dde-750a-4f5f-9cf4-97b8794398b5" />


