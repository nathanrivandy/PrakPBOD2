//Nama: Nathanael Arvind Krishna Rivandy
//NIM: 24060123130108
//LAB: D2

public class MGaris {
    public static void main(String[] args) {

        //Garis 1
        System.out.println("Garis 1");
        Garis G1 = new Garis();
        G1.setTitikAwal(new Titik(-2, 0));
        G1.setTitikAkhir(new Titik(0, 4));
        G1.printGaris();
        System.out.println("Panjang garis 1: " + G1.getPanjang());
        System.out.println("Gradien dari garis 1: " + G1.getGradien());
        System.out.println("Titik tengah dari garis 1: (" + G1.getTitikTengah().getAbsis() + ", " + G1.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan garis 1:" + G1.getPGaris());
        System.out.println("");

        //Garis 2
        System.out.println("Garis 2");
        Garis G2 = new Garis();
        G2.setTitikAwal(new Titik(1, 2));
        G2.setTitikAkhir(new Titik(3, 6));
        G2.printGaris();
        System.out.println("Panjang garis 2: " + G2.getPanjang());
        System.out.println("Gradien dari garis 2: " + G2.getGradien());
        System.out.println("Titik tengah dari garis 2: (" + G2.getTitikTengah().getAbsis() + ", " + G2.getTitikTengah().getOrdinat() + ")");
        
        System.out.println("Apakah garis 1 sejajar dengan garis 2: " + G1.isSejajar(G2));
        System.out.println("Persamaan garis 2:" + G2.getPGaris());
    }
}