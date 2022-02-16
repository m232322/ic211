import java.util.Scanner;

/**
 * A point holding an x and y value (double)
 * @author Green, Collin
 */
public class Point{
    private double x_coord;
    private double y_coord;
    
    /**
     * Constructor method for Point
     * @param x value for x-coordinate
     * @param y value for y-coordinate
     */
    public Point(double x, double y){
        x_coord = x;
        y_coord = y;
    }

    /**
     * Create a point from reading user input
     * @param sc Scanner used to read values
     * @return A point created from user input coordinates
     */
    public static Point read(Scanner sc){
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        Point p = new Point(x,y);
        return p;
    }

    /**
     * Return a string of x and y values for a point
     * @return (String) x y
     */
    public String toString(){
        return String.valueOf(x_coord) + " " + String.valueOf(y_coord);
    }

    /**
     * Get private int x_coord
     * @return x coordinate
     */
    public double getX(){
        return x_coord;
    }
    
    /**
     * Get private int y_coord
     * @return y coordinate
     */
    public double getY(){
        return y_coord;
    }
}