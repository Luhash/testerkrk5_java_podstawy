package pl.sda.podstawyjavy;

public class PodstawyJavy {
    public static void main(String[] args) {

       int yob = 1991;
                if (yob < 1980) {
                    System.out.println("Rok ponizej 1980");
                } else if (yob > 1990) {
                    System.out.println("Rok powyzej 1990");
                } else {
                    System.out.println("Rok pomierdzy 1980 a 1990");
                }

    }
    void wydrukujArgumenty(String[] args) {

        for (int i = 0; i< args.length; i++) {
            System.out.println(args [i]);
        }

        System.out.println("Hello World");
    }

}
