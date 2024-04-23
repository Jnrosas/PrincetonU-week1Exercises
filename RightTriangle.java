/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

/*
Write a program RightTriangle that takes three int command-line arguments and
determines whether they constitute the side lengths of some right triangle.
*/

public class RightTriangle {

    public static void main(String[] args) {
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        int arg3 = Integer.parseInt(args[2]);

        boolean isRightTriangle = (Math.pow(arg3, 2) == Math.pow(arg1, 2) +
                Math.pow(arg2, 2)) && (arg1 > 0 && arg2 > 0 && arg3 > 0) ||

                (Math.pow(arg2, 2) == Math.pow(arg1, 2) + Math.pow(arg3, 2)) &&
                        (arg1 > 0 && arg2 > 0 && arg3 > 0) ||

                (Math.pow(arg1, 2) == Math.pow(arg2, 2) + Math.pow(arg3, 2)) &&
                        (arg1 > 0 && arg2 > 0 && arg3 > 0);

        System.out.println(isRightTriangle);
    }
}
