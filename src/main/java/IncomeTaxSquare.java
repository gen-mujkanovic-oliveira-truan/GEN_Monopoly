/**
 * Represent a Square where you have to pay if you land on it.
 */
public class IncomeTaxSquare extends Square {
    /**
     * IncomeTaxSquare constructor
     * @param name The name of the Square
     */
    public IncomeTaxSquare(String name) {
        super(name);
    }

    @Override
    /**
     * Override of landedOn so the IncomeTaxSquare remove some cash from the player.
     * @param p The player who just landed on the Square.
     */
    public void landedOn(Player p) {
        p.reduceCash(Integer.min(200,(p.getNetWorth() / 10)));
    }
}
