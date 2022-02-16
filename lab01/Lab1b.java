import java.util.*;

public class Lab1b {
    public static void main(String[] args) {
        //Scan in name, n and k
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Please input an integer: ");
        int n = in.nextInt();
        System.out.print("Please input a second integer: ");
        int k = in.nextInt();
        System.out.println("The two ints were " + n + " and " + k);

        //Multiply numerator in series until (n(k-1)) and factorial denominator
        int num = n;
        int denom = k;
        for(int j = 1; j <= k - 1; j++){
            num = num*(n-j);
        }
        for (int l = k - 1; l > 0; l--){
            denom = denom*l;
        }

        //Calculate odds
        int odds = num/denom;
        double odds_d = 1.0/((double)odds);
    
        //Output in correct format
        System.out.println("numerator = " + num);
        System.out.println("denominator = " + denom);
        System.out.println("odds = 1 in " + odds + " = " + odds_d);
        System.out.println("Goodbye " + name + ".");
    }
}