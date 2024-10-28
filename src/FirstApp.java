import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class FirstApp extends JFrame {
    JLabel label;
    public FirstApp() {
        setSize(1200, 800);
        setTitle("My First App");

        label = new JLabel();
        label.setBounds(450, 10, 300, 50);
        label.setText("Hello World");
        label.setFont(new Font("Helvetica Neue", Font.BOLD, 50));

        setLayout(null);

        add(label);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FirstApp();
    }
}
