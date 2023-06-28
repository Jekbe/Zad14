import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Okno  extends JFrame {
    private final JPanel panel;
    private JPanel przyciski, tresc, dane;
    private JButton bDodajS, bDodajP;
    private JLabel lStudent, lPracownik, lImie, lNazwisko, lMiejsowosc, lUczelnia, lKierunek, lFirma, lStanowisko, lPobory;
    private JTextField tfImie, tfNazwisko, tfUczelnia, tfKierunek, tfFirma, tfStanowisko, tfPobory;
    private JComboBox<String> cbMiejscowosc;
    private JRadioButton rbStudent, rbPracownik;
    private ButtonGroup bg;
    private String[] miejscowosci;
    private final List<Student> studenci;
    private final List<Pracownik> pracownicy;

    public Okno(){
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        add(panel);
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        studenci = new ArrayList<>();
        pracownicy = new ArrayList<>();

        generuj();
    }

    private void generuj(){
        przyciski = new JPanel();
        tresc = new JPanel();
        dane = new JPanel();
        przyciski.setLayout(new BoxLayout(przyciski, BoxLayout.Y_AXIS));
        przyciski.setSize(50, 600);
        tresc.setLayout(new BoxLayout(tresc, BoxLayout.Y_AXIS));
        dane.setLayout(new FlowLayout());
        bg = new ButtonGroup();

        miejscowosci = new String[] {"Siedlce", "Łosice", "Łuków", "Węgrów", "Warszawa"};

        rbStudent = new JRadioButton("Student", true);
        rbPracownik = new JRadioButton("Pracownik");
        bg.add(rbStudent);
        bg.add(rbPracownik);

        bDodajS = new JButton("Dodaj");
        bDodajP = new JButton("dodaj");

        remove();
    }

    private void generujS(){
        tresc.add(lUczelnia = new JLabel("Uczelnia"));
        tresc.add(tfUczelnia = new JTextField(40));
        tresc.add(lKierunek = new JLabel("Kierunek"));
        tresc.add(tfKierunek = new JTextField(20));
        tresc.add(bDodajS);

        daneS();

        listener();
    }

    private void generujP(){
        tresc.add(lFirma = new JLabel("Firma"));
        tresc.add(tfFirma = new JTextField(20));
        tresc.add(lStanowisko = new JLabel("Stanowisko"));
        tresc.add(tfStanowisko = new JTextField(20));
        tresc.add(lPobory = new JLabel("Pobory"));
        tresc.add(tfPobory = new JTextField(10));
        tresc.add(bDodajP);

        daneP();

        listener();
    }

    private void listener(){
        rbStudent.addActionListener(e -> remove());

        rbPracownik.addActionListener(e -> remove());

        bDodajS.addActionListener(e -> zapiszS());

        bDodajP.addActionListener(e -> zapiszP());
    }

    private void remove(){
        panel.removeAll();
        przyciski.removeAll();
        tresc.removeAll();
        dane.removeAll();

        panel.add(przyciski);
        panel.add(tresc);
        panel.add(dane);

        przyciski.add(rbStudent);
        przyciski.add(rbPracownik);

        if (rbStudent.isSelected()) tresc.add(lStudent = new JLabel("Okno studenta"));
        else if (rbPracownik.isSelected()) tresc.add(lPracownik = new JLabel("Okno pracownika"));
        tresc.add(lImie = new JLabel("Imie"));
        tresc.add(tfImie = new JTextField(10));
        tresc.add(lNazwisko = new JLabel("Nazwisko"));
        tresc.add(tfNazwisko = new JTextField(20));
        tresc.add(lMiejsowosc = new JLabel("Miejscowosc"));
        tresc.add(cbMiejscowosc = new JComboBox<>(miejscowosci));
        if (rbStudent.isSelected()) generujS();
        else if (rbPracownik.isSelected()) generujP();
    }

    private void zapiszS(){
        studenci.add(new Student(tfImie.getText(), tfNazwisko.getText(), Objects.requireNonNull(cbMiejscowosc.getSelectedItem()).toString(),
            tfUczelnia.getText(), tfKierunek.getText()));

        daneS();
    }

    private void zapiszP(){
        pracownicy.add(new Pracownik(tfImie.getText(), tfNazwisko.getText(),
            Objects.requireNonNull(cbMiejscowosc.getSelectedItem()).toString(), tfFirma.getText(), tfStanowisko.getText(),
            Double.parseDouble(tfPobory.getText())));

        daneP();
    }

    private void daneS(){
        for (Student student : studenci){
            Button button = new Button(student.getImie() + student.getNazwisko());
            button.addActionListener(e -> pokazS(student));
            dane.add(button);
        }

        revalidate();
        repaint();
    }

    private void daneP(){
        for (Pracownik pracownik : pracownicy){
            Button button = new Button(pracownik.getImie() + pracownik.getNazwisko());
            button.addActionListener(e -> pokazP(pracownik));
            dane.add(button);
        }

        revalidate();
        repaint();
    }

    private void pokazS(Student student){

    }

    private void pokazP(Pracownik pracownik){

    }
}
