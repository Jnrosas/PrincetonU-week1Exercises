/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

/*
Write a program RightTriangle that takes three int command-line arguments and
determines whether they constitute the side lengths of some right triangle.
*/

import java.util.Arrays;

public class RightTriangle {

    public static void main(String[] args) {

        Arrays.sort(args);


        boolean isRightTriangle = (Math.pow(Double.parseDouble(args[2]), 2) ==
                (Math.pow(Double.parseDouble(args[0]), 2) +
                        Math.pow(Double.parseDouble(args[1]), 2))) &&
                (Double.parseDouble(args[0]) > 0 && Double.parseDouble(args[1]) > 0 &&
                        Double.parseDouble(args[2]) > 0);
        System.out.println(isRightTriangle);
    }

}
