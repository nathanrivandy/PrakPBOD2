//Nama: Nathanael Arvind Krishna Rivandy
//Lab: D2
//NIM: 24060123130108

package Pertemuan_6_Tugas_Lanj;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Anabul anabul1 = new Kucing("Ethel");
        Anabul anabul2 = new Anjing("Doge");
        Anabul anabul3 = new Burung("Manuk");

        ArrayList<Anabul> nabuls = new ArrayList<>();
        nabuls.add(anabul1);
        nabuls.add(anabul2);
        nabuls.add(anabul3);

        for (Anabul anabul : nabuls) {
            anabul.Gerak();
            anabul.Bersuara();
            System.out.println();
        }
    }
}

