

import org.junit.Test;

import static org.junit.Assert.*;


public class CardTest {
    @Test
    public void should_get_card_number_when_call_getNumber() {
        Card card = new Card("2H");
        assertEquals(card.getNumber(), "2");
    }

    @Test
    public void should_get_card_mark_when_call_getMark() {
        Card card = new Card("2H");
        assertEquals(card.getMark(), "H");
    }

    @Test
    public void should_return_1_when_cardA_bigger_than_cardB(){
        Card cardA = new Card("3H");
        Card cardB = new Card("2H");

        assertTrue(cardA.compareTo(cardB));
    }

}