import java.util.*;

public class HW3 {
    public static void main(String[] args){
        //Create array of mids
        System.out.print("How many mids? ");
        Scanner in = new Scanner(System.in);
        int num_mids = in.nextInt();
        Mid[] M = new Mid[num_mids];
        for(int i = 0; i < num_mids; i++){
            M[i] =  createMid(in);
        }

        //Output mids in desired company
        System.out.println("What company would you like to print out? ");
        int comp = in.nextInt();
        for(int i = 0; i < num_mids; i++){
            if(M[i].company == comp){
                printMid(M[i]);
            }
        }
    }
    //Create a new mid object
    public static Mid createMid(Scanner in){
        Mid newmid = new Mid();
        System.out.print("Alpha? ");
        newmid.alpha = in.next();
        System.out.print("First name? ");
        newmid.firstName = in.next();
        System.out.print("Last name? ");
        newmid.lastName = in.next();
        System.out.print("Company? ");
        newmid.company = in.nextInt();

        return newmid;
    }
    //Print out stats for each mid
    public static void printMid(Mid m){
        System.out.println(m.alpha + " " + m.lastName + " " + m.firstName + " " + m.company);
    }
}
    