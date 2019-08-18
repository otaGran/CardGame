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

    public int compareTo(Card card){
        if(card.getNumber().equals(this.number))
            return 0;
        else if(card.getNumber().charAt(0) > this.number.charAt(0))
            return 1;
        else
            return -1;
    }


}
