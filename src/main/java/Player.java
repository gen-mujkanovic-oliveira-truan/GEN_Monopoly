public class Player {
    private String name;
    private Piece piece;
    private Cup cup;
    private Board board;
    private int cash;

    public Player(String name, Cup cup, Board board){
        this.name = name;
        this.piece = new Piece("Piece of " + name, board.getSquare(null,0));
        this.cup = cup;
        this.board = board;
        this.cash = 1500;
    }

    public void takeTurn(){
        int fvTot = 0;
        cup.roll();
        fvTot = cup.getTotal();
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc,fvTot);
        this.piece.setLocation(newLoc);
        this.piece.getLocation().landedOn(this);
    }

    public void addCash(int cash){
        this.cash += cash;
    }

    public void reduceCash(int cash){
        this.cash -= cash;
    }

    public int getNetWorth(){
        return this.cash;
    }

    public void setLocation(Square newLoc){
        this.piece.setLocation(newLoc);
    }

    public Board getBoard(){
        return this.board;
    }

    public Piece getPiece(){
        return this.piece;
    }

    public String toString(){
        return this.name + ": " + this.cash;
    }
}
