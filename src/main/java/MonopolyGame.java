import java.util.ArrayList;

/**
 * Represent a game of Monopoly.
 * Authors : Edin Mujkanovic, Daniel Oliveira Paiva, Victor Truan.
 */
public class MonopolyGame {
    private Board board;
    private Cup cup;
    private ArrayList<Player> players;
    private int roundCnt;

    /**
     * Constructor of a monopoly game.
     * @param nbPlayers The number of player for the game. It must be between 2 and 8.
     */
    public MonopolyGame(int nbPlayers){
        this.board = new Board();
        this.roundCnt = 0;
        this.cup = new Cup(2);
        this.players = new ArrayList<>();
        if(nbPlayers < 2 || nbPlayers > 8){
            throw new RuntimeException("The number of players must be between 2 and 8 !");
        }
        for(int i = 1; i <= nbPlayers; ++i){
            this.players.add(new Player("Player " + i,cup, board));
        }
    }

    /**
     * Play a Monopoly games based. Each player is going to play nbRound turn.
     * @param nbRound The total number of turn for the game.
     */
    public void playGame(int nbRound){
        while(roundCnt < nbRound){
            playRound();
            ++roundCnt;
        }
        System.out.println("Game finished ! ");
        System.out.println("Results:");
        for (Player p : this.players) {
            System.out.println(p);
        }
    }

    /**
     * Make all the player in the current game play their turn.
     */
    private void playRound(){
        for (Player p: players ) {
            p.takeTurn();
        }
    }

    /**
     * Can be used to get the current turn number.
     * @return The current turn number.
     */
    public int getRoundCnt() {
        return roundCnt;
    }

    /**
     * Can be used to get the number of players in the game.
     * @return The number of players in the game.
     */
    public int getNbPlayer(){
        return this.players.size();
    }


    public static void main(String[] args) {
        MonopolyGame mg = new MonopolyGame(2);
        mg.playGame(20);
    }
}
