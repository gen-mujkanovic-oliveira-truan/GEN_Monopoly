/**
 * Represent a regular Square on the gameBoard without any effects.
 * Authors : Edin Mujkanovic, Daniel Oliveira Paiva, Victor Truan.
 */
public class RegularSquare extends Square {
    /**
     * RegularSquare constructor
     * @param name The name of the Square
     */
    public RegularSquare(String name) {
        super(name);
    }

    @Override
    /**
     * Override of landedOn so it does nothing.
     * @param p The player who just landed on the Square.
     */
    public void landedOn(Player p) {

    }
}
