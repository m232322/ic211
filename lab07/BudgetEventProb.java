import java.util.Random;

public class BudgetEventProb extends BudgetEvent{
    private double prob;

    public BudgetEventProb(String n, MyDate s, int r, boolean d, MyDate e, double p){
        super(n,s,r,e);
        this.prob = p;
    }

    public boolean happensToday(MyDate check, Random rand){
        if(super.happensToday(check)){
            return rand.nextDouble()) < prob;
        }
        else{
            return false;
        }
    }
}
