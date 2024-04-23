/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

/*
The great-circle distance is the length of the shortest path between two points (x1,y1)
and (x2,y2)
on the surface of a sphere, where the path is constrained to be along the surface.
*/

public class GreatCircle {
    public static void main(String[] args) {

        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;

        double a1 = Math.pow(Math.sin((x2 - x1) / 2), 2);
        double a2 = Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2), 2);
        double a3 = Math.sqrt(a1 + a2);
        double distance = 2 * r * Math.asin(a3);

        System.out.println(distance + " kilometers");
    }
}
