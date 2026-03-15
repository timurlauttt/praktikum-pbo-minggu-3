class Rekening{
    private String nama;
    private String nomorRekening;
    private double saldo;
    private String bank;

    public void setRekening(String nama, String nomorRekening, double saldo, String bank){
        this.nama = nama;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
        this.bank = bank;
    }

    // setter
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNomorRekening(String nomorRekening){
        this.nomorRekening = nomorRekening;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    // getter
    public String getNama(){
        return nama;
    }

    public String getNomorRekening(){
        return nomorRekening;
    }

    public double getSaldo(){
        return saldo;
    }

    public void getRekening(){
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Bank: " + bank);
        System.out.println("Saldo: " + saldo);
    }

    void tarikUang(double jumlah){
        if(jumlah > saldo){
            System.out.println("Saldo tidak cukup");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik uang sebesar " + jumlah + " berhasil. Sisa saldo: " + saldo);
        }
    }
}

class ATM{
    void prosesTarikUang(Rekening rekening, double jumlah){
        rekening.tarikUang(jumlah);
    }
}

class BankBCA{
    final private String namaBank = "Bank ABC";

    void daftarRekening(Rekening rekening){
        rekening.setRekening(rekening.getNama(), "BCA" +rekening.getNomorRekening(), rekening.getSaldo(), namaBank);
    }
}

public class RekeningBank {
    public static void main(String[] args) {
        Rekening r = new Rekening();
        Rekening r2 = new Rekening();
        ATM a = new ATM();
        BankBCA bca = new BankBCA();

        // langsung
        r.setRekening("John Doe", "1234567890", 10000, "Bank Mandiri");

        // lewat bank
        r2.setNama("Abdul");
        r2.setNomorRekening("0987654321");
        r2.setSaldo(50000);
        bca.daftarRekening(r2);

        r.getRekening();
        r2.getRekening();
    }
}