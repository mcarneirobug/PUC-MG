/* Dependencias */
import java.io.IOException;
import java.util.Scanner;

public class Lista09 {

    /* Variavel global responsavel por manipular entrada e saida de dados */
    public static Scanner in = new Scanner (System.in);

    public static void main (String [] args) throws IOException {

        /* Criar dois vetores */

        int  size      = 10;
        int half_size  = 5;

        int [ ] vetorTen  = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
        int [ ] vetorFive = new int [half_size];

        vetorFive = positionPar(vetorTen);

        System.out.println("\nVetor 10 posicoes: \n");
        mostrar(vetorTen);

        System.out.println("\nVetor com 5 posicoes (pares): \n");
        mostrar(vetorFive);

        System.exit(0);
    } //end main()

    public static int [] positionPar ( int [] vetor ) {

        int [] resp = new int [5];
        int aux = 0;

        for ( int i = 0; i < vetor.length; i += 2 ) {
            resp[aux] = vetor[i];
            aux++;
        } //end for
        return ( resp );
    } //end positionPar()

    public static void mostrar ( int [] vetor ) {

        for ( int x: vetor) {
            System.out.println("Vetor: [" + x + "]");
        } //end for
    } //end mostrar()

} //end class Lista09
