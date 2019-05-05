/**
 * Represent A piece on the board.
 * Authors : Edin Mujkanovic, Daniel Oliveira Paiva, Victor Truan.
 */
public class Piece {
    private String name;
    private Square location;

    /**
     * Piece constructor
     * @param name The name of the piece
     * @param location A Square which is the start location
     */
    public Piece(String name, Square location){
        this.name = name;
        this.location = location;
    }

    /**
     * Return the location of the piece
     * @return A Square which is the location of the piece
     */
    public Square getLocation() {
        return location;
    }

    /**
     * Set the location of the piece at the newLoc param.
     * @param newLoc A Square to which the piece is going to move.
     */
    public void setLocation(Square newLoc){
        this.location = newLoc;
    }
}
