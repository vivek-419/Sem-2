// Example of creating a JFrame by creating an instance
import javax.swing.*;

public class Ex1_JFrameAss {
    public static void main(String[] args) {
        JFrame f = new JFrame(); // Creating instance of JFrame
        
        JButton b = new JButton("Click"); // Creating instance of JButton
        b.setBounds(130, 100, 100, 40); // Setting position and size of button
        
        f.add(b); // Adding button to JFrame
        f.setSize(400, 500); // Setting size of frame (width: 400, height: 500)
        f.setLayout(null); // Using no layout managers
        f.setVisible(true); // Making the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
    }
}