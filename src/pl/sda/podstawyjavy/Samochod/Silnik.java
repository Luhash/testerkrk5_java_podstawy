package pl.sda.podstawyjavy.Samochod;


public class Silnik {
    private String poleRodzajSilnika;
    private boolean silnikDziala = false;
    private long obroty = 0;

    public Silnik(String rodzajSilnika) {
        poleRodzajSilnika = rodzajSilnika;
    }

    String typSilnika() {
        return poleRodzajSilnika;
    }

    void uruchom() {
        obroty = 750;
        silnikDziala = true;
    }

    boolean czySilnikDziala() {

        return silnikDziala;
    }

    void zatrzymaj() {
        obroty = 0;
        silnikDziala = false;
    }

    void zwiekszObroty() {
        if (obroty < 5000) {

            obroty += 100;
        }
    }

    void zmniejszObroty() {
        if (obroty > 100) {
            obroty -= 100;
        } else {
            obroty = 0;
        }
    }
}
