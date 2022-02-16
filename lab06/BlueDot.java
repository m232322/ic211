import java.util.Random;

public class BlueDot extends MovingDot{
    private int count;
    
    public BlueDot(int r, int c){
        super(r,c);
        this.dir = 's';
        this.count = 0;
    }
    public void step(){
        Random rand = new Random();
        this.count++;
        if(this.count == 10){
            this.count = 0;
            int direction = rand.nextInt(3);
            if(direction == 0){
                this.dir = 'l';
            }
            else if(direction == 1){
                this.dir = 's';
            }
            else{
                this.dir = 'r';
            }
        }
        super.step();
    }

    public String toString(){
        return super.toString() + " b";
    }
}
