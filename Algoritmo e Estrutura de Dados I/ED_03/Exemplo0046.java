/**
* Exemplo0046
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @version 06
* Turno: Vespertino
*/
// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0046
{

// ---------------------------------------------- definicao de metodo auxiliar - 01

      public static void metodo01 ( )
      {
      // definir dados
      int x;
      // identificar o metodo
      IO.println ( "Metodo 01" );
      // ler valor inteiro do teclado
      x = IO.readint ( "Entrar com um valor inteiro: " );
      IO.println ( "Valor lido = " + x );
      
      } // fim metodo01( )


// ---------------------------------------------- definicao de metodo auxiliar - 02

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


// ---------------------------------------------- definicao de metodo auxiliar - 03

         public static void metodo03 ( )
         {
         //definir dados
         int x;
         // definir dado para guardar o resultado
         int quantidade = 0;
         // definir contador
         int contador;
         // identificar o metodo
         IO.println ( "Metodo 03" );
         // ler a quantidade do teclado
         quantidade = IO.readint ( "Entrar com a quantidade: " );
         contador = quantidade;
         while ( contador > 0 )
         {
         // ler valor inteiro do teclado
         x = IO.readint ( "Entrar com um valor inteiro: " );
         IO.println ( "Valor lido = " + x );
         // contar mais um valor lido
         contador = contador - 1;
      } //fim repetir
        } //fim metodo03( )


// ---------------------------------------------- definicao de metodo auxiliar - 04

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


// ---------------------------------------------- definicao de metodo auxiliar - 05

         public static void metodo05 ( )
         {
         //definir dados
         int x;
         
         // definir dado para guardar o resultado
         int quantidade = 0;
         
         // definir contador
         int contador;
         
         // identificar o metodo
         IO.println ( "Metodo 05" );
         
         // ler a quantidade do teclado
         quantidade = IO.readint ( "Entrar com a quantidade: " );
         
         contador = 0;
         
         while ( contador < quantidade )
         {
         // ler valor inteiro do teclado
         x = IO.readint ( "Entrar com um valor inteiro: " );
         IO.println ( "Valor lido = " + x );
         
         // contar mais um valor lido
         contador = contador + 1;
         
      } //fim repetir
        } //fim metodo05( )
        
// ---------------------------------------------- definicao do metodo principal
   /**
   * main() metodo principal
   */
   public static void main ( String [ ] args )
   {
   
   //definir dado
      int opcao;
   
   // identificar
   IO.println ( "EXEMPLO0046 - Programa em Java" );
   IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
   
   //mostrar opcoes 
   IO.println ( "Opcoes: " );
   IO.println ( "1 : Metodo 01" );
   IO.println ( "2 : Metodo 02" );
   IO.println ( "3 : Metodo 03" );
   IO.println ( "4 : Metodo 04" );
   IO.println ( "5 : Metodo 05" );
   
   //ler opcao do teclado
   opcao = IO.readint( "Qual a sua opcao? " );
   
   //escolher qual metodo executar
   
   switch ( opcao )
   {
      case 1: metodo01 ( );
      break;
      case 2: metodo02 ( );
      break;
      case 3: metodo03 ( );
      break;
      case 4: metodo04 ( );
      break;
      case 5: metodo05 ( );
      break;
      
   } // fim switch
        
     // encerrar
       IO.pause ( "Apertar ENTER para terminar." );
       
   } // fim main( )
} // fim class Exemplo0046
// ---------------------------------------------- documentacao complementar

// Acrescentar outro metodo com uma repeticao com contagem decrescente
// ler uma certa quantidade de valores inteiros
// na parte principal, editar a chamada para o novo metodo

// Acrescentar outro metodo com uma repeticao com variacao crescente
// comecando em zero, para ler uma certa quantidade de valores inteiros
//
// Incluir o tratamento de uma escolha inválida

// ---------------------------------------------- historico
//
// Versao    Data  Modificacao
// 0.1      21/08   esboco
//
// ---------------------------------------------- testes
//
// Versao Teste
// 0.1 01. (OK) identificacao de programa e leitura
// 0.5 01. (OK) Exemplo0045 
// 0.6 01. (OK) Exemplo0046