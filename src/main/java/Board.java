import java.util.ArrayList;

/**
 * Represents a board. Contains different Squares
 * Authors : Edin Mujkanovic, Daniel Oliveira Paiva, Victor Truan.
 */
public class Board {
    private ArrayList<Square> squaresArray;

    /**
     * Board constructor
     */
    public Board(){
        int i;
        this.squaresArray = new ArrayList<Square>();

        //adding the first square
        squaresArray.add(new GoSquare("GO"));

        //adding 9 regular squares
        for(i = 1; i < 10; ++i){
            squaresArray.add(new RegularSquare("Square " + i));
        }

        //adding jail square
        squaresArray.add(new RegularSquare("JAIL"));

        //adding 9 regular squares
        for(; i < 19; ++i){
            squaresArray.add(new RegularSquare("Square " + i));
        }

        //adding the incometax square
        squaresArray.add(new IncomeTaxSquare("INCOME TAX SQUARE"));

        //adding 9 regular squares
        for(; i < 28; ++i){
            squaresArray.add(new RegularSquare("Square " + i));
        }

        //adding the gotojail square
        squaresArray.add(new GoToJailSquare("GO TO JAIL"));

        //adding 9 regular squares
        for(; i < 37; ++i){
            squaresArray.add(new RegularSquare("Square " + i));
        }
    }

    /**
     * Get the square located at oldLoc + offset
     * @param oldLoc Old square location
     * @param fvTot Offset
     * @return the new square
     */
    public Square getSquare(Square oldLoc, int fvTot){

        if(oldLoc == null){
            oldLoc = squaresArray.get(0);
        }

        return squaresArray.get((squaresArray.indexOf(oldLoc)+fvTot ) % squaresArray.size());
    }

    /**
     * Get the square at specific position
     * @param pos position of the square we want to get
     * @return the square at specific position
     */
    public Square getSquareAtPos(int pos){
        return squaresArray.get(pos % squaresArray.size());
    }
}
