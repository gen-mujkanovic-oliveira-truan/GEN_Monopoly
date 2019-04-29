import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class BoardTest {

    @Test
    public void theNewLocationMustBeTheOldLocationMoreOffset(){
        Board b = new Board();
        Square s = b.getSquare(null,0);

        ArrayList<Square> squares = new ArrayList<Square>();
        squares.add(new Square("GO"));
        for(int i = 1; i < 40; ++i){
            squares.add(new Square("Square " + i));
        }

        int index = 0;
        //deplacements possibles
        for(int i = 2; i < 13; ++i){
            s = b.getSquare(s,i);
            index = (i + index) % 40;
            assertEquals(s.toString(), squares.get(index).toString());

        }
    }

    @Test
    public void aBoardShouldReturnFirstSquare(){
        Board b = new Board();
        Square s = b.getSquare(null,0);
        assertEquals("GO",s.toString());
    }


}
