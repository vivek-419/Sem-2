//example of JFrame with constructor and association inside counstructor
import javax.swing.*;

public class Ex2_JFrameAssCon {
    JFrame f;

    // Constructor
    Ex2_JFrameAssCon() {
        f = new JFrame(); // Creating instance of JFrame

        JButton b = new JButton("Click"); // Creating instance of JButton
        b.setBounds(130, 100, 100, 40); // Setting position and size of button

        f.add(b); // Adding button to JFrame
        f.setSize(400, 500); // Setting size of frame (width: 400, height: 500)
        f.setLayout(null); // Using no layout managers
        f.setVisible(true); // Making the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
    }

    public static void main(String[] args) {
        new Ex2_JFrameAssCon(); // Creating an instance of the class
    }
}