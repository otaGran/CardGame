import java.util.*;
import java.util.stream.Collectors;

public class Player {

    private List<Card> cards;
    private int level;
    private List<Map.Entry<String,Integer>> countedCards;


    Player(List<Card> cards) {
        this.cards = cards;
        countCards();

    }

    public List<Card> getCards() {
        return cards;
    }

    public int getLevel() {
        return 2;
    }


    private void countCards(){
        countedCards = new ArrayList<>(this.cards.stream()
                .map(Card::getNumber)
                .collect(Collectors.toMap(poker -> poker, poker -> 1, Integer::sum))
                .entrySet());
        countedCards.sort(new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue()) * -1;
            }

        });
    }

    public boolean hasPair() {
        for (Map.Entry<String, Integer> entry : countedCards) {
            if( entry.getValue() == 2)
                return true;
        }
        return false;
    }

    public boolean hasThree() {
        for (Map.Entry<String, Integer> entry : countedCards) {
            if( entry.getValue() == 3)
                return true;
        }
        return false;
    }

    public boolean hasFour() {
        for (Map.Entry<String, Integer> entry : countedCards) {
            if( entry.getValue() == 4)
                return true;
        }
        return false;
    }
}
