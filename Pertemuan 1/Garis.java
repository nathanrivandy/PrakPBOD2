//Nama: Nathanael Arvind Krishna Rivandy
//NIM: 24060123130108
//LAB: D2

public class Garis {
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;

    Garis(){
        awal = new Titik(0, 0);
        akhir = new Titik(1, 1);
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    Garis(Titik a, Titik b){
        a = awal;
        b = akhir;
        counterGaris++;
    }

    Titik getTitikAwal(){
        return awal;
    }

    Titik getTitikAkhir(){
        return akhir;
    }

    void setTitikAwal(Titik a){
        awal = a;
    }

    void setTitikAkhir(Titik b){
        akhir = b;
    }

    double getPanjang() {
        return Math.sqrt(Math.pow(akhir.getAbsis() - awal.getAbsis(), 2) + Math.pow(akhir.getOrdinat() - awal.getOrdinat(), 2));
    }

    double getGradien(){
        return (akhir.ordinat - awal.ordinat) / (akhir.absis - awal.absis);
    }

    Titik getTitikTengah(){
        return new Titik((awal.getAbsis() + akhir.getAbsis()) / 2, (awal.getOrdinat() + akhir.getOrdinat()) / 2);
    }

    boolean isSejajar(Garis x){
        return this.getGradien() == x.getGradien();
    }

    boolean isTegakLurus(Garis x) {
        return (this.getGradien() * x.getGradien()) == -1;
    }

    void printGaris(){
        System.out.println("Titik Awal (" + awal.getAbsis() + "," + awal.getOrdinat() + "), Titik Akhir (" + akhir.getAbsis() + "," + akhir.getOrdinat() + ")");
    }

    String getPGaris() {
        double m = getGradien();
        double c = awal.getOrdinat() - m * awal.getAbsis();
        return " y = " + m + "x + " + c;
    }
}