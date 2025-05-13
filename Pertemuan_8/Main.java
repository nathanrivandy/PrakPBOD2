//Nama: Nathanael Arvind Krishna Rivandy
//Lab: D2
//NIM: 24060123130108  

public class Main {
    public static void main(String[] args) {
        BangunDatarGenerik<Persegi> bd1 = new BangunDatarGenerik<>(new Persegi(4));
        BangunDatarGenerik<PersegiPanjang> bd2 = new BangunDatarGenerik<>(new PersegiPanjang(3, 5));
        BangunDatarGenerik<Segitiga> bd3 = new BangunDatarGenerik<>(new Segitiga(4, 6, 5, 5, 6));

        System.out.println("Persegi: Luas = " + bd1.luas() + ", Keliling = " + bd1.keliling());
        System.out.println("PersegiPanjang: Luas = " + bd2.luas() + ", Keliling = " + bd2.keliling());
        System.out.println("Segitiga: Luas = " + bd3.luas() + ", Keliling = " + bd3.keliling());

        Koleksi<Character> koleksiChar = new Koleksi<>();
        for (char c = 'A'; c < 'K'; c++) {
            koleksiChar.add(c);
        }
        koleksiChar.showAll();

        Koleksi<Anabul> koleksiAnabul = new Koleksi<>();
        koleksiAnabul.add(new Kucing("Kitty"));
        koleksiAnabul.add(new Anjing("Doggo"));
        koleksiAnabul.add(new Burung("Cicak"));
        koleksiAnabul.add(new Kucing("Oyen"));
        koleksiAnabul.add(new Anjing("Bruno"));
        koleksiAnabul.add(new Burung("Paro"));
        koleksiAnabul.add(new Burung("Nuri"));
        koleksiAnabul.add(new Anjing("Rex"));
        koleksiAnabul.add(new Kucing("Mimi"));
        koleksiAnabul.add(new Kucing("Tom"));

        for (int i = 0; i < koleksiAnabul.getSize(); i++) {
            Anabul a = koleksiAnabul.getIsi(i);
            System.out.print("Nama: " + a.getNama() + " | ");
            a.Bersuara();
            a.Gerak();
            System.out.println();
        }
    }
}
