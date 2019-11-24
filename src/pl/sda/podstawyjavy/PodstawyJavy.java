package pl.sda.podstawyjavy;


public class PodstawyJavy {
    public static void main(String[] args) {
        KomunikatyDlaLiczb komunikatyDlaLiczb = new KomunikatyDlaLiczb();
        komunikatyDlaLiczb.przyjmijLiczbe();
        System.out.println("Poprawnie wprowadzona wartosc to: " + komunikatyDlaLiczb.pobierzOstatniaWartoscLiczby());

    }
}
