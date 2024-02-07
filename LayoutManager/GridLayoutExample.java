// Grid Layout Example
import java.awt.*;
import javax.swing.*;

public class GridLayoutExample{
    JFrame f;
    GridLayoutExample(){
        f = new JFrame("Grid Layout Example");
        f.setSize(500,600);
        f.setLayout(new GridLayout(2,3,20,20));

        JButton b1 = new JButton();
        f.add(b1);
        JButton b2 = new JButton();
        f.add(b2);
        JButton b3 = new JButton();
        f.add(b3);
        JButton b4 = new JButton();
        f.add(b4);
        JButton b5 = new JButton();
        f.add(b5);
        JButton b6 = new JButton();
        f.add(b6);

        f.setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutExample();
    }
}