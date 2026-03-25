package modul4.model;

public abstract class Manusia { // blueprint utama

    private final String nama;
    protected int umur; // bisa diakses di satu package/folder yang sama, dan subclassnya,, lebih tinggi tingkatannya daripada non-modifier

    public static final String SPESIES = "Homo sapiens"; // konstanta

    private final String alamat; // tanpa modifier = package-private, bukan protected

    // constructor
    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    // abstract method(tanpa isi)
    public abstract void kerja();

    // method biasa aja kek biasa bray
    public String getNama(){
        return nama;
    }

    public int getUmur(){
        return umur;
    }

    public String getAlamat() {
        return alamat;
    }
}
