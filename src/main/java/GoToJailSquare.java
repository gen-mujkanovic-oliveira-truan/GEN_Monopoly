/**
 * Represent a Square where you are put on the jail square if you land on it.
 */
public class GoToJailSquare extends Square {
    /**
     * GoToJailSquare constructor
     * @param name The name of the Square
     */
    public GoToJailSquare(String name) {
        super(name);
    }

    @Override
    /**
     * Override of landedOn so the GoToJailSquare put the player on the Jail square.
     * @param p The player who just landed on the Square.
     */
    public void landedOn(Player p) {
        p.setLocation(p.getBoard().getSquareAtPos(10));
    }
}
