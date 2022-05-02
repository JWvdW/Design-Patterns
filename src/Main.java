/**
 * Project: Main
 *
 * @author Jan Willem vd Wal on 2-5-2022.
 * Beschrijving:
 */
public class Main {

    public static void main(String[] args) {
        SpeelgoedFabriek speelgoedFabriek = new SpeelgoedFabriek();

        Speelgoed auto = speelgoedFabriek.geefSpeelgoed("Auto");
        auto.produceer();

        Speelgoed trekker = speelgoedFabriek.geefSpeelgoed("Trekker");
        trekker.produceer();
    }
}
