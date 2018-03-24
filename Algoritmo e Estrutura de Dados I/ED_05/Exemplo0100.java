/**
 * Exemplo0100
 * @author Matheus Santos Rosa Carneiro
 * @version 11
 * Turno: Vespertino
 * Matricula: 613414
 */

//--------- dependencias
import IO.*;

//-------------------------------------------- definicao da classe principal
public class Exemplo0100 {
    //---------------------------------------- definicao de metodo auxiliar 01
    public static void metodo01(int x) {
        //repetir enquanto valor maior que zero
        while (x > 0) {
            //mostrar valor
            IO.println("Valor = " + x);
            //passar para proximo valor maior que zero
            x = x - 1; //essa linha é responsavel em subtrair o valor colocado pelo usuário até que o x seja igual a 0
            //para que nao ocorra um loop infinito
        } //end repeticao
    } //end metodo01( )
    //---------------------------------------- definicao de metodo auxiliar 02

    /**
     * metodo para mostrar valores inteiros decrescentes
     * @param x
     */
    public static void metodo02(int x)
    {
        //definir dado local
        int y = x;

        //repetir enquanto valor maior que zero
        while (y > 0)
        {
            //mostrar valor
            IO.println( "Valor = " + y );
            //passar para o proximo
            y = y - 1;
        } //end repeticao
    } //end metodo02( )

    //---------------------------------------- definicao de metodo auxiliar 03

    /**
     * metodo para mostrar valores inteiros decrescentes
     * utilizando o for como repeticao
     */

    public static void metodo03(int x)
    {
        //definir dado local
        int y;
        //repetir enquanto valor maior que zero
        for (y = x; y > 0; y = y - 1)
        {
            IO.println( "Valor = " + y );
        } //end repeticao
    } //end metodo03( )

    //---------------------------------------- definicao de metodo auxiliar 04
    public static void metodo04(int x)
    {
        //definir dado local
        int y;
        //repetir enquanto valor maior que zero
        for (y = 1; y <= x; y = y + 1)
        {
            IO.println( "Valor = " + y );
        } //end repeticao
    } //end metodo04( )

    //---------------------------------------- definicao de metodo auxiliar 05

    /**
     * metodo para mostrar valores na sequencia 1 - 3 - 5 - 7
     * de 2 em 2, o valor chamado no metodo ( x ) vai ser somado com 2
     */

    public static void metodo05(int x)
    {
        //definir dado local
        int y;
        int z = 1;
        //repetir enquanto valor maior que zero
        for (y = 1; y <= x; y = y + 1)
        {
            //mostrar valor
            IO.println( "Valor = " + z );
            //passar ao proximo
            z = z + 2;
            //z = 1 - valor inicial
            //a cada repeticao o z soma 2
        }
    } //end metodo05( )

    //---------------------------------------- definicao de metodo auxiliar 06

    /**
     * metodo para mostrar valores na sequencia 1 - 2 - 4 - 6 - 8
     * de 2 em 2
     */

    public static void metodo06(int x)
    {
        //definir dado local
        int y;
        int z = 1;

        //repetir enquanto valor maior que zero
        IO.println( "Valor = " + z ); //valor inicial z
        z = 2; // outro valor definido para repeticao
        // z = 2
        for(y = 1; y < x; y = y + 1)
        {
            IO.println( "Valor = " + z );
            //passar ao proximo
            z = z + 2;
        } //end repeticao
    } //end metodo06( )

    //---------------------------------------- definicao de metodo auxiliar 07
    public static void metodo07(int x)
    {
        //definir dado local
        int y;
        int z;
        //repetir enquanto valor maior que zero
        IO.println( "Valor = 1/1 " );
        z = 3;
        for (y = 2; y <= x; y = y + 1) //y = 3

        //z = 3 - 1 = 2 / 3 (segundo valor)
        //z = 3 + 2 = 5 - 1 = 4 / 5 (terceiro valor) - z fica valendo 3 e soma com 2
        //z = 3 + 4 = 7 - 1 = 6 / 7 (quarto valor)
        //z = 3 + 6 = 9 - 1 = 8/ 9 (quinto valor)
        {
            //mostrar valor
            IO.println( "Valor = " + (z - 1) + "/" + z ); // 'z' valor armazenado somado com + 2
            // (z - 1) valor armazenado + 3 e - 1
            //passar ao proximo
            z = z + 2;
        } //end repeticao
    } //end metodo07( )

