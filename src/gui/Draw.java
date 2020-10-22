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
    private BufferedImage img_background = null;
    private BufferedImage img_tubeUp = null;
    private BufferedImage img_tubeDown = null;
    private  BufferedImage img_bird = null;
    private BufferedImage img_bird_dead = null;
    private BufferedImage img_gameover = null;
    private BufferedImage img_Flappy_Logo = null;



    Draw(Bird bird, Gui gui, Tubes tubes, Tubes tubes1, Tubes tubes2) {
        this.bird = bird;
        this.gui = gui;
        this.tubes = tubes;
        this.tubes1 = tubes1;
        this.tubes2 = tubes2;

        try {
            img_background = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\background.png"));
            img_tubeUp = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\tubeUp.png"));
            img_tubeDown = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\tubeDown.png"));
            img_bird = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\bird.png"));
            img_bird_dead = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\bird_dead.png"));
            img_gameover = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\gameover.png"));
            img_Flappy_Logo = ImageIO.read(new File("C:\\dateien\\JavaWorkspace\\FlappyBird\\src\\gui\\images\\Flappy_Logo.png"));
        } catch (IOException ex) {
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        //Background
        g.drawImage(img_background, 0, 0, gui.getWidth(), gui.getHeight(), null);

        //Tubes
        g.drawImage(img_tubeDown, tubes.getX() - 52, tubes.getY(), 52, tubes.getTubeCor().get(0), null);
        g.drawImage(img_tubeUp, tubes.getX() - 52, tubes.getY() + tubes.getTubeCor().get(0) + tubes.getTubeCor().get(1), 52, tubes.getTubeCor().get(2), null);

        g.drawImage(img_tubeDown, tubes1.getX() - 52, tubes1.getY(), 52, tubes1.getTubeCor().get(0), null);
        g.drawImage(img_tubeUp, tubes1.getX() - 52, tubes1.getY() + tubes1.getTubeCor().get(0) + tubes1.getTubeCor().get(1), 52, tubes1.getTubeCor().get(2), null);

        g.drawImage(img_tubeDown, tubes2.getX() - 52, tubes2.getY(), 52, tubes2.getTubeCor().get(0), null);
        g.drawImage(img_tubeUp, tubes2.getX() - 52, tubes2.getY() + tubes2.getTubeCor().get(0) + tubes2.getTubeCor().get(1), 52, tubes2.getTubeCor().get(2), null);

        //Bird
        g.drawImage(img_bird, bird.getX(), bird.getY(), 50, 38, null);

        //Score
        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        g.drawString(bird.getScore() + "", 2, 20);

        if (gameOver) {
            //Dead Bird
            g.drawImage(img_bird_dead, bird.getX(), bird.getY(), 50, 46, null);
            //Game Over
            g.drawImage(img_gameover, 200, 230, 280, 70, null);
        }
        if (!GameTimer.running) {
            //Flappy Bird Logo
            g.drawImage(img_Flappy_Logo, 200, 230, 280, 74, null);
        }
        repaint();
    }
    public static void setGameOver(boolean gameOver) {
        Draw.gameOver = gameOver;
    }
}
