package actions;

import game.Bird;
import game.GameTimer;
import game.Tubes;
import gui.Draw;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * KeyHandler
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date todo
 */


public class KeyHandler implements KeyListener {
    private Bird bird;
    private GameTimer gameTimer;
    private Tubes tubes;

    public KeyHandler(Bird bird, GameTimer gameTimer, Tubes tubes) {
        this.bird = bird;
        this.gameTimer = gameTimer;
        this.tubes = tubes;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            tubes.newRandomTube();
        }

        if (e.getKeyCode() == KeyEvent.VK_SPACE){
            if (Draw.gameOver){

            }else {
                if (!gameTimer.isRunning()) {
                    gameTimer.setRunning(true);
                }else{
                    bird.setY(bird.getY() - 10);
                    gameTimer.wait5();
                    bird.setY(bird.getY() - 10);
                    gameTimer.wait5();
                    bird.setY(bird.getY() - 10);
                    gameTimer.wait5();
                    bird.setY(bird.getY() - 10);
                    gameTimer.wait5();
                    bird.setY(bird.getY() - 10);
                    gameTimer.wait5();
                    bird.setY(bird.getY() - 10);
                    gameTimer.wait5();
                    bird.setY(bird.getY() - 10);
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
