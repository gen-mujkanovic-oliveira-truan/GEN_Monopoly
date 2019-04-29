import java.util.ArrayList;

public class MonopolyGame {
    private Board board;
    private Die[] dice;
    private ArrayList<Player> players;
    private int roundCnt;

    MonopolyGame(int nbPlayers){
        this.board = new Board();
        this.dice = new Die[] {new Die(), new Die()};
        this.roundCnt = 0;
        this.players = new ArrayList<>();
        if(nbPlayers < 2 || nbPlayers > 8){
            throw new RuntimeException("The number of players must be between 2 and 8 !");
        }
        for(int i = 1; i <= nbPlayers; ++i){
            this.players.add(new Player("Player " + i,this.dice, board));
        }
    }

    public void playGame(int nbRound){
        while(roundCnt < nbRound){
            playRound();
            ++roundCnt;
        }
        System.out.println("Game finished ! ");
    }

    private void playRound(){
        for (Player p: players ) {
            p.takeTurn();
        }
    }

    public int getRoundCnt() {
        return roundCnt;
    }

    public int getNbPlayer(){
        return this.players.size();
    }
}
