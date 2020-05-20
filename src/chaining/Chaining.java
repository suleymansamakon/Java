package chaining;

public class Chaining {

    Eleman bas;
    Chaining[] dizi;
    int N;

    public Chaining(int N) {
        bas = null;
        this.N = N;
        for (int i = 0; i < N; i++) {
            dizi[i] = new Chaining(i);
            //nesne dizisi olan dizinin her elemeanı için hafızada yeni bir yer açıldı,

        }
    }

    int ModAl(int sayi) {
        return sayi % N;
    }

    public void basaEkle(Eleman yeni) {
        if (bas == null) {
            bas = yeni;
        } else {
            yeni.ileri = bas;
            bas = yeni;
        }
    }

    void addChain(Eleman eleman) {
        int sayi = ModAl(eleman.icerik);
        dizi[sayi].basaEkle(eleman);
    }

    public void yazdir() {
        Eleman tmp = bas;
        while (bas != null) {
            System.out.println(tmp.icerik);
            tmp = tmp.ileri;
        }
    }
    public static void main(String[] args) {
       
    }

}
