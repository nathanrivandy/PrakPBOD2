//Nama: Nathanael Arvind Krishna Rivandy
//Lab: D2
//NIM: 24060123130108   

package Pertemuan_6_Post_Test;

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
            System.out.println();
        }
    }
}

// 2. Pada kasus ini polimorfisme berguna untuk menyimpan semua jenis pegawai, manajer, dan programmer pada satu arraylist bertipe pegawai.
// 3. Jika tidak menggunakan polimorfisme, maka dibutuhkan arraylist yang terpisah untuk tiap jenis pegawai.