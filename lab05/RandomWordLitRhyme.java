/**
 * Class that determines a group of rhyming words from an alliterated list
 * @author Green, Collin
 */
public class RandomWordLitRhyme extends RandomWordLit{
    String suffix;

    /**
     * Constructor class for RandomWordLitRhyme 
     * @param seed random seed value
     */
    public RandomWordLitRhyme(long seed){
        super(seed);
        this.suffix = " ";
    }

    /**
     * Generates the next String that fits the criteria
     * @return A generated String
     */
    public String next(){
        //Find next alliterative String
        String out = super.next();
        
        //Return if first String (suffix not defined)
        if(this.suffix.equals(" ")){
            String suff = out.substring(out.length() - 2);
            this.suffix = suff;
        }
        //Loop through and return an alliterative and rhyming String
        else{
            while(!(out.endsWith(this.suffix))){
                out = super.next();
            }
        }
        return out;
    }
}