    //---------------------------------------- definicao de metodo auxiliar 08
    public static void metodo08 (int x)
    {
        //definir dado local
        int y;
        int z;
        double soma = 1.0;
        //repetir valor enquanto valor maior que zero
        IO.println( "Valor = 1/1 " );
        z = 3;
        for (y = 2; y <= x; y = y + 1)
        {
            //mostrar valor
            IO.println( "Valor = " + (z - 1) + "/" + z );
            //somar uma parcela
            soma = soma + 1.0 * (z - 1)/ z;
            //passar ao proximo
            z = z + 2;
        } //end repeticao
        //mostrar resultado
        IO.println( "Soma = " + soma ); //soma de todos os valores
    } //end metodo08( )

    //---------------------------------------- definicao de metodo auxiliar 09
    public static double metodo09(int x)
    {
        //definir dado local
        int y;
        int z;
        double soma = 1.0;
        //repetir enquanto o valor maior que zero
        IO.println( "Valor = 1/1 " );
        z = 3;
        for (y = 2; y < x; y = y + 1) //mudança do sinal '<'
        {
            //mostrar valor
            IO.println( "Valor = " + (z - 1) + "/" + z );
            //somar uma parcela
            soma = soma + 1.0 * (z - 1) / z;
            //passar ao proximo
            z = z + 2;
        } //end repeticao
        //retornar resposta
        return(soma);
    } //end metodo09( )

    //---------------------------------------- definicao de metodo auxiliar 10
    public static double metodo10(int x)
    {
        //definir dado local
        int y;
        int numerador = 1;
        int denominador = 1;
        double soma = (double) numerador / denominador;
        //repetir enquanto valor maior que zero
        IO.println( "+ " + soma);
        for (y = 1; y < x; y = y + 1)
        {
            //y = 1
            // y * 2 = 2 - denominar = 1 + 2 = 3 - 2/3 (segunda)
            // y * 2 = 2 * 2 = 4 - denominador = 3 + 2 = 5 - 4/5 (terceiro valor)
            // y * 2 = 3 * 2 = 6 - denominador = 5 + 2 = 7 - 6/7 (quarto valor)
            // y * 2 = 4 * 2 = 8 - denominador = 7 + 2 = 9 - 8/9 (quinto valor)
            //numerador = 1
            // a cada repeticao o y soma + 1 em seu valor
            // por isso ele esta multiplicando por 2 - 3 - 4

            //passar ao proximo numerador
            numerador = y * 2;
            //passar ao proximo denominador
            denominador = denominador + 2;
            //mostrar valor
            IO.println( "+ " + numerador + "/" + denominador );
            //somar uma parcela
            soma = soma + 1.0 * numerador / denominador;
        } //end repeticao
        //retornar resposta
        return (soma);
    } //end metodo10( )

    //---------------------------------------- definicao de metodo auxiliar 11
    public static double metodo11()
    {
        //definir dado local
        int x          = 0;
        int y          = 0;
        int quantidade = 0;

        //ler quantidade de termos no teclado
        quantidade = IO.readint("Entrar com os termos: " );
        IO.println( "Valor lido = " + quantidade );

        //repetir enquanto valor for maior que zero
        for (x = 1; x <= quantidade; x = x + 1)
        {

            y = 5 * x;
            //mostrar os termo(s) e valore(s) correspondente(s)
            IO.println("" + x +"\t" + y);
        } //end repeticao
        return ( quantidade );
    } //end metodo11( )

