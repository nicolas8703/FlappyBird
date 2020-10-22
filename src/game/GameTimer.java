package game;

import actions.Collide;
import gui.Draw;

/**
 * GameTimer
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 21.20.2020
 */


public class GameTimer extends Thread {
    public static boolean running = false;
    private final Collide collide;
    private final Bird bird;
    private final Tubes tubes;
    private final Tubes tubes1;
    private final Tubes tubes2;

    GameTimer(Collide collide, Bird bird, Tubes tubes, Tubes tubes1, Tubes tubes2) {
        this.collide = collide;
        this.bird = bird;
        this.tubes = tubes;
        this.tubes1 = tubes1;
        this.tubes2 = tubes2;
    }

    public void run() {
        while (!running) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (running) {
            try {
                sleep(10);
                bird.setY(bird.getY() + 2);
                tubes.setX(tubes.getX() - 2);
                tubes1.setX(tubes1.getX() - 2);
                tubes2.setX(tubes2.getX() - 2);
                if (tubes.getX() < bird.getX() && tubes.isisPassed()) {
                    bird.setScore(bird.getScore() + 1);
                    tubes.setPassed(true);
                }
                if (tubes1.getX() < bird.getX() && tubes1.isisPassed()) {
                    bird.setScore(bird.getScore() + 1);
                    tubes1.setPassed(true);
                }
                if (tubes2.getX() < bird.getX() && tubes2.isisPassed()) {
                    bird.setScore(bird.getScore() + 1);
                    tubes2.setPassed(true);
                }
                if (tubes.getX() < 0) {
                    tubes.newRandomTube();
                    tubes.setX(680);
                    tubes.setPassed(false);
                }
                if (tubes1.getX() < 0) {
                    tubes1.newRandomTube();
                    tubes1.setX(680);
                    tubes1.setPassed(false);
                }
                if (tubes2.getX() < 0) {
                    tubes2.newRandomTube();
                    tubes2.setX(680);
                    tubes2.setPassed(false);
                }
                if (collide.collideWall()) {
                    gameOver();
                }
                if (collide.collideTube()) {
                    gameOver();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void gameOver() throws InterruptedException {
        bird.setScore(0);
        Draw.setGameOver(true);
        sleep(3000);
        bird.setY(300);
        bird.setX(340);
        Draw.setGameOver(false);
        tubes.newRandomTube();
        tubes1.newRandomTube();
        tubes2.newRandomTube();
        tubes.setX(680);
        tubes1.setX(906);
        tubes2.setX(1132);
        running = false;
        start();
    }

    public void wait5() {
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
        GameTimer.running = running;
    }
}
