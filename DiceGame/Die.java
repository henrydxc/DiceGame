import java.util.ArrayList;

public class Die {
    private int sides;
    private int location;
    private int min;
    private ArrayList<Integer> valuesArray = new ArrayList<>();

    /**
     * creates a die with sides quantity of sides with values from 1 to the quantity of sides;
     * sets the current facing to 1
     * @param sides quantity of sides
     */
    Die(int sides){
        this.sides = sides;
        this.min = 1;
        for (int i=0; i<sides;i++){
            this.valuesArray.add(i,min);
            min++;
        }
        setFacing(0);
    }

    /**
     *creates a die with sides quantity of sides with values from min to (the quantity of sides + min – 1)
     * sets the current facing to min
     * @param sides quantity of sides
     * @param min the minimum value of the dice
     */
    Die(int sides, int min){
        this.sides = sides;
        this.min = min;
        for (int i=0; i<sides;i++){
            valuesArray.add(i,min);
            min++;
        }
        setFacing(0);
    }

    /**
     *  creates a die with values as enumerated from valuesArray with the sides quantity as the size of the ArrayList
     *  sets the current facing to the facing represented by the first value occurrence within ArrayList
     * @param valuesArray the arraylist contains the values of the dice
     */
    Die(ArrayList<Integer> valuesArray){
        this.sides = valuesArray.size();
        this.valuesArray = valuesArray;
        setFacing(0);
    }

    /**
     *  creates a die with 1 side with a value of 1, facing to 1.
     */
    public Die(){
        this.sides = 1;
        this.valuesArray.add(1);
        setFacing(0);
    }
    /**
     * sets the current location to the facing at sideLocation
     * @param sideLocation
     */
    void setFacing(int sideLocation){
       try {
           location = sideLocation;
       }catch(Exception e){
           System.out.println(e.getMessage());
        }
    }

    /**
     * a representation of the Die
     * @return a representation of the Die as <quantity of sides> +  “ “ + <first value > + “:” + <second value> + …
     */
    public String toString(){
        String values="";
        for(int i=0; i<valuesArray.size();i++){
            values += valuesArray.get(i)+":";
        }
        return sides+" "+values;
    }

    /**
     * get the number of sides
     * @return sides the dice has
     */
    int getQuantityOfSides(){
        return sides;
    }

    /**
     * get value of given position
     * @param sideLocation the location of which you want to know the value
     * @return the value of the given location
     */
    int getValueAt(int sideLocation) {
        try {
            return valuesArray.get(sideLocation - 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return valuesArray.get(sideLocation-1);
    }

    /**
     * get the current value of the dice
     * @return current value of the dice
     */
    int getCurrentValue(){
        return valuesArray.get(location);
    }

    /**
     * simulation of rolling the dice
     * @return the current value of the dice after rolling it
     */
    int rollDie(){
        location = (int) (Math.random()*valuesArray.size());
        return valuesArray.get(location);
    }

    /**
     * compare two dices' current value, true for equal
     * @param d1
     * @param d2
     * @return the result of comparing
     */
    boolean compareDieValue(Die d1, Die d2){
        return d1.getCurrentValue()==d2.getCurrentValue();
    }

    /**
     * comparing two dices' quantities of sides
     * @param d1 the first dice to compare
     * @param d2 the second dice to compare
     * @return the result of comparing
     */
    boolean compareQuantityOfSides(Die d1, Die d2){
        return d1.sides==d2.sides;
    }

    /**
     * comparing two dices to tell if they are the same
     * @param d1 the first dice to compare
     * @param d2 the second dice to compare
     * @return the result of comparing
     */
    boolean compareDice(Die d1, Die d2){
        return d1.sides==d2.sides && d1.valuesArray.equals(d2.valuesArray);
    }

    /**
     * comparing two diec to tell whether they are the same and have the same current value
     * @param d1 the first dice to compare
     * @param d2 the second dice to compare
     * @return the result of comparing
     */
    boolean compareTo(Die d1, Die d2){
        return d1.sides==d2.sides && d1.valuesArray.equals(d2.valuesArray)
                && d1.valuesArray.get(d1.location)==d2.valuesArray.get(d2.location);
    }
}