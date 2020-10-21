package game;

import actions.Collide;
import gui.Gui;

/**
 * Main
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date todo
 */


public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Tubes tubes = new Tubes();
        Collide collide = new Collide(bird, tubes);
        GameTimer gameTimer = new GameTimer(collide, bird, tubes);
        Gui gui = new Gui(bird, gameTimer, tubes);
        gameTimer.run();
    }
}
