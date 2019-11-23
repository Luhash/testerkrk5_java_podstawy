package pl.sda.podstawyjavy;

public class PodstawyJavy {
    public static void main(String[] args) {
      int i = 0;
        System.out.println(i); // sprawdzenie i
        System.out.println(++i); // zwiekszamy o 1 przed wykonaniem kodu
        System.out.println(i); // sprawdzenie i
        System.out.println(i++); // zwiekszamy o 1 po wykonaniu kodu
        System.out.println(i); // sprawdzenie i

        System.out.println(i); // drukuje wartosc 2 po wykonaniu wczesniejszych instrukcji

    }
    void wydrukujArgumenty(String[] args) {

        for (int i = 0; i< args.length; i++) {
            System.out.println(args [i]);
        }

        System.out.println("Hello World");
    }

}
