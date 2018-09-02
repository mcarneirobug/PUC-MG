// dependence
import java.util.*;

public class Lista02{

    private static Scanner in = new Scanner (System.in);
    private static Random gerador = new Random();

    private static void tarefa01 ( ){

        //define data
        int value, amount, amount2;
        Object data;
        CPilha P = new CPilha( );
        CPilha Paux = new CPilha( );

        System.out.println("Enter 10 values: ");

        //stack values
        for ( int i = 0; i < 10; i++ ){
            value = in.nextInt( );
            P.empilha(value);
        }//end for

        //define amount
        amount = P.quantidade( );

        //show data
        System.out.println("\nCPilha: ");
        while ( amount > 0 ) {

            data = P.desempilha();
            System.out.println("["+ data + "]");
            Paux.empilha(data);
            amount--;
        } //end while

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

    private static void tarefa02( ){

        //define data
        int value, amount;

        Object dado;
        Object aux;
        CPilha P = new CPilha( );
        CPilha Paux = new CPilha( );

        System.out.println("Entre com 10 valores: ");
        //empilhar
        for ( int i = 0; i < 10; i++ ){
            value = in.nextInt( );
            P.empilha(value);
        }//end for

        //definir quantidade
        amount = P.quantidade( );
        //mostrar dados da pilha
        for ( int j = 0; amount > 0; amount-- ){
            dado = P.desempilha( );
            aux  = dado;
            Paux.empilha(dado);
            System.out.println(""+aux);
        }//end for

        for ( int j = 0; amount > 0; amount-- ){
            P.empilha(Paux.desempilha( ));
        }//end for
    }//end tarefa02( )

    private static void tarefa03 ( ){

        //define data
        int value;
        int quantidade;
        Object dado;
        CPilha P = new CPilha( );
        CPilha Paux = new CPilha( );

        System.out.println("Entre com 10 valores: ");
        //empilhar
        for ( int i = 0; i < 10; i++ ){
            value = in.nextInt( );
            P.empilha(value);
        }//end for

        //definir quantidade
        quantidade = P.quantidade( );
        //mostrar dados da pilha
        for ( int j = 0; quantidade > 0; quantidade-- ){
            dado = P.desempilha( );
            System.out.println ( ""+dado);
            Paux.empilha(dado);
        }//end for
    }//end tarefa03( )

    private static void tarefa04() {

        //define data
        int value;
        int quantidade;
        Object dado;
        CPilha P = new CPilha( );
        CPilha Paux = new CPilha( );


        System.out.println("Entre com 10 valores: ");
        //empilhar
        for ( int i = 0; i < 10; i++ ){
            value = gerador.nextInt(25);
            P.empilha(value);
        }//end for

        //definir quantidade
        quantidade = P.quantidade();
        //quantidade = Paux.quantidade( );
        //mostrar dados da pilha

        while ( quantidade > 0 ) {
            dado = P.desempilha( );
            System.out.println ( ""+dado);
            Paux.empilha(dado);
            quantidade--;
        }
        int amount = Paux.quantidade();
        while ( amount > 0 ) {

            dado = Paux.desempilha();
            System.out.println(""+dado);
            P.empilha(dado);
            amount--;
        }
        /*
        for ( int j = 0; quantidade > 0; quantidade-- ){
            dado = P.desempilha( );
            System.out.println ( ""+dado);
            Paux.empilha(dado);
        }//end for
        */
    /*
        while ( quantidade < 0 ) {
            P.empilha(Paux.desempilha());
            quantidade++;
        }
        */
        /*
        for ( int j = 0; quantidade > 0; quantidade -- ){
            P.empilha(Paux.desempilha( ));
            System.out.println("Data P:"+ P.peek());
        }//end for
        */
        System.out.println("Pauxs:"+Paux.peek());

        System.out.println("P:"+P.peek());
    } //end tarefa04()

    public static void main ( String [ ] args ){

        System.out.println("\nLista02 - Programa em Java ");
        System.out.println("Autor: Matheus Santos Rosa Carneiro");
        System.out.println();

        //define data
        int opcao;

        do {
            //show option
            System.out.println("Opcoes: ");
            System.out.println("0 - parar");
            System.out.println("1 - tarefa01");
            System.out.println("2 - tarefa02");
            System.out.println("3 - tarefa03");
            System.out.println("4 - tarefa04");

            System.out.println();

            //leitura da opcao do teclado
            System.out.println("Qual a opcao desejada? ");
            opcao = in.nextInt();

            //escolha da opcao
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    tarefa01();
                    break;
                case 2:
                    tarefa02();
                    break;
                case 3:
                    tarefa03();
                    break;
                case 4:
                    tarefa04();
                    break;
                    default:
                        System.out.println("ERROR: Invalid option! ");
                        break;
            } //end switch()
        } //end do()
        while(opcao != 0);

        System.exit(0);
    }//end main ( )
}//end class