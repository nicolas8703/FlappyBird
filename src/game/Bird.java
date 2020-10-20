package game;

/**
 * Bird
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date todo
 */


public class Bird  {
    private int x = 340;
    private int y = 300;
    private int score = 0;

    public Bird() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
