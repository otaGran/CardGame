import java.util.HashMap;
import java.util.Map;

public class Card {

    private String number;
    private String mark;

    private Map<String, String> AJQKMap = new HashMap<String, String>(){{
        put("A", "1");
        put("J", "11");
        put("Q", "12");
        put("K", "13");
    }};

    public String getNumber() {
        return number;
    }

    public String getMark() {
        return mark;
    }

    Card(String cardInfo) {
        number = cardInfo.substring(0, cardInfo.length()-1);
        mark = cardInfo.substring(cardInfo.length()-1);
        if(AJQKMap.containsKey(number))
            number = AJQKMap.get(number);

    }

    public int compareTo(Card card){
        if(card.getNumber().equals(number))
            return 0;
        else if(Integer.parseInt(card.getNumber()) < Integer.parseInt(number))
            return -1;
        else
            return 1;
    }


}
