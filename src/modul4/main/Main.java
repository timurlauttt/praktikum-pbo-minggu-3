package modul4.main;

import modul4.model.Karyawan;

public class Main {
    public static void main(String[] args) {
        Karyawan k = new Karyawan("Budi", 30, "Jakarta", "K001");
    
        k.kerja();

        System.out.println("Nama: " + k.getNama());
        System.out.println("Umur: " + k.getUmur());
        System.out.println("Alamat: " + k.getAlamat());
        System.out.println("ID: " + k.getId());

        // akses ke variabel static final SPESIES melalui class Karyawan
        Karyawan.infoSpesies();
    }

}
