//Nama: Nathanael Arvind Krishna Rivandy
//Lab: D2
//NIM: 24060123130108  

class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double luas() {
        return panjang * lebar;
    }

    public double keliling() {
        return 2 * (panjang + lebar);
    }
}
