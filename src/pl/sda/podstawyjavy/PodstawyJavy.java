package pl.sda.podstawyjavy;

import java.util.Scanner;

public class PodstawyJavy {
    public static void main(String[] args) {

        for (int i = 0; i <5; i++) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Prosze podaj rok urodzenia:");


            int yob = scanner.nextInt();

            String powitanie = (yob == 1980) ? "Urodziles sie w 1980" : "Nie urodziles sie w 1980";
            System.out.println(powitanie);
        }
    }
    void wydrukujArgumenty(String[] args) {

        for (int i = 0; i< args.length; i++) {
            System.out.println(args [i]);
        }

        System.out.println("Hello World");
    }

}
