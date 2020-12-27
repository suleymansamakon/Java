package collentionsyapisi;

class Eleman {

    Eleman ileri;
    int icerik;

    public Eleman(int icerik) {
        this.icerik = icerik;
        ileri = null;
    }
}

public class BagliListe {

    Eleman bas;
    Eleman son;

    public BagliListe() {
        bas = null;
        son = null;
    }

    public void BasaEkle(Eleman yeni) {
        if (bas == null) {
            bas = yeni;
            bas = bas.ileri;
        } else {
            yeni.ileri = bas;
            bas = yeni;
        }
    }

    public int BastanCikar() {
        int gonder = bas.icerik;
        bas = bas.ileri;
        return gonder;
    }

    public void sonaEkle(Eleman yeni) {
        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            son.ileri = yeni;
            son = yeni;
        }

    }

    public int sondanCikar() {

        Eleman onceki = bas;
        while (onceki != null) {
            onceki = onceki.ileri;
        }
        int gonder = son.icerik;
        son = onceki;
        return gonder;

    }
}
