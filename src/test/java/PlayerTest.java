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
}