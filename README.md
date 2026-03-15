# Praktikum PBO Minggu 3 - Implementasi 4 Pilar OOP

Repository ini berisi latihan dasar Pemrograman Berorientasi Objek (PBO) dengan Java, khususnya untuk memahami **4 pilar OOP**:

1. **Encapsulation (Enkapsulasi)**
2. **Inheritance (Pewarisan)**
3. **Polymorphism (Polimorfisme)**
4. **Abstraction (Abstraksi)**

---

## Struktur Proyek

- **src/** : kode sumber Java
- **bin/** : hasil kompilasi (`.class`)
- **lib/** : library tambahan (jika ada)

---

## Penjelasan Kelas

### 1) Hierarki Hewan (`Hewan`, `Anjing`, `Kucing`) - Inheritance + Polymorphism + Abstraction

- **`Hewan`**
	- Kelas induk (superclass)
	- Memiliki method `suara()` dengan perilaku umum: "Hewan bersuara"
	- Berperan sebagai bentuk **abstraksi sederhana** untuk semua hewan

- **`Anjing extends Hewan`**
	- Kelas turunan (subclass)
	- Override `suara()` menjadi: "Anjing menggonggong"

- **`Kucing extends Hewan`**
	- Kelas turunan (subclass)
	- Override `suara()` menjadi: "Kucing mengeong"

Konsep yang terlihat:
- **Inheritance**: `Anjing` dan `Kucing` mewarisi `Hewan`
- **Polymorphism**: objek `Hewan` bisa mereferensikan `Anjing`/`Kucing`, lalu `suara()` menyesuaikan objek aslinya
- **Abstraction**: `Hewan` menjadi representasi umum dari berbagai jenis hewan

Contoh pemakaian ada di `App.java`.

---

### 2) Hierarki Kendaraan (`Kendaraan`, `Mobil`) - Inheritance

- **`Kendaraan`**
	- Memiliki atribut `merk`
	- Memiliki method `jalan()`

- **`Mobil extends Kendaraan`**
	- Mewarisi atribut/method dari `Kendaraan`
	- Menambahkan atribut `jumlahPintu` dan `harga`
	- Memiliki method `tampilkanInfo()` untuk menampilkan data mobil

Konsep yang terlihat:
- **Inheritance**: `Mobil` mewarisi karakteristik umum dari `Kendaraan`

---

### 3) Kelas `Manusia` - Encapsulation

- Atribut dibuat `private`:
	- `nama`
	- `umur`
	- `jenisKelamin`
- Akses data dilakukan melalui method `setNama()` dan `getNama()`

Konsep yang terlihat:
- **Encapsulation**: data disembunyikan, perubahan/akses dilakukan lewat method publik (getter/setter)

---

### 4) Simulasi Bank (`Rekening`, `ATM`, `BankBCA`, `RekeningBank`) - Encapsulation + Abstraction

Semua class ini ditulis dalam satu file: **`RekeningBank.java`**

- **`Rekening`**
	- Menyimpan data penting rekening (`nama`, `nomorRekening`, `saldo`, `bank`) sebagai `private`
	- Menyediakan setter/getter dan method `tarikUang()`
	- `tarikUang()` melakukan validasi saldo sebelum transaksi

- **`ATM`**
	- Memiliki method `prosesTarikUang(Rekening rekening, double jumlah)`
	- Bertindak sebagai perantara proses transaksi

- **`BankBCA`**
	- Memiliki `namaBank` konstan (`final`)
	- Method `daftarRekening()` memformat nomor rekening dengan prefix BCA

- **`RekeningBank`**
	- Berisi `main()` untuk menjalankan simulasi
	- Menunjukkan pembuatan rekening secara langsung dan melalui bank

Konsep yang terlihat:
- **Encapsulation**: data rekening disembunyikan melalui `private`
- **Abstraction**: pengguna cukup memanggil method seperti `setRekening()`/`tarikUang()` tanpa perlu tahu detail implementasi internal

---

## Contoh Polimorfisme di `App.java`

Program membuat objek:

- `Hewan h1 = new Anjing();`
- `Hewan h2 = new Kucing();`

Saat `h1.suara()` dan `h2.suara()` dipanggil, Java mengeksekusi method sesuai objek aslinya (**runtime polymorphism**).

---

## Cara Menjalankan

1. Kompilasi file Java (misalnya lewat VS Code atau terminal)
2. Jalankan:
	 - `App` untuk demo hewan/polimorfisme
	 - `RekeningBank` untuk demo simulasi rekening

---

## Ringkasan 4 Pilar OOP pada Proyek Ini

- **Encapsulation**: `Manusia`, `Rekening`
- **Inheritance**: `Anjing`/`Kucing` dari `Hewan`, `Mobil` dari `Kendaraan`
- **Polymorphism**: pemanggilan `suara()` lewat referensi `Hewan` di `App`
- **Abstraction**: `Hewan` sebagai bentuk umum; operasi rekening disederhanakan lewat method publik
