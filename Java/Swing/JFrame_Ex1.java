import javax.swing.JFrame;

public class JFrame_Ex1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Practice GUI");
        frame.setSize(420, 420); // Set the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on exit
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
