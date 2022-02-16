/**
 * Format an array of strings into rows of specified characters
 * @author Green, Collin
 */

public class Formatter {

    /**
     * Prints an array of strings formatted
     * @param A Array of strings to be formatted
     * @param cols Number of columns allowed in each row
     */
    public static void writeInColumns(String[] A, int cols){
        //Count sum of characters in each row
        int colSum = 0;

        //Loop through array for output
        for(int i = 0; i < A.length; i++){
            //Set row count to the length of word (+1 space if it is not the first word)
            if (i != 0){
                colSum += 1;
            }
            colSum += A[i].length();
            //Check for column bounds, output new line and word or (space if not 1st) and word 
            if (colSum > cols){
                colSum = A[i].length();
                System.out.print("\n" + A[i]);
            }
            else {
                if (i != 0){
                    System.out.print(" ");
                }
                System.out.print(A[i]);
            }
        }
        System.out.println();
    }
}
