/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

// Write a program CMYKtoRGB.java that converts from CMYK format to RGB format

public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        int white = Integer.parseInt(String.valueOf(Math.round(1 - black)));
        int red = Integer.parseInt(String.valueOf(Math.round(255 * white * (1 - cyan))));
        int green = Integer.parseInt(String.valueOf(Math.round(255 * white * (1 - magenta))));
        int blue = Integer.parseInt(String.valueOf(Math.round(255 * white * (1 - yellow))));

        System.out.println("red   = " + red);
        System.out.println("green = " + green);
        System.out.println("blue  = " + blue);
    }
}
