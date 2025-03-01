/* Nama File: Dosen.java
 * Deskripsi: File main dari class dosen, kendaraan, mahasiswa, dan matakuliah
 * Pembuat: Nathanael Arvind Krishna Rivandy / 24060123130108
 * Tanggal: 26 Februari 2025
*/

package Pertemuan_2;

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah ASD = new MataKuliah("ASD", "Algoritma dan Struktur Data", 4);

        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
        Mahasiswa M2 = new Mahasiswa("235", "Budi", "Sistem Informasi");

        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Dosen D2 = new Dosen("124", "Siti", "Sistem Informasi");
        
        Kendaraan K1 = new Kendaraan("H1234AB", "Motor");
        Kendaraan K2 = new Kendaraan("B5678CD", "Mobil");

        M1.setDoswal(D1);
        M1.setKendaraan(K1);
        M2.setDoswal(D2);
        M2.setKendaraan(K2);

        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M2.addMatkul(ASD);
        M2.addMatkul(PBO);
        
        System.out.println("Detail Mahasiswa 1");
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah: " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS: " + M1.getJumlahSKS());
        System.out.println("\nDetail Mahasiswa 2");
        M2.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah: " + M2.getJumlahMatKul());
        System.out.println("Jumlah SKS: " + M2.getJumlahSKS());
    }
}
