import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squaresArray;

    public Board(){
        int i;
        this.squaresArray = new ArrayList<Square>();
        squaresArray.add(new GoSquare("GO"));
        for(i = 1; i < 10; ++i){
            squaresArray.add(new RegularSquare("Square " + i));
        }
        squaresArray.add(new RegularSquare("JAIL"));

        for(; i < 19; ++i){
            squaresArray.add(new RegularSquare("Square " + i));
        }

        squaresArray.add(new IncomeTaxSquare("INCOME TAX SQUARE"));

        for(; i < 28; ++i){
            squaresArray.add(new RegularSquare("Square " + i));
        }

        squaresArray.add(new GoToJailSquare("GO TO JAIL"));

        for(; i < 37; ++i){
            squaresArray.add(new RegularSquare("Square " + i));
        }
    }

    public Square getSquare(Square oldLoc, int fvTot){

        if(oldLoc == null){
            oldLoc = squaresArray.get(0);
        }

        return squaresArray.get((squaresArray.indexOf(oldLoc)+fvTot ) % squaresArray.size());
    }

    public Square getSquareAtPos(int pos){
        return squaresArray.get(pos % squaresArray.size());
    }
}
