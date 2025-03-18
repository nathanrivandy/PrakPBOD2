// Main.java
// Pembuat: Nathanael Arvind Krishna Rivandy
// Tanggal: 18 Maret 2025

public class Main {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap(
            "9545c47548", "Andi", "5 5 1990", "1 1 2015", 
            5000000, "Dosen Tetap", "Fakultas Sains dan Matematika", "78647324");
        
        DosenTamu dosenTamu = new DosenTamu(
            "9545c47549", "Budi", "10 6 1988", "1 6 2018", 
            4500000, "Dosen Tamu", "Fakultas Teknik", 
            "123456", "31 12 2025");
        
        Tendik tendik = new Tendik(
            "9545c47550", "Citra", "15 7 1992", "1 8 2016", 
            3500000, "Akademik");
        
        System.out.println("=== SEBELUM PERUBAHAN ===");
        dosenTetap.printInfo();
        
        dosenTetap.setNama("Budi Speed");
        dosenTetap.setGajiPokok(5500000);
        dosenTetap.setFakultas("Fakultas Teknik");
        dosenTetap.setNidn("78647325");
        
        System.out.println("\n=== SETELAH PERUBAHAN ===");
        dosenTetap.printInfo();
 
        System.out.println("\n=== INFORMASI DOSEN TETAP ===");
        dosenTetap.printInfo();
        
        System.out.println("\n=== INFORMASI DOSEN TAMU ===");
        dosenTamu.printInfo();
        
        System.out.println("\n=== INFORMASI TENDIK ===");
        tendik.printInfo();
    }
}