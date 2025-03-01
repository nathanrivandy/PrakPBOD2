/* Nama File: MataKuliah.java
 * Deskripsi: Atribut dan method dari class matakuliah
 * Pembuat: Nathanael Arvind Krishna Rivandy / 24060123130108
 * Tanggal: 26 Februari 2025
*/

package Pertemuan_2;

public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    public MataKuliah (){
        idMatkul = "-";
        nama = "-";
        sks = 0;
    }

    public MataKuliah (String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getidMatkul(){
        return idMatkul;
    }

    public String getNamaMatkul(){
        return nama;
    }

    public int getSKS(){
        return sks;
    }

    public void setidMatkul(String idMatkul){
        idMatkul = this.idMatkul;
    }

    public void setNamaMatkul(String nama){
        nama = this.nama;
    }
    
    public void setSKS(int sks){
        sks = this.sks;
    }   
}
