import java.util.ArrayList;

public class Game {
    public static void main(String[] args){
        int score1, score2, total = 0;
        ArrayList<Integer> even = new ArrayList<>();
        even.add(2);
        even.add(4);
        even.add(6);
        even.add(8);
        even.add(10);
        ArrayList<Integer> odd = new ArrayList<>();
        odd.add(3);
        odd.add(5);
        odd.add(7);
        odd.add(9);
        Die evenDice = new Die(even);
        Die oddDice = new Die(odd);
        Die die = new Die(13,1);
        System.out.println("Round 1 Play 1 rolling...");
        evenDice.rollDie();
        die.rollDie();
        score1 = evenDice.getCurrentValue() + die.getCurrentValue();
        System.out.println(score1);
        System.out.println("Player 2 rolling");
        oddDice.rollDie();
        die.rollDie();
        score2 = oddDice.getCurrentValue()+ die.getCurrentValue();
        System.out.println(score2);
        Game.result(score1,score2);
        total = total + Game.scoring(score1,score2);
        System.out.println("Round 2 Play 1 rolling...");
        evenDice.rollDie();
        die.rollDie();
        score1 = evenDice.getCurrentValue() + die.getCurrentValue();
        System.out.println(score1);
        System.out.println("Player 2 rolling");
        oddDice.rollDie();
        die.rollDie();
        score2 = oddDice.getCurrentValue()+ die.getCurrentValue();
        System.out.println(score2);
        Game.result(score1,score2);
        total = total + Game.scoring(score1,score2);
        System.out.println("Round 3 Play 1 rolling...");
        evenDice.rollDie();
        die.rollDie();
        score1 = evenDice.getCurrentValue() + die.getCurrentValue();
        System.out.println(score1);
        System.out.println("Player 2 rolling");
        oddDice.rollDie();
        die.rollDie();
        score2 = oddDice.getCurrentValue()+ die.getCurrentValue();
        System.out.println(score2);
        Game.result(score1,score2);
        total = total + Game.scoring(score1,score2);
        if(total>0){
            System.out.println("Play1 wins most games");
        } else if (total<0) {
            System.out.println("Play2 wins most games");
        }else {
            System.out.println("Tie");
        }
    }
    public static int scoring(int a, int b){
        int s=0;
        if(a>b){
            s++;
        }
        if(a<b){
            s--;
        }
        return s;
    }
    public static void result(int a, int b){
        System.out.println(a+":"+b);
        String result;
        if(a>b){
            result = "Play 1 wins";
        }else if(a<b){
            result = "Play 2 wins";
        }else{
            result = "Tie";
        }
        System.out.println(result);
    }
}
/**
 * Round 1 Play 1 rolling...
 * 12
 * Player 2 rolling
 * 5
 * 12:5
 * Play 1 wins
 * Round 2 Play 1 rolling...
 * 15
 * Player 2 rolling
 * 21
 * 15:21
 * Play 2 wins
 * Round 3 Play 1 rolling...
 * 12
 * Player 2 rolling
 * 6
 * 12:6
 * Play 1 wins
 * Play1 wins most games
 */
