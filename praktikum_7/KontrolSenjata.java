//Nama: Nathanael Arvind Krishna Rivandy
//Lab: D2
//NIM: 24060123130108

package praktikum_7;

public class KontrolSenjata{
    public Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }
    
    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
        }
        else{
            for (int i = 0; i < jumlah; i++) {
                if (isAdaPeluru()) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                } 
                else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            if (senjata.getPeluru() >= 0) {
                System.out.println(">> Peluru sisa: " + senjata.getPeluru());
            }
        }
    }
    
    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "Menusuk dengan bayonet!";
        } else {
            return "Bayonet belum terpasang!";
        }
    }
    
    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
    
}
