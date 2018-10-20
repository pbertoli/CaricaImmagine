package caricaimmagine;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class CaricaImmagine extends JPanel {

    Image img;

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public CaricaImmagine() {
        try { // file nella dir del progetto (citata nel package)
            img = ImageIO.read(new File("bruna.jpg"));
        } catch (IOException e) {
            System.out.println("File non trovato");
        }
    }
    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(300,300);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Image Sample");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getPreferredSize();
        f.add(new CaricaImmagine());
        f.pack();
        f.setVisible(true);
    }
}
