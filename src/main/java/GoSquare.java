/**
 * Represent the start square of the game. You win money if you land on it.
 */
public class GoSquare extends Square {
    /**
     * GoSquare constructor
     * @param name The name of the square
     */
    public GoSquare(String name) {
        super(name);
    }

    @Override
    /**
     * Override of landedOn so the GoSquare add cash to the player.
     * @param p The player who just landed on the Square.
     */
    public void landedOn(Player p) {
        p.addCash(200);
    }
}
