import java.util.ArrayList;

public class Cup {
    private int getTotal;
    private ArrayList<Die> dice;

    public Cup(int nbDice){
        this.dice = new ArrayList<>();
        for(int i = 0 ; i < nbDice; ++i){
            this.dice.add(new Die());
        }
    }

    public void roll(){
        this.getTotal = 0;
        for (Die d: this.dice) {
            d.roll();
            getTotal += d.getFaceValue();
        }
    }

    public int getTotal(){
        return this.getTotal;
    }
}
