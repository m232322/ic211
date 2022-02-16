public class MovingDot extends Dot{
    
    //s for straight, b for back, l for left, r for right
    protected char dir;

    // a constructor that takes row and column position as integers
    public MovingDot(int r, int c){
        super(r, c);
        this.dir = 's';
    }

    // a step method that moves the Dot in the direction that it is facing
    public void step(){
        if(this.dir == 's'){
            this.incRow();
        }
        else if(this.dir == 'b'){
            this.decRow();
        }
        else if(this.dir == 'l'){
            this.decCol();
        }
        else{
            this.incCol();
        }
    }

    public String toString(){
        return super.toString() + " " + this.dir;
    }
}
