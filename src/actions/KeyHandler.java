package actions;

import game.Bird;
import game.GameTimer;

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

    public KeyHandler(Bird bird, GameTimer gameTimer) {
        this.bird = bird;
        this.gameTimer = gameTimer;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE){
            if (!gameTimer.isRunning()){
                gameTimer.setRunning(true);
            }
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

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
