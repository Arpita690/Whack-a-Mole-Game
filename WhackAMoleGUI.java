import javax.swing.*;
import java.awt.*;

public class WhackAMoleGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Whack-a-Mole Game");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        JLabel scoreLabel = new JLabel("Score: 0");
        JLabel timerLabel = new JLabel("Time: 30 sec");

        topPanel.add(scoreLabel);
        topPanel.add(Box.createHorizontalStrut(50));
        topPanel.add(timerLabel);

        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3, 3, 10, 10));

        for (int i = 0; i < 9; i++) {
            JButton button = new JButton();
            gamePanel.add(button);
        }

        ((JButton) gamePanel.getComponent(4)).setText("Mole");

        JPanel bottomPanel = new JPanel();
        JButton restartButton = new JButton("Restart");
        bottomPanel.add(restartButton);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(gamePanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}