package game;

import java.util.ArrayList;

/**
 * Tubes
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date todo
 */


public class Tubes {
    private int x = 680;
    private int y = 0;
    private ArrayList<Integer> tubeCor;
    private boolean isPassed = false;

    public Tubes() {
        tubeCor = getRandomTube();
    }

    public ArrayList<Integer> getRandomTube(){
        ArrayList<Integer> tubeCor = new ArrayList<>();
        int randomNr = (int)(Math.random()*280);

        tubeCor.add(0, randomNr);
        tubeCor.add(1, 200);
        tubeCor.add(2, 680-randomNr-100);

        return tubeCor;
    }
    public void newRandomTube(){
        ArrayList<Integer> tubeCor = new ArrayList<>();
        int randomNr = (int)(Math.random()*280);

        tubeCor.add(0, randomNr);
        tubeCor.add(1, 200);
        tubeCor.add(2, 680-randomNr-100);

        this.tubeCor = tubeCor;
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

    public ArrayList<Integer> getTubeCor() {
        return tubeCor;
    }

    public void setTubeCor(ArrayList<Integer> tubeCor) {
        this.tubeCor = tubeCor;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }
}
