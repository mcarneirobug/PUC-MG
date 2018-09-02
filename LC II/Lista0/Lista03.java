/* Dependence */
import java.io.IOException;
import java.util.Scanner;

public class Lista03 {

    /* Global variable to manipulate inpu and output data */
    public static Scanner in = new Scanner (System.in);

    public static void main (String [] args) throws IOException {

        /* Define data */
        double base      = 0.0;
        double height    = 0.0;
        double sum       = 0.0;
        double area      = 0.0;
        double perimetro = 0.0;

        /* read base and height to keyboard */
        do {

            System.out.println("\nEnter the base: ");
            base = in.nextDouble();

            /* Check, if the base is valid */
            if( base > 0 ) {

                /* read height to keyboard */
                System.out.println("\nEnter the height: ");
                height = in.nextDouble();

                /* call function areaCalculator */
                area = areaCalculator(base, height);

                /* call function perimetroCalculator */
                perimetro = perimetroCalculator(base, height);

                /* print area and perimetro */
                System.out.println("Area: " + area + " cm"+" | " + "Perimetro: " + perimetro + " cm");

                /* Sum of areas */
                sum = sum + area;
            } //end se
            else {
                System.out.println("ERROR: Negative base invalid...");
            } //end else
        } while ( base > 0 );

        /* Print sum of ares */
        System.out.println("Sum of areas: " + "("+ sum + ")");
        System.exit(0);
    } //end main()

    public static double areaCalculator ( double base, double height ) {

        /* Define data */
        double answer = (base * height);

        /* Return answer */
        return ( answer );
    } //end areaCalculator()

    public static double perimetroCalculator ( double base, double height ) {

        /* Define data */
        double answer = 2*(base + height);

        /* Return answer */
        return ( answer );
    } //end perimetroCalculator()
} // end class Lista03
