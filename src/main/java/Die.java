import java.util.Random;

/**
 * Represent a die
 */
public class Die {
    private int faceValue;

    /**
     * Roll the die
     */
    public void roll(){
        Random r = new Random();
        this.faceValue = r.nextInt(6) + 1;
    }

    /**
     * get the face value
     * @return the face value
     */
    public int getFaceValue() {
        return faceValue;
    }
}
