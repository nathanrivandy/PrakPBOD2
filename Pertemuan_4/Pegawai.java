// Pegawai.java
// Pembuat: Nathanael Arvind Krishna Rivandy
// Tanggal: 18 Maret 2025

public class Pegawai {
    private String nip;
    private String nama;
    private String tanggalLahir;
    private String tmt;
    private double gajiPokok;
    
    public Pegawai(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }
    
    public String getNip() {
        return nip;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getTanggalLahir() {
        return tanggalLahir;
    }
    
    public String getTmt() {
        return tmt;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public void setTmt(String tmt) {
        this.tmt = tmt;
    }
    
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public int hitungMasaKerja(String tanggalSekarang) {
        String[] tglMulai = tmt.split(" ");
        String[] tglSekarang = tanggalSekarang.split(" ");
        
        int tahunMulai = Integer.parseInt(tglMulai[2]);
        int bulanMulai = Integer.parseInt(tglMulai[1]);
        int hariMulai = Integer.parseInt(tglMulai[0]);
        
        int tahunSekarang = Integer.parseInt(tglSekarang[2]);
        int bulanSekarang = Integer.parseInt(tglSekarang[1]);
        int hariSekarang = Integer.parseInt(tglSekarang[0]);
        
        int tahun = tahunSekarang - tahunMulai;
        int bulan = bulanSekarang - bulanMulai;
        
        if (bulan < 0) {
            tahun--;
            bulan += 12;
        } else if (bulan == 0 && hariSekarang < hariMulai) {
            tahun--;
            bulan = 11;
        }
        
        return tahun * 12 + bulan;
    }
    
    public void printInfo() {
        System.out.println("NIP        : " + nip);
        System.out.println("Nama       : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("TMT        : " + tmt);
        System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", gajiPokok));
    }
}