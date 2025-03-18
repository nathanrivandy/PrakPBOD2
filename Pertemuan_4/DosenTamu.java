// DosenTamu.java
// Pembuat: Nathanael Arvind Krishna Rivandy
// Tanggal: 18 Maret 2025

public class DosenTamu extends Dosen {
    private String nidk;
    private String tanggalBerakhirKontrak;
    
    public DosenTamu(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String jabatan, String fakultas, String nidk, String tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, jabatan, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public String getNidk() {
        return nidk;
    }
    
    public String getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }
    
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }
    
    public void setTanggalBerakhirKontrak(String tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }
    
    @Override
    public double hitungTunjangan(String tanggalSekarang) {
        int masaKerjaBulan = hitungMasaKerja(tanggalSekarang);
        int masaKerjaTahun = masaKerjaBulan / 12;
        return 0.025 * masaKerjaTahun * getGajiPokok();
    }
    
    @Override
    public void printInfo() {
        int masaKerjaBulan = hitungMasaKerja("10 3 2025");
        int tahun = masaKerjaBulan / 12;
        int bulan = masaKerjaBulan % 12;
        double tunjangan = hitungTunjangan("10 3 2025");
        
        System.out.println("NIP        : " + getNip());
        System.out.println("NIDK       : " + nidk);
        System.out.println("Nama       : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.println("TMT        : " + getTmt());
        System.out.println("Jabatan    : " + getJabatan());
        System.out.println("Fakultas   : " + getFakultas());
        System.out.println("Masa Kerja : " + tahun + " tahun " + bulan + " bulan");
        System.out.println("Kontrak Berakhir : " + tanggalBerakhirKontrak);
        System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", getGajiPokok()));
        System.out.println("Tunjangan  : 2.5% x " + tahun + " x Rp " + String.format("%,.2f", getGajiPokok()) + " = Rp " + String.format("%,.2f", tunjangan));
    }
}