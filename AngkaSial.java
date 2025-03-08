public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka !!!");
        }
    }
}

//Jawaban pertanyaan 1: baris 12 tidak dieksekusi karena eksepsi telah dilempar pada baris ke 4
//Jawaban pertanyaan 2: baris catch akan tereksekusi ketika baris try "as.cobaAngka(13)" dijalankan, karena angka 13 masuk ke dalam eksepsi 