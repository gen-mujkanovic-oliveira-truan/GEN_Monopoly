import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test some function of the Monopoly Game.
 * Authors : Edin Mujkanovic, Daniel Oliveira Paiva, Victor Truan.
 */
public class MonopolyGameTest {
    /**
     * Test if a monopoly game does not stop too early or too late.
     */
    @ParameterizedTest
    @ValueSource(ints = {1,5,10,20,30,100})
    public void aMonopolyGameMustPlayTheSpecifiedNumberOfRound(int nbRound){
        MonopolyGame mp = new MonopolyGame(2);
        mp.playGame(nbRound);
        assertEquals(nbRound, mp.getRoundCnt());

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
