import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame {
    private JLabel label;
    public HelloWorld() {
        super("Our first Swing program");
        setLayout(new FlowLayout());
        label = new JLabel("Hello World");
        label.setFont(new Font("Times new Roman",Font.PLAIN, 40));
        add(label);
    }

    public static void main(String[] args) {
        String str1 = JOptionPane.showInputDialog("Enter 1st integer");
        String str2 = JOptionPane.showInputDialog("Enter 2st integer");
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int sum = num1 + num2;
        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + sum, "Sum of Two Integers", JOptionPane.INFORMATION_MESSAGE);
        HelloWorld gui = new HelloWorld();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(800, 600);
        gui.setVisible(true);
    }
}
