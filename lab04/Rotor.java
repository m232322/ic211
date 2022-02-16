/**
 * Models a rotor in the Enigma machine
 * @author Green, Collin
 */
public class Rotor {
    private String full;
    private char top;
    
    /**
     * Constructor method for Rotor
     * @param fullstring 27-character string for the rotor
     */
    public Rotor(String fullstring){
        this.full = fullstring;
        char top = full.charAt(0);
    }

    /**
     * Return the index of a character on a rotor wheel
     * @param a char to find on wheel
     * @return int index of the char
     */
    public int indexOf(char a){
        return this.full.indexOf(a);
    }

    /**
     * Returns the character at a specified index on the wheel
     * @param index int index to find char at
     * @return char at specified index
     */
    public char charAt(int index){
        return this.full.charAt(index);
    }

    /**
     * Rotate the rotor by a specified number
     * @param num Number of clicks to rotate
     */
    public void rotate(int num){
        while(num > 0){
            this.full = this.charAt(26) + this.full.substring(0,26);
            num -= 1;
        }
    }

    /**
     * Rotate the rotor to a specified char
     * @param a char to rotate to
     */
    public void rotate(char a){
        while(this.top != a){
            this.full = this.charAt(26) + this.full.substring(0,26);
            this.top = this.full.charAt(0);
        }
    }

    /**
     * Get the string of the rotor in order
     * @return rotor string
     */
    public String getFull(){
        return this.full;
    }
}
