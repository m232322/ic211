import java.util.Random;
public class GreenDot extends MovingDot{
    private int count;
    public GreenDot(int r, int c){
        super(r,c);
        this.dir = 's';
        this.count = 0;
    }
    public void step(){
        Random rand = new Random();
        this.count++;
        if(this.count == 5){
            this.count = 0;
            int direction = rand.nextInt(4);
            if(direction == 0){
                this.dir = 'l';
            }
            else if(direction == 1){
                this.dir = 's';
            }
            else if(direction == 2){
                this.dir = 'r';
            }
            else{
                this.dir = 'b';
            }
        }
        if (dir == 'l'){
            this.decCol();
            this.incRow();
        }
        else if (dir == 's'){
            this.incCol();
            this.incRow();
        }
        else if(dir == 'r'){
            this.incCol();
            this.decRow();
        }
        else{
            this.decCol();
            this.decRow();
        }    
    }
    public String toString(){
        return super.toString() + " g";
    }
}

