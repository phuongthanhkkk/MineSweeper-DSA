package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindow extends JFrame {
    public StartWindow() {
        setTitle("Start Game");
        setSize(350,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btnEasy = new JButton("Easy");
        JButton btnHard = new JButton("Difficult");

        btnEasy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openGameWindow(false); // false: Easy
            }
        });

        btnHard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openGameWindow(true); // true: Diffucult
            }
        });

        setLayout(null);
        btnEasy.setBounds(60, 60, 80, 30);
        btnHard.setBounds(190, 60, 80, 30);

        add(btnEasy);
        add(btnHard);
        setLocationRelativeTo(null);
    }

    private void openGameWindow(boolean isHardMode) {
        Gui gameWindow = new Gui(isHardMode);
        gameWindow.setVisible(true);
        dispose(); // Close "START" window after opening main Game window
    }
}
