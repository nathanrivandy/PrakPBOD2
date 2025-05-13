//Nama: Nathanael Arvind Krishna Rivandy
//Lab: D2
//NIM: 24060123130108  

class BangunDatarGenerik<T extends BangunDatar> {
    private T bangunDatar;

    public BangunDatarGenerik(T bangunDatar) {
        this.bangunDatar = bangunDatar;
    }

    public double luas() {
        return bangunDatar.luas();
    }

    public double keliling() {
        return bangunDatar.keliling();
    }
}