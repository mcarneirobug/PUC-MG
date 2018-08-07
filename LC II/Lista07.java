/* Dependencias */
import java.io.IOException;
import java.util.Scanner;

public class Lista07 {

    /* Variavel global para manipular entrada e saida */
    private static Scanner in = new Scanner (System.in);

    /* Funcao responsavel por calcular o produto */
    private static double produto ( double a, int b ) {

        /* Definir dados */
        double resp = 0.0;
        while ( b > 0 ) {
            resp = resp + a;
            /*
            0 =  0 + 5;  b = 5
            5 =  5 + 5;  b = 4
           10 = 10 + 5;  b = 3
           15 = 15 + 5;  b = 2
           20 = 20 + 5;  b = 1
           25 = 25 + 0;  b = 0
             */

            /* variar o b, ate que ele seja diferente de 0 */
            b--;
        } //end while

        return ( resp );
    } //end produto()

    public static void main (String [] args) throws IOException {

        /* Definicao de dados*/
        double resp = 0.0;
        double product = 0.0;
        int inteiro    = 0;

        System.out.println("Entre com um numero real: ");
        product = in.nextDouble();

        System.out.println("Entre com um numero inteiro: ");
        inteiro = in.nextInt();

        /* Chamada da funcao produto */
        resp = produto (product, inteiro);
        System.out.println("Soma de A por B: " + resp);

    } //end main()
} //end class Lista07
