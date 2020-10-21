package actions;

import game.Bird;
import game.Tubes;

/**
 * Collide
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 21.20.2020
 */


public class Collide {
    private Bird bird;
    private Tubes tubes;
    private Tubes tubes1;
    private Tubes tubes2;

    public Collide(Bird bird, Tubes tubes, Tubes tubes1, Tubes tubes2) {
        this.bird = bird;
        this.tubes = tubes;
        this.tubes1 = tubes1;
        this.tubes2 = tubes2;
    }

    public boolean collideWall() {
        return bird.getY() < 0 || bird.getY() > 560;
    }

    public boolean collideTube() {
        if (testCollide(tubes)) return true;
        if (testCollide(tubes1)) return true;
        if (testCollide(tubes2)) return true;
        return false;
    }

    private boolean testCollide(Tubes tubes) {
        if (bird.getX() == tubes.getX() - 92 && bird.getY() < tubes.getTubeCor().get(0)) {
            return true;
        }
        if (bird.getX() == tubes.getX() - 52 && bird.getY() < tubes.getTubeCor().get(0)) {
            return true;
        }
        if (bird.getX() == tubes.getX() - 92 && bird.getY() + 40 > tubes.getY() + tubes.getTubeCor().get(0) + tubes.getTubeCor().get(1)) {
            return true;
        }
        return bird.getX() == tubes.getX() - 52 && bird.getY() + 40 > tubes.getY() + tubes.getTubeCor().get(0) + tubes.getTubeCor().get(1);
    }

}
