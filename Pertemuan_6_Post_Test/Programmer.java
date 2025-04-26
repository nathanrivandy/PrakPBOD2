//Nama: Nathanael Arvind Krishna Rivandy
//Lab: D2
//NIM: 24060123130108   

package Pertemuan_6_Post_Test;

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama Manajer: " + nama + ", Gaji Pokok: " + gajiPokok);
        System.out.println("Bonus: " + bonus);
    }
}