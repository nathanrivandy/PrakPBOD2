//Nama: Nathanael Arvind Krishna Rivandy
//NIM: 24060123130108
//LAB: D2

public class MTitik {
    public static void main(String[] args) {
      //Titik 1  
      Titik T1 = new Titik();
      T1.setAbsis(5);
      T1.setOrdinat(10);
      T1.printTitik();
      
      //Titik 2
      Titik T2 = new Titik();
      T2.setAbsis(2);
      T2.setOrdinat(2);
      T2.printTitik();

      //Testing
      System.out.println("Kuadran: " + T2.getKuadran());
      System.out.println("Jarak T2 ke pusat: " + T2.getJarakPusat());
      System.out.println("Jarak T2 ke T1: " + T2.getJarak(T1));
      T2.refleksiX(); //Refleksi T2 terhadap sumbu X
      T2.printTitik();
      T2.refleksiY(); //Refleksi T2 terhadap sumbu Y
      T2.printTitik();

      Titik T3 = T2.getRefleksiX();
      T3.printTitik();

      Titik T4 = T3.getRefleksiY();
      T4.printTitik();
    }
  }