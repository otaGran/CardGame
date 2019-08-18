public class Card {

    private String number;
    private String mark;

    public String getNumber() {
        return number;
    }

    public String getMark() {
        return mark;
    }

    Card(String cardInfo) {
        number = cardInfo.substring(0, 1);
        mark = cardInfo.substring(1);
    }
}
