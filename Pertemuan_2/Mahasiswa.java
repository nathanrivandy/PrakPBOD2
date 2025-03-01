/* Nama File: Mahasiswa.java
 * Deskripsi: Atribut dan method dari class mahasiswa
 * Pembuat: Nathanael Arvind Krishna Rivandy / 24060123130108
 * Tanggal: 26 Februari 2025
*/

package Pertemuan_2;

import java.util.ArrayList;

public class Mahasiswa {
    /*Atribut */
    private String nim;
    private String nama;
    private String prodi;
    private int jumlahMatKul;
    ArrayList<MataKuliah> listMatKul;
    private Dosen doswal;
    private Kendaraan kendaraan;

    /*Method */
    public Mahasiswa() {
        this.listMatKul = new ArrayList<>(); 
        this.jumlahMatKul = 0;
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.jumlahMatKul = 0;
    }

    public String getNIM(){
        return nim;
    }

    public String getNamaMahasiswa(){
        return nama;
    }

    public String getProdiMahasiswa(){
        return prodi;
    }

    public ArrayList<MataKuliah> getlistMatkul(){
        return listMatKul;
    }

    public Dosen getDoswal(){
        return doswal;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public int getJumlahSKS(){
        int totalSKS = 0;
        for (MataKuliah matkul : listMatKul) {
            totalSKS += matkul.getSKS();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    public void setNIM(String nim){
        this.nim = nim;
    }

    public void setNamaMahasiswa(String nama){
        this.nama = nama;
    }

    public void setProdiMahasiswa(String prodi){
        this.prodi = prodi;
    }

    public void setDoswal(Dosen doswal){
        this.doswal = doswal;
    }

    public void setKendaraan(Kendaraan e){
        this.kendaraan = e;
    }

    public void addMatkul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
        jumlahMatKul++;
    }
    public void printMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi" + prodi);
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("List matakuliah:");
        int i;
        for(i = 0; i <listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getNamaMatkul());
        }
        System.out.println("Dosen Wali: " + doswal.getNama());
        System.out.println("NoPlat Kendaraan: " + kendaraan.getnoPlat());
        System.out.println("Jenis kendaraan: " + kendaraan.getJenis());
    }
    
}

