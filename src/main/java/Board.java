import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    private ArrayList<Square> squaresArray;

    Board(){
        this.squaresArray = new ArrayList<Square>();
        squaresArray.add(new Square("GO"));
        for(int i = 1; i < 40; ++i){
            squaresArray.add(new Square("Square " + i));
        }
    }

    public Square getSquare(Square oldLoc, int fvTot){

        if(oldLoc == null){
            oldLoc = squaresArray.get(0);
        }

        return squaresArray.get((squaresArray.indexOf(oldLoc)+fvTot ) % squaresArray.size());
    }
}
