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

    @Test
    public void should_return_8_when_players_has_four_of_a_kind(){
        Card card1 = new Card("9H");
        Card card2 = new Card("9S");
        Card card3 = new Card("9D");
        Card card4 = new Card("9C");
        Card card5 = new Card("KH");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(8, player.getLevel());
    }

    @Test
    public void should_return_7_when_players_has_full_house(){
        Card card1 = new Card("9H");
        Card card2 = new Card("9S");
        Card card3 = new Card("9D");
        Card card4 = new Card("KC");
        Card card5 = new Card("KH");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(7, player.getLevel());
    }

    @Test
    public void should_return_6_when_players_has_flush(){
        Card card1 = new Card("AH");
        Card card2 = new Card("9H");
        Card card3 = new Card("6H");
        Card card4 = new Card("4H");
        Card card5 = new Card("KH");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(6, player.getLevel());
    }

    @Test
    public void should_return_5_when_players_has_straight(){
        Card card1 = new Card("9H");
        Card card2 = new Card("8S");
        Card card3 = new Card("7D");
        Card card4 = new Card("5C");
        Card card5 = new Card("6H");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(5, player.getLevel());
    }

    @Test
    public void should_return_4_when_players_has_three_of_a_kind(){
        Card card1 = new Card("9H");
        Card card2 = new Card("9S");
        Card card3 = new Card("9D");
        Card card4 = new Card("8C");
        Card card5 = new Card("6H");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(4, player.getLevel());
    }

    @Test
    public void should_return_3_when_players_has_two_pairs(){
        Card card1 = new Card("9H");
        Card card2 = new Card("9S");
        Card card3 = new Card("8D");
        Card card4 = new Card("8C");
        Card card5 = new Card("6H");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(3, player.getLevel());
    }

    @Test
    public void should_return_2_when_players_has_only_one_pair(){
        Card card1 = new Card("2H");
        Card card2 = new Card("2H");
        Card card3 = new Card("6H");
        Card card4 = new Card("AH");
        Card card5 = new Card("5S");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(2, player.getLevel());
    }

    @Test
    public void should_return_1_when_players_has_no_other_suit(){
        Card card1 = new Card("2H");
        Card card2 = new Card("KD");
        Card card3 = new Card("6H");
        Card card4 = new Card("AH");
        Card card5 = new Card("5S");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(1, player.getLevel());
    }

    @Test
    public void shoule_return_maxNumber_when_players_has_no_ohter_suit(){
        Card card1 = new Card("2H");
        Card card2 = new Card("KD");
        Card card3 = new Card("6H");
        Card card4 = new Card("AH");
        Card card5 = new Card("5S");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(13, player.getMaxNumber());
    }

    @Test
    public void shoule_return_maxNumber_when_players_has_a_pair(){
        Card card1 = new Card("2H");
        Card card2 = new Card("2D");
        Card card3 = new Card("6H");
        Card card4 = new Card("AH");
        Card card5 = new Card("5S");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(2, player.getMaxNumber());
    }

    @Test
    public void shoule_return_maxNumber_when_players_has_two_pair(){
        Card card1 = new Card("2H");
        Card card2 = new Card("2D");
        Card card3 = new Card("6H");
        Card card4 = new Card("6H");
        Card card5 = new Card("5S");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(6, player.getMaxNumber());
    }

    @Test
    public void shoule_return_maxNumber_when_players_has_three(){
        Card card1 = new Card("2H");
        Card card2 = new Card("2D");
        Card card3 = new Card("2H");
        Card card4 = new Card("6H");
        Card card5 = new Card("5S");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(2, player.getMaxNumber());
    }

    @Test
    public void shoule_return_maxNumber_when_players_has_straight(){
        Card card1 = new Card("1H");
        Card card2 = new Card("2D");
        Card card3 = new Card("3H");
        Card card4 = new Card("4H");
        Card card5 = new Card("5S");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(5, player.getMaxNumber());
    }

    @Test
    public void shoule_return_maxNumber_when_players_has_flush(){
        Card card1 = new Card("4H");
        Card card2 = new Card("2H");
        Card card3 = new Card("8H");
        Card card4 = new Card("KH");
        Card card5 = new Card("AS");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(13, player.getMaxNumber());
    }

    @Test
    public void shoule_return_maxNumber_when_players_has_full_house(){
        Card card1 = new Card("4H");
        Card card2 = new Card("4S");
        Card card3 = new Card("4D");
        Card card4 = new Card("KH");
        Card card5 = new Card("KS");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(4, player.getMaxNumber());
    }

    @Test
    public void shoule_return_maxNumber_when_players_has_StraightFlush(){
        Card card1 = new Card("6S");
        Card card2 = new Card("5S");
        Card card3 = new Card("4S");
        Card card4 = new Card("3S");
        Card card5 = new Card("2S");
        List<Card> cardList = Arrays.asList(card1, card2, card3, card4, card5);
        Player player = new Player(cardList);
        assertEquals(6, player.getMaxNumber());
    }

}