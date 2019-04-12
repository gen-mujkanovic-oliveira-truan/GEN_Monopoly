public class Player {
    private String name;
    private Piece piece;
    private Die[] dice;
    private Board board;

    Player(String name, Die[] dice, Board board){
        this.name = name;
        this.piece = new Piece("Piece of " + name, board.getSquare(null,0));
        this.dice = dice;
        this.board = board;

    }

    public void takeTurn(){
        int fvTot = 0;
        for (Die d: this.dice) {
            d.roll();
            fvTot += d.getFaceValue();
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc,fvTot);
        piece.setLocation(newLoc);

    }


}
