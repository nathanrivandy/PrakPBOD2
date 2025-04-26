//Nama: Nathanael Arvind Krishna Rivandy
//Lab: D2
//NIM: 24060123130108   

package Pertemuan_6_Post_Test;

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama Manajer: " + nama + ", Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
    }
}
