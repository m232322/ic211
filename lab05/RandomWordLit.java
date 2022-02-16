/**
 * Class that determines a group of alliterated words from a list
 * @author Green, Collin
 */
public class RandomWordLit extends RandomWord{
    private char allit;

    /**
     * Constructor class for RandomWordLit
     * @param seed value for random seed
     */
    public RandomWordLit(long seed){
        super(seed);
        this.allit = ' ';
    }
    /**
     * Find the next alliterated String in the list
     * @return String that comes next in the list
     */
    public String next(){
        //Call next String from RandomWord
        String out = super.next();

        //Return if it is the first String(allit is not defined)
        if(this.allit == ' '){
            this.allit = out.charAt(0);
            return out;
        }
        //Continue through list until another alliterative String is found
        else{
            while(out.charAt(0) != this.allit){
                out = super.next();
            }
            return out;
        }
    }
}
