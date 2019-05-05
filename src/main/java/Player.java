/**
 * Represent a Player in the game.
 * Authors : Edin Mujkanovic, Daniel Oliveira Paiva, Victor Truan.
 */
public class Player {
    private String name;
    private Piece piece;
    private Cup cup;
    private Board board;
    private int cash;

    /**
     * Player constructor
     * As it is the player start with 1500 of cash.
     * @param name The name of the player
     * @param cup The cup the player is going to use during the game.
     * @param board Le the on which the game is going to happend.
     */
    public Player(String name, Cup cup, Board board){
        this.name = name;
        this.piece = new Piece("Piece of " + name, board.getSquare(null,0));
        this.cup = cup;
        this.board = board;
        this.cash = 1500;
    }

    /**
     * Make the player play his turn
     *      -Roll the dice
     *      -Move his piece
     *      -Get the Square effect
     */
    public void takeTurn(){
        int fvTot = 0;
        cup.roll();
        fvTot = cup.getTotal();
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc,fvTot);
        this.piece.setLocation(newLoc);
        this.piece.getLocation().landedOn(this);
    }

    /**
     * Add the pass value to the player cash.
     * @param cash The value we want to add to the player.
     */
    public void addCash(int cash){
        this.cash += cash;
    }

    /**
     * Remove the pass value to the player cash.
     * @param cash The value we want to remove from the player.
     */
    public void reduceCash(int cash){
        this.cash -= cash;
    }

    /**
     * Return the current cash of the player.
     * @return The current cash of the player.
     */
    public int getNetWorth(){
        return this.cash;
    }

    /**
     * Set the piece location of the player at the parameter location.
     * @param newLoc The location to which we put the piece.
     */
    public void setLocation(Square newLoc){
        this.piece.setLocation(newLoc);
    }

    /**
     * Return the board on which the player plays.
     * @return The board on which the player plays.
     */
    public Board getBoard(){
        return this.board;
    }

    /**
     * Return the piece of the player.
     * @return The piece of the player.
     */
    public Piece getPiece(){
        return this.piece;
    }

    /**
     * Return the player name and cash total in a String.
     * @return The String which is the player name and cash total.
     */
    public String toString(){
        return this.name + ": " + this.cash;
    }

    /**
     * Return the name of the player
     * @return The String which is the name of the player
     */
    public String getName(){
        return this.name;
    }
}
