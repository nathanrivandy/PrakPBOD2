//Nama: Nathanael Arvind Krishna Rivandy
//Lab: D2
//NIM: 24060123130108 

package Pertemuan_6_Tugas_Lanj;

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara guk-guk!");
    }
}