import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class TryAgain extends JFrame{
    TryAgain(){

        JButton tryAgainButton = new JButton();
        JButton exitButton = new JButton();

        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));

        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));

        this.add(tryAgainButton);
        this.add(exitButton);

        // Frame Layout
        this.setLayout(new FlowLayout());
        // Frame title
        this.setTitle("Snake Game");
        // Terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Frame size
        this.setSize(250, 500);
        // Puts frame in the middle
        this.setLocationRelativeTo(null);
        // Make frame appear
        this.setVisible(true);
        // Disable resize
        this.setResizable(false);
        // Set background color
        this.getContentPane().setBackground(Color.MAGENTA);
    }
}
