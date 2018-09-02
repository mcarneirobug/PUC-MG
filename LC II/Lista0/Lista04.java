/* Dependence */
import java.io.IOException;
import java.util.Scanner;

public class Lista04 extends Lista05 {

    /* Global variable to manipulate input and output data */
    public static Scanner in = new Scanner (System.in);

    public static void main (String [] args) throws IOException {

        /* method main call */
        area();

        System.exit(0);
    }  //end main()

    public static void area () {

        /* define data */
        double answer;
        int x = 10;
        int y = 20;
        double p;
        for ( p = x; p <= y; p += 2) {

            /* call function */
            answer = areaCalculator(p);

            /* printer */
            System.out.println("X = " + x + " | " + "Y = " + y + " | " + "Raio = " + p + " | " + "Area = " + answer);
        } //end for
    } //end area()
} //end Lista04
