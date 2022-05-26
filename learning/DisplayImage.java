package learning;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayImage {

    public static void main(String avg[]) throws IOException {
        display();
    }

    private static void display() throws IOException {
        System.out.println(System.getProperty("user.dir"));
        BufferedImage img = ImageIO.read(new File(String.format("%s/image.jpg", System.getProperty("user.dir"))));
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                // looping through width and height
                int clr = img.getRGB(i, j);
                // reading the binary hidden in int @clr int a 32 bit binary
                // where it has four bytes for data (A,R,G,B)
                // more info on how we are converting it to rgb in gettingRGBrules.java
                int red = (clr & 0xff);
                int green = (clr & 0xff00) >> 8;
                int blue = (clr & 0xff0000) >> 16;
                System.out.println(Color.BLACK);
                System.out.println(String.format("%s %s %s", red, green, blue));
                System.out.println(Color.RESET);

            }
        }

        JFrame frame = new JFrame("image viewer");
        frame.setLayout(new FlowLayout());
        frame.setSize(200, 300);
        JLabel lbl = new JLabel();
        JLabel lbl2 = new JLabel();
        lbl2.setText("test");
        lbl.setIcon(new ImageIcon(img));
        frame.add(lbl);
        frame.add(lbl2);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
