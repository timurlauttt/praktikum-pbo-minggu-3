# README Modul 4 — Enkapsulasi, Constructor, Modifier, dan Package (Java)

Dokumen ini menjelaskan implementasi konsep OOP pada folder `modul4` berdasarkan source code di:

- `src/modul4/model/Manusia.java`
- `src/modul4/model/Karyawan.java`
- `src/modul4/main/Main.java`

---

## 1) Enkapsulasi

**Enkapsulasi** adalah teknik menyembunyikan data internal objek dan memberikan akses melalui method.

### Implementasi pada `Manusia`

- `nama` dibuat `private final`
- `alamat` dibuat `private final`
- akses data dilakukan melalui getter:
  - `getNama()`
  - `getUmur()`
  - `getAlamat()`

Dengan pola ini, data penting tidak diubah sembarangan dari luar class. Akses lebih terkontrol dan aman.

### Implementasi pada `Karyawan`

- `id` disimpan sebagai `private final String id;`
- nilai `id` diambil lewat `getId()`

Ini juga contoh enkapsulasi: field langsung tidak diekspos, tetapi dibuka lewat method publik.

---

## 2) Constructor

**Constructor** adalah method khusus untuk inisialisasi objek saat dibuat.

### Constructor di `Manusia`

```java
public Manusia(String nama, int umur, String alamat) {
	 this.nama = nama;
	 this.umur = umur;
	 this.alamat = alamat;
}
```

Constructor ini memastikan setiap objek `Manusia` (atau turunannya) memiliki nilai awal `nama`, `umur`, dan `alamat`.

### Constructor di `Karyawan`

```java
public Karyawan(String nama, int umur, String alamat, String id) {
	 super(nama, umur, alamat);
	 this.id = id;
}
```

Di sini digunakan `super(...)` untuk memanggil constructor parent class (`Manusia`).
Setelah itu, field khusus `Karyawan` (`id`) diinisialisasi.

---

## 3) Access Modifier

Kode modul ini memakai beberapa modifier penting:

1. **`private`**  
	- Contoh: `nama`, `alamat`, `id`  
	- Hanya bisa diakses di dalam class yang sama.

2. **`protected`**  
	- Contoh: `umur`  
	- Bisa diakses oleh class dalam package yang sama dan subclass.

3. **`public`**  
	- Contoh: constructor, getter, `infoSpesies()`  
	- Bisa diakses dari mana saja.

4. **`static final`**  
	- Contoh: `SPESIES` pada `Manusia`  
	- `static` = milik class, bukan objek.  
	- `final` = nilai konstan (tidak berubah).

5. **`abstract`**  
	- `Manusia` adalah abstract class dan punya method abstract `kerja()`.  
	- Artinya class turunan wajib meng-override `kerja()`.

---

## 4) Package

Package membantu mengelompokkan class agar rapi dan modular.

Struktur package pada modul ini:

- `modul4.model` → berisi model/data class (`Manusia`, `Karyawan`)
- `modul4.main` → berisi entry point program (`Main`)

Contoh penggunaan import di `Main`:

```java
import modul4.model.Karyawan;
```

Dengan package:

- penamaan class lebih terstruktur
- menghindari bentrok nama class
- mempermudah maintenance project

---

## 5) Alur Program Singkat

Di `Main`, program membuat objek:

```java
Karyawan k = new Karyawan("Budi", 30, "Jakarta", "K001");
```

Lalu:

1. memanggil `k.kerja()` (hasil override dari `Karyawan`)
2. menampilkan data lewat getter (`getNama()`, `getUmur()`, `getAlamat()`, `getId()`)
3. memanggil `Karyawan.infoSpesies()` untuk menampilkan konstanta class

---

## Kesimpulan

Modul 4 sudah menunjukkan praktik OOP dasar yang baik:

- **enkapsulasi** dengan field private + getter
- **constructor chaining** lewat `super(...)`
- penggunaan **modifier** sesuai kebutuhan akses
- pemisahan class dengan **package** model dan main

Fondasi ini sudah tepat untuk lanjut ke materi inheritance dan polymorphism yang lebih kompleks.
