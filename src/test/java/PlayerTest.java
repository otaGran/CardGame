import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void should_return_all_cards_player_had_when_call_getCards(){
        Card card1 = new Card("AH");
        Card card2 = new Card("2H");
        Card card3 = new Card("3H");
        Card card4 = new Card("4H");
        Card card5 = new Card("5H");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(cardList, player.getCards());
    }

    @Test
    public void should_return_2_when_players_has_only_one_pair(){
        Card card1 = new Card("2H");
        Card card2 = new Card("2H");
        Card card3 = new Card("6H");
        Card card4 = new Card("AH");
        Card card5 = new Card("5H");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(2, player.getLevel());
    }

    @Test
    public void should_return_true_when_players_has_one_pair(){
        Card card1 = new Card("2H");
        Card card2 = new Card("2H");
        Card card3 = new Card("6H");
        Card card4 = new Card("AH");
        Card card5 = new Card("5H");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertTrue( player.hasPair());
    }

    @Test
    public void should_return_true_when_players_has_three_of_a_kind(){
        Card card1 = new Card("2H");
        Card card2 = new Card("2H");
        Card card3 = new Card("2H");
        Card card4 = new Card("AH");
        Card card5 = new Card("5H");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertTrue( player.hasThree());
    }
    @Test
    public void should_return_true_when_players_has_four_of_a_kind(){
        Card card1 = new Card("2H");
        Card card2 = new Card("2H");
        Card card3 = new Card("2H");
        Card card4 = new Card("2H");
        Card card5 = new Card("5H");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertTrue( player.hasFour());
    }

    @Test
    public void should_return_true_when_players_has_flush(){
        Card card1 = new Card("2H");
        Card card2 = new Card("2H");
        Card card3 = new Card("2H");
        Card card4 = new Card("2H");
        Card card5 = new Card("5H");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertTrue( player.hasFlush());
    }

    @Test
    public void should_return_true_when_players_has_two_pair(){
        Card card1 = new Card("2H");
        Card card2 = new Card("2H");
        Card card3 = new Card("5H");
        Card card4 = new Card("6H");
        Card card5 = new Card("5H");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertTrue( player.hasTwoPair());

    }

    @Test
    public void should_return_true_when_players_has_full_house(){
        Card card1 = new Card("2H");
        Card card2 = new Card("2H");
        Card card3 = new Card("5H");
        Card card4 = new Card("2H");
        Card card5 = new Card("5H");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertTrue( player.hasFullHouse());
    }

    @Test
    public void should_return_true_when_players_has_straight(){
        Card card1 = new Card("9H");
        Card card2 = new Card("10H");
        Card card3 = new Card("JH");
        Card card4 = new Card("QH");
        Card card5 = new Card("KH");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertTrue( player.hasStraight());
    }
    @Test
    public void should_return_9_when_players_has_straight_flush(){
        Card card1 = new Card("9H");
        Card card2 = new Card("10H");
        Card card3 = new Card("JH");
        Card card4 = new Card("QH");
        Card card5 = new Card("KH");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(9, player.getLevel());
    }


}