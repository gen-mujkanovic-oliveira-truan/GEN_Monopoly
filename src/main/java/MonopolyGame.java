import java.util.ArrayList;

public class MonopolyGame {
    private Board board;
    private Cup cup;
    private ArrayList<Player> players;
    private int roundCnt;

    public MonopolyGame(int nbPlayers){
        this.board = new Board();
        this.roundCnt = 0;
        this.cup = new Cup(3);
        this.players = new ArrayList<>();
        if(nbPlayers < 2 || nbPlayers > 8){
            throw new RuntimeException("The number of players must be between 2 and 8 !");
        }
        for(int i = 1; i <= nbPlayers; ++i){
            this.players.add(new Player("Player " + i,cup, board));
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
