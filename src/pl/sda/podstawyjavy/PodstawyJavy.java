package pl.sda.podstawyjavy;


import pl.sda.podstawyjavy.Samochod.Samochod;

import java.util.function.DoubleToIntFunction;

public class PodstawyJavy {
    public static void main(String[] args) {

        Samochod bmw = new Samochod("benzynowy","7","BMW","czarny");

        Samochod fiat = new Samochod("benzynowy", "500","Fiat","bialy");

        Samochod nissan = new Samochod("benzynowy","200sx","nissan","zielony");

        bmw.jedz();
        fiat.jedz();
        bmw.jedz();
        fiat.jedz();                    // odpala stworzone wlasne metody
        bmw.jedz();

        System.out.println(bmw.modelIMarka() + " " + bmw.stanLicznika() + "km");
        System.out.println(fiat.modelIMarka() + " " + fiat.stanLicznika() + "km");


    }
}
