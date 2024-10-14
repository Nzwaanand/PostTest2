# Sistem Pengelolaan Jadwal Dokter di Klinik
## Nama: Nazwa Tri Ananda (2309116018)
---

### Latar Belakang Program
Program Sistem Pengelolaan Jadwal Dokter di Klinik bertujuan untuk mempermudah pengelolaan jadwal praktik dokter di sebuah klinik. Dengan sistem ini, staf klinik dapat melakukan pencatatan, pembaruan, penghapusan, serta meninjau daftar dan jadwal dokter dengan mudah. Hal ini mendukung peningkatan efisiensi administrasi klinik, menjaga agar jadwal dokter selalu terbaru, dan meminimalkan kesalahan dalam penjadwalan.

---
### Penjelasan Program
#### Struktur Paket (Package)
- **Model:** Berisi kelas-kelas yang merepresentasikan data dan perilaku dokter, termasuk antarmuka CRUD.
- **Manajemen:** Berisi kelas yang berperan dalam pengelolaan operasi CRUD pada jadwal dokter.

#### Penjelasan Kelas Model (Dokter)
Kelas *Dokter* merupakan representasi dari data seorang dokter. Kelas ini mengelola informasi dasar tentang dokter seperti nama, spesialisasi, dan jadwal praktiknya.

#### *Atribut*

- `nama` (String): Menyimpan nama dokter.
- `spesialis` (String): Menyimpan spesialisasi dokter.
- `jadwal` (String): Menyimpan jadwal praktik dokter.

#### *Constructor*
- `Dokter(String nama, String spesialis, String jadwal)`: Constructor yang digunakan untuk membuat objek Dokter dengan nama, spesialis, dan jadwal tertentu.

#### *Metode*
- `void tampilkanInfo()`: Menampilkan informasi lengkap tentang dokter.
- `String getNama()`: Mengembalikan nama dokter.
- `void setNama(String nama)`: Mengubah nama dokter.
- `String getSpesialis()`: Mengembalikan spesialisasi dokter.
- `void setSpesialis(String spesialis)`: Mengubah spesialisasi dokter.
- `String getJadwal()`: Mengembalikan jadwal dokter.
- `void setJadwal(String jadwal)`: Mengubah jadwal dokter.

#### Penjelasan Kelas Manajemen (PengelolaanJadwal)
Kelas *PengelolaanJadwal* mengelola seluruh logika CRUD dari sistem. Kelas ini menyediakan menu interaktif untuk pengguna, di mana pengguna dapat menambah, menampilkan, memperbarui, atau menghapus data dokter.

#### *Atribut*
- `daftarDokter`: ArrayList yang menyimpan objek Dokter.
- `scanner`: Scanner yang digunakan untuk membaca input dari pengguna.

#### *Metode Utama (main)*
- `public static void main(String[] args)`: Metode utama yang menjalankan program dan menampilkan menu pengelolaan jadwal dokter.

#### *CRUD Program*
- `tambah()`: Menambahkan data dokter baru berdasarkan input pengguna.
- `tampilkan()`: Menampilkan seluruh data dokter yang ada dalam `daftarDokter`.
- `update()`: Memperbarui jadwal praktik dokter berdasarkan nama yang dimasukkan pengguna.
- `hapus()`: Menghapus data dokter berdasarkan nama yang diinput pengguna.

---
### Menu Utama

Program ini mengelola data jadwal dokter di sebuah klinik melalui beberapa operasi CRUD (Create, Read, Update, Delete). Berikut adalah menu yang tersedia:

- **Tambah Dokter:** Menambahkan dokter baru, termasuk nama, spesialisasi, dan jadwal praktik.
- **Tampilkan Semua Dokter:** Menampilkan daftar semua dokter beserta jadwal praktiknya.
- **Update Jadwal Dokter:** Memperbarui jadwal dokter yang ada berdasarkan nama dokter.
- **Hapus Dokter:** Menghapus data dokter dari sistem berdasarkan nama.
- **Keluar:** Mengakhiri program.

---
#### Penjelasan Alur Program

#### *Tambah Dokter*
- Pengguna memasukkan nama, spesialisasi (Umum atau Spesialis), dan jadwal dokter.
- Program membuat objek Dokter baru dan menambahkannya ke dalam `daftarDokter`.

*menambah dokter umum*

<img width="404" alt="Tangkapan Layar 2024-10-14 pukul 15 43 16" src="https://github.com/user-attachments/assets/4373471a-1e28-44c1-8119-c226e4c0f7f9">

*menambah dokter spesialis*

<img width="407" alt="Tangkapan Layar 2024-10-14 pukul 15 46 28" src="https://github.com/user-attachments/assets/9315db81-4082-418b-a443-58cd4511fa14">

#### *Tampilkan Semua Dokter*
- Jika daftar kosong, program menampilkan pesan bahwa tidak ada dokter yang terdaftar.
- Jika ada, program akan menampilkan informasi dari setiap dokter di daftar.

<img width="356" alt="Tangkapan Layar 2024-10-14 pukul 15 47 00" src="https://github.com/user-attachments/assets/8232ef3e-eb73-4c66-9824-c57ed587d59a">

#### *Update Jadwal Dokter*
- Pengguna memasukkan nama dokter yang ingin diperbarui.
- Jika dokter ditemukan, pengguna memasukkan jadwal baru dan program memperbarui jadwal tersebut.
- Jika tidak ditemukan, program menampilkan pesan bahwa dokter tidak ditemukan.
  
<img width="472" alt="Tangkapan Layar 2024-10-14 pukul 15 47 54" src="https://github.com/user-attachments/assets/54da9b27-2b52-4cac-91d6-a83ea09cbdbc">

#### *Hapus Dokter*
- Pengguna memasukkan nama dokter yang ingin dihapus.
- Jika dokter ditemukan, data dokter tersebut akan dihapus dari daftar.
- Jika tidak ditemukan, program menampilkan pesan bahwa dokter tidak ditemukan.

<img width="389" alt="Tangkapan Layar 2024-10-14 pukul 15 49 51" src="https://github.com/user-attachments/assets/47b12dfe-9f7f-421f-84df-547f12e3b93a">

*setelah dihapus*

<img width="357" alt="Tangkapan Layar 2024-10-14 pukul 15 50 22" src="https://github.com/user-attachments/assets/a9ec1cde-1837-4981-b867-75c4ebfacf1a">

#### *Keluar*
Program akan menutup dan mengakhiri sesi.

-<img width="352" alt="Tangkapan Layar 2024-10-14 pukul 15 51 03" src="https://github.com/user-attachments/assets/bf6a7343-4cc1-4935-b80d-e9d70f1f436b">
