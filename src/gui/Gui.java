package gui;

import actions.KeyHandler;
import game.Bird;
import game.GameTimer;
import game.Tubes;

import javax.swing.*;

/**
 * Gui
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date todo
 */


public class Gui {
    private int width = 680;
    private int height = 600;


    public Gui(Bird bird, GameTimer gameTimer, Tubes tubes) {
        JFrame frame = new JFrame("Flappy Bird");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.addKeyListener(new KeyHandler(bird, gameTimer, tubes));

        Draw z = new Draw(bird, this, tubes);
        z.setBounds(0,0, width, height);
        z.setVisible(true);
        frame.add(z);

        frame.requestFocus();
        frame.setVisible(true);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
