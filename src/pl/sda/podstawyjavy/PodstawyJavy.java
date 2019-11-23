package pl.sda.podstawyjavy;

public class PodstawyJavy {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);

        for (int i = 0; i< args.length; i++) {
            System.out.println(args [i]);
        }

        System.out.println("Hello World");
    }

}
