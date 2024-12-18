package gui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import gui.ICommon;
import gui.ITrans;
import javax.swing.Timer;
import logic.Board;

public class ControlPanel extends JPanel implements ICommon {

    private static final long serialVersionUID = 5219120377989554161L;
    public static final boolean STT_WIN = true;
    public static final boolean STT_LOSE = false;
    private JLabel lbNumSquareClosed;
    private JLabel lbNotify;
    private JButton btnRestart;
    private ITrans listener;
    private JButton btnRedo;
    private JLabel lbTimer;
    public Timer timer;
    public int second;
    public int minute;

    public ControlPanel() {
        initComp();
        addComp();
        addEvent();
    }

    @Override
    public void initComp() {
        setLayout(null);
    }

    @Override
    public void addComp() {
        Font font = new Font("VNI", Font.PLAIN, 20);

        lbNumSquareClosed = new JLabel();
        lbNumSquareClosed.setFont(font);
        lbNumSquareClosed.setText("Number of unopened cells: " + Board.NUM_ROWS * Board.NUM_COLUMNS);
        lbNumSquareClosed.setBounds(10, 10, 250, 40);
        add(lbNumSquareClosed);

        lbNotify = new JLabel();
        lbNotify.setFont(font);
        lbNotify.setBounds(350, 10, 200, 40);
        add(lbNotify);

        btnRestart = new JButton();
        btnRestart.setFont(font);
        btnRestart.setText("Play again");
        btnRestart.setBounds(490, 10, 100, 40);
        add(btnRestart);

        btnRedo = new JButton();
        btnRedo.setFont(font);
        btnRedo.setText("Undo");
        btnRedo.setBounds(590, 10, 100, 40);
        add(btnRedo);

        lbTimer = new JLabel("Time: 0:0");
        lbTimer.setFont(font);
        lbTimer.setBounds(220, 10, 200, 40);
        add(lbTimer);
        second = 0;
        minute = 0;
        timer();
        timer.start();
    }

    @Override
    public void addEvent() {
        btnRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.restart();
                lbNumSquareClosed.setText("Number of unopened cells: " + Board.NUM_ROWS * Board.NUM_COLUMNS);
                lbNotify.setText("");
            }
        });
        btnRedo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.undo();
                lbNotify.setText("");
            }
        });
    }

    public void addListener(ITrans event) {
        listener = event;
    }

    public void updateStatus(int numSquareClosed) {
        lbNumSquareClosed.setText("Number of unopened cells: " + numSquareClosed);
        if (numSquareClosed == Board.NUM_MINES) {
            lbNotify.setText("WIN");
            lbNotify.setForeground(Color.blue);
        } else if (numSquareClosed == 0) {
            lbNotify.setText("FAILURE");
            lbNotify.setForeground(Color.red);
        }
    }

    public void timer() {
        timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                second++;
                lbTimer.setText("Time: " + minute + ":" + second);
                if (second == 60) {
                    second = 0;
                    minute++;
                    lbTimer.setText("Time: " + minute + ":" + second);
                }
            }
        });
    }
}
