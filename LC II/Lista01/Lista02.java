// dependence
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Lista02{

    private static Scanner in        = new Scanner (System.in);
    private static Random gerador    = new Random();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    private static void task01 ( ) throws IOException {

        //define data
        int amount, amount2;
        Object data, in;
        CPilha P    = new CPilha( );
        CPilha Paux = new CPilha( );

        System.out.println("Enter 10 values: ");

        //stack values
        for ( int i = 0; i < 10; i++ ){
            in = br.readLine();
            P.empilha(in);
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
    }//end task01( )

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
    }//end task02( )

    private static void task03 ( ){

        //define data
        CPilha P    = new CPilha();
        CFila  F = new CFila();
        Object data;
        int input, amount, amount2;

        System.out.println("Enter 10 values: ");

        //stack P
        for(int i = 0; i < 10; i++) {
            input = in.nextInt();
            P.empilha(input);
        } //end for

        //define amount P
        amount = P.quantidade();

        //stack to F
        while( amount > 0 ) {
            data = P.desempilha();
            F.enfileira(data);
            System.out.println("[" + data + "]");
            amount--;
        } //end while

        //define amount F
        amount2 = F.quantidade();

        //unpack F to P
        while( amount2 > 0 ) {
            data = F.desenfileira();
            P.empilha(data);
            amount2--;
        } //end while

        //check what's on top
        System.out.println("Element on top: " + P.peek());
    }//end task03( )

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
        System.out.println("Arithmetic mean of elements: " + mean);
    } //end task05()

    private static void task06() {

        //define data
        CFila F    = new CFila();
        CFila Faux = new CFila();
        int aux = 1, amount, amount2;
        Object data;
        String input;

        System.out.println("\nEnter 10 names: ");

        //stack F
        for ( int i = 0; i < 10; i++ ) {
            input = in.next();
            F.enfileira(input);
        } //end for

        //define amount F
        amount = F.quantidade();

        System.out.println("\nCFila: ");

        //show CFila
        while ( amount > 0 ) {

            data = F.desenfileira();
            System.out.println(aux + " - " + data);
            Faux.enfileira(data);
            aux++;
            amount--;
        } //end while

        //define amount Faux
        amount2 = Faux.quantidade();

        //stack to F again
        while ( amount2 > 0 ) {

            data = Faux.desenfileira();
            F.enfileira(data);
            amount2--;
        } //end while

        //check what's on first
        System.out.println("\nFirst in queue: "+ F.peek());

    } //end task06()

    private static void limpaPilha (CPilha P) {

        //define data
        int amount;
        amount = P.quantidade();

        while ( amount > 0 ) {
            P.desempilha();
            amount--;
        } //end while()
    } //end limpaPilha()

    private static void task07() {

        //define data
        CPilha P    = new CPilha();
        CPilha Paux = new CPilha();
        int input, amount, amount2;
        Object data;
        System.out.println("Enter 15 values: ");

        //stack P
        for( int i = 0; i < 15; i++ ) {
            input = gerador.nextInt(20);
            P.empilha(input);
        } //end for

        System.out.println("\nCPilha: ");

        //define amount P
        amount = P.quantidade();

        //unpack P to Paux
        while ( amount > 0 ) {

            data = P.desempilha();
            System.out.println("[" + data + "]");
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
        System.out.println("\nElement on top (before): "+ P.peek());

        //clear all items
        limpaPilha(P);

        //check what's on top
        System.out.println("Element on top (after): "+ P.peek());
    }  //end task07()

    private static void task08() {

        //define data
        CPilha P    = new CPilha();
        CPilha Paux = new CPilha();
        Object data;
        int input, amount, amount2;

        System.out.println("Enter 15 values: ");

        //stack P
        for( int i = 0; i < 15; i++ ) {
            input = gerador.nextInt(100);
            P.empilha(input);
        } //end for

        //define amount P
        amount = P.quantidade();

        while ( amount > 0 ) {
            data = P.desempilha();
            System.out.println("[" + data + "]");
            Paux.empilha(data);
            amount--;
        } //end while

        //define amount Paux
        amount2 = Paux.quantidade();

        //unpack Paux to P
        while( amount2 > 0 ) {
            data = Paux.desempilha();
            P.empilha(data);
            amount2--;
        } //end while

        //check what's on top before
        System.out.println("\nElement on top: (before) "+ P.peek());

        //clear all items
        P.limpa();

        //check what's on top after
        System.out.println("Element on top: (after) "+ P.peek());
    } //end task08()

    private static void task09() {

        //define data
        CFila F    = new CFila();
        CFila Faux = new CFila();
        int amount, amount2;
        String input;
        Object data;

        System.out.println("\nEnter 10 names: ");
        //stack F
        for(int i = 0; i < 10; i++) {
            input = in.next();
            F.enfileira(input);
        } //end for

        //define amount F
        amount = F.quantidade();

        while ( amount > 0 ) {

            data = F.desenfileira();
            System.out.println("[" + data + "]");
            Faux.enfileira(data);
            amount--;
        } //end while

        //define amount Faux
        amount2 = Faux.quantidade();

        //unpack Faux to F
        while( amount2 > 0 ) {

            data = Faux.desenfileira();
            F.enfileira(data);
            amount2--;
        } //end while

        //check what's on top before
        System.out.println("\nFirst in queue: (before) " + F.peek());

        //clear all items
        F.limpa();

        //check what's on top after
        System.out.println("First in queue: (after) " + F.peek());
    } //end task09()

    private static void task10() {

        //define data
        CFila F    = new CFila();
        CFila Faux = new CFila();
        int input, amount, amount2, aux = 10;
        Object data;

        System.out.println("Enter 10 values: ");

        for(int i = 0; i < aux; i++) {
            input = in.nextInt();
            F.enfileira(input);
        } //end for

        //method call
        F.furaFila(5);

        System.out.println("\nCFila: ");
        //define amount F
        amount = F.quantidade();

        //show data
        while( amount > 0 ) {
            data = F.desenfileira();
            System.out.println(""+ data);
            Faux.enfileira(data);
            amount--;
        } //end while

        //define amount Faux
        amount2 = Faux.quantidade();

        while( amount2 > 0 ) {
            data = Faux.desenfileira();
            F.enfileira(data);
            amount2--;
        } //end while

        //check what's on first
        System.out.println("\nFirst in queue: "+ F.peek());
    } //end task10()

    private static void furaFila (CFila F, Object item) {

        int amount = F.quantidade();
        while( amount > 0 ) {
            CCelula aux = new CCelula();
            aux.prox = new CCelula(item, aux.prox);
            F.enfileira(item);
            amount--;
        }
    } //end furaFila()

    private static void furaQueue ( CFila F, Object item ) {
        F.furaFila(item);
    } //end furaQueue()


    private static void task11() {

        //define data
        CFila F    = new CFila();
        CFila Faux = new CFila();
        Object data;
        int input, input2, amount, amount2;

        System.out.println("Enter 10 values: ");

        for(int i = 0; i < 10; i++) {
            input = in.nextInt();
            F.enfileira(input);
        } //end for


        System.out.println("Enter 1 value: ");
        input2 = in.nextInt();

        //call method
        furaQueue(F, input2);

        //define amount F
        amount = F.quantidade();

        while( amount > 0 ) {
            data = F.desenfileira();
            System.out.println("" + data);
            Faux.enfileira(data);
            amount--;
        } //end while

        //define amount Faux
        amount2 = Faux.quantidade();

        //stack to F again
        while( amount2 > 0 ) {
            data = Faux.desenfileira();
            F.enfileira(data);
            amount2--;
        } //end while

        //check what's element on first
        System.out.println("First in queue: " + F.peek());
    } //end task11()

    public static void main ( String [ ] args ) throws IOException {

        System.out.println("\nList 02 - Program in Java ");
        System.out.println("Author: Matheus Santos Rosa Carneiro");
        System.out.println();

        //define data
        int option;

        do {
            //show option
            System.out.println("\nOptions: ");
            System.out.println("00 - break");
            System.out.println("01 - task01");
            System.out.println("02 - task02");
            System.out.println("03 - task03");
            System.out.println("04 - task04");
            System.out.println("05 - task05");
            System.out.println("06 - task06");
            System.out.println("07 - task07");
            System.out.println("08 - task08");
            System.out.println("09 - task09");
            System.out.println("10 - task10");
            System.out.println("11 - task11");

            System.out.println();

            //read keyboard
            System.out.println("Choose an option: ");
            option = in.nextInt();

            //choose an option
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
                    task03();
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
                case 7:
                    task07();
                    break;
                case 8:
                    task08();
                    break;
                case 9:
                    task09();
                    break;
                case 10:
                    task10();
                    break;
                case 11:
                    task11();
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