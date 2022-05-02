/**
 * Project: SpeelgoedFabriek
 *
 * @author Jan Willem vd Wal on 2-5-2022.
 * Beschrijving:
 */
public class SpeelgoedFabriek {
    public Speelgoed geefSpeelgoed(String speelgoedType) {
        if (speelgoedType == null) {
            return null;
        }
        if (speelgoedType.equals("Auto")) {
            return new Auto();
        }
        else if (speelgoedType.equals("Trekker")){
            return new Trekker();
        }
        else {
            return null;
        }
    }

}
