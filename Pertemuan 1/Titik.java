//Nama: Nathanael Arvind Krishna Rivandy
//NIM: 24060123130108
//LAB: D2

import java.lang.Math;

class Titik{
  double absis;
  double ordinat;
  static int counterTitik = 0;

  Titik(){
    absis = 0;
    ordinat = 0;
    counterTitik++;
  }
  
  static int getCounterTitik(){
    return counterTitik;
  }
  
  Titik (double x, double y){
    absis = x;
    ordinat = y;
  }

  double getAbsis(){
    return absis;
  }
  
  double getOrdinat(){
    return ordinat;
  }

  void setAbsis(double x){
    absis = x;
  }

  void setOrdinat(double y){
    ordinat = y;
  }

  void geser(double x, double y){
    absis = absis + x;
    ordinat = ordinat + y;
  }

  int getKuadran(){
    int i = 0;

    if (absis > 0 && ordinat > 0){
      i = 1;
    }
    else if (absis < 0 && ordinat > 0){
      i = 2;
    }
    else if (absis < 0 && ordinat < 0){
      i = 3;
    }
    else if (absis > 0 && ordinat < 0){
      i = 4;
    }
    else {
      i = 0;
    }
    return i;
  }

  double getJarakPusat(){
    return Math.sqrt(Math.pow(ordinat, 2) + Math.pow(absis, 2));
  }

  double getJarak(Titik T){
    return Math.sqrt(Math.pow(ordinat-T.ordinat, 2) + Math.pow(absis-T.absis, 2));
  }

  void refleksiX(){
    ordinat = ordinat * -1;
  }

  void refleksiY(){
    absis = absis * -1;
  }

  Titik getRefleksiX(){
    return new Titik (this.absis, this.ordinat *= -1);
  }

  Titik getRefleksiY(){
    return new Titik (this.absis *= -1, this.ordinat);
  }

  void printTitik(){
    System.out.println("Titik (" + absis + "," + ordinat + ")");
  }
}  