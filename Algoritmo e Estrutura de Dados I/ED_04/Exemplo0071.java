/**
* Exemplo0071
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @Turno: Vespertino
* @version 11
*/

// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0071
{

// ---------------------------------------------- definicao de metodo auxiliar 01
   public static void metodo01 ( )
   {
   // definir dados
      String x;
      int tamanho;
      int posicao; 
   
   // identificar o metodo
      IO.println ( "Metodo 01" );
   
   // ler cadeia de caracteres do teclado
      x = IO.readString ( "Entrar com uma cadeia de caracteres: " );
      IO.println ( "Valor lido = " + x );
   
   //obter tamanho da cadeia
      tamanho = x.length( ); //calcular quantos caracteres foram digitados
   
   //mostrar o tamanho da cadeia
      IO.println( "tamanho de " + x + " = " + tamanho );
   
   //mostrar cada letra MAIUSCULA separadamente
      posicao = 0;
      while( posicao < tamanho )
      {
         if( x.charAt( posicao ) >= 'A' &&
         x.charAt( posicao ) <= 'Z')
         {
            IO.println( "posicao = " + posicao + 
                     " contem " + x.charAt( posicao ));
         } //fim se
         posicao = posicao + 1;
      } //fim repetir
   
   } // fim metodo01( )   

// ---------------------------------------------- definicao do metodo principal
/**
* main() – metodo principal
*/
   public static void main ( String [ ] args )
   {
   // identificar
      IO.println ( "EXEMPLO0071 - Programa em Java" );
      IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
   // executar o metodo auxiliar
      metodo01( ); 
   
     // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0071

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