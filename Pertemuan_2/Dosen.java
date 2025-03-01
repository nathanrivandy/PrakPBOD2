/* Nama File: Dosen.java
 * Deskripsi: Atribut dan method dari class dosen
 * Pembuat: Nathanael Arvind Krishna Rivandy / 24060123130108
 * Tanggal: 26 Februari 2025
*/

package Pertemuan_2;

public class Dosen {
    /*Atribut */
    private String nip;
    private String nama;
    private String prodi;

    /*Method */
    public Dosen(){
       nip = "-";
       nama = "-";
       prodi = "-";
    }
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNIP(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNIP(String nip){
        nip = this.nip;
    }

    public void setNama(String nama){
        nama = this.nama;
    }

    public void setProdi(String prodi){
        prodi = this.prodi;
    }
}