/**
* Exemplo0042
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @version 02
* Turno: Vespertino
*/
// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0042
{
// ---------------------------------------------- definicao de metodo auxiliar
   public static void metodo02 ( )
   {
      // definir dados
      int x;
      // definir dado para guardar o resultado
      int quantidade = 0;
      // identificar o metodo
      IO.println ( "Metodo 02" );
      
      // ler a quantidade do teclado
      quantidade = IO.readint ( "Entrar com a quantidade: " );
      while ( quantidade > 0 )
      {
         // ler valor inteiro do teclado
         x = IO.readint ( "Entrar com um valor inteiro: " );
         IO.println ( "Valor lido = " + x );
         // diminuir a quantidade
         quantidade = quantidade - 1;
      } // fim repetir
   } // fim metodo02( )   
// ---------------------------------------------- definicao do metodo principal
   /**
   * main() – metodo principal
   */
   public static void main ( String [ ] args )
   {
      // identificar
      IO.println ( "EXEMPLO0041 - Programa em Java" );
      IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
      // executar o metodo auxiliar
      metodo02 ( ); // ler e mostrar valor inteiro
      // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0042

// ---------------------------------------------- documentacao complementar
//
// ---------------------------------------------- historico
//
// Versao    Data  Modificacao
// 0.1      21/08   esboco
//
// ---------------------------------------------- testes
//
// Versao Teste
// 0.1 01. (OK) identificacao de programa e leitura
//