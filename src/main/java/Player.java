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
        if(hasStraight() && hasFlush())
            return 9;
        if(hasFour())
            return 8;
        if(hasFullHouse())
            return 7;
        if(hasFlush())
            return 6;


        return -1;

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

    public boolean hasFlush() {
        Set<String> keyset = new HashSet<>();
        for (Card card: cards) {
            keyset.add(card.getMark());
        }
        return keyset.size() == 1;
    }

    public boolean hasTwoPair() {
        return countedCards.stream().filter(x -> x.getValue() == 2).count() == 2;
    }

    public boolean hasFullHouse() {
        return hasPair() && hasThree();
    }

    public boolean hasStraight() {
        int maxValue = countedCards.stream().mapToInt(x -> Integer.parseInt(x.getKey())).max().orElse(-1);
        int minValue = countedCards.stream().mapToInt(x -> Integer.parseInt(x.getKey())).min().orElse(-1);
        return countedCards.stream().filter(x -> x.getValue() == 1).count() == 5 && maxValue-minValue ==4;
    }
}
