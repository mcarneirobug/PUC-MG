/* dependence */
import java.io.IOException;
import java.util.Scanner;

public class Lista13 {

    /* Global variable to mapilate input and output data */
    public static Scanner in = new Scanner (System.in);

    public static void main (String [] args) throws IOException {

        int [][] array = diagonalP();
        showMatrix(array);

        System.exit(0);
    } //end main()

    public static void showMatrix ( int [][] array ) {

        /* define data */
        int row, columns;

        // faz um loop pelas linhas do array
        for ( row = 0; row < array.length; row++ ) {
             // faz um loop pelas colunas da linha atual
            for( columns = 0; columns < array[0].length; columns++ ) {
                    if( row == columns ) {
                        System.out.print("["+array[row][columns]+"]");
                    }
                    System.out.print("\t");
            } //end second for
            // inicia nova linha de saida
            System.out.println();
        } //end first for
    }  //end diagonalP()

    public static int [][] diagonalP () {

        int i, j;
        int row, columns, value;
        int [][] answer = new int [5][5];

        row     = answer.length;
        columns = answer[0].length;

        if ( answer == null ) {
            System.out.println("ERROR: Nao ha' espaco para armazenamento. ");
        } //end if
        else {
            for ( i = 0; i < row; i++ ) {
                for ( j = 0; j < columns; j++ ){
                    //if( i == j ) {
                        System.out.println("Entrada de dados para a posicao: " + i + "x" + j + " : ");
                        value = in.nextInt();
                        answer[i][j] = value;
                    //}
                } //end second for
            } //end first for
        } //end else
        return (answer);
    } //end diagonalP()

} //end class Lista13
