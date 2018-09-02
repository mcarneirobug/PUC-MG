/* Dependencias */
import java.io.IOException;
import java.util.Scanner;

public class Lista02 {

    /* Variavel global responsavel por manipular entrada e saida de dados */
    public static Scanner in = new Scanner (System.in);

    /* Metodo principal */
    public static void main (String [] args) throws IOException {

        /* Chamada do metodo funcional */
        tabuada();

        System.out.println("Encerrando...");
        System.exit(0);
    } //end main()

    public static int [] mathMultiplication ( int n, int coeficiente ) {

        /* Definir dados */
        int [] answer = new int [10];

        for ( int i = 0; i < answer.length; i++ ) {
            answer[i] = n * coeficiente;
            /* variar apenas o coeficiente */
            coeficiente++;
        } //end for
        return ( answer );
    } //end mathMultiplication()

    public static void tabuada ( ) {

        /* Definir variaveis */
        int x = 1, y = 1;
        int aux = 0;
        int [] tabuada = new int [10];

        /* Repeticao para delimitar as multiplicacoes */
        for ( int i = 0; i < tabuada.length; i++ ) {
            /* chamada da funcao para multiplicar os termos */
            tabuada = mathMultiplication(x, y);

            /* repeticao para printar */
            for(int j = 0; j < tabuada.length; j++) {
                aux = j++;
                System.out.println("["+ x + " x " +aux+ " = " + tabuada[j]+"]");
            } //end for (second)
                System.out.println("\n");

                /* variar valor de x */
                x++;
        } //end for (first)
    } //end tabuada()
} //end class Lista02
