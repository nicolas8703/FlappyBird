package game;

import actions.Collide;
import gui.Gui;

/**
 * Main
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 21.20.2020
 */


public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Tubes tubes = new Tubes();
        Tubes tubes1 = new Tubes(906);
        Tubes tubes2 = new Tubes(1132);
        Collide collide = new Collide(bird, tubes, tubes1, tubes2);
        GameTimer gameTimer = new GameTimer(collide, bird, tubes, tubes1, tubes2);
        Gui gui = new Gui(bird, gameTimer, tubes, tubes1, tubes2);
        gameTimer.run();
    }
}
