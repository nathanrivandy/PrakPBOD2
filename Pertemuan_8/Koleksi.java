//Nama: Nathanael Arvind Krishna Rivandy
//Lab: D2
//NIM: 24060123130108  

class Koleksi<T> {
    private int nbelm = 0;
    private Object[] wadah = new Object[100];

    public T getIsi(int index) {
        return (T) wadah[index];
    }

    public void setIsi(int index, T elemen) {
        wadah[index] = elemen;
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        nbelm = size;
    }

    public void add(T elemen) {
        wadah[nbelm++] = elemen;
    }

    public void delete(int index) {
        for (int i = index; i < nbelm - 1; i++) {
            wadah[i] = wadah[i + 1];
        }
        nbelm--;
    }

    public void showAll() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println(wadah[i]);
        }
    }
}