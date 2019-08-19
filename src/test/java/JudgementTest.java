import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class JudgementTest {
    @Test
    public void should_print_Players_1_win_when_reveive_1H2H3H4H5H_1D3D5D6S7D(){

        Card card1 = new Card("1H");
        Card card2 = new Card("2H");
        Card card3 = new Card("3H");
        Card card4 = new Card("4H");
        Card card5 = new Card("5H");
        List<Card> cardList1 = Arrays.asList(card1, card2, card3, card4, card5);
        Player player1 = new Player(cardList1);

        Card card6 = new Card("1D");
        Card card7 = new Card("3D");
        Card card8 = new Card("5D");
        Card card9 = new Card("6S");
        Card card10 = new Card("7D");
        List<Card> cardList2 = Arrays.asList(card1, card2, card3, card4, card5);
        Player player2 = new Player(cardList2);

        Judgement judgement = new Judgement();

        assertEquals("Player 1 win", judgement.judge(player1, player2));
    }

}