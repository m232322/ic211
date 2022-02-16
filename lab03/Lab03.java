import java.util.*;

/**
 * Lab 03 assignment, simulating a bounding box around points
 * @author Green, Collin 
 */
public class Lab03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in;

        //Create empty box (so as not to interfere with add point)
        Box b = new Box('e');
        int flag = 0; 
        while(true){
            in = sc.next();

            //Add point to the bounds of the box
            if (in.equals("add")){
                Point p = Point.read(sc);
                Box temp = new Box(p);
                if(flag == 0){
                    b = temp;
                    flag = 1;
                }
                else{
                    b.growBy(p);
                }  
            }

            //Return bounds of the box
            else if (in.equals("box")){
                System.out.println(b.toString());
            }

            //Return the unit square x and y coordinates of a given point
            else if (in.equals("map")){
                double newX = sc.nextDouble();
                double newY = sc.nextDouble();
                double min_x = b.getMinX();
                double min_y = b.getMinY();
                double max_x = b.getMaxX();
                double max_y = b.getMaxY();
                Point mapPoint = new Point(newX, newY);
                Point unitSq = b.mapIntoUnitSquare(mapPoint);
                
                if (unitSq != null){
                    System.out.println(unitSq.toString());
                }
                else{
                    System.out.println("error");
                }
            }

            //Break loop and end program
            else if (in.equals("done")){
                break;
            }

            //Error message if command is not recognized
            else {
                System.out.println("Error! Unknown command \"" + in + "\"!");
            }
        }
    }
}