    //---------------------------------------- definicao de metodo auxiliar 12
    public static double metodo12()
    {
        //definir dado local
        int x          = 0;
        int y          = 0;
        int quantidade = 0;

        //ler quantidade de termos no teclado
        quantidade = IO.readint("Entrar com os termos: " );
        IO.println( "Valor lido = " + quantidade );

        //repetir enquanto valor for maior que zero
        for (x = 1; x <= quantidade; x = x + 1)
        {

            y = 5 * x; //5 x 1 = 5 - 5 x 2 = 10
            y = 2 * y; //5 x 2 = 10 x 2 = 20
            //5 x 3 = 15 x 2 = 30
            //5 x 4 = 20 x 2 = 40
            //5 x 5 = 25 x 2 = 50

            //mostrar os termo(s) e valore(s) correspondente(s)
            IO.println("" + x +"\t" + y);
        } //end repeticao
        return ( quantidade );
    } //end metodo12( )

    //---------------------------------------- definicao de metodo auxiliar 13
    public static double metodo13()
    {
        //definir dado local
        int x          = 0;
        int y          = 0;
        int quantidade = 0;

        //ler quantidade de termos no teclado
        quantidade = IO.readint("Entrar com os termos: " );
        IO.println( "Valor lido = " + quantidade );

        //repetir enquanto valor for maior que zero
        for (x = quantidade; x > 0; x = x - 1)
        {

            y = 5 * x; //x = 1
            y = y * 2 - 5;

            //mostrar os termo(s) e valore(s) correspondente(s)
            IO.println("" + x +"\t" + y);
        } //end repeticao
        return ( quantidade );
    } //end metodo13( )

    //---------------------------------------- definicao de metodo auxiliar 14
    public static double metodo14()
    {
        int x = 0;
        int y = 1;
        int quantidade = 0;

        quantidade = IO.readint("Entrar com os termos: " );
        IO.println( "Valor lido = " + quantidade );

        for (x = 1; quantidade >= x; x = x + 1)
        {
            IO.println("" + y + "/" + (x * 5));
        }
        return (quantidade);
    } //end metodo14( )

    //---------------------------------------- definicao de metodo auxiliar 15
    public static double metodo15()
    {
        int x = 0;
        int y = 1;
        int quantidade = 0;

        quantidade = IO.readint("Entrar com os termos: " );
        IO.println( "Valor lido = " + quantidade );

        for (x = 1; quantidade >= x; x = x + 1)
        {
            IO.println("" + y + "/"  + (int)Math.pow(5,x));
        }
        return (quantidade);
    } //end metodo15( )

    //---------------------------------------- definicao de metodo auxiliar 16
    public static double metodo16(int n)
    {
        //definir dados
        int cont = 0;
        int numeroPar = 0;
        int resultado = 0 ;

        while ( cont != n )
        {
            numeroPar = numeroPar + 2 ;
            if ((numeroPar)% 5 != 0)
            {
                resultado = resultado + numeroPar;
                cont = cont + 1;
            }
        }
        return resultado ;
    }//end metodo16()

    //---------------------------------------- definicao de metodo auxiliar 17
    public static double metodo17(int n)
    {
        //definir dados
        int cont = 0;
        int numeroPar = 0;
        int resultado = 0 ;

        while ( cont != n )
        {
            numeroPar = numeroPar + 2 ;
            if ((numeroPar)% 5 != 0)
            {
                resultado = resultado + numeroPar ;

                cont = cont + 1;
                IO.println("Numero par = " + "1/" + numeroPar);
                //     IO.println("Resultado = " + resultado);

                // IO.println("Cont = " + cont);
            }
        }

        return (resultado) ;
    }

    //---------------------------------------- definicao de metodo auxiliar 18
    public static int natural (int x)
    {
        //definir dados
        int y = 0;
        int n = 0; //numero natural
        int resultado = 0;
        //repetir enquanto valor maior que zero
        while(y != x)
        {
            n = n + 1; //numero natural

            if ( (n) > 0 )
            {
                resultado = resultado + n;
                y = y + 1;

                IO.println( "Numero natural = " + n );
            } //end se
        } //end repeticao
        //retornar resultado
        return (resultado);
    } //end soma( )

    public static void metodo18( )
    {
        //definir dados
        int x;
        int resultado;
        //ler valor no teclado
        x = IO.readint("Entrar com um valor: " );
        IO.println( "Valor = " + x );

        resultado = natural(x);
        IO.println( "Soma = " + resultado );
    } //end metodo18( )
    //---------------------------------------- definicao de metodo auxiliar 19
    public static double potenciaN(double x)
    {
        //definir dados
        int y = 0;
        int n = 0; //natural
        int resultado = 0;

        //repetir enquanto valor maior que zero
        while(y != x)
        {
            n = n + 1;
            if ((n) > 0)
            {
                resultado = resultado + (int)Math.pow(n , 2);
                y = y + 1;

                IO.println( "Numero natural = " + n );
                IO.println( "Potencia = " + n * n );
            } //end se
        } //end repetica
       //retornar resultado
       return (resultado);
    } //end potenciaN( )

    public static void metodo19()
    {
        //definir dados
        double x;
        double resultado;

        //ler valor no teclado
        x = IO.readint("Entrar com um valor: " );
        IO.println( "Valor = " + x );

        resultado = potenciaN(x);
        IO.println( "Soma = " + resultado );
    } //end metodo19( )

    //---------------------------------------- definicao de metodo auxiliar 20
    public static double inversoN(int x)
    {
        //definir dados
        double y = 0.0; //cont
        double n = 0.0; //natural
        double resultado = 0.0;

        //repetir enquanto valor maior que zero
        while (y != x)
        {
            n = n + 1;

            if ((n) > 0)
            {
                resultado = resultado + n;
                y = y + 1;
                IO.println( "Numero natural = " + n );
            } //end se
        } //end repeticao
        //retornar resultado
        return (resultado);
    } //end inversoN( )

    public static void metodo20( )
    {
        //definir dados
        int x;
        double resultado;

        //ler valor no teclado
        x = IO.readint("Entrar com um valor: " );
        IO.println( "Valor = " + x );

        resultado = inversoN(x);
        IO.println( "Soma = " + resultado );
    } //end metodo20( )

    //---------------------------------------- definicao de metodo auxiliar Tarefa01
    public static int fatorial(int n)
    {
        //definir dados
        int resultado = 1;
        //enquanto valor maior que zero
        while (n > 0)
        {
            resultado = resultado * n;

            n = n - 1;
        } //end repeticao
        //retornar resultado
        return(resultado);
    } //end fatorial( )

    public static void tarefa01()
    {
        //definir dados
        int resultado;
        int n;

        //ler valor do teclado
        n = IO.readint("Entrar com um valor: " );
        IO.println( "Valor = " + n );

        resultado = fatorial(n);
        IO.println( "Fatorial = " + resultado );
    } //end tarefa01( )

    //---------------------------------------- definicao de metodo auxiliar Tarefa02
    public static double funcaoN(double n)
    {
        //definir dados
        double x = 1.0;
        double y = 3.0;
        double z = 2.0;
        double resultado = 1.0;

        //repetir enquanto valor maior que zero
        while (n > 0)
        {
            resultado = resultado * (x + z / y);
            z = z + 1;
            y = y + 1;
            n = n - 1;
        } //end repeticao
        //retornar resultado
        return (resultado);
    } //end funcaoN( )

    public static void tarefa02()
    {
        //definir dados
        double n;
        double resultado;

        //ler valor no teclado
        n = IO.readdouble("Entrar com um valor: " );
        IO.println( "Valor = " + n );

        resultado = funcaoN(n);
        IO.println( "" + resultado );
    } //end tarefa02( )
    //---------------------------------------- definicao do metodo principal

