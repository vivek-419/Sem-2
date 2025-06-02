import java.awt.event.*; // Import ActionListener
import javax.swing.*; // Import Swing components

public class Ex4_JButtonList {
    public static void main(String[] args) {
        // Create JFrame
        JFrame f = new JFrame("Button Example");

        // Create JTextField
        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);

        // Create JButton
        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 30);

        // Add ActionListener using Anonymous Class
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("I am a button");
            }
        });

        // Add components to JFrame
        f.add(b);
        f.add(tf);

        // Set frame properties
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}