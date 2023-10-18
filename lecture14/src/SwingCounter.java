import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCounter extends JFrame {
    private JTextField tfCount;
    private JButton btCount;
    private int count = 0;

    public SwingCounter() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 0));
        add(new JLabel("Counter"));
        tfCount = new JTextField("0",2);
        tfCount.setEditable(true);
        add(tfCount);
        btCount = new JButton("Count");
        add(btCount);
        btCount.addActionListener(new ButtonClickListener());
    }

    public static void main(String[] args) {
        SwingCounter sc = new SwingCounter();
        sc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        sc.setTitle("Swing Counter");
        sc.setSize(400, 100);
        sc.setVisible(true);
    }
    public class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            count++;
            tfCount.setText(count + "");
        }
    }
}
