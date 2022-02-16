import java.util.Random;

public class RedDot extends MovingDot{
    public RedDot(int r, int c){
        super(r,c);
        this.dir = 's';
    }

    public void step(){
        Random rand = new Random();
        int direction = rand.nextInt(3);
        if(direction == 0){
            this.dir = 'l';
            System.out.println('l');
        }
        else if(direction == 1){
            this.dir = 's';
            System.out.println('s');
        }
        else{
            this.dir = 'r';
            System.out.println('r');
        }
        super.step();
    }

    public String toString(){
        return super.toString() + " r";
    }
}
