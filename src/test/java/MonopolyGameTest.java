import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MonopolyGameTest {
    /**
     * Test if a monopoly game does not stop too early or too late.
     */
    @Test
    public void aMonopolyGameMustPlayTheSpecifiedNumberOfRound(){
        MonopolyGame mp = new MonopolyGame(2);
        mp.playGame(20);
        assertEquals(20, mp.getRoundCnt());

    }

    /**
     * Test if the number of player is the one expected.
     */
    @Test
    public void aMonpolyGameMustHaveTheSpecifiedNumberOfPlayers(){
        MonopolyGame mp = new MonopolyGame(2);
        assertEquals(2, mp.getNbPlayer());
    }

    /**
     * Test that we can't create a game with too many of too few players.
     */
    @Test
    public void aMonopolyGameMustThrowExceptionForIncorrectNumberOfPlayers(){
        assertThrows(RuntimeException.class, () -> {
            new MonopolyGame(-1);
        });

        assertThrows(RuntimeException.class, () -> {
            new MonopolyGame(10);
        });


    }
}
