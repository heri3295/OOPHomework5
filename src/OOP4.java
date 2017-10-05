
import java.util.Random;


public class OOP4 {
    public static void main(String[] args){
        final long TOTALPOINT = 400000000;
        final int RADIUS = 1000;
        double returnValue;
        double PIValue;
        returnValue = MonteCarlo(TOTALPOINT, RADIUS);                                   //MonteCarlo will be returning a long; returnValue is a double.
        PIValue = (returnValue/TOTALPOINT) *4;                                          //Since we're dealing with a quarter of the circle, we need to multiply by 4.
        System.out.println("The value that I got for pi is: " + PIValue);
    }

    public static long MonteCarlo (long TOTALPOINT, int RADIUS) {
        Random rand = new Random();
        long count = 0;                                                                 //Counter
        int XCOOR, YCOOR;                                                               //Coordinate values.
        for (long i = 0; i < TOTALPOINT; i++) {
            XCOOR = rand.nextInt(RADIUS) + 1;                                           //Assign random coordinates on grid.
            YCOOR = rand.nextInt(RADIUS) + 1;
            if (Math.sqrt( (XCOOR * XCOOR) + (YCOOR * YCOOR) ) <= RADIUS){              //Let's find the DISTANCE of the coordinate point from the origin.
                count++;                                                                //If the distance from origin to coordinate point is less than RADIUS, then it's inside the circle.
            }
        }
        return count;
    }
}
