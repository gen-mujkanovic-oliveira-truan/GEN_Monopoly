/**
 * Abstract class to represent a Square on a board.
 */
public abstract class Square {
    private String name;

    /**
     * Constructor used by the child class.
     * @param name The name of the Square
     */
    public Square(String name){
        this.name = name;
    }

    /**
     * Override of toString so it return the name of the Square.
     * @return The name of the square.
     */
    @Override
    public String toString(){
        return name;
    }

    /**
     * Abstract function that must be implemented in the child class.
     * @param p The player who just landed on the Square.
     */
    public abstract void landedOn(Player p);
}
