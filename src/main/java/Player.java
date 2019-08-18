import java.util.List;

public class Player {

    private List<Card> cards;
    private int level;
    Player(List<Card> cards){
        this.cards = cards;


    }
    public List<Card> getCards() {
        return cards;
    }

    public int getLevel(){
        return 2;
    }
}
