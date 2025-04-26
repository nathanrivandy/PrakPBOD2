//Nama: Nathanael Arvind Krishna Rivandy
//Lab: D2
//NIM: 24060123130108   

package Pertemuan_6_Post_Test;

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
