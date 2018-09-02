// dependence
import java.util.*;

public class Lista02{

    private static Scanner in = new Scanner (System.in);
    private static Random gerador = new Random();

    private static void task01 ( ){

        //define data
        int value, amount, amount2;
        Object data;
        CPilha P    = new CPilha( );
        CPilha Paux = new CPilha( );

        System.out.println("Enter 10 values: ");

        //stack values
        for ( int i = 0; i < 10; i++ ){
            value = in.nextInt( );
            P.empilha(value);
        }//end for

        //define amount P
        amount = P.quantidade( );

        //show data
        System.out.println("\nCPilha: ");
        while ( amount > 0 ) {

            data = P.desempilha();
            System.out.println("["+ data + "]");
            Paux.empilha(data);
            amount--;
        } //end while

        //define amount Paux
        amount2 = Paux.quantidade();

        //stack to P again
        while ( amount2 > 0 ) {
            data = Paux.desempilha();
            P.empilha(data);
            amount2--;
        } //end while

        //check what's on top
        System.out.println("\nElement on top: "+ P.peek());
    }//end tarefa01( )

    private static void task02( ){

        //define data
        int value, amount, amount2;
        Object data;
        CPilha P    = new CPilha( );
        CPilha Paux = new CPilha( );

        System.out.println("Enter 10 values: ");

        //stack P
        for ( int i = 0; i < 10; i++ ){
            value = in.nextInt( );
            P.empilha(value);
        }//end for

        //define amount P
        amount = P.quantidade( );

        //stack Paux
        while ( amount > 0 ) {

            data = P.desempilha();
            Paux.empilha(data);
            amount--;
        } //end while

        //define amount Paux
        amount2 = Paux.quantidade();

        System.out.println("\nCPilha: ");
        while ( amount2 > 0 ) {

            data = Paux.desempilha();
            P.empilha(data);
            System.out.println("["+ data + "]");

            amount2--;
        } //end while()

        //check what's on top
        System.out.println("Element on top: "+ P.peek());
    }//end tarefa02( )

   /* private static void task03 ( ){
    }//end tarefa03( ) */

    private static void task04() {

        //define data
        int value, amount, amount2;
        Object data;
        CPilha P    = new CPilha( );
        CPilha Paux = new CPilha( );

        System.out.println("Enter 10 values: ");

        //stack P
        for ( int i = 0; i < 10; i++ ){
            value = gerador.nextInt(25);
            P.empilha(value);
        }//end for

        //define amount
        amount = P.quantidade();

        System.out.println("\nCPilha: ");

        //show data
        while ( amount > 0 ) {

            data = P.desempilha( );
            System.out.println ("["+ data + "]");
            Paux.empilha(data);
            amount--;
        } //end while

        //define amount Paux
        amount2 = Paux.quantidade();

        while ( amount2 > 0 ) {

            data = Paux.desempilha();
            P.empilha(data);
            amount2--;
        } //end while

        //check what's on top
        System.out.println("\nElement on top: "+ P.peek());
    } //end task04()

    private static void task05() {

        //define data
        int value, amount, amount2, aux = 10;
        double mean = 0.0;
        Object data;
        CPilha P    = new CPilha( );
        CPilha Paux = new CPilha( );

        System.out.println("Enter 10 values: ");

        //stack P
        for ( int i = 0; i < aux; i++ ){
            value = gerador.nextInt(25);
            P.empilha(value);
        }//end for

        //define amount
        amount = P.quantidade();

        System.out.println("\nCPilha: ");

        //show data
        int sum = 0;
        while ( amount > 0 ) {

            data = P.desempilha( );
            System.out.println ("["+ data + "]");
            sum = sum + (int)data;
            mean = (double)sum/aux;
            Paux.empilha(data);
            amount--;
        } //end while

        //define amount Paux
        amount2 = Paux.quantidade();

        while ( amount2 > 0 ) {

            data = Paux.desempilha();
            P.empilha(data);
            amount2--;
        } //end while

        //check what's on top
        System.out.println("\nElement on top: "+ P.peek());
        System.out.println("Sum of elements: " + sum);
        System.out.println("Arithmetic men of elements: " + mean);
    } //end task05()

    private static void task06() {

        //define data
        CFila F    = new CFila();
        CFila Faux = new CFila();
        int aux = 10, aux2 = 1, amount, amount2;
        Object data;
        String input;

        System.out.println("\nEnter 10 names: ");

        //stack F
        for ( int i = 0; i < aux; i++ ) {
            input = in.next();
            F.enfileira(input);
        } //end for

        //define amount F
        amount = F.quantidade();

        System.out.println("\nCFila: ");

        //show CFila
        while ( amount > 0 ) {

            data = F.desenfileira();
            System.out.println(aux2 + " - " + data);
            Faux.enfileira(data);
            aux2++;
            amount--;
        } //end while

        amount2 = Faux.quantidade();

        //stack to P again
        while ( amount2 > 0 ) {

            data = Faux.desenfileira();
            F.enfileira(data);
            amount2--;
        } //end while

        //check what's on first
        System.out.println("\nFirst in queue: "+ F.peek());

    } //end task06()

    public static void main ( String [ ] args ){

        System.out.println("\nLista02 - Programa em Java ");
        System.out.println("Autor: Matheus Santos Rosa Carneiro");
        System.out.println();

        //define data
        int option;

        do {
            //show option
            System.out.println("\nOptions: ");
            System.out.println("0 - break");
            System.out.println("1 - task01");
            System.out.println("2 - task02");
            System.out.println("3 - task03");
            System.out.println("4 - task04");
            System.out.println("5 - task05");
            System.out.println("6 - task06");

            System.out.println();

            //leitura da opcao do teclado
            System.out.println("Choose an option: ");
            option = in.nextInt();

            //escolha da opcao
            switch (option) {
                case 0:
                    break;
                case 1:
                    task01();
                    break;
                case 2:
                    task02();
                    break;
                case 3:
                    break;
                case 4:
                    task04();
                    break;
                case 5:
                    task05();
                    break;
                case 6:
                    task06();
                    break;
                    default:
                        System.out.println("ERROR: Invalid option! ");
                        break;
            } //end switch()
        } //end do()
        while(option != 0);

        System.exit(0);
    }//end main ( )
}//end class