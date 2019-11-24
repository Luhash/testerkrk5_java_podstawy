package pl.sda.podstawyjavy;

import java.util.Scanner;

public class PodstawyJavy {
    public static void main(String[] args) {

        boolean podanaPoprawnaWartosc = false;

        Scanner scanner = new Scanner(System.in);

        while (!podanaPoprawnaWartosc ){

        System.out.println("Podaj dowolna liczbe od 0 do 9: ");
        int liczba = scanner.nextInt();

        if (liczba >= 0 && liczba <=9) {
            podanaPoprawnaWartosc = true;

            if (liczba ==3) {
                System.out.println("Dzien dobry");
            } else if (liczba ==5){
                System.out.println("Dobranoc");
            } else {
                System.out.println("Standardowa wiadomosc");
            }
        }else {
            System.out.println("Podana wartosc jesst nieprawidlowa");
        }
    }
    }
    void wydrukujArgumenty(String[] args) {

        for (int i = 0; i< args.length; i++) {
            System.out.println(args [i]);
        }

        System.out.println("Hello World");
    }

}
