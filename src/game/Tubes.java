package game;

import java.util.ArrayList;

/**
 * Tubes
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 21.20.2020
 */


public class Tubes {
    private int x = 680;
    private int y = 0;
    private ArrayList<Integer> tubeCor;
    private boolean isPassed = false;

    Tubes() {
        tubeCor = getRandomTube();
    }

    Tubes(int x) {
        this.x = x;
        tubeCor = getRandomTube();
    }

    private ArrayList<Integer> getRandomTube() {
        ArrayList<Integer> tubeCor = new ArrayList<>();
        int randomNr = (int) (Math.random() * 280);

        tubeCor.add(0, randomNr);
        tubeCor.add(1, 130);
        tubeCor.add(2, 680 - randomNr - 100);

        return tubeCor;
    }

    public void newRandomTube() {
        ArrayList<Integer> tubeCor = new ArrayList<>();
        int randomNr = (int) (Math.random() * 280);

        tubeCor.add(0, randomNr);
        tubeCor.add(1, 130);
        tubeCor.add(2, 680 - randomNr - 100);

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

    public ArrayList<Integer> getTubeCor() {
        return tubeCor;
    }

    public boolean isisPassed() {
        return !isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }
}
