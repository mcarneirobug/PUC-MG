/**
* Exemplo0073
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @Turno: Vespertino
* @version 13
*/

// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0073
{

// ---------------------------------------------- definicao de metodo auxiliar 03

   public static void metodo03( )
   {
   //definir dados
      String x;
      int tamanho;
      int posicao;
      int contador;
      String maiusculas;
   
   //identificar metodo
      IO.println( "Metodo 03" );
   
   //ler cadeia de caracteres do teclado
      x = IO.readString( "Entrar com uma cadeia de caracteres: " );
      IO.println( "Valor lido = " + x );
   
   //obter o tamanho da cadeia
      tamanho = x.length( );
   
   //mostrar tamanho da cadeia
      IO.println( "tamanho de " + x + " = " + tamanho );
   
   //contar e separar letras maiusculas
      maiusculas = "";
      contador = contar_maiusculas ( x );
      posicao = 0;
      
      while( posicao < tamanho )
      {
         if( maiuscula( x.charAt(posicao)) )
         {
            IO.println( "posicao = " + posicao +
                     " contem " + x.charAt(posicao));
            maiusculas = maiusculas + x.charAt(posicao);
         } //fim se
         
         posicao = posicao + 1;
      } //fim repetir
      
      //mostrar quantidade de letras maiusculas
      IO.println( "letras maiusculas = " + contador
                  + " = " + maiusculas );
   
   } // end metodo03 ( )

// ---------------------------------------------- definicao de metodo auxiliar   
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
   
// ---------------------------------------------- definicao de metodo auxiliar   
   public static int contar_maiusculas ( String cadeia )
   {
      //definir dados
      int resposta = 0;
      int posicao = cadeia.length( ) - 1; 
      
      //testar simbolos na cadeia de caracteres
      while ( posicao >= 0 )
      {
         //testar se letra maiuscula
         if( maiuscula (cadeia.charAt(posicao)) )
         {
            resposta = resposta + 1;
         } //fim se
         //passar a proxima
         posicao = posicao - 1;
      } //fim repeticao
      //retornar resultado
      return ( resposta );
   } //fim contar_maiusculas
   
   

// ---------------------------------------------- definicao do metodo principal
/**
* main() – metodo principal
*/
   public static void main ( String [ ] args )
   {
   // identificar
      IO.println ( "EXEMPLO0073 - Programa em Java" );
      IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
   // executar o metodo auxiliar
     metodo03( ); 
   
     // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0073

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