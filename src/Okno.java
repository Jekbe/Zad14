import javax.swing.*;
import java.awt.*;

public class Okno  extends JFrame {


    public Okno(){
        setSize(650, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        generuj();
    }

    private void generuj(){


        listener();
    }

    private void listener(){

    }
}
