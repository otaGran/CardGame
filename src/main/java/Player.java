import java.util.List;

public class Player {

    private List<Card> cards;
    Player(List<Card> cards){
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }
}
