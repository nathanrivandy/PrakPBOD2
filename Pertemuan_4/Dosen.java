// Dosen.java
// Pembuat: Nathanael Arvind Krishna Rivandy
// Tanggal: 18 Maret 2025

public class Dosen extends Pegawai {
    private String jabatan;
    private String fakultas;
    
    public Dosen(String nip, String nama, String tanggalLahir, String tmt, 
                double gajiPokok, String jabatan, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.jabatan = jabatan;
        this.fakultas = fakultas;
    }

    public String getJabatan() {
        return jabatan;
    }
    
    public String getFakultas() {
        return fakultas;
    }
 
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
    public double hitungTunjangan(String tanggalSekarang) {
        int masaKerjaBulan = hitungMasaKerja(tanggalSekarang);
        int masaKerjaTahun = masaKerjaBulan / 12;
        return 0.02 * masaKerjaTahun * getGajiPokok();
    }
    
    public String hitungBUP(String tanggalSekarang) {
        String[] tglLahir = getTanggalLahir().split(" ");
        int tahunLahir = Integer.parseInt(tglLahir[2]);
        int bulanLahir = Integer.parseInt(tglLahir[1]);
        int hariLahir = Integer.parseInt(tglLahir[0]);
        
        int tahunBUP = tahunLahir + 65;
        
        return hariLahir + " " + bulanLahir + " " + tahunBUP;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan    : " + jabatan);
        System.out.println("Fakultas   : " + fakultas);
    }
}