/* Dependencias */

import java.io.IOException;
import java.util.Scanner;

public class Lista10 {

    /* Variavel global responsavel pela entrada e saida de dados */
    public static Scanner in = new Scanner (System.in);

    /* Metodo principal */
    public static void main (String [] args) throws IOException {

        int [] oVet = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int [] nVet = new int [oVet.length];

        inverter(oVet);
        /* clonar o vetor ja invertido */
        nVet = oVet.clone();
        mostrar(nVet);

        System.exit(0);
    } //end main()

    /* Metodo responsavel por inverter a ordem do vetor utilizando swap */
    private static void inverter(int[] oVet) {

        /* Definir dados*/
        int i = 0;
        int f = oVet.length - 1;
        /* enquanto o inicio nao for menor que o fim */
        while ( i < f ) {
            swap(oVet, i, f);
            i++;
            f--;
        } //end while
    } //end inverter

    /* Metodo responsavel por trocar duas posicoes entre elementos de um vetor */
    private static void swap(int[] oVet, int i, int f) {

        /* Definir dados */
        int aux = oVet[i];
        oVet[i] = oVet[f];
        oVet[f] = aux;
    } //end swap

    /* Metodo responsavel por mostrar o vetor */
    public static void mostrar ( int vetor [] ) {

        for ( int x: vetor) {
            System.out.print( " " + x );
        } //end for
    } //end mostrar()
} //end class Lista10
