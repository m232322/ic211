public class BudgetEvent {
    private String name;
    private MyDate start;
    private int recurring;
    private boolean days;
    private MyDate end;
    
    public BudgetEvent(String n, MyDate s, int r, boolean d, MyDate e){
        this.name = n;
        this.start = s;
        this.recurring = r;
        this.days = d;
        this.end = e;
    }

    public boolean happensToday(MyDate check){
        if(check.daysUntil(this.end) > 0 && check.daysUntil(this.start) < 0){
            MyDate clone = start.clone();
            while(clone.daysUntil(this.end) > 0){
                if(clone.daysUntil(check) == 0){
                    return true;
                }
                if(this.days){
                    clone.incDay(recurring);
                }
                else{
                    clone.incMonth(recurring);
                }
            }
            return false;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return this.name;
    }
}
