import java.util.Scanner;
import java.io.*;

public class Budget {
    MyDate start;
    Queue list;

    public static Budget makeBudget(String path){
        Scanner sc = null;
        try {
        sc = new Scanner(new FileReader(path));
        } catch(IOException e) {
        e.printStackTrace(); System.exit(1);
        }
        
        Budget b = new Budget();
        Queue q = new Queue();

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] splitLine = line.split(" ");
        }
    }

    public void simDay(int numDays){
        for(int i = 0; i < numDays; i++){
            this.list.dateSearch(start);
            start.incDay(1);
        }
    }
}
