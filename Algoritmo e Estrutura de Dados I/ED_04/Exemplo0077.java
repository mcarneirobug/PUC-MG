/**
* Exemplo0077
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @Turno: Vespertino
* @version 16
*/

// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0077
{

// ---------------------------------------------- definicao de metodo auxiliar 03

   public static void metodo07 ( )
   {
         
     //definir dados
     //onde guardar a palavra
      String palavra = ""; //valor vazio
      int posicao = 0; //posicao inicial = 0 
      int quantidade = 0;
      char simbolo = '='; //pode ser qrr sinal
         
       //primeira acao a fazer
           
       // identificar
         IO.println ( );
         IO.println ( "Metodo07" );
         IO.println ( );
          
      // definir acoes
          
       //   primeira acao a fazer
      //    1. Obter a palavra do teclado
            palavra = IO.readString( "Entrar com uma palavra: " );
            //verificar o valor 
            //para ter certeza do valor armazenado em "palavra"
            IO.println( "palavra lida = " + palavra );       
            
            //2. obter o tamanho //pode se obter com o tamanho da palavra = palavra.length( );
            quantidade = palavra.length( ); //buscar o tamanho utilizando o length
            IO.println( " quantidade = " + quantidade ) ; //para confirmar que esta certo, printamos na tela 
            
            //3. repetir para cada posicao
               for ( posicao = 0; posicao < quantidade ; posicao = posicao + 1) //posicao = 0, com essa condição, ela vai verificando se a letra é 0,1,2,3,4,5
               {
               //3.0 obter o caracter em uma posicao
                 simbolo = palavra.charAt(posicao); //vai me dar o simbolo 
                 //mapear o caracter em determinada posicao
                 //vai dar as informacoes para eu saber onde cada simbolo esta em posicao
                 //funcao vai buscar 
               
               //3.1 testar digito
               if( simbolo >= '0' && simbolo <= '9' ) //condicional para mostrar somente se o simbolo for minusculo
               {   
                  
                  IO.println( " simbolo = " + simbolo );
                } //end se 
                  
               } //fim repeticao
               
               // encerrar
             IO.pause   ( "Apertar ENTER para continuar." );
   } // fim metodo07( )
  

// ---------------------------------------------- definicao do metodo principal


//* main() � metodo principal

   public static void main ( String [ ] args )
   {
   // identificar
      IO.println ( "EXEMPLO0077 - Programa em Java" );
      IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
   // executar o metodo auxiliar
     metodo07( ); 
   
     // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0077

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

