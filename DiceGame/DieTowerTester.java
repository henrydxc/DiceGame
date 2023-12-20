public class DieTowerTester {
    public static void main(String[] args) {
        DieTower dt1 = new DieTower();
        DieTower dt2 = new DieTower();
        Die d1 = new Die();
        Die d2 = new Die(5);
        Die d3 = new Die(5, 5);
        Die d4 = new Die(6, 6);
        dt1.addDie(d1);
        dt1.addDie(d2);
        dt1.addDie(d3);
        dt1.addDie(d4);
        dt2 = dt1;
        System.out.println(dt1.getTotal());
        System.out.println(dt1.getDiceQuantity());
        System.out.println(dt1.toString());
        dt1.roll();
        if(dt1.compareTo(dt1,dt2)){
            System.out.println("same");
        }else{
            System.out.println("not the same");
        }
        dt1.emptyDieTower();
        dt1.addDie(d1);
        System.out.println(dt1.toString());
    }
}
