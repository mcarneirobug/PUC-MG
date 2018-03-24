/**
* Exemplo0072
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @Turno: Vespertino
* @version 12
*/

// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0072
{

// ---------------------------------------------- definicao de metodo auxiliar 02

   public static void metodo02( )
   {
   //definir dados
      String x;
      int tamanho;
      int posicao;
      int contador = 0;
   
   //identificar metodo
      IO.println( "Metodo02" );
   
   //ler cadeia de caracteres do teclado
      x = IO.readString( "Entrar com uma cadeia de caracteres: " );
      IO.println( "Valor lido = " + x );
   
   //obter o tamanho da cadeia
      tamanho = x.length( );
   
   //mostrar tamanho da cadeia
      IO.println( "tamanho de " + x + " = " + tamanho );
   
   //contar letras maiusculas
      contador = 0;
      posicao = 0;
      while( posicao < tamanho )
      {
         if( maiuscula( x.charAt(posicao)) )
         {
            IO.println( "posicao = " + posicao +
                     " contem " + x.charAt(posicao));
            contador = contador + 1;
         } //fim se
         posicao = posicao + 1;
      } //fim repetir
   //mostrar quantidade de letras maiusculas
      IO.println( "letras maiusculas = " + contador );
   
   } // end metodo02 ( )
   
   public static boolean maiuscula( char simbolo )
   {
      //definir dado
      boolean resposta = false;
      
      //testar se letra maiuscula
      if( simbolo >= 'A' && 
          simbolo <= 'Z')
      {
         resposta = true;
      } //fim se
          
          //retornar resultado
      return ( resposta );
   } //end maiuscula( )

// ---------------------------------------------- definicao do metodo principal
/**
* main() – metodo principal
*/
   public static void main ( String [ ] args )
   {
   // identificar
      IO.println ( "EXEMPLO0072 - Programa em Java" );
      IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
   // executar o metodo auxiliar
      metodo02( ); 
   
     // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0072

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