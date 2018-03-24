/**
* Exemplo0074
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @Turno: Vespertino
* @version 14
*/

// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0074
{

// ---------------------------------------------- definicao de metodo auxiliar 03

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
   
   //ler cadeia de caracteres do teclado
      x = IO.readString( "Entrar com uma cadeia de caracteres: " );
      IO.println( "Valor lido = " + x );
   
   //obter o tamanho da cadeia
      tamanho = x.length( );
   
   //mostrar tamanho da cadeia
      IO.println( "tamanho de " + x + " = " + tamanho );
   
   //contar e separar letras maiusculas
      maiusculas = separar_maiusculas( x );
      contador = contar_maiusculas ( x );
            
      //mostrar quantidade de letras maiusculas
      IO.println( "letras maiusculas = " + contador
                  + " = " + maiusculas );
     } // end metodo04 ( )

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
   
// ---------------------------------------------- definicao de metodo auxiliar 
   public static String separar_maiusculas ( String cadeia )
   {
      //definir dados 
      String resposta = "";
      int posicao = cadeia.length( ) - 1;
      
      //testar simbolos na cadeia de caracteres
      while ( posicao >= 0 )
      {
         //testar se letra maiuscula
         if( maiuscula (cadeia.charAt(posicao)) )
         {
            resposta = resposta + cadeia.charAt(posicao);
         } //fim se
         //passar a proxima
         posicao = posicao - 1;
      } //fim repeticao
      //retornar resultado 
      return ( resposta );
   } //fim separar_maiusculas( )
   

// ---------------------------------------------- definicao do metodo principal
/**
* main() – metodo principal
*/
   public static void main ( String [ ] args )
   {
   // identificar
      IO.println ( "EXEMPLO0074 - Programa em Java" );
      IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
   // executar o metodo auxiliar
     metodo04( ); 
   
     // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0074

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