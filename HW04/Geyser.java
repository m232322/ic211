import java.util.*;

public class Geyser {
    private String name;
    private double baseProbFactor;
    private int    daysSinceLastBlow;

    /**
    * Simulate one day.  If g doesn't blow, return -1
    * if g blows, return number of days since last blow
    */
    public int simDay(Random r) {
        int tmp         = ++this.daysSinceLastBlow;
        double blowProb = 1 - Math.pow(this.baseProbFactor, tmp);
    
        if (r.nextDouble() <= blowProb) {
          this.daysSinceLastBlow = 0;
        } else {
          tmp = -1;
        }
        return tmp;
    }

    /**
    * reads (and returns) geyser in the following format
    * <name> <initBlowProb> <days>
    */
    public static Geyser read(Scanner sc) {
        Geyser g = new Geyser();

        g.name              = sc.next();
        g.baseProbFactor    = 1.0 - sc.nextDouble();
        g.daysSinceLastBlow = sc.nextInt();
        return g;
    }

    /**
    * Simulate day d for array G of geysers & output results
    */
    public static void simDay(int d, Geyser[] G, Random r) {
        int k = 0;

        System.out.print("Day " + d + ":");

        for (int i = 0; i < G.length; i++) {
            if (G[i].simDay(r) != -1) {
                System.out.print((k++ > 0 ? ", " : " ") + G[i].name);
            }
        }
        System.out.println();
    }
}