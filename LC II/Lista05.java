/* Dependence*/
import java.io.IOException;
import java.util.Scanner;

public class Lista05 {

    /* Global variable to manipulate input and output data */
    public static Scanner in = new Scanner (System.in);

    public static double areaCalculator ( double radius ) {

        /* define data */
        double pi     = 3.14;
        double answer = Math.pow(radius, 2) * pi;
        /*
        *           2
        * A = pi * R
        * pi = 3.14
        * radius = (?)
        */

        /* return answer */
        return ( answer );
    } //end areaCalculator()

    public static void area ( ) {

        /* define data */
        double answer;
        int x         = 1;
        int y         = 10;

        for ( double i = x; i <= y; i += 0.1 ){

            /* call function */
            answer = areaCalculator(i);
            /* print operation of each radius */
            System.out.printf("\nX: " + x + " | "+ "Y: "+ y + " | "+ "Raio: "+i + " | "+"Area: %.2f %n", answer);
        } //end for
    } //end area()

    public static void main(String [] args) throws IOException {

        /* method call */
        area();

        System.out.println("\n\nExit...");
        System.exit(0);
    } //end main()
} //end class Lista05
