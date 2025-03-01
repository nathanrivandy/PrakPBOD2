/* Nama File: Kendaraan.java
 * Deskripsi: Atribut dan method dari class kendaraan
 * Pembuat: Nathanael Arvind Krishna Rivandy / 24060123130108
 * Tanggal: 26 Februari 2025
*/

package Pertemuan_2;

public class Kendaraan {
    /*Atribut */
    private String noPlat;
    private String jenis;

    /*Method */
    public Kendaraan(){
        noPlat = "-";
        jenis = "-";
    }

    public Kendaraan (String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getnoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setnoPlat(String noPlat){
        noPlat = this.noPlat;
    }

    public void setJenis(String jenis){
        jenis = this.jenis;
    }
}
