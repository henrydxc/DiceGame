import java.util.*;
public class DieTower extends Die {
    private ArrayList<Die> diceTower = new ArrayList<>();

    DieTower(){

    }
    void addDie(Die newDie){
        try{
            diceTower.add(newDie);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    void emptyDieTower(){
        diceTower = new ArrayList<>();
    }
    public String toString(){
        String information="";
        for(int i=0;i<diceTower.size();i++){
            information += diceTower.get(i).toString()+":";
        }
        return "DiceTower"+"::"+information;
    }
    int getDiceQuantity(){
        return diceTower.size();
    }

    int getTotal(){
        int total=0;
        for(int i=0;i<diceTower.size();i++){
            total+=diceTower.get(i).getCurrentValue();
        }
        return total;
    }

    Die getDie(int diePosition){
        try{
            return diceTower.get(diePosition);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return diceTower.get(diePosition);
    }

    ArrayList<Integer> getCurrentValues(){
        ArrayList<Integer> values = new ArrayList<>();
        for(int i=0; i<diceTower.size();i++){
            values.add(diceTower.get(i).getCurrentValue());
        }
        return values;
    }
    void roll(){
        for(int i=0;i<diceTower.size();i++){
            diceTower.get(i).rollDie();
        }
    }
    private void swapDice(int a, int b){
        Die temp = new Die();
        temp = diceTower.get(a);
        diceTower.set(a,diceTower.get(b));
        diceTower.set(b,temp);
    }
    boolean compareTo(DieTower dt1,DieTower dt2){
        return dt1.diceTower==dt2.diceTower&&dt1.getCurrentValues()==dt2.getCurrentValues();
    }
}
