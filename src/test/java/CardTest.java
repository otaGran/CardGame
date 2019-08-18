

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
    public void should_return_positive_when_cardA_bigger_than_cardB() {
        Card cardA = new Card("2H");
        Card cardB = new Card("3H");

        assertEquals(1 , cardA.compareTo(cardB));
    }
    @Test
    public void should_return_0_when_cardA_equals_to_cardB() {
        Card cardA = new Card("2H");
        Card cardB = new Card("2H");

        assertEquals(0 , cardA.compareTo(cardB));
    }
    @Test
    public void should_return_negative_when_cardA_smaller_than_cardB() {
        Card cardA = new Card("3H");
        Card cardB = new Card("2H");

        assertEquals(-1 , cardA.compareTo(cardB));
    }

}