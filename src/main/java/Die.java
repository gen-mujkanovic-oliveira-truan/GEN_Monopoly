import java.util.Random;

public class Die {
    private int faceValue;


    public void roll(){
        Random r = new Random();
        this.faceValue = r.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
