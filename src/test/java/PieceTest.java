import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test some functionality for the piece.
 * Authors : Edin Mujkanovic, Daniel Oliveira Paiva, Victor Truan.
 */
public class PieceTest {
    /**
     * Before all test we are looking if a piece really start on the good Square.
     */
    @BeforeEach
    public void aPieceShouldStartAtGoSquare(){
        Player p = new Player("TestPlayer",new Cup(2), new Board());
        GoSquare tmpSquare = new GoSquare("GO");
        assertEquals(tmpSquare.toString(),p.getPiece().getLocation().toString());
    }

    /**
     * Test if a piece correctly moves.
     */
    @Test
    public void aPieceMustChangeItsLocationAfterTakingTurn(){
        Piece p = new Piece("pieceTest", new RegularSquare("GO"));
        Square s = new RegularSquare("testSquare");
        p.setLocation(s);
        assertEquals(s,p.getLocation());
    }

    /**
     * Test if a piece moves to the good location.
     */
    @Test
    public void aPieceMustReturnItsTrueSquare(){
        Piece p = new Piece("pieceTest",new RegularSquare("6"));
        Square s = p.getLocation();
        assertEquals("6",s.toString());
    }
}
