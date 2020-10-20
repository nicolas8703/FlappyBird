package actions;

import game.Bird;
import game.Tubes;

/**
 * Collide
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date todo
 */


public class Collide {
    private Bird bird;
    private Tubes tubes;

    public Collide(Bird bird, Tubes tubes) {
        this.bird = bird;
        this.tubes = tubes;
    }

    public boolean collideWall(){
        if (bird.getY() < 0 || bird.getY() > 560){
            return true;
        }
        return false;
    }

}