    /**
     * main( ) - metodo principal
     */
    public static void main(String[] args) {
        //identificar
        IO.println("Exemplo0100 - Programa em Java");
        IO.println("Autor: Matheus Santos Rosa Carneiro");
        IO.println(); //pular uma linha

        //definir dados
        int opcao;

        //metodo fazer
        do {
            //mostrar opcoes
            IO.println("Opcoes:");
            IO.println(" 0 - parar");
            IO.println(" 1 - metodo 01");
            IO.println(" 2 - metodo 02");
            IO.println(" 3 - metodo 03");
            IO.println(" 4 - metodo 04");
            IO.println(" 5 - metodo 05");
            IO.println(" 6 - metodo 06");
            IO.println(" 7 - metodo 07");
            IO.println(" 8 - metodo 08");
            IO.println(" 9 - metodo 09");
            IO.println("10 - metodo 10");
            IO.println("11 - metodo 11");
            IO.println("12 - metodo 12");
            IO.println("13 - metodo 13");
            IO.println("14 - metodo 14");
            IO.println("15 - metodo 15");
            IO.println("16 - metodo 16");
            IO.println("17 - metodo 17");
            IO.println("18 - metodo 18");
            IO.println("19 - metodo 19");
            IO.println("20 - metodo 20");
            IO.println("21 - tarefa 01");
            IO.println("22 - tarefa 02");

            IO.println();

            //ler opcao do teclado
            opcao = IO.readint("Qual a sua opcao? ");

            //escolher a opcao
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    metodo01(5); //passar quantas vezes devera ser executado o x, até queo valor seja > 0
                    break;
                case 2:
                    metodo02(5);
                    break;
                case 3:
                    metodo03(6);
                    break;
                case 4:
                    metodo04(10);
                    break;
                case 5:
                    metodo05(5); //valor somado com 2 //repeticao 5 vezes
                    break;
                case 6:
                    metodo06(5); //repeticao 5 vezes
                    break;
                case 7:
                    metodo07(5); //repeticao 5 vezes
                    break;
                case 8:
                    metodo08(5); //repeticao 5 vezes
                    break;
                case 9:
                    IO.println( "Soma = " + metodo09(6) );
                    break;
                case 10:
                    //definir dado para receber o resultado
                    double resposta;
                    //receber o resultado
                    resposta = metodo10(5);
                    //mostrar resultado
                    IO.println( "Soma = " + resposta );
                    break;
                case 11:
                    metodo11( );
                    break;
                case 12:
                    metodo12( );
                    break;
                case 13:
                    metodo13( );
                    break;
                case 14:
                    metodo14();
                    break;
                case 15:
                    metodo15();
                    break;
                case 16:
                    IO.println("Resultado: " + (int)metodo16(5));
                    break;
                case 17:
                    IO.println( "Resultado = " + "1/" + (int)metodo17(5) );
                    break;
                case 18:
                    metodo18();
                    break;
                case 19:
                    metodo19();
                    break;
                case 20:
                    metodo20();
                    break;
                case 21:
                    tarefa01();
                    break;
                case 22:
                    tarefa02();
                    break;

                default:
                    IO.println("Error, invalid option!!!");
                    break;
            } //fim escolher
        } //end do( )
        while(opcao != 0);
        //encerrar
        IO.pause("Apertar ENTER para terminar.");
    } //end main( )
} //end Exemplo0100( )

// --------------------------------------------- testes
// Exemplo0081 (OK) - mostrando todos os valores definidos no metodo principal.
// Exemplo0082 (OK) - mostrando valores inteiros decrescentes.
// Exemplo0083 (OK) - mostrar valores inteiros utilizando, for, como repeticao.
// Exemplo0084 (OK) - mostrar valores inteiros crescentes
// Exemplo0085 (OK) - mostrar valor somado com + 2
// Exemplo0086 (OK) - mostrar valor somado com + 2
// Exemplo0087 (OK) - mostrar valores na sequencia 1/1 - 2/3 - 4/5 - 6/7 - 8/9
// Exemplo0088 (OK) - mostrar a soma de todos os valores fracionarios
// Exemplo0089 (OK) - mostrar a soma de todos os valores fracionarios
// Exemplo0090 (OK)
// Exemplo0091 (OK)
// Exemplo0092 (OK)
// Exemplo0093 (OK)
// Exemplo0094 (OK)
// Exemplo0095 (OK)
// Exemplo0096 (OK)
// Exemplo0097 (OK)
// Exemplo0098 (OK)
// Exemplo0099 (OK)
// Exemplo0100 (OK)
// Tarefa01 (OK)
// Tarefa02 (OK)