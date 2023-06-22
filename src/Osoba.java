public abstract class Osoba {
    private final String imie, nazwisko, miejscowosc;

    public Osoba(String imie, String nazwisko, String miejscowosc) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
    }

    public String getImie() {
        return this.imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public String getMiejscowosc() {
        return this.miejscowosc;
    }

    public abstract String info();

    public abstract double oblicz();
}
