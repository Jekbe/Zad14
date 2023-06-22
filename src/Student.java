public class Student extends Osoba{
    private final String uczelnia, kierunek;
    private final double[] oceny = new double[5];
    private int ileOcen = 0;

    public Student(String imie, String nazwisko, String miejscowosc, String uczelnia, String kierunek) {
        super(imie, nazwisko, miejscowosc);
        this.uczelnia = uczelnia;
        this.kierunek = kierunek;
    }

    public String getUczelnia() {
        return uczelnia;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void dodajOcene(double ocena){
        oceny[ileOcen] = ocena;
        ileOcen++;
    }

    @Override
    public String info(){
        return "Student kierunku: " + kierunek;
    }

    @Override
    public double oblicz() {
        int sum = 0;
        for (double ocena : oceny) sum += ocena;

        return (double) sum / ileOcen;
    }
}
