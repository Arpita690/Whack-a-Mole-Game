package Whackamolegame;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GUI {

    static JButton[] buttons = new JButton[9];
    static Random random = new Random();

    static int score = 0;
    static int timeLeft = 30;
    static int molePosition = -1;

    static JLabel scoreLabel;
    static JLabel timerLabel;

    static Timer moleTimer;
    static Timer gameTimer;

    public static void main(String[] args) {

   

        JFrame frame = new JFrame("Whack-a-Mole Game");

        frame.setSize(600, 600);

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        frame.setLocationRelativeTo(null);

        frame.setLayout(
                new BorderLayout(10, 10)
        );


        JLabel title = new JLabel(
                "WHACK-A-MOLE",
                SwingConstants.CENTER
        );

        title.setFont(
                new Font("Arial", Font.BOLD, 28)
        );

        frame.add(title, BorderLayout.NORTH);


        JPanel topPanel = new JPanel();

        scoreLabel = new JLabel("Score: 0");
        timerLabel = new JLabel("Time: 30 sec");

        scoreLabel.setFont(
                new Font("Arial", Font.BOLD, 18)
        );

        timerLabel.setFont(
                new Font("Arial", Font.BOLD, 18)
        );

        topPanel.add(scoreLabel);

        topPanel.add(
                Box.createHorizontalStrut(100)
        );

        topPanel.add(timerLabel);


        JPanel gamePanel = new JPanel(
                new GridLayout(3, 3, 10, 10)
        );

        gamePanel.setBorder(
                BorderFactory.createEmptyBorder(
                        10, 20, 10, 20
                )
        );


        for (int i = 0; i < 9; i++) {

            buttons[i] = new JButton();

            buttons[i].setFocusPainted(false);

            final int position = i;

            buttons[i].addActionListener(e -> {

                if (position == molePosition) {

                    score++;

                    scoreLabel.setText(
                            "Score: " + score
                    );

                    buttons[position].setIcon(null);

                    molePosition = -1;
                }
            });

            gamePanel.add(buttons[i]);
        }


        JPanel centerPanel = new JPanel(
                new BorderLayout()
        );

        centerPanel.add(
                topPanel,
                BorderLayout.NORTH
        );

        centerPanel.add(
                gamePanel,
                BorderLayout.CENTER
        );

        frame.add(
                centerPanel,
                BorderLayout.CENTER
        );


        JPanel bottomPanel = new JPanel();

        JButton restartButton =
                new JButton("Restart");

        restartButton.setFont(
                new Font("Arial", Font.BOLD, 16)
        );

        bottomPanel.add(restartButton);

        frame.add(
                bottomPanel,
                BorderLayout.SOUTH
        );


        frame.setVisible(true);


        moleTimer = new Timer(800, e -> {

            for (JButton button : buttons) {
                button.setIcon(null);
            }

 
            molePosition = random.nextInt(9);

            buttons[molePosition].setIcon(
                    new MoleIcon()
            );
        });


        gameTimer = new Timer(1000, e -> {

            timeLeft--;

            timerLabel.setText(
                    "Time: " + timeLeft + " sec"
            );

            if (timeLeft <= 0) {

                gameTimer.stop();
                moleTimer.stop();

                molePosition = -1;

                for (JButton button : buttons) {

                    button.setIcon(null);
                    button.setEnabled(false);
                }

                JOptionPane.showMessageDialog(
                        frame,
                        "GAME OVER!\n\nYour Score: "
                                + score,
                        "Game Over",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });


        moleTimer.start();
        gameTimer.start();


        restartButton.addActionListener(e -> {

            moleTimer.stop();
            gameTimer.stop();

            score = 0;
            timeLeft = 30;
            molePosition = -1;

            scoreLabel.setText("Score: 0");
            timerLabel.setText("Time: 30 sec");

            for (JButton button : buttons) {

                button.setEnabled(true);
                button.setIcon(null);
            }

            moleTimer.start();
            gameTimer.start();
        });
    }


    static class MoleIcon implements Icon {

        @Override
        public int getIconWidth() {
            return 100;
        }

        @Override
        public int getIconHeight() {
            return 100;
        }

        @Override
        public void paintIcon(
                Component c,
                Graphics g,
                int x,
                int y
        ) {

            Graphics2D g2 =
                    (Graphics2D) g;

            g2.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON
            );


            g2.setColor(
                    new Color(125, 82, 50)
            );

            g2.fillOval(
                    x + 10,
                    y + 20,
                    80,
                    70
            );


            g2.setColor(
                    new Color(100, 65, 40)
            );

            g2.fillOval(
                    x + 5,
                    y + 5,
                    30,
                    30
            );


            g2.fillOval(
                    x + 65,
                    y + 5,
                    30,
                    30
            );


            g2.setColor(
                    new Color(190, 120, 100)
            );

            g2.fillOval(
                    x + 12,
                    y + 12,
                    15,
                    15
            );

            g2.fillOval(
                    x + 73,
                    y + 12,
                    15,
                    15
            );


            g2.setColor(Color.BLACK);

            g2.fillOval(
                    x + 28,
                    y + 42,
                    10,
                    12
            );

            g2.fillOval(
                    x + 62,
                    y + 42,
                    10,
                    12
            );


            g2.fillOval(
                    x + 43,
                    y + 58,
                    15,
                    12
            );

            g2.drawArc(
                    x + 37,
                    y + 62,
                    27,
                    18,
                    0,
                    -180
            );
        }
    }
}