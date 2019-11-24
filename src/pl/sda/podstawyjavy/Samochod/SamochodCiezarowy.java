package pl.sda.podstawyjavy.Samochod;

public class SamochodCiezarowy extends Samochod {
    boolean czyPrzyczepaZapieta = false;

    public SamochodCiezarowy(String typSilnika, String model, String marka, String kolor){
        super(typSilnika,model,marka,kolor);
    }

   public void deczepPrzyczepe(){
        czyPrzyczepaZapieta = true;
   }

   public void odczepPrzyczepe() {
        czyPrzyczepaZapieta = false;
   }



}
