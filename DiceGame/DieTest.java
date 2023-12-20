import java.util.ArrayList;

public class DieTest {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);a.add(5);a.add(7);a.add(9);
        Die d1 = new Die();
        Die d2 = new Die(5);
        Die d3 = new Die(5,5);
        Die d4 = new Die(a);
        System.out.println("dice 1: "+d1.toString());
        System.out.println("dice 2: "+d2.toString());
        System.out.println("dice 3: "+d3.toString());
        System.out.println("dice 4: "+d4.toString());
        System.out.println("dice 2 current value: "+d2.getCurrentValue());
        System.out.println("Now rolling dice two...");
        d2.rollDie();
        System.out.println("Dice 2 value after rolling: "+d2.getCurrentValue());
        System.out.println("Dice 3 current value: "+d3.getCurrentValue());
        System.out.println("Now set facing of dice3 to location 2(begin at 0)...");
        d3.setFacing(2);
        System.out.println("Dice 3 value after set facing: " + d3.getCurrentValue());
        System.out.println("following shows the result of four compare methods: (suppose to be F,T,F,F)");
        if(d1.compareDice(d1,d2)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        if(d1.compareQuantityOfSides(d2,d3)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        if(d1.compareTo(d2,d3)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        if(d1.compareDieValue(d1,d4)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

    }
}
