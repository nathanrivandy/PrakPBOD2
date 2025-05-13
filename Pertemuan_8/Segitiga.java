//Nama: Nathanael Arvind Krishna Rivandy
//Lab: D2
//NIM: 24060123130108  

class Segitiga extends BangunDatar {
    private double alas, tinggi, sisiA, sisiB, sisiC;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public double luas() {
        return 0.5 * alas * tinggi;
    }

    public double keliling() {
        return sisiA + sisiB + sisiC;
    }
}

