public class Student extends Osoba{
    private final String uczelnia, kierunek;
    private final double[] oceny;
    private int ileOcen;

    public Student(String imie, String nazwisko, String miejscowosc, String uczelnia, String kierunek) {
        super(imie, nazwisko, miejscowosc);
        this.uczelnia = uczelnia;
        this.kierunek = kierunek;
        this.oceny = new double[5];
        this.ileOcen = 0;
    }

    public String getUczelnia() {
        return this.uczelnia;
    }

    public String getKierunek() {
        return this.kierunek;
    }

    public void dodajOcene(double ocena){
        this.oceny[this.ileOcen] = ocena;
        this.ileOcen++;
    }
    public String info(){
        return "Student kierunku: " + this.kierunek;
    }

    public double oblicz() {
        int sum = 0;
        for (double ocena : this.oceny){
            sum += ocena;
        }

        return (double) sum / this.ileOcen;
    }
}
