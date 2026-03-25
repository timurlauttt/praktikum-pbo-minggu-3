package modul4.model;

public class Karyawan extends Manusia {

    private final String id;

    public Karyawan(String nama, int umur, String alamat, String id) {
        super(nama, umur, alamat); // mengakses constructor dari class Manusia
        this.id = id;
    }

    // override buat timpa method kerja() dari class Manusia
    @Override
    public void kerja() {
        System.out.println(getNama() + " bekerja sbg karyawan.");
    }

    public String getId() {
        return id;
    }

    public static void infoSpesies(){
        System.out.println("Spesies: " + SPESIES);
    }

}
