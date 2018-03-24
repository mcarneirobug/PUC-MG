/**
  * ---------------------------------------------- Documentacao preliminar
  * Pontificia Universidade Catolica de Minas Gerais
  * Curso de Ciencia da Computacao
  * Algoritmos e Estruturas de Dados I
  *
  * Trabalho pratico: ED_06
  *
  * Objetivo:
  * Aplicar os conhecimentos de recursividade
  *
  * Autor:   Matricula: 613414  Nome: Matheus Santos Rosa Carneiro 
  * Versao:  1.0                Data: 20/09/2017
  *
  * Referencias:
  * - Exemplos mostrados em sala de aula
  * - Apostila: Fundamentos de Programacao - Notas de aulas
  *
  */

// ---------------------------------------------- classes nativas
// 
import IO.*;

// ---------------------------------------------- definicao da classe principal
public class ED_06
{

// ---------------------------------------------- definicao de metodo auxiliar 01
   public static void metodo01 ( int x )
   {
   // testar se valor positivo
      if ( x > 0 )
      {
      // mostrar valor
         IO.println ( "Valor lido = " + x );
      // tentar fazer de novo com valor menor
         metodo01 ( x-1 );
      } //endSe
   } //end metodo01( )
   
// ---------------------------------------------- definicao de metodo auxiliar 02
   public static void metodo02( int x )
   {
      // testar se valor positivo
      if ( x > 0 )
      {
      // tentar fazer de novo com valor menor
         metodo02 ( x-1 );
      // mostrar valor ( acao pendente )
         IO.println ( "Valor = " + x );
      } //endSe
   } //end metodo02( )
   
// ---------------------------------------------- definicao de metodo auxiliar 03
   public static void metodo03( int x )
   {
      // testar se contador valido
      if ( x > 1 )
      {
      // mostrar valor relativo
         IO.println( " " + x );
      // tentar fazer de novo com valor menor
         metodo03 ( x-1 );
      // motor da recursividade
      }
      else
      {
      // mostrar ultimo
         IO.println ( " " + x ); // base da recursividade
      } //endSe
   } //end metodo03( )

// ---------------------------------------------- definicao de metodo auxiliar 04
   public static void metodo04( int x )
   {
      // testar se contador valido
      if ( x > 1 )
      {
      // mostrar valor relativo
         IO.println( " " + 2*(x-1) );
      // tentar fazer de novo com valor menor
         metodo04 ( x-1 );
      }
      else
      {
      // mostrar ultimo
         IO.println ( " 1" );
      } // endSe
   } //end metodo04( )
   
// ---------------------------------------------- definicao de metodo auxiliar 05
   public static void metodo05( int x )
   {
      // testar se contador valido
      if ( x > 1 )
      {
      // tentar fazer de novo com valor menor
         metodo05 ( x-1 );
      // mostrar valor relativo
         IO.println( " + " + (2*(x-1)) + "/" + (2*x-1) );
      }
      else
      {
      // mostrar ultimo valor (primeiro na sequencia)
         IO.println( " 1" );
      } // endSe
   } //end metodo05( )
   
// ---------------------------------------------- definicao de funcao auxiliar 01
   public static int funcao01( int x )
   {
      // definir dado
      int resposta = 0;
   // testar se contador valido
      if ( x > 1 )
      {
      // tentar fazer de novo com valor menor
         resposta = x + funcao01 ( x-1 );
      // mostrar valor relativo
         IO.println( " + " + x );
      }
      else
      {
      // mostrar ultimo
         IO.println( " 1" );
      // ultima resposta
         resposta = 1;
      } // endSe
   // retornar resposta
      return ( resposta );
   } //end funcao01( )
   
// ---------------------------------------------- definicao de funcao auxiliar 02 
   public static double funcao02( int x )
   {
      // definir dado
      double resposta = 0.0;
   // testar se contador valido
      if ( x > 1 )
      {
      // calcular termo e tentar fazer de novo com valor menor
         resposta = (2.0*(x-1) / (2.0*x-1)) + funcao02 ( x-1 );
      // mostrar valor relativo
         IO.println( " + " + 2*(x-1) + "/" + (2*x-1) );
      }
      else
      {
      // ultima resposta
         resposta = 1.0;
      // mostrar ultimo
         IO.println( " 1" );
      } // endSe
   // retornar resposta
      return ( resposta ); 
   } //end funcao02( )  
   
// ---------------------------------------------- definicao de funcao auxiliar 03
   public static int funcao03( int x )
   {
      // definir dado
      int resposta = 1;
   // base
   // testar se contador valido
      if ( x >= 10 )
      {
      // tentar fazer de novo com valor menor
         resposta = 1 + funcao03 ( x/10 );
      // motor 1
      }
      else
      {
         if ( x < 0 )
         {
         // fazer de novo com valor absoluto
            resposta = funcao03 ( -x );
         // motor 2
         } // endSe
      } // endSe
   // retornar resposta
      return ( resposta );
   } //end funcao03( )
   
// ---------------------------------------------- definicao de funcao auxiliar 04
   public static int funcao04( int x )
   {
      // definir dado
      int resposta = 0;
   // testar se contador valido
      if ( x == 1 || x == 2 )
      {
      // primeiros dois valores iguais a 1
         resposta = 1;
      // bases
      }
      else
      {
         if ( x > 1 )
         {
         // fazer de novo com valor absoluto
            resposta = funcao04 ( x-1 ) + funcao04 ( x-2 );
         } // endSe 
      } // endSe
   // retornar resposta
      return ( resposta );
   } //end funcao04( )
   
// ---------------------------------------------- definicao de funcao auxiliar 05
   public static int funcao05(String cadeia, int x)
   {
      // definir dado
      int resposta = 0;
   // testar se contador valido
      if ( 0 <= x && x < cadeia.length( ) )
      {
      // testar se letra minuscula
         if ( cadeia.charAt (x) >= 'a' &&
         cadeia.charAt (x) <= 'z' )
         {
         // fazer de novo com valor absoluto
            resposta = 1;
         } // endSe
         resposta = resposta + funcao05 ( cadeia, x+1 );
      } // endSe
   // retornar resposta
      return ( resposta );
   } //end funcao05( )
   
// ---------------------------------------------- definicao de exe auxiliar 01
   public static void exe01( int contador, int valor )
   {
      if (contador > 0)
      {
        // calcular o valor correspondente ao termo
         IO.println ( "Valor: " + valor );
         exe01(contador -1, valor +2);        
      } // endSe
   } //end exe01( )
   
// ---------------------------------------------- definicao de exe auxiliar 02
   public static void exe02( int x )
   {
      //testar se valor positivo
      if(x > 0)
      {
      //mostrar valor
         IO.println("Valor lido: "+ x * 3);
      //tentar fazer de novo com valor menor
         exe02(x-1);
      }//endSe
   } //end exe02( )
   
// ---------------------------------------------- definicao de exe auxiliar 03
   public static void exe03( int x )
   {
      if (x > 1)
      {
         exe03(x-1);
         IO.println ("Valor: " + 3 * (x-1) );            
      }
      else 
      {
         IO.println ("Valor: " + x );
      } //endSe   
   } //end exe03( ) 
   
// ---------------------------------------------- definicao de exe auxiliar 04
   public static void exe04(int x)
   {
      if(x > 1)
      {
         //mostrar valor
         IO.println("Valor lido : 1/"+ (int)Math.pow (3 , x) / 3);
          
          //tentar fazer de novo com valor menor
         exe04(x-1);  
      }
      else
      {
         IO.println("Valor lido: 1");
      }//endSe
   } //end exe04( ) 
   
// ---------------------------------------------- definicao de exe auxiliar 05
   public static void exe05(String cadeia, int posicao)
   {
      int tamanho = cadeia.length( );
      if ( posicao < tamanho )
      { 
         if( cadeia.charAt(posicao) >= 'A' || cadeia.charAt(posicao) <= 'Z' ||
             cadeia.charAt(posicao) >= 'a' || cadeia.charAt(posicao) <= 'z' ||
             cadeia.charAt(posicao) >= '0' || cadeia.charAt(posicao) <= '9' )
         {
            IO.println ( "Caractere lido: " + cadeia.charAt(posicao) );
            exe05( cadeia , posicao = posicao + 1 );
         } //endSe  
      } //endSe
   } //end exe05( ) 

// ---------------------------------------------- definicao de exe auxiliar 06
   
