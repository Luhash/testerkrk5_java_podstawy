package pl.sda.podstawyjavy;


import java.util.function.DoubleToIntFunction;

public class PodstawyJavy {
    public static void main(String[] args) {
        KomunikatyDlaLiczb komunikatyDlaLiczb = new KomunikatyDlaLiczb();
        komunikatyDlaLiczb.przyjmijLiczbe();
        System.out.println("Poprawnie wprowadzona wartosc to: " + komunikatyDlaLiczb.pobierzOstatniaWartoscLiczby());

        komunikatyDlaLiczb.ustawWartoscZmiennejLiczba(98);
        System.out.println(komunikatyDlaLiczb.pobierzOstatniaWartoscLiczby());

        komunikatyDlaLiczb.ustawWartoscZmiennejLiczba(3);
        System.out.println(komunikatyDlaLiczb.pobierzOstatniaWartoscLiczby());

        komunikatyDlaLiczb.ustawWartosciZmiennejLiczba(500,76,10,6,3);
        System.out.println(komunikatyDlaLiczb.pobierzOstatniaWartoscLiczby());

    }
}
