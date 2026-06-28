import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class WhackAMoleGame {

    static JButton[] buttons = new JButton[9];
    static Random random = new Random();

    public static void main(String[] args) {

        JFrame frame = new JFrame("Whack-a-Mole Game");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();

        JLabel scoreLabel = new JLabel("Score: 0");
        JLabel timerLabel = new JLabel("Time: 30 sec");

        scoreLabel.setFont(new Font("Arial", Font.BOLD, 18));
        timerLabel.setFont(new Font("Arial", Font.BOLD, 18));

        topPanel.add(scoreLabel);
        topPanel.add(Box.createHorizontalStrut(100));
        topPanel.add(timerLabel);

        JPanel gamePanel = new JPanel(new GridLayout(3, 3, 10, 10));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("Arial", Font.BOLD, 22));
            gamePanel.add(buttons[i]);
        }

        JPanel bottomPanel = new JPanel();
        JButton restartButton = new JButton("Restart");
        restartButton.setFont(new Font("Arial", Font.BOLD, 16));
        bottomPanel.add(restartButton);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(gamePanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);

        Timer timer = new Timer(1000, e -> {

            for (JButton button : buttons) {
                button.setText("");
            }

            int position = random.nextInt(9);
            buttons[position].setText("🐹");

        });

        timer.start();
    }
}