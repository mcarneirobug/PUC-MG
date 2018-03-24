/**
* Exemplo0081
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @Turno: Vespertino
* @version 19
*/


import IO.*;

public class Exemplo0081 {

    // ------------------------------ deficao do metodo auxilar 01
    public static void metodo01()
    {
        //definir dados
        String x;
        int tamanho;
        int posicao = 0;

        //identificar metodo
        IO.println( "Metodo 01" );

        //ler cadeia de caracteres do teclado
        x = IO.readString("Entrar com uma cadeia de caracteres: " );
        IO.println( "Valor lido: " + x );

        //obter tamanho da cadeia
        tamanho = x.length();
        IO.println( "tamanho de " + x + " = " + tamanho ); //printar valor armazenado

        //mostrar cada letra maiuscula separadamente
        while (tamanho > posicao)
        {
            if (x.charAt(posicao) >= 'A' &&
                x.charAt(posicao) <= 'Z')
            {
                IO.println( "Posicao de: " + posicao +
                             " contem " + x.charAt(posicao));
            } //end se
            posicao = posicao + 1; //para passar para proxima letra
        } //end repeticao

    } //end metodo01( )

    // ------------------------------ deficao do metodo auxilar 02

    /**
     *
     * @param simbolo - para servir como teste para letra maiuscula
     * @return - retornar resultado
     */

    public static boolean maiuscula (char simbolo)
    {
        boolean resposta = false;
        if (simbolo >= 'A' &&
            simbolo <= 'Z')
        {
            resposta = true;
        } //end se
        //retornar resposta
        return ( resposta );
    } //end maiusculas( )

    public static void metodo02()
    {
        //definir dados
        String x;
        int contador = 0;
        int tamanho;
        int posicao = 0;

        //identificar metodo
        IO.println( "Metodo 02" );

        //ler valor escrito no teclado
        x = IO.readString("Entrar com uma cadeia de caracteres: " );
        IO.println( "Valor lido: " + x );

        //obter tamanho
        tamanho = x.length();
        IO.println( "tamanho de " + x + " = " + tamanho );

        //definir contador
        while (tamanho > posicao)
        {
            if( maiuscula(x.charAt(posicao)))
            {
                IO.println( "posicao de " + posicao +
                             " contem " + x.charAt(posicao));
                 contador = contador + 1;
            } //end se
            posicao = posicao + 1; //proxima letra
        } //end repeticao
        //mostrar quantidade de letras maiusculas lidas (contador)
        IO.println( "Letras maiusculas lidas = " + contador );
    } //end metodo02( )

    // ------------------------------ deficao do metodo auxilar 03

    /**
     *
     * @param cadeia - string para armazenar
     * @return - retornar resultado do contador
     */
    public static int contador_maiusculas ( String cadeia )
    {
        int posicao = cadeia.length() - 1;
        int resposta = 0;

        //testar simbolos na cadeia de caracteres
        while( posicao >= 0 )
        {
            if (maiuscula(cadeia.charAt(posicao)))
            {
                resposta = resposta + 1;
            } //end se
            //passar para a proxima
            posicao = posicao - 1;
        } //end repeticao
        //retornar resultado
        return ( resposta );
    } //end contador_maiuscula

    public static void metodo03()
    {
        //definir dados
        String x;
        int contador;
        int tamanho;
        int posicao;
        String maiusculas;

        //definicao de metodos
        IO.println( "Metodo 03" );

        x = IO.readString("Entrar com uma cadeia de caracteres: " );
        IO.println( "Valor lido:  " + x );

        //obter tamanho
        tamanho = x.length( );
        IO.println( "tamanho de " + x + " = " + tamanho );

        //contar maiusculas
        maiusculas = "";
        contador = contador_maiusculas( x );
        posicao = 0;

        while ( tamanho > posicao )
        {
            if (maiuscula (x.charAt(posicao)))
            {
                IO.println( "posicao de " + posicao +
                             " contem " + x.charAt(posicao));
                 maiusculas = maiusculas + x.charAt(posicao);
            } //end se
            posicao = posicao + 1;
        } //end repeticao
        //mostrar quantidade de letras maiusculas
        IO.println( "Letras maiusculas lidas: " + contador
                     + " = " + maiusculas );
    } //metodo03 ( )

    // ------------------------------ deficao do metodo auxilar 04

    /**
     *
     * Funcao separar maiusculas
     * @return - retornar separador
     */

    public static String separar_maiusculas ( String cadeia )
    {
        String resposta = "";
        int posicao = cadeia.length() - 1;

        //testar simbolos na cadeia de caracteres
        while ( posicao >= 0 )
        {
            if(maiuscula(cadeia.charAt(posicao)))
            {
                resposta = resposta + cadeia.charAt(posicao);
            } //end se
            //passar para proxima
            posicao = posicao - 1;
        } //end repeticao
        //retornar resultado
        return ( resposta );
    } //end separar_maiusculas( )

    public static void metodo04( )
    {
        //definir dados
        String x;
        int tamanho;
        int posicao;
        int contador;
        String maiusculas;

        //identificar metodo
        IO.println( "Metodo 04" );

        //ler teclado
        x = IO.readString("Entrar com uma cadeia de caracteres: " );
        IO.print( "Valor lido: " + x );

        //obter tamanho
        tamanho = x.length();
        IO.println( "tamanho de " + x + " = " + tamanho );

        //contar e separar letras
        maiusculas = separar_maiusculas( x );
        contador = contador_maiusculas( x );

        //mostrar quantidade de letras maiusculas
        IO.println( "Letras maiusculas lidas: " + contador +
                     " = " + maiusculas );
    } //end metodo04( )

    // ------------------------------ deficao do metodo auxilar 05
    public static boolean minuscula ( char simbolo )
    {
        //definir dados
        boolean resposta = false;
        if (simbolo >= 'a' && simbolo <= 'z')
        {
            resposta = true;
        } //end se
        //retornar resposta
        return ( resposta );
    } //end minuscula ()

    public static int contar_minusculas ( String cadeia )
    {
        int resposta = 0;
        int posicao = cadeia.length() - 1;

        //teste
        while( posicao >= 0 )
        {
            if (minuscula(cadeia.charAt(posicao)))
            {
                resposta = resposta + 1;
            } //end se
            //passar para proxima
            posicao = posicao - 1;
        } //end repeticao
        //retornar resultado
        return ( resposta );
    } //end contar_minusculas( );

    public static void metodo05()
    {
        //definir dados
        String x;
        int tamanho;
        int posicao;
        int contador;
        int contador02;
        String maiusculas;
        String minusculas;

        //identificar metodo
        IO.println( "Metodo 05" );

        //ler teclado
        x = IO.readString("Entrar com uma cadeia de caracteres: " );
        IO.println( "Valor lido: " + x );

        //obter tamanho
        tamanho = x.length();
        IO.println( "tamanho de " + x + " = " + tamanho );

        //contar e separar letras
        maiusculas = "";
        minusculas = "";
        contador = contador_maiusculas( x );
        contador02 = contar_minusculas( x );
        posicao = 0;

        //teste
        while ( tamanho > posicao )
        {
            if (maiuscula(x.charAt(posicao)))
            {
                IO.println( "posicao de = " + posicao +
                           " contem " + x.charAt(posicao));
                maiusculas = maiusculas + x.charAt(posicao);
            } //end se
            if(minuscula(x.charAt(posicao)))
            {
                IO.println( "posicao de = " + posicao
                            + " contem " + x.charAt(posicao));
                minusculas = minusculas + x.charAt(posicao);
            } //end se
            posicao = posicao + 1;
        } //end repeticao
        //mostrar quantidade de letras maiusculas e minusculas
        IO.println( "Letras maiusculas lidas: " + contador
                     + " = " + maiusculas);
        IO.println( "Letras minusculas lidas: " + contador02
                     + " = " + minusculas );
    } //end metodo05()

    // ------------------------------ deficao do metodo auxilar 06

    public static String separar_minusculas(String cadeia )
    {
        //definir dados
        String resposta = "";
        int posicao = cadeia.length() - 1;

        //teste
        while ( posicao >= 0 )
        {
            if (minuscula(cadeia.charAt(posicao)))
            {
                resposta = resposta + cadeia.charAt(posicao);
            }
            //passar para proxima
            posicao = posicao - 1;
        } //end repeticao
        //retornar resposta
        return ( resposta );
    } //end separar_minusculas( )

    public static void metodo06()
    {
        String x;
        int tamanho;
        int contador;
        int contador02;
        int posicao;
        String minusculas;
        String maiusculas;

        //identificar metodo
        IO.println( "Metodo 06" );

        //ler teclado
        x = IO.readString("Entrar com uma cadeia de caracteres: " );
        IO.println( "Valor lido: " + x );

        //obter tamanho
        tamanho = x.length();
        IO.println( "tamanho de " + x + " = " + tamanho );

        //contador e separador
        maiusculas = separar_maiusculas( x );
        minusculas = separar_minusculas ( x );
        contador = contador_maiusculas( x );
        contador02 = contar_minusculas( x );

        //mostrar
        IO.println( "Letras maiusculas lidas: " + contador
                     + " = " + maiusculas );
        IO.println( "Letras minusculas lidas: " + contador02
                     + " = " + minusculas);
    } //end metodo06()

    // ------------------------------ deficao do metodo auxilar 07
    public static void metodo07()
    {
        //definir dados
        String palavra = ""; //valor vazio
        int posicao;
        int quantidade = 0;
        char simbolo = '=';

        //identificar metodo
        IO.println("Metodo 07");

        palavra = IO.readString("Entrar com um digito: " );
        //verificar o valor armazenado
        IO.println( "Palavra lida: " + palavra );

        //obter o tamanho
        quantidade = palavra.length();
        IO.println( "quantidade = " + quantidade );

        //repeticao para cada posicao
        for ( posicao = 0; quantidade > posicao; posicao = posicao + 1)
        {
            simbolo = palavra.charAt(posicao);
            if( simbolo >= '0' && simbolo <= '9' )
            {
                IO.println( "Digito =  " + simbolo );
            } //end se
        } //end repeticao
    } //end metodo07( )

    // ------------------------------ deficao do metodo auxilar 08
    public static boolean digito ( char simbolo )
    {
        //definir dados
        boolean resposta = false;
        if(simbolo >= '0' && simbolo <= '9')
        {
            resposta = true;
        }
        //retornar resposta
        return ( resposta );
    } //end digito( )

    public static int contar_impar ( String cadeia )
    {
        //definir dados
        int posicao = cadeia.length() - 1;
        int resposta = 0;

        //testar simbolos
        while ( posicao >= 0 )
        {
            if(digito(cadeia.charAt(posicao)) && (cadeia.charAt(posicao)) % 2 != 0 )
            {
                resposta = resposta + 1;
            } //end se
            //passar para proxima
            posicao = posicao - 1;
        } //end repeticao
        //retornar resposta
        return ( resposta );
    } //end contar_impar

    public static void metodo08()
    {
        //definir dados
        String x;
        int contador;

        //identificar o metodo
        IO.println( "Metodo 08" );


        //ler teclado
        x = IO.readString("Entrar com algum digito: " );
        IO.println( "Valor lido: " + x );


        //contar digitos impares
        contador = contar_impar( x );
        IO.println( "Digitos impares: " + contador );
    } //end metodo08()

    // ------------------------------ deficao do metodo auxilar 09
    public static String separador ( String cadeia )
    {
        //definir dados
        String resultado = "";
        int posicao = cadeia.length() - 1; //ultima

        //testar
        while( posicao >= 0 )
        {
            if (digito(cadeia.charAt(posicao)))
            {
                resultado = resultado + cadeia.charAt(posicao);
            } //end se
            //passar para o proximo
            posicao = posicao - 1;
        } //end repeticao
        //retornar resultado
        return ( resultado );
    } //end separador( )

    public static void metodo09()
    {
        //definir dados;
        String x;
        int contador;
        int tamanho;
        int quantidade;
        int posicao = 0;
        String impares;

        //identificar metodo
        IO.println( "Metodo 09" );

        //ler teclado
        x = IO.readString("Entrar com um valor: " );
        IO.println( "Valor lido = " + x  );

        //obter tamanho
        tamanho = x.length();
        IO.println( "tamanho de " + x + " = " + tamanho );

        //separador de digitos impares
        impares = separador( x );

        while(posicao < tamanho )
        {
            if (digito(x.charAt(posicao)))
            {
                IO.println( "posicao = " + posicao +
                           " contem " + x.charAt(posicao));
            } //end se
            posicao = posicao + 1;
        } //end repeticao
        IO.println( "Digitos impares = " + impares );
    } //end metodo09( )

    // ------------------------------ deficao do metodo auxilar 10
    public static boolean letter ( char simbolo )
    {
        //definir dados
        boolean resposta = false;
        if(simbolo >= 'a' && simbolo <= 'z' ||
           simbolo >= 'A' && simbolo <= 'Z' )
        {
            resposta = true;
        } //end se
        //retornar resposta
        return ( resposta );
    } //end letter( )

    public static int contador_letter ( String cadeia )
    {
        //definir dados
        int posicao = cadeia.length() - 1;
        int resposta = 0;

        //testar
        while( posicao >= 0 )
        {
            if(letter(cadeia.charAt(posicao)))
            {
                resposta = resposta + 1;
            }//end se
            posicao = posicao - 1;
        } //end repeticao
        //retornar resposta
        return ( resposta );
    } //end contador_letter

    public static String separador_letter ( String cadeia )
    {
        //definir dados
        String resposta = "";
        int posicao = cadeia.length() - 1; //ultima

        //teste
        while(posicao >= 0)
        {
            if(letter(cadeia.charAt(posicao)))
            {
                resposta = resposta + cadeia.charAt(posicao);
            } //end se
            //passar para proxima
            posicao = posicao - 1;
        } //end repeticao
        //retornar resposta
        return ( resposta );
    } //end separador_letter( )

    public static int contador_digito ( String cadeia )
    {
        //definir dados
        int posicao = cadeia.length() - 1;
        int resposta = 0;

        //teste
        while ( posicao >= 0 )
        {
            if(digito(cadeia.charAt(posicao)))
            {
                resposta = resposta + 1;
            }//end se
            //passar para proxima
            posicao = posicao - 1;
        } //end repeticao
        //retornar resposta
        return ( resposta );
    } //end contador_digito

    public static void metodo10()
    {
        //definir dados
        String x;
        int contador;
        int contador02;
        int tamanho;
        int quantidade;
        int posicao = 0;
        String digit; //separador digitos
        String letter; //separar letras

        //identificar metodo
        IO.println( "Metodo 10" );

        //ler no teclado
        x = IO.readString("Entrar com um valor: " );
        IO.println("Valor lido: " + x);

        //obter tamanho
        tamanho = x.length();
        IO.print( "tamanho de " + x + " = " + tamanho );

        //contar e separar digitos e letras
        digit = separador( x ); //digitos
        letter = separador_letter( x );
        contador = contador_digito( x );
        contador02 = contador_letter( x );

        while(posicao < tamanho )
        {
            if (digito(x.charAt(posicao)))
            {
                IO.println( "posicao = " + posicao +
                             " contem " + x.charAt(posicao));
            } //end se
            if (letter(x.charAt(posicao)))
            {
                IO.println( "posicao de = " + posicao
                             + " contem "  + x.charAt(posicao));
            }//end se
            posicao = posicao + 1;
        } //end repeticao

        IO.println( "Letras = " + letter );
        IO.println( "Contador letras = " + contador02 );
        IO.println();
        IO.println( "Digitos: " + digit );
        IO.println( "Contador digito = " + contador );
    } //metodo10( )

    // ------------------------------ deficao do metodo principal
    public static void main ( String [ ] args)
    {
        // identificar
         IO.println ( "EXEMPLO0081 - Programa em Java" );
         IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
 
         
        //definir dados
        int opcao;

        //repetir o metodo ate parar
        do {
            //mostrar opcoes
            IO.println( "Opcoes:" );
            IO.println( " 0 - parar" );
            IO.println( " 1 - metodo 01" );
            IO.println( " 2 - metodo 02" );
            IO.println( " 3 - metodo 03" );
            IO.println( " 4 - metodo 04 ");
            IO.println( " 5 - metodo 05 ");
            IO.println( " 6 - metodo 06 ");
            IO.println( " 7 - metodo 07 ");
            IO.println( " 8 - metodo 08 ");
            IO.println( " 9 - metodo 09 ");
            IO.println( " 10 - metodo 10 ");

            IO.println();

            //ler opcao do teclado
            opcao = IO.readint("Qual a sua opcao? ");

            //escolher a opcao
            switch (opcao)
            {
                case 0:
                    break;
                case 1:
                    metodo01();
                    break;
                case 2:
                    metodo02();
                    break;
                case 3:
                    metodo03();
                    break;
                case 4:
                    metodo04();
                    break;
                case 5:
                    metodo05();
                    break;
                case 6:
                    metodo06();
                    break;
                case 7:
                    metodo07();
                    break;
                case 8:
                    metodo08();
                    break;
                case 9:
                    metodo09();
                    break;
                case 10:
                    metodo10();
                    break;

                    default:
                        IO.println( "ERROR, TRY AGAIN!" );
                        break;

            } //end escolher
        } //metodo fazer
        while( opcao != 0 );

        //encerrar execucao
        IO.println();
        IO.pause( "Apertar ENTER para terminar." );
    } //end main( )

} //end Exemplo0081( )

//----------------------------- observacao
// Theldo, o Exemplo0081 é a junção de todos os Exemplos do exercício 
// proposto em somente um arquivo. 
// 

// ---------------------------- teste

// Exemplo0061 (OK)
// Exemplo0062 (OK)
// Exemplo0063 (OK)
// Exemplo0064 (OK) 
// Exemplo0065 (OK)
// Exemplo0066 (OK)
// Exemplo0067 (OK)
// Exemplo0068 (OK)
// Exemplo0069 (OK)
// Exemplo0070 (OK)