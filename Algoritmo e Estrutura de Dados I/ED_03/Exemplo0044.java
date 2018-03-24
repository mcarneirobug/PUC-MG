/**
* Exemplo0044
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @version 04
* Turno: Vespertino
*/
// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
         public class Exemplo0044
         {
// ---------------------------------------------- definicao de metodo auxiliar
// ---------------------------------------------- definicao de metodo auxiliar
         public static void metodo04 ( )
         {
         //definir dados
         int x;
         // definir dado para guardar o resultado
         int quantidade = 0;
         // definir contador
         int contador;
         // identificar o metodo
         IO.println ( "Metodo 04" );
         // ler a quantidade do teclado
         quantidade = IO.readint ( "Entrar com a quantidade: " );
         contador = 1;
         while ( contador <= quantidade )
         {
         // ler valor inteiro do teclado
         x = IO.readint ( "Entrar com um valor inteiro: " );
         IO.println ( "Valor lido = " + x );
         // contar mais um valor lido
         contador = contador + 1;
      } //fim repetir
        } //fim metodo04( )
// ---------------------------------------------- definicao do metodo principal
   /**
   * main() metodo principal
   */
   public static void main ( String [ ] args )
   {
   // identificar
   IO.println ( "EXEMPLO0044 - Programa em Java" );
   IO.println ( "Autor: ________________________" );
   // executar o metodo auxiliar
   metodo04 ( ); // ler e mostrar valor inteiro
   // encerrar
   IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
} // fim class Exemplo0044
// ---------------------------------------------- documentacao complementar
// Acrescentar outro metodo com uma repeticao com contagem decrescente
// ler uma certa quantidade de valores inteiros
// na parte principal, editar a chamada para o novo metodo

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
//