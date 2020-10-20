package game;

import actions.Collide;
import gui.Draw;

/**
 * GameTimer
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date todo
 */


public class GameTimer extends Thread{
    private boolean running = false;
    private Collide collide;
    private Bird bird;
    private Tubes tubes;

    public GameTimer(Collide collide, Bird bird, Tubes tubes) {
        this.collide = collide;
        this.bird = bird;
        this.tubes = tubes;
    }

    public void run(){
        while (!running){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (running){
            try {
                sleep(10);
                bird.setY(bird.getY() + 2);
                tubes.setX(tubes.getX()-2);
                if (collide.collideWall()){
                    bird.setScore(0);
                    Draw.setGameOver(true);
                    sleep(5000);
                    bird.setY(300);
                    bird.setX(340);
                    Draw.setGameOver(false);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void wait5(){
        try {
            sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
