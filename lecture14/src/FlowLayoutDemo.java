import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutDemo extends JFrame { //流式布局
    private JButton bt1, bt2, bt3;
    private int count = 1;

    public FlowLayoutDemo() {
        super("Flow Layout");
        setLayout(new FlowLayout());
        bt1 = new JButton("Button 1");
        add(bt1); bt1.addActionListener(new Listener());
        bt2 = new JButton("Button 2");
        add(bt2);
        bt3 = new JButton("Button 3");
        add(bt3);
    }

    public static void main(String[] args) {
        FlowLayoutDemo demo = new FlowLayoutDemo();
        demo.setSize(200, 100);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg) {
            count++;
            bt1.setText("Button " + count);
        }
    }
}
