# Latihan2_DPBO
Latihan2_DPBO


/*Saya Atta Arrezie Kurnia (2006836) mengerjakan Latihan 2 
  dalam mata kuliah Desain dan Pmerograman Berorientasi Objek
  untuk keberkahanNya maka saya tidak melakukan kecurangan
  seperti yang telah dispesifikasikan. Aamiin*/
  
  
  File Tugas dibagi menjadi 4 file tugas berdasarkan tiap bahasa, dan 1 file screenshot
  
  1. c++/java -> program akan menampilkan main menu seperti pada gambar "cpp_main" pada file screenshot, user bisa memberikan inputan integer dari 1-2 untuk memilih menu untuk menambahkan data mahasiswa, dan melihat list tabel mahasiswa, serta menu int 3 untuk exit program. (java akan memiliki tampilan main menu yg kurang rapih dibanding c++).


  Algoritma :
 1. main menu -> Pada main menu, user akan diminta untuk memasukkan integer dari 1-3 untuk memilih menu
 2. menu "1" -> pada menu ini user akan diminta memasukkan nik, nim, nama, kelamin, prodi, fakultas, asal universitas, dan email univ asal mahasiswa secara bergantian.
  
    note : Testcase menu "1" : 
                - "1092837" "2006" "Atta Arrezie Kurnia" "Laki" "Ilkom" "FPMIPA" "UPI" "Atta@upi.edu"
                - "2093844" "2009" "Bima Putra Setiabudi" "Laki" "Teknik Komputer" "FPTK" "Telkom" "Bima@telkom.edu"
                - "2020002" "2002" "Tazkia Hana Azzahra" "Perempuan" "Seni Murni" "FPSD" "Telkom" "Hana@telkom.edu"

    note : Template inputan tiap tiap variabel adalah sebagai berikut
           1. nik -> input 7 angka
           2. nim -> input 4 angka
           3. nama -> input nama lengkap 
           4. kelamin -> input jenis kelamin
           5. prodi -> input prodi yang diambil mahasiswa
           6. fakultas -> input fakultas asal dari prodi yang diambil mahasiswa
           7. Asal universitas -> input asal universitas dari mahasiswa
           8. Email -> input email khusus universitas masing masing mahasiswa

    Setelah user memasukkan data tersebut, program akan menanyakan apakah akan melanjutkan menginput data mahasiswa yang lain atau tidak
    tekan Y/y untuk melanjutkan,
    tekan N/n untuk kembali ke menu awal.

 3. menu "2" -> pada menu ini user tidak perlu memasukkan input, karna menu ini hanya akan menampilkan tabel data mahasiswa yg telah diinput pada menu 1, user bisa         menekan tombol apapun(disarankan tekan tombol "enter"), untuk kembali ke menu awal
 4. menu "3" -> ketika user menginput angka 3 pada menu awal, program akan langsung keluar
  

