/**
* Exemplo0080
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @Turno: Vespertino
* @version 18
*/

// ---------------------------------------------- dependencias

import IO.*;

// ---------------------------------------------- definicao da classe principal

public class Exemplo0080
{

// ---------------------------------------------- definicao de metodo auxiliar 08

   public static void metodo10 ( )
   {
   // definir dados
      String x;
      int contador;
      int contador02;
      int tamanho;
      int quantidade;
      int posicao = 0;
      String digit; //separador digitos
      String letter; //separar letras
   // identificar o metodo
      IO.println ( "Metodo 10" );
   
   // ler cadeia de caracteres do teclado
      x = IO.readString ( "Entrar com uma cadeia de caracteres: " );
      IO.println ( "Valor lido = " + x );
    
    //obter tamanho 
   tamanho = x.length( );
   
   //1. mostrar o tamanho armazenado
   IO.println( "tamanho de " + x + " = " + tamanho ); 
    
    // contar e separar digitos e letras
      //contador = contar_impar (x) ;
      digit = separador ( x ); //digitos
      letter = separador_letter ( x ); //separador letras
      contador = contador_digito ( x ); //cont digit
      contador02 = contador_letter ( x );
       
      while ( posicao < tamanho )
      {
         if( digito( x.charAt(posicao)) )
         {
            IO.println( "posicao = " + posicao +
                        " contem " + x.charAt(posicao));
         } //end se
         if( letter(x.charAt(posicao)) )
         {
            IO.println( "posicao = " + posicao + 
                        " contem " + x.charAt(posicao));
         } //end se
         
         posicao = posicao + 1;
         
         }
      
      IO.println( "letras = " + letter );
      IO.println( "contador letras = " + contador02 );
      IO.println( );
      IO.println ( "Digito : " + digit ); 
      IO.println ( "contador digito = " + contador );
     
   } // fim metodo10( )
// ---------------------------------------------- definicao de metodo auxiliar 2.2
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
      
// ---------------------------------------------- definicao de metodo auxiliar  2.1
  
   public static int contador_digito ( String cadeia )
   {
      //definir dados
      int resposta = 0;
      int posicao = cadeia.length( ) - 1; 
      
      //testar simbolos na cadeia de caracteres
      while ( posicao >= 0 )
      {
         //testar se letra maiuscula
         if( digito (cadeia.charAt(posicao)) )
         {
            resposta = resposta + 1;
         } //fim se
         //passar a proxima
         posicao = posicao - 1;
      } //fim repeticao
      //retornar resultado
      return ( resposta );
   } //fim contar_impar

// ---------------------------------------------- definicao de metodo auxiliar 2.0

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

// ---------------------------------------------- definicao de metodo auxiliar 1.0
   /**
   *@func para verificar se o que foi digitado e uma letra
   * 
   */   
   public static boolean letter ( char simbolo ){
   
   boolean resposta = false;
   
   if( simbolo >= 'a' &&
       simbolo <= 'z' ||
       simbolo >= 'A' &&
       simbolo <= 'Z' )
       {
          resposta = true;
       } //end se
       //retornar resposta 
       return ( resposta );
   } //end letter( )
   
// ---------------------------------------------- definicao de metodo auxiliar 1.1
   /**
   *@func para contar as letras inseridas
   *
   */
   
   public static int contador_letter ( String cadeia ){
   
      //definir dados
      int resposta = 0;
      int posicao = cadeia.length ( ) - 1;
      
      //testar simbolos na cadeia de caracteres
      while ( posicao >= 0 )
      {
         if( letter ( cadeia.charAt(posicao)) )
         {
            resposta = resposta + 1;
         } //fim se
         //passar para a proxima letra
         posicao = posicao - 1;
      } //fim repeticao
      //retornar resultado
      return ( resposta );
   
   } //end contador_letter 
   
// ---------------------------------------------- definicao de metodo auxiliar 1.2
   public static String separador_letter ( String cadeia ){
      
      //definir dados
      String resposta = "";
      int posicao = cadeia.length( ) - 1; //ultima
      
      //teste simbolos na cadeia de caracteres
      while ( posicao >= 0 )
      {
         if ( letter (cadeia.charAt(posicao)) )
         {
            resposta = resposta + cadeia.charAt(posicao);
         } //fim se
         //passar para proxima
         posicao = posicao - 1; 
      } //end repeticao
      //retornar resultado
      return ( resposta );
   } // end separador_letter( )       
      
// ---------------------------------------------- definicao do metodo principal
/**
* main() metodo principal
*/
   public static void main ( String [ ] args )
   {
   // identificar
      IO.println ( "EXEMPLO0080 - Programa em Java" );
      IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
   // executar o metodo auxiliar
   
      metodo10( );
   
     // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0080

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