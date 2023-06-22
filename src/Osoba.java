public abstract class Osoba {
    private final String imie, nazwisko, miejscowosc;

    public Osoba(String imie, String nazwisko, String miejscowosc) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public abstract String info();

    public abstract double oblicz();
}
