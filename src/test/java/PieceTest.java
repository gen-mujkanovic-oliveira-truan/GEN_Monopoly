import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest {

    @BeforeEach
    public void aPieceShouldStartAtGoSquare(){
        Player p = new Player("TestPlayer",new Cup(2), new Board());
        GoSquare tmpSquare = new GoSquare("GO");
        assertEquals(tmpSquare.toString(),p.getPiece().getLocation().toString());
    }
    @Test
    public void aPieceMustChangeItsLocation(){
        Piece p = new Piece("pieceTest", new RegularSquare("GO"));
        Square s = new RegularSquare("testSquare");
        p.setLocation(s);
        assertEquals(s,p.getLocation());
    }

    @Test
    public void aPieceMustReturnItsTrueSquare(){
        Piece p = new Piece("pieceTest",new RegularSquare("6"));
        Square s = p.getLocation();
        assertEquals("6",s.toString());
    }
}
