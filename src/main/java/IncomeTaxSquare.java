public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        p.reduceCash(Integer.min(200,(p.getNetWorth() / 10)));
    }
}
