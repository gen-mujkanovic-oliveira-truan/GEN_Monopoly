import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test some functionality for the player.
 * Authors : Edin Mujkanovic, Daniel Oliveira Paiva, Victor Truan.
 */
public class PlayerTest {

    /**
     * Test if a player has the correct name
     */
    @Test
    public void aPlayerShouldHaveTheCorrectName(){
        Player p = new Player("Nicolas", new Cup(2), new Board());
        assertEquals(p.getName(),"Nicolas");
    }
    /**
     * Test if a player start with the good amount of money.
     */
    @BeforeEach
    public void aPlayerShouldStartTheGameWith1500OfCash(){
        Player p = new Player("TestPlayer", new Cup(2), new Board());
        assertEquals(1500,p.getNetWorth());
    }

}
