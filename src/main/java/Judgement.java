public class Judgement {
    Judgement(){

    }

    public String judge(Player player1, Player player2){
        int players1Level = player1.getLevel();
        int players2Level = player2.getLevel();
        int players1MaxNumber = player1.getMaxNumber();
        int players2MaxNumber = player2.getMaxNumber();

        System.out.println(players1Level+"   "+players2Level);

        if(players1Level == players2Level && players1MaxNumber == players2MaxNumber){
            return "Draw";
        }
        else{
            if(players1Level > players2Level || (players1Level == players2Level && players1MaxNumber > players2MaxNumber))
                return "Player 1 win";
            else
                return "Player 2 win";
        }
    }
}