   public static int func06(int x, int soma)
   {
      if(x > 1)
      {
         soma = (2* x + 1) + func06(x - 1, soma);
         return (soma);
      } 
      else
      {
         soma = 3;
         return(soma);
      } //endElse
   } //end func06( ) 
   
   public static void exe06( )
   {
      //definir dado
      int d;
      int resultado;
      
      //ler valor do teclado
      d = IO.readint("Informe a quantidade: " );
      
      resultado = func06(d, 0);
      IO.println("Resultado: " + resultado); 
      
      //encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   
   } //end exe06( ) 
 
   
// ---------------------------------------------- definicao de exe auxiliar 07
   public static double somarIn(int quantidade)
   {  
      //definir dado
      double resposta;
      
      if(quantidade == 1)
      {
         resposta = 1/(double)(2 * quantidade + 1);
      }
      else
      {
         resposta = 1/(double)(2 * quantidade + 1) + somarIn(quantidade - 1);
      } //endSe
      //retornar resposta
      return(resposta);
   } //end somarIn( )
   
   public static void exe07( )
   {  
      //definir dados
      int quantidade;
      double result;
      
      quantidade = IO.readint("Informe o valor da quantidade: " );
      if(quantidade > 0)
      {
         result = somarIn(quantidade);
         IO.println("Soma dos inversos: " + result);
      } //endSe 
      
      //encerrar
      IO.pause ( "Apertar ENTER para terminar." );      
   } //end exe07( );
   
// ---------------------------------------------- definicao de exe auxiliar 08
   public static int fibonacci(int quantidade)
   {
      //definir dado
      int resultado;
      
      if(quantidade == 1 || quantidade == 2)
      {
         resultado = 1;
      } 
      else
      {
         resultado = fibonacci(quantidade - 1) + fibonacci(quantidade - 2);
      } //endSe
      //retornar resultado
      return(resultado);
   } //end fibonacci( )
   
