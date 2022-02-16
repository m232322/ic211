/**
 * Used to define the bounding box around Points
 * @author Green, Collin
 */
public class Box{
    private double min_x;
    private double max_x;
    private double min_y;
    private double max_y;

    /**
     * Constructor method for a Box given a single Point
     * @param p Point to build box around
     */
    public Box(Point p) {
        min_x = p.getX();
        max_x = p.getX();
        min_y = p.getY();
        max_y = p.getY();
    }

    /**
     * Constructor method for a box holding MAX and MIN double values
     * @param e Arbitrary parameter type char
     */
    public Box(char e){
        min_x = Double.MAX_VALUE;
        max_x = Double.MIN_VALUE;
        min_y = Double.MAX_VALUE;
        max_y = Double.MIN_VALUE;
    }

    /**
     * Constructor method for a box around 2 points
     * @param a Point for bounds box
     * @param b Point for bounds box
     */
    public Box(Point a, Point b) {
        min_x = Math.min(min_x, Math.min(a.getX(), b.getX()));
        max_x = Math.max(max_x, Math.max(a.getX(), b.getX()));
        min_y = Math.min(min_y, Math.min(a.getY(), b.getY()));
        max_y = Math.max(max_y, Math.max(a.getY(), b.getY()));
    }

    /**
     * Increase the size of the bounding box to include a new Point
     * @param p Point to be included
     */
    public void growBy(Point p) {
        min_x = Math.min(min_x, p.getX());
        max_x = Math.max(max_x, p.getX());
        min_y = Math.min(min_y, p.getY());
        max_y = Math.max(max_y, p.getY());
    }

    /**
     * If a Point is within the box, return the unit square equivalent
     * @param p Point to be converted to unit
     * @return Unit square equivalent Point, or null if not in bounds
     */
    public Point mapIntoUnitSquare(Point p) {
        double x = p.getX();
        double y = p.getY();
        
        if(y >= min_y && y <= max_y && x <= max_x && x >= min_x){
            double newX = (x - min_x)/(max_x-min_x);
            double newY = (y - min_y)/(max_y-min_y);
            Point newp = new Point(newX, newY);
            return newp;
        }
        else{
            return null;
        }
    }

    /**
     * Convert bounds of a box to a String
     * @return String format of bounding box
     */
    public String toString() {
        String out = String.valueOf(min_x) + " < x < " + String.valueOf(max_x) + ", " + 
        String.valueOf(min_y) + " < y < " + String.valueOf(max_y);

        return out;
    }

    /**
     * Get private int min_x
     * @return min_x
     */
    public double getMinX(){
        return min_x;
    }

    /**
     * Get private int min_y
     * @return min_y
     */
    public double getMinY(){
        return min_y;
    }

    /**
     * Get private int max_x
     * @return max_x
     */
    public double getMaxX(){
        return max_x;
    }

    /**
     * Get private int max_y
     * @return max_y
     */
    public double getMaxY(){
        return max_y;
    }
}