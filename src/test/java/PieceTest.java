import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest {

    @Test
    public void aPieceMustChangeItsLocation(){
        Piece p = new Piece("pieceTest", new Square("GO"));
        Square s = new Square("testSquare");
        p.setLocation(s);
        assertEquals(s,p.getLocation());
    }

    @Test
    public void aPieceMustReturnItsTrueSquare(){
        Piece p = new Piece("pieceTest",new Square("6"));
        Square s = p.getLocation();
        assertEquals("6",s.toString());
    }
}
