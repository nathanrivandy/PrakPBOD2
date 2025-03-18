// DosenTetap.java
// Pembuat: Nathanael Arvind Krishna Rivandy
// Tanggal: 18 Maret 2025

public class DosenTetap extends Dosen {
    private String nidn;
    private String bup;
    
    public DosenTetap(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String jabatan, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, jabatan, fakultas);
        this.nidn = nidn;
        this.bup = hitungBUP(tanggalLahir);
    }

    public String getNidn() {
        return nidn;
    }
    
    public String getBUP() {
        return bup;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
    
    public void setBUP(String bup) {
        this.bup = bup;
    }
    
    public String hitungBUP(String tanggalLahir) {
        String[] tglLahir = tanggalLahir.split(" ");
        int tahunLahir = Integer.parseInt(tglLahir[2]);
        int bulanLahir = Integer.parseInt(tglLahir[1]);
        int hariLahir = Integer.parseInt(tglLahir[0]);
        
        int tahunBUP = tahunLahir + 65;
        
        return hariLahir + " " + (bulanLahir + 1) + " " + tahunBUP;
    }
    
    @Override
    public void setTanggalLahir(String tanggalLahir) {
        super.setTanggalLahir(tanggalLahir);
        this.bup = hitungBUP(tanggalLahir);
    }
    
    @Override
    public double hitungTunjangan(String tanggalSekarang) {
        int masaKerjaBulan = hitungMasaKerja(tanggalSekarang);
        int masaKerjaTahun = masaKerjaBulan / 12;
        return 0.02 * masaKerjaTahun * getGajiPokok();
    }
    
    @Override
    public void printInfo() {
        int masaKerjaBulan = hitungMasaKerja("18 3 2025");
        int tahun = masaKerjaBulan / 12;
        int bulan = masaKerjaBulan % 12;
        double tunjangan = hitungTunjangan("18 3 2025");
        
        System.out.println("NIP        : " + getNip());
        System.out.println("NIDN       : " + nidn);
        System.out.println("Nama       : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.println("TMT        : " + getTmt());
        System.out.println("Jabatan    : " + getJabatan());
        System.out.println("Fakultas   : " + getFakultas());
        System.out.println("Masa Kerja : " + tahun + " tahun " + bulan + " bulan");
        System.out.println("BUP        : " + bup);
        System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", getGajiPokok()));
        System.out.println("Tunjangan  : 2% x " + tahun + " x Rp " + String.format("%,.2f", getGajiPokok()) + 
                           " = Rp " + String.format("%,.2f", tunjangan));
    }
}