public class Pracownik extends Osoba{
    private final String firma, stanowisko;
    private final double poboryBrutto;
    private final String[] ukonczoneKursy = new String[5];
    private int ileKursow = 0;

    public Pracownik(String imie, String nazwisko, String miejscowosc, String firma, String stanowisko, double poboryBrutto) {
        super(imie, nazwisko, miejscowosc);
        this.firma = firma;
        this.stanowisko = stanowisko;
        this.poboryBrutto = poboryBrutto;
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

    public String info(){
        StringBuilder info = new StringBuilder("Pracownik na stanowisku: " + stanowisko + "ukończył następujące kursy: ");
        for (int f1 = 0; f1 < ileKursow; f1++) info.append(ukonczoneKursy[f1]).append(", ");

        return info.toString();
    }

    public double oblicz(){
        return poboryBrutto - poboryBrutto * ((double) 19 / 100);
    }
}