   public static void exe08( )
   {
      //definir dados
      int quantidade;
      int resultado;
      
      //ler valor no teclado
      quantidade = IO.readint("Informe a quantidade: " );
      
      if(quantidade > 0)
      {
         quantidade = (quantidade * 3);
         resultado = fibonacci(quantidade); //chamada da funcao
         IO.println("Termos: " + resultado);
      } //endSe 
      
      //encerrar
      IO.pause ( "Apertar ENTER para terminar." );
     
   } //end exe08( )
   
// ---------------------------------------------- definicao de exe auxiliar 09
   
   public static boolean maiuscula(char m)
   {  
      //definir dado
      boolean resposta = false;
      
      if(m >= 'A' && m <= 'Z')
      {
         resposta = true;
      } //endSe
      //retornar resposta
      return(resposta);
   } //end maiuscula( )

   
   public static int count(String cadeia, int x)
   {
      //definir dados
      int resposta = 0;
      
      if(x >= 0 && x < cadeia.length())
      {
         if(maiuscula(cadeia.charAt(x)))
         {
            resposta = 1;
         } //endSe
         resposta = resposta + count(cadeia, x + 1);
      } //endSe
      //retornar resposta
      return(resposta);
   } //end count( )
   
   public static void exe09( )
   {
      //definir dado
      String z;
      z = IO.readString("Entrar com uma cadeia de caracteres: " );
      IO.println("Letras maiusculas: " + count(z, 0)); 
      
      //encerrar
      IO.pause ( "Apertar ENTER para terminar." );    
   } //end exe09( )

// ---------------------------------------------- definicao de exe auxiliar 10
   public static int countD(String cadeia, int x)
   {
      //definir dado
      int resposta = 0;
      
      if(x >= 0 && x < cadeia.length( ))
      {
         if(cadeia.charAt(x) >= '0' &&
            cadeia.charAt(x) <= '9')
         {
            resposta = 1;
         } //endSe
         resposta = resposta + countD(cadeia, x + 1);
      } //endSe
      //retornar resposta
      return(resposta);
   } //end countD( )
   
