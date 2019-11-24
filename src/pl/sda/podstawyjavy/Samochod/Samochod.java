package pl.sda.podstawyjavy.Samochod;

public class Samochod {

    private Silnik silnik;
    private UkladHamulcowy ukladHamulcowy = new UkladHamulcowy();
    private int LicznikKilometrow = 0;
    private String model;                                       // to sa konstruktory
    private String marka;
    private String kolor;


    public Samochod(String typSilnika, String model, String marka, String kolor) {
        silnik = new Silnik(typSilnika);
        this.model = model;                                         // bierze zmienna z klasy
        this.marka = marka;
        this.kolor = kolor;
    }

    public void jedz() {
        ukladHamulcowy.odblokuj();
        silnik.uruchom();
        silnik.zwiekszObroty();
        LicznikKilometrow++;
    }

    public void stoj() {
        silnik.zatrzymaj();
        ukladHamulcowy.zablokuj();
    }

   public String modelIMarka() {
        return marka + " " + model;
    }

    public int stanLicznika() {
        return LicznikKilometrow;
    }
   public String pobierzKolor(){
        return kolor;
    }
}
