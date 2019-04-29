public class GoToJailSquare extends Square {
    public GoToJailSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        p.setLocation(p.getBoard().getSquareAtPos(10));
    }
}
