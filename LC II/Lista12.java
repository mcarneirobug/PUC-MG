/* Dependence*/
import java.io.IOException;
import java.util.Scanner;

public class Lista12 {

    /* Global variable to manipulate input and output data */
    public static Scanner in = new Scanner (System.in);

    public static void main (String [] args) throws IOException {

        int [] aux = array();

        showArray(aux);

        //multipleStore();
        //multiplo();
        System.exit(0);
    } //end main()

    public static void showArray ( int [] printer  ) {

        for( int x: printer ) {
            System.out.println("Values:  "+ "[" + x + "]");
        } //end for
    } //end showArray()

    public static int [] array ( ) {

        /* define data */
        int [] aux = new int [500];
        int i, counter = 0;

        for ( i = 0; i < aux.length; i++ ) {
            if( i % 5 == 0 ) {
                aux[i] = counter;
                counter += 5;
            } //end se
        } //end for
        return ( aux );
    } //end array()
} //end class Lista12
