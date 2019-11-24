package pl.sda.podstawyjavy;

import java.util.Scanner;

public class PodstawyJavy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yob = -1; // wartosc zerowa w petli
        int licznikWykonan = 0;

        while (yob < 2019 && licznikWykonan < 9){

            System.out.println( (licznikWykonan + 1) + ".200 Prosze podaj rok urodzenia:");

        yob = scanner.nextInt(); // zmiana wartosci zmiennej

        String powitanie = (yob == 1980) ? "Urodziles sie w 1980 - BRAWO!" : "Urodziles sie w: " + yob;

        System.out.println(powitanie);
        licznikWykonan++;
    }
    }
    void wydrukujArgumenty(String[] args) {

        for (int i = 0; i< args.length; i++) {
            System.out.println(args [i]);
        }

        System.out.println("Hello World");
    }

}
