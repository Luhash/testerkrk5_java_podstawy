package pl.sda.podstawyjavy;

public class PodstawyJavy {
    public static void main(String[] args) {

       int yob = 1980;

       String powitanie = (yob ==1980 ) ? "Urodziles sie w 1980" : "Nie urodziles sie w 1980" ;
        System.out.println(powitanie);

    }
    void wydrukujArgumenty(String[] args) {

        for (int i = 0; i< args.length; i++) {
            System.out.println(args [i]);
        }

        System.out.println("Hello World");
    }

}
