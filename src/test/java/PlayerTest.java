import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @BeforeEach
    public void aPlayerShouldStartTheGameWith1500OfCash(){
        Player p = new Player("TestPlayer", new Cup(2), new Board());
        assertEquals(1500,p.getNetWorth());
    }

   @Test
    public void aPlayersCashMustIncreaseEachTimeHePassOnGoSquare(){
       GoSquare tmpGoSquare = new GoSquare("GO");
       Player p = new Player("TestPlayer", new Cup(2), new Board());
       Piece tmpPiece = p.getPiece();
       int cash = p.getNetWorth();
       p.setLocation(tmpGoSquare);
       tmpPiece.getLocation().landedOn(p);
       assertFalse(cash == p.getNetWorth());
       assertEquals(cash + 200, p.getNetWorth());
   }

   @Test
    public void ifAPlayerLandOnGoToJailSquareHeHasToGoToJail(){
        GoToJailSquare tmpGoToJail = new GoToJailSquare("GO TO JAIL");
        Player p = new Player("TestPlayer", new Cup(2), new Board());
        Piece piece = p.getPiece();
        p.setLocation(tmpGoToJail);
        piece.getLocation().landedOn(p);

        assertNotEquals(piece.getLocation().getClass().getSimpleName(), "IncomeTaxSquare");
        assertNotEquals(piece.getLocation().getClass().getSimpleName(), "GoToJailSquare");
        assertNotEquals(piece.getLocation().getClass().getSimpleName(), "GoSquare");
        assertEquals(piece.getLocation().getClass().getSimpleName(), "RegularSquare");
        assertEquals(piece.getLocation().toString(), "JAIL");
   }



}
