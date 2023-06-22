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
        this.ukonczoneKursy = new String[5];
        this.ileKursow = 0;
    }

    public String getFirma() {
        return this.firma;
    }

    public String getStanowisko() {
        return this.stanowisko;
    }

    public double getPoboryBrutto() {
        return this.poboryBrutto;
    }

    public void dodajKurs(String kurs){
        this.ukonczoneKursy[this.ileKursow] = kurs;
        this.ileKursow++;
    }

    public String info(){
        StringBuilder info = new StringBuilder("Pracownik na stanowisku: " + this.stanowisko + "ukończył następujące kursy: ");
        for (int f1 = 0; f1 < this.ileKursow; f1++){
            info.append(this.ukonczoneKursy[f1]).append(", ");
        }

        return info.toString();
    }

    public double oblicz(){
        return this.poboryBrutto - this.poboryBrutto * ((double) 19 / 100);
    }
}
