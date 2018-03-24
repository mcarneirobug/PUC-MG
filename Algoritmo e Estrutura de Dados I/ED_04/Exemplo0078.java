/**
* Exemplo0078
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @Turno: Vespertino
* @version 17
*/

// ---------------------------------------------- dependencias

import IO.*;

// ---------------------------------------------- definicao da classe principal

public class Exemplo0078
{

// ---------------------------------------------- definicao de metodo auxiliar 08

   public static void metodo08 ( )
   {
   // definir dados
      String x;
      int contador;
   // identificar o metodo
      IO.println ( "Metodo 08" );
   // ler cadeia de caracteres do teclado
      x = IO.readString ( "Entrar com um digito: " );
      IO.println ( "Valor lido = " + x );
    // contar digitos impares
      contador = contar_impar (x) ;
      IO.println ( "Digito impares: " + contador ); 
    
    
   } // fim metodo08( )

// ---------------------------------------------- definicao de metodo auxiliar
   public static boolean digito ( char simbolo )
   {
      //definir dados
      boolean resposta = false;
      
      //testar se e digito
      if( simbolo >= '0' &&
          simbolo <= '9')
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

      
// ---------------------------------------------- definicao do metodo principal
/**
* main() metodo principal
*/
   public static void main ( String [ ] args )
   {
   // identificar
      IO.println ( "EXEMPLO0078 - Programa em Java" );
      IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
   // executar o metodo auxiliar
   
      metodo08( );
   
     // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0078

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