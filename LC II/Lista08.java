import java.io.IOException;
import java.util.Scanner;

public class Lista08 {

    /* Variavel global para manipular entrada e saida de dados */

    public static Scanner in = new Scanner (System.in);

    /* Funcao para calcular o fatorial de n */
    public static int fatorialN ( int n ) {

        /* Definicao de dados */
        int resp, i;

        /* repeticao para calcular o fatorial */
        for ( resp = 1; n > 1; n = n - 1 ) { /* fatorial sempre tem que ser diferente de 0 */
            resp = resp * n;                 /* portanto enquanto for maior que 1 ele repete */
        } //end for
        return (resp);
    } //end fatorialN

    public static void main (String [] args) throws IOException {

        /* Definicao de dados */
        int resp = 0;
        int aux  = 0;

        System.out.println("Insira o fatorial !n:" );
        aux = in.nextInt();

        /* chamada da funcao fatorial */
        resp = fatorialN(aux);

        System.out.println("O fatorial de: " + aux + ", " + resp+ ".");
    } //end main
} //end class
