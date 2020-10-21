package gui;

import game.Bird;
import game.GameTimer;
import game.Tubes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Draw
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 21.20.2020
 */


public class Draw extends JLabel {
    private Bird bird;
    private Gui gui;
    private Tubes tubes;
    private Tubes tubes1;
    private Tubes tubes2;
    public static boolean gameOver = false;

    Draw(Bird bird, Gui gui, Tubes tubes, Tubes tubes1, Tubes tubes2) {
        this.bird = bird;
        this.gui = gui;
        this.tubes = tubes;
        this.tubes1 = tubes1;
        this.tubes2 = tubes2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        //Background
        BufferedImage img0 = null;
        try {
            img0 = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\background.png"));
        } catch (IOException e) {
        }
        g.drawImage(img0, 0, 0, gui.getWidth(), gui.getHeight(), null);

        //Tubes
        BufferedImage img6 = null;
        try {
            img6 = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\tubeDown.png"));
        } catch (IOException e) {
        }
        g.drawImage(img6, tubes.getX() - 52, tubes.getY(), 52, tubes.getTubeCor().get(0), null);


        BufferedImage img1 = null;
        try {
            img1 = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\tubeUp.png"));
        } catch (IOException e) {
        }
        g.drawImage(img1, tubes.getX() - 52, tubes.getY() + tubes.getTubeCor().get(0) + tubes.getTubeCor().get(1), 52, tubes.getTubeCor().get(2), null);

        BufferedImage img10 = null;
        try {
            img10 = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\tubeDown.png"));
        } catch (IOException e) {
        }
        g.drawImage(img10, tubes1.getX() - 52, tubes1.getY(), 52, tubes1.getTubeCor().get(0), null);


        BufferedImage img7 = null;
        try {
            img7 = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\tubeUp.png"));
        } catch (IOException e) {
        }
        g.drawImage(img7, tubes1.getX() - 52, tubes1.getY() + tubes1.getTubeCor().get(0) + tubes1.getTubeCor().get(1), 52, tubes1.getTubeCor().get(2), null);

        BufferedImage img8 = null;
        try {
            img8 = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\tubeDown.png"));
        } catch (IOException e) {
        }
        g.drawImage(img8, tubes2.getX() - 52, tubes2.getY(), 52, tubes2.getTubeCor().get(0), null);


        BufferedImage img9 = null;
        try {
            img9 = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\tubeUp.png"));
        } catch (IOException e) {
        }
        g.drawImage(img9, tubes2.getX() - 52, tubes2.getY() + tubes2.getTubeCor().get(0) + tubes2.getTubeCor().get(1), 52, tubes2.getTubeCor().get(2), null);


        //Bird
        BufferedImage img2 = null;
        try {
            img2 = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\bird.png"));
        } catch (IOException e) {
        }
        g.drawImage(img2, bird.getX(), bird.getY(), 50, 38, null);

        //Score
        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        g.drawString(bird.getScore() + "", 2, 20);

        if (gameOver) {
            BufferedImage img3 = null;
            try {
                img3 = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\bird_dead.png"));
            } catch (IOException e) {
            }
            g.drawImage(img3, bird.getX(), bird.getY(), 50, 46, null);

            BufferedImage img4 = null;
            try {
                img4 = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\gameover.png"));
            } catch (IOException e) {
            }
            g.drawImage(img4, 200, 230, 280, 70, null);
        }
        if (!GameTimer.running) {
            BufferedImage img5 = null;
            try {
                img5 = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\Flappy_Logo.png"));
            } catch (IOException e) {
            }
            g.drawImage(img5, 200, 230, 280, 74, null);
        }
        repaint();
    }
    public static void setGameOver(boolean gameOver) {
        Draw.gameOver = gameOver;
    }
}
