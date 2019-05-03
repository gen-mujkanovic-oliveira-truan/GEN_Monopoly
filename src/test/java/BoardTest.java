import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class BoardTest {

    /**
     * This test if all the deplacements are legits
     */
    @Test
    public void theNewLocationMustBeTheOldLocationMoreOffset(){
        Board b = new Board();
        Square s = b.getSquareAtPos(0);

        int index = 0;

        //deplacements possibles avec deux dés
        for(int i = 2; i < 13; ++i){
            s = b.getSquare(s,i);
            index = (i + index) % 40;
            assertEquals(s.toString(), b.getSquareAtPos(index).toString());

        }
    }

    /**
     * Check if the board return the right first square
     */
    @Test
    public void aBoardShouldReturnFirstSquare(){
        Board b = new Board();
        Square s = b.getSquare(null,0);
        assertEquals("GO",s.toString());
    }


}
