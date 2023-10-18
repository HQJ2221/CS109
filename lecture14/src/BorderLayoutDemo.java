import javax.swing.*;
import java.awt.*;

//public class GridLayoutDemo extends JFrame{ //网格布局管理器
//    public GridLayoutDemo() {
//        super();
//        setLayout(new GridLayout(rows,cols,hgap,vgap));
//    }
//}

public class BorderLayoutDemo extends JFrame {
    private JButton bt1, bt2, bt3, bt4, bt5;

    public BorderLayoutDemo() {
        super("Border Layout");
        setLayout(new BorderLayout(3,3));
        bt1 = new JButton("North");
        add(bt1, BorderLayout.NORTH);
        bt2 = new JButton("South");
        add(bt2, BorderLayout.SOUTH);
        bt3 = new JButton("Center");
        add(bt3, BorderLayout.CENTER);
        bt4 = new JButton("West");
        add(bt4, BorderLayout.WEST);
        bt5 = new JButton("East");
        add(bt5, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        BorderLayoutDemo demo = new BorderLayoutDemo();
        demo.setTitle("Border");
        demo.setDefaultCloseOperation(EXIT_ON_CLOSE);
        demo.setSize(300,150);
        demo.setVisible(true);
    }
}
