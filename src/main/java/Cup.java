import java.util.ArrayList;

/**
 * Represent the cup containing multiple dice
 */
public class Cup {
    private int getTotal;
    private ArrayList<Die> dice;

    /**
     * Cup constructor
     * @param nbDice the number of die that the cup will contain
     */
    public Cup(int nbDice){
        this.dice = new ArrayList<>();
        for(int i = 0 ; i < nbDice; ++i){
            this.dice.add(new Die());
        }
    }

    /**
     * Roll the die of the cup
     */
    public void roll(){
        this.getTotal = 0;
        for (Die d: this.dice) {
            d.roll();
            getTotal += d.getFaceValue();
        }
    }

    /**
     * Get the total of the face values of the dice
     * @return
     */
    public int getTotal(){
        return this.getTotal;
    }
}
