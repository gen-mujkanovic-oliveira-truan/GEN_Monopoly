import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test some implementations of non abstracts squares.
 * Authors : Edin Mujkanovic, Daniel Oliveira Paiva, Victor Truan.
 */
public class SquareTest {

    /**
     * Test if a player truly win money if he lands on the Go Square.
     */
    @Test
    public void aGoSquareShouldAddMoneyToThePlayer(){
        GoSquare tmpGoSquare = new GoSquare("GO");
        Player p = new Player("TestPlayer", new Cup(2), new Board());
        Piece tmpPiece = p.getPiece();
        int cash = p.getNetWorth();
        p.setLocation(tmpGoSquare);
        tmpPiece.getLocation().landedOn(p);
        assertFalse(cash == p.getNetWorth());
        assertEquals(cash + 200, p.getNetWorth());
    }

    /**
     * Test if a player is sent to the correct Jail if he lands on the Go To Jail Square.
     */
    @Test
    public void GoToJailSquareShouldPutThePlayerInJail(){
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

    /**
     * Test if a player pays the correct amount of money if he lands on the Tax Square.
     */
    @Test
    public void TheTaxSquareShouldRemoveSomeMoneyFromThePlayer(){
        IncomeTaxSquare tmpIncomeTax = new IncomeTaxSquare("TAX");
        Player p = new Player("TestPlayer", new Cup(2), new Board());
        Piece piece = p.getPiece();
        int tmpCash = p.getNetWorth();
        p.setLocation(tmpIncomeTax);
        piece.getLocation().landedOn(p);
        int expectedTax = Integer.min(tmpCash/10,200);

        assertEquals(tmpCash - expectedTax, p.getNetWorth());
    }
}
