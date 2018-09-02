/* Dependencias */
import java.io.IOException;
import java.util.Scanner;

public class Lista11 {

    /* Variavel global para manipular entrada e saida de dados*/
    public static Scanner in = new Scanner (System.in);

    public static void main (String [] args) throws IOException {

        int [] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("\nantes: \n");
        mostrar(vetor);
        inverter (vetor);
        System.out.println("\ndepois: \n");
        mostrar  (vetor);

        System.exit(0);
    } //end main()

    private static void mostrar(int[] vetor) {

        for (int x : vetor) {
            System.out.println("Invertido: " + x);
        } //end for
    } //end mostrar

    private static void inverter(int[] vetor) {

        int i = 0; //primeira posicao
        int f = vetor.length - 1; //ultima posicao

        while ( i < f ) { //enquanto inicio for menor que fim
            swap(vetor, i, f); //troca os elementos de posicao
            i++;
            f--;
        } //end repeticao
    } //end inverter()

    private static void swap(int[] vetor, int i, int f) {

        /* Definir dados*/
        int aux;

        aux = vetor[i];
        vetor[i] = vetor[f];
        vetor[f] = aux;
    } //end swap
} //enc lass Lista11
