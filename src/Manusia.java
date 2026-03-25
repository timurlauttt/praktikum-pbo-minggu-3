public class Manusia{ // contoh modifier di class

    private String nama; // contoh modifier di atribut
    private int umur;

    public void setNama(String nama){ // contoh modifier di method
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }

    public void setUmur(int umur){
        this.umur = umur;
    }

    public int getUmur(){
        return this.umur;
    }

}