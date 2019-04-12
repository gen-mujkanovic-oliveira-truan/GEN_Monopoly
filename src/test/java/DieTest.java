import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DieTest {


    @RepeatedTest(100)
    public void dieRollMustBeLessThanSeven(){
        Die d = new Die();
        d.roll();
        int tmp = d.getFaceValue();
        assertTrue(7 > tmp, "Value is higher than 7 ");
        assertTrue(0 < tmp, "Value is lower than 0");
    }


    @Test
    public void dieShouldReturnTheRightNumber(){
        Die d = new Die(){
            int faceValue=0;

            @Override
            public void roll() {
                this.faceValue = 6;
            }

            @Override
            public int getFaceValue() {
                return faceValue;
            }
        };
        d.roll();
        int faceValue = d.getFaceValue();
        assertEquals(6,faceValue);
    }

}
