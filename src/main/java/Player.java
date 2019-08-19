import java.util.*;
import java.util.stream.Collectors;

public class Player {

    private List<Card> cards;
    private int level;
    private List<Map.Entry<String,Integer>> countedCards;
    private int maxNumber;


    Player(List<Card> cards) {
        this.cards = cards;
        countCards();
        maxNumber = this.cards.stream().mapToInt(x -> Integer.parseInt(x.getNumber())).max().orElse(-1);


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
        if(hasStraight())
            return 5;
        if(hasThree())
            return 4;
        if(hasTwoPair())
            return 3;
        if(hasPair())
            return 2;


        return 1;

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
            if( entry.getValue() == 2) {
                maxNumber = Integer.parseInt(entry.getKey());
                return true;
            }
        }
        return false;
    }

    public boolean hasThree() {
        for (Map.Entry<String, Integer> entry : countedCards) {
            if( entry.getValue() == 3) {
                maxNumber = Integer.parseInt(entry.getKey());
                return true;
            }
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
        boolean res =  countedCards.stream().filter(x -> x.getValue() == 2).count() == 2;
        if(res)
            maxNumber = countedCards.stream().filter(x -> x.getValue() == 2).mapToInt(x -> Integer.parseInt(x.getKey())).max().orElse(-1);
        return res;
    }

    public boolean hasFullHouse() {
        return hasPair() && hasThree();
    }

    public boolean hasStraight() {
        int maxValue = countedCards.stream().mapToInt(x -> Integer.parseInt(x.getKey())).max().orElse(-1);
        int minValue = countedCards.stream().mapToInt(x -> Integer.parseInt(x.getKey())).min().orElse(-1);
        return countedCards.stream().filter(x -> x.getValue() == 1).count() == 5 && maxValue-minValue ==4;
    }

    public int getMaxNumber(){

        getLevel();
        return maxNumber;
    }
}