   public static void exe10( )
   {
      //definir dado
      String y;
      //ler valor no teclado
      y = IO.readString("Entrar com uma cadeia de caracteres: " );
      IO.println("Digitos lidos: " + countD(y, 0));
      
      //encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } //end exe10( )
   
// ---------------------------------------------- definicao de extra01 auxiliar 01
   
   public static double pot(double base, double expoente, double n)
   {
      //definir dado
      double resposta = 0.0;
      
      if(expoente <= n)
      {
         resposta = Math.pow(base, expoente) + pot(base, expoente + 1, n);
      } //endSe
      //retornar resposta
      return(resposta);
   } //end pot( )
   
   public static void extra01( )
   {
      //definir dado
      double base;
      double expoente = 0.0;
      double n;
      int resposta;
      
      //ler valor no teclado
      base = IO.readdouble("Entrar com um valor para base: " );
      n = IO.readdouble("Entrar com um valor para o expoente: " );
      
      resposta = (int)pot(base, expoente, n);
      //encerrar
      IO.pause ( "Apertar ENTER para terminar." );      
   } //end extra01( )
   
   // ---------------------------------------------- definicao de extra02 auxiliar 02
   
   public static double divisao(double denominador, double numerador, double n)
   {
      //definir dado
      double resposta = 0.0;
      
      if(denominador != 0 && denominador < n)
      {
         resposta = numerador/denominador + divisao(denominador + 1, numerador, n);
      }
      else if(denominador == 0)
      {
         resposta = 1.0 + divisao(denominador + 1, numerador, n);
      } //endSe
      //retornar resposta
      return(resposta);
   } //end divisao( )
   
   public static void extra02( )
   {
      //definir dado
      double denominador = 0.0;
      double numerador   = 1.0;
      double n;      
      double resposta;
          
      //ler valor no teclado
      n = IO.readdouble("Informe a quantidade: " );
      
      if(n > 0)
      {
         resposta = divisao(denominador, numerador, n);
         IO.println("Soma: " + resposta);
      } //endSe
      
      //encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } //end extra02( )
   // ---------------------------------------------- definicao do metodo principal
/**
* main() – metodo principal
*/
   public static void main ( String [ ] args )
   {
   // identificar
      IO.println ( "EXEMPLO0101 - Programa em Java" );
      IO.println ( "Autor:Matheus Santos Rosa Carneiro" );
   
      //definir dado
      int opcao;
      
      do
      {
         IO.println( "0 - parar" );
         IO.println( "1 - metodo 01" );
         IO.println( "2 - metodo 02" );
         IO.println( "3 - metodo 03" );
         IO.println( "4 - metodo 04" );
         IO.println( "5 - metodo 05" );
         IO.println( "6 - funcao 01" );
         IO.println( "7 - funcao 02" );
         IO.println( "8 - funcao 03" );
         IO.println( "9 - funcao 04" );
         IO.println("10 - funcao 05" );
         //exercicios
         IO.println("11 - exe 01 " );
         IO.println("12 - exe 02 " );
         IO.println("13 - exe 03 " );
         IO.println("14 - exe 04 " );
         IO.println("15 - exe 05 " );
         IO.println("16 - exe 06 " );
         IO.println("17 - exe 07 " );
         IO.println("18 - exe 08 " );
         IO.println("19 - exe 09 " );
         IO.println("20 - exe 10 " );
         //extras
         IO.println("21 - extra 01 " );
         IO.println("22 - extra 02 " );
        
         opcao = IO.readint( "Informe a opcao: " );
         switch(opcao)
         {
            case 0:
               break;
            case 1:
               metodo01(5);
               break;
            case 2:
               metodo02(5);
               break;
            case 3:
               metodo03(5);
               break;
            case 4:
               metodo04(5);
               break;
            case 5:
               metodo05(5);
               break;
            case 6:
               IO.println( " = " + funcao01(5));
               break;
            case 7:
               IO.println( " = " + funcao02(5));
               break;
            case 8:
               IO.println ( "Digitos = " + funcao03 ( 123 ));
               IO.println ( "Digitos = " + funcao03 ( 0 ) );
               IO.println ( "Digitos = " + funcao03 ( -12 ));
               break;
            case 9:
               IO.println ( "Fibonacci = " + funcao04 ( 1 ));
               IO.println ( "Fibonacci = " + funcao04 ( 2 ));
               IO.println ( "Fibonacci = " + funcao04 ( 3 ));
               IO.println ( "Fibonacci = " + funcao04 ( 4 ));
               IO.println ( "Fibonacci = " + funcao04 ( 5 ));
               break;
            case 10:
               IO.println ( "Minusculas (\"abc\",0) = " + funcao05 ( "abc" , 0 ));
               IO.println ( "Minusculas (\"aBc\",0) = " + funcao05 ( "aBc" , 0 ));
               IO.println ( "Minusculas (\"AbC\",0) = " + funcao05 ( "AbC", 0 ));
               break;
           //exercicios    
            case 11:
               int x = 0;
               x = IO.readint("Informe a quantidade: " );
               exe01(x,3);
               break;
            case 12:
               int a;
               a = IO.readint("Informe a quantidade: " );
               exe02(a);
               break; 
            case 13:
               int b;
               b = IO.readint("Informe a quantidade: " );
               exe03(b);
               break; 
            case 14:
               int c = 0;
               c = IO.readint("Informe a quantidade: " );
               exe04(c);
               break;
            case 15:
               int posicao = 0;
               String resposta = "";
               resposta = IO.readString( "Entrar com uma cadeia de caracteres: " );
               exe05(resposta, posicao);
               break;
            case 16:
               exe06( );
               break;
            case 17:
               exe07( );
               break;
            case 18:
               exe08( );
               break;
            case 19:
               exe09( );
               break;
            case 20:
               exe10( );
               break;
                  //extras
            case 21:
               extra01( );
               break;
            case 22:
               extra02( );
               break;
            default:
               IO.println("ERROR - INVALID OPTION" );
               break;   
         } //end switch( )
      } //end do
      while(opcao != 0);
     
      // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0101

  