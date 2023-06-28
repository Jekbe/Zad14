public class Pracownik extends Osoba{
    private final String firma, stanowisko;
    private final double poboryBrutto;
    private final String[] ukonczoneKursy;
    private int ileKursow;

    public Pracownik(String imie, String nazwisko, String miejscowosc, String firma, String stanowisko, double poboryBrutto) {
        super(imie, nazwisko, miejscowosc);
        this.firma = firma;
        this.stanowisko = stanowisko;
        this.poboryBrutto = poboryBrutto;
        ukonczoneKursy = new String[5];
        ileKursow = 0;
    }

    public String getFirma() {
        return firma;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public double getPoboryBrutto() {
        return poboryBrutto;
    }

    public void dodajKurs(String kurs){
        ukonczoneKursy[ileKursow] = kurs;
        ileKursow++;
    }

    @Override
    public String info(){
        StringBuilder info = new StringBuilder("Pracownik na stanowisku: " + stanowisko + "ukończył następujące kursy: ");
        for (int f1 = 0; f1 < ileKursow; f1++) info.append(ukonczoneKursy[f1]).append(", ");

        return info.toString();
    }

    @Override
    public double oblicz(){
        return poboryBrutto - poboryBrutto * ((double) 19 / 100);
    }
}
