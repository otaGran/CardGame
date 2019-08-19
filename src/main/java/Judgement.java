public class Judgement {
    Judgement(){

    }

    public String judge(Player player1, Player player2){
        int players1Level = player1.getLevel();
        int players2Level = player2.getLevel();

        if(players1Level == players2Level){

        }
        else{
            if(players1Level > players2Level)
                return "Player 1 win";
            else
                return "Player 2 win";
        }
    }
}
