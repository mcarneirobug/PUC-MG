/**
* Exemplo0079
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @Turno: Vespertino
* @version 18
*/

// ---------------------------------------------- dependencias

import IO.*;

// ---------------------------------------------- definicao da classe principal

public class Exemplo0079
{

// ---------------------------------------------- definicao de metodo auxiliar 07

   public static void metodo09 ( )
   {
   // definir dados
      String x;
      int contador;
      int tamanho;
      int quantidade;
      int posicao = 0;
      String impares;
   // identificar o metodo
      IO.println ( "Metodo 09" );  
   
   // ler cadeia de caracteres do teclado
      x = IO.readString ( "Entrar com uma cadeia de caracteres: " );
      IO.println ( "Valor lido = " + x );
    
    //obter tamanho 
   tamanho = x.length( );
   
   //1. mostrar o tamanho armazenado
   IO.println( "tamanho de " + x + " = " + tamanho ); 
    
    // contar digitos impares
      //contador = contar_impar (x) ;
      impares = separador ( x );
      
      while ( posicao < tamanho )
      {
         if( digito( x.charAt(posicao)) )
         {
            IO.println( "posicao = " + posicao +
                        " contem " + x.charAt(posicao));
         } //end se
         posicao = posicao + 1;
      }
      
      IO.println( "digitos impares = " + impares );
      //IO.println ( "Digito impares: " + contador ); 
    
    
   } // fim metodo09( )
// ---------------------------------------------- definicao de metodo auxiliar
   public static boolean digito ( char simbolo )
   {
      //definir dados
      boolean resposta = false;
      
      //testar se e digito
      if( simbolo >= '0' &&
          simbolo <= '9'
          && simbolo % 2 != 0)
      {
         resposta = true;
      } //fim se
          
      //retornar resultados
      return ( resposta );
   } // end digito ( )
      
// ---------------------------------------------- definicao de metodo auxiliar   
  
   public static int contar_impar ( String cadeia )
   {
      //definir dados
      int resposta = 0;
      int posicao = cadeia.length( ) - 1; 
      
      //testar simbolos na cadeia de caracteres
      while ( posicao >= 0 )
      {
         //testar se letra maiuscula
         if( digito (cadeia.charAt(posicao)) && (cadeia.charAt(posicao)) % 2 != 0 )
         {
            resposta = resposta + 1;
         } //fim se
         //passar a proxima
         posicao = posicao - 1;
      } //fim repeticao
      //retornar resultado
      return ( resposta );
   } //fim contar_impar

// ---------------------------------------------- definicao de metodo auxiliar

// metodo separador

public static String separador ( String cadeia ){

//definir dados
String resposta = "";
int posicao = cadeia.length( ) - 1; //ultima

//testar digitos na cadeia de caracteres
while ( posicao >= 0 )
{
   if( digito(cadeia.charAt(posicao)) )
   {
      resposta = resposta + cadeia.charAt(posicao);
   } //fim se  
      //passar para proximo digito
      posicao = posicao - 1;
} //end repeticao
   //retornar resultado (preferencialmente no final)
   return ( resposta );
} //end separador( )
      
// ---------------------------------------------- definicao do metodo principal
/**
* main() metodo principal
*/
   public static void main ( String [ ] args )
   {
   // identificar
      IO.println ( "EXEMPLO0079 - Programa em Java" );
      IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
   // executar o metodo auxiliar
   
      metodo09( );
   
     // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0079

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