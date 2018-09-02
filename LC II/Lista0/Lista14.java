// Dependence
import java.io.IOException;
import java.util.Scanner;

public class Lista14 {

    // Global variable to manipulate input and output data
    public static Scanner in = new Scanner (System.in);

    public static void main (String [] args) throws IOException {

        // call the method and function
        int [][] answer = null;
        int aux         = 0;

        answer = matrix();
        aux    = sum(answer);
        showMatrix(answer);

        System.exit(0);
    } //end main()

    public static void showMatrix ( int [][] array ) {

        // define data
        int i, j;
        int row, columns;

        // define values
        row     = array.length;
        columns = array[0].length;

        // verify, if array is valid

        if( array != null ) {

            for (i = 0; i < row; i++) {
                for (j = 0; j < columns; j++) {
                    System.out.print("[" + array[i][j] + "]");
                } //end second for
                System.out.println();
            } //end first for
        } //end condition
    } //end showMatrix()

    public static int [][] matrix () {

        int [][] array = new int [5][5];
        int i, j, row, columns, values;

        row     = array.length;
        columns = array[0].length;

        // verify, if array is valid
        if( array != null ) {

            for (i = 0; i < row; i++) {
                for (j = 0; j < columns; j++) {
                    System.out.println("Enter the values in matriz: " + "[" + i + "]" +"x"+ "[" + j + "] :");
                    values = in.nextInt();
                    array[i][j] = values;
                } //end second for
            } //end first for
        } //end if
        else {
             System.out.println("ERROR: Matriz is null. ");
        } //end else
        return (array);
    } //end matrix()

    public static int sum ( int [][] aux ) {

        // define data
        int i, j, row, columns;
        int soma = 0;

        // define values
        row     = aux.length;
        columns = aux[0].length;

        for( i = 0; i < row; i++ ) {
            for( j = 0; j < columns; j++ ){
                if( j > i ) {
                    soma += aux[i][j];
                    //System.out.println("Sum = " + soma);
                } //end condition
            } //end second for
        } //end first for
        System.out.println("Sum = " + soma);
        return ( soma );
    } //end sum()
} //end Lista14
