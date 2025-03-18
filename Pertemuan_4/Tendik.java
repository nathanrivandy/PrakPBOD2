// Tendik.java
// Pembuat: Nathanael Arvind Krishna Rivandy
// Tanggal: 18 Maret 2025

public class Tendik extends Pegawai {
    private String bidang;
    private String bup;
    
    public Tendik(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
        this.bup = hitungBUP(tanggalLahir);
    }
    
    public String getBidang() {
        return bidang;
    }
    
    public String getBUP() {
        return bup;
    }
    
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
    
    public void setBUP(String bup) {
        this.bup = bup;
    }

    @Override
    public void setTanggalLahir(String tanggalLahir) {
        super.setTanggalLahir(tanggalLahir);
        this.bup = hitungBUP(tanggalLahir);
    }
    
    private String hitungBUP(String tanggalLahir) {
        String[] tglLahir = tanggalLahir.split(" ");
        int tahunLahir = Integer.parseInt(tglLahir[2]);
        int bulanLahir = Integer.parseInt(tglLahir[1]);
        int hariLahir = Integer.parseInt(tglLahir[0]);
        
        int tahunBUP = tahunLahir + 55;
        
        return hariLahir + " " + (bulanLahir + 1) + " " + tahunBUP;
    }
    
    public double hitungTunjangan(String tanggalSekarang) {
        int masaKerjaBulan = hitungMasaKerja(tanggalSekarang);
        int masaKerjaTahun = masaKerjaBulan / 12;
        return 0.01 * masaKerjaTahun * getGajiPokok();
    }
    
    @Override
    public void printInfo() {
        int masaKerjaBulan = hitungMasaKerja("18 3 2025");
        int tahun = masaKerjaBulan / 12;
        int bulan = masaKerjaBulan % 12;
        double tunjangan = hitungTunjangan("18 3 2025");
        
        System.out.println("NIP        : " + getNip());
        System.out.println("Nama       : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.println("TMT        : " + getTmt());
        System.out.println("Bidang     : " + bidang);
        System.out.println("Masa Kerja : " + tahun + " tahun " + bulan + " bulan");
        System.out.println("BUP        : " + bup);
        System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", getGajiPokok()));
        System.out.println("Tunjangan  : 1% x " + tahun + " x Rp " + String.format("%,.2f", getGajiPokok()) + 
                           " = Rp " + String.format("%,.2f", tunjangan));
    }
}
