/**
  * ---------------------------------------------- Documentacao preliminar
  * Pontificia Universidade Catolica de Minas Gerais
  * Curso de Ciencia da Computacao
  * Algoritmos e Estruturas de Dados I
  *
  * Trabalho pratico: Prova_01
  *
  * Objetivo:
  * Aplicar os conhecimentos de recursividade
  *
  * Autor:   Matricula: 613414  Nome: Matheus Santos Rosa Carneiro 
  * Versao:  1.0                Data: 21/09/2017
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
public class Prova_01
{
   
 /**
 * questao 1 
 */  
   public static void questao01()
   {
      //definir dados
      int n;  
      int i; 
      int variacao      = 1;
      int anterior      = 1;
      int resultado     = 0;
      
      //ler valor do teclado
      n = IO.readint("Entrar com quantidade: ");
      
      //repeticao
      for(i = 0; i < n ; i = i+1)
      {
         IO.println("Digito: " +anterior);
         resultado = resultado + anterior;
         anterior = anterior + variacao;   
         variacao = variacao + 2;        
      }//fim repeticao
      
      IO.println("Somatorio: " + resultado);
   } //end questao01( )

   /**
 * questao 2
 */  
 
   public static void questao02( )
   {
      //definir dados
      int x, z;  
      int contadorx =   0; //contador para o valor x
      int contadorz =   0; //contador para o valor z
      
      //ler valores do teclado
      x = IO.readint("Entrar com valor para x: ");
      z = IO.readint("Entrar com valor para z: ");
      
      //repeticao de x
      while(x > 0)
      {
         int resto = x % 10; 
         IO.println("Resto da divisao por 10: " +resto);
         x = x/10; 
         
         if(resto % 3 !=0 && resto % 2!=0)  
         {
            contadorx = contadorx + 1;
         } //endSe
      } // end repeticao (x)
      
      
      //repeticao de z 
      while(z > 0)
      {
         int resto = z % 10; 
         IO.println("Resto da divisao por 10 z: " + resto);
         z = z/10;
         
         if(resto % 3 !=0 && resto % 2 !=0) 
         {
            contadorz = contadorz + 1;      
         } //endSe
      } //end repeticao (z) 
    
      if(contadorz > contadorx) //condicao para z maior que x
      {
         IO.println("Maior valores em z: " + contadorz);
      } //endSe
      else if(contadorx > contadorz) //condicao para x maior que z
      {
         IO.println("Maior valores em x: " + contadorx);
      } //endSe
      else if(contadorx == contadorz) //condicao caso x e z sejam iguais
      {
         IO.println("Mesma quantidade de digitos: " + contadorx);
      } //endSe
   } //questao02( )
   
/**
  * questao03
  */
  
   public static boolean str (String cadeia)
   {
      //definir dados
      boolean resposta = true;
      boolean resposta00 = false; 
      boolean resposta01 = true;  
      
      int tamanho; 
      int posicao; 
      
      tamanho = cadeia.length( )-1; //definicao de tamanho
      
      for(posicao = 0; posicao < tamanho; posicao++)
      {
       //definicao de condicao 
         if(cadeia.charAt(posicao) >= (int)'0' &&
            cadeia.charAt(posicao) <= (int)'9')
         {
            resposta = resposta01;
         } //endSe
         else
         {
            if(cadeia.charAt(posicao) >= 'a' &&
               cadeia.charAt(posicao) <= 'z' ||
               cadeia.charAt(posicao) >= 'A' &&
               cadeia.charAt(posicao) <= 'Z')
            {
               resposta = resposta00;
            }
         } //end else          
      } //fim repeticao
      //retornar resposta
      return(resposta);
   } //end str( )  
   
   public static void questao03( )
   {
      //definir dado
      String x;
      boolean resultado;
      
      //ler valor do teclado
      x = IO.readString("Entrar com uma cadeia de caracteres: " );
      resultado = str(x);
      
      IO.println("Valor boolean: " + resultado);
   } //questao03( )
   
/**
   * questao04
   */
   
   public static void questao04( )
   {
      //definir dados
      double ac; //comprimento do segmento
      double bc; //comprimento do segmento de B ate C
      double ab; //para condicao
      double resposta = 0; 
      int contador    = 0; 
               
      do 
      {
         //ler valores
         ab = IO.readdouble("Entrar com valor para AB: ");
         IO.println("Valor de AB: " + ab);
         bc = IO.readdouble("Entrar com valor BC: ");
         IO.println("Valor de BC: " +bc);
         
         //condicao para contar
         if(ab!=0 && bc!=0)
         {
            resposta = ((bc * bc)-(ab)*(ab + bc));
            if (resposta < (1/1000))
            {
               contador = contador + 1;
            }
         } //endSe
      } while(ab!=0 && bc!=0);
      //end repeticao    
      
      IO.println("Quantidade de valores que obedecem a condicao AB/BC = BC/AC: "+ contador);  
       
   } //end questao04( )

/**
   * questao05
   */
   
   public static int funcao(int x, int y)
   {
      while(x > 0)
      {
         y = y+y;
         x = x-1;
         IO.pause(" " +x+ " " +y);
      }//fim repeticao
      //retornar 
      return(y);
   }//end funcao
   
   public static void questao05( )
   {
      int resposta; 
      int x;
      int y = 1;
      
      x = IO.readint("Entrar com o valor para o expoente: " );
      IO.println("Expoente: " + x);
      resposta = funcao(x,y);
      
      IO.println(" "+ x + " -> " + " " + y + " = "+ resposta);     
   } //end questao05( )


   // ---------------------------------------------- definicao do metodo principal
/**
* main() – metodo principal
*/
   public static void main ( String [ ] args )
   {
   // identificar
      IO.println ( "Prova_01 - Programa em Java" );
      IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
   
      //definir dado
      int opcao;
      
      do
      {
         IO.println( "0 - parar" );
         IO.println( "1 - questao 01 " );
         IO.println( "2 - questao 02 " );
         IO.println( "3 - questao 03 " );
         IO.println( "4 - questao 04 " );
         IO.println( "5 - questao 05 " );
      
         opcao = IO.readint( "Informe a opcao: " );
         switch(opcao)
         {
            case 0:
               break;
            case 1:
               questao01( );
               break;
            case 2:
               questao02( );
               break;
            case 3:
               questao03( );
               break;
            case 4:
               questao04( );
               break;
            case 5:
               questao05( );
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
} // endClass Prova_01
