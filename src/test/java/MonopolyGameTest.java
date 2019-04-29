import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MonopolyGameTest {

    @Test
    public void aMonopolyGameMustPlayTheSpecifiedNumberOfRound(){
        MonopolyGame mp = new MonopolyGame(2);
        mp.playGame(20);
        assertEquals(20, mp.getRoundCnt());

    }
    @Test
    public void aMonpolyGameMustHaveTheSpecifiedNumberOfPlayers(){
        MonopolyGame mp = new MonopolyGame(2);
        assertEquals(2, mp.getNbPlayer());
    }

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
