/**
* Exemplo0054
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @version 14
* Turno: Vespertino
*/
// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0054
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
        
// ---------------------------------------------- definicao de metodo auxiliar - 06
         public static void metodo06 ( )
         {
         //definir dados
         int x;
         
         // definir dado para guardar o resultado
         int quantidade = 0;
         
         // definir contador
         int contador;
          
         // identificar o metodo
         IO.println ( "Metodo 06" );
         
         // ler a quantidade do teclado
         contador = 0;
         quantidade = IO.readint ( "Entrar com a quantidade: " );
         IO.println ( "Valor lido : " + quantidade );
         
         
         do {
                  
         // ler valor inteiro do teclado
         x = IO.readint ( "Entrar com um valor inteiro: " );
         IO.println ( "Valor lido = " + x );
         
         contador = contador + 1;
         
         }
         while ( x < 100); 
                 
      
        } //fim metodo06( )

// ---------------------------------------------- definicao de metodo auxiliar - 07
         public static void metodo07 ( )
         {
         //definir dados
         int x;
         
         // definir dado para guardar o resultado
         int quantidade = 0;
         
         // definir contador
         int contador;
          
         // identificar o metodo
         IO.println ( "Metodo 07" );
         
         // ler a quantidade do teclado
         contador = 0;
         quantidade = IO.readint ( "Entrar com a quantidade: " );
         IO.println ( "Valor lido : " + quantidade );
         
         
         do {
                  
         // ler valor inteiro do teclado
         x = IO.readint ( "Entrar com um valor inteiro: " );
         IO.println ( "Valor lido = " + x );
         
         contador = contador + 1;
         
         }
         while ( x < 100 && x % 2 != 0); 
         
         if ( x % 2 == 0) //condicao se o numero for par, aparecer msg de erro
         {
            IO.println( "Valor lido par, invalido" );
         }
                 
      
        } //fim metodo07( )

// ---------------------------------------------- definicao de metodo auxiliar - 08
         public static void metodo08 ( )
         {
         //definir dados
         double x;
         
         // definir dado para guardar o resultado
         int quantidade = 0;
         
         // definir contador
         int contador;
          
         // identificar o metodo
         IO.println ( "Metodo 08" );
         
         // ler a quantidade do teclado
         
         quantidade = IO.readint ( "Entrar com a quantidade: " );
         contador = 0;
         IO.println ( "Valor lido : " + quantidade );
         
         
         while ( contador < quantidade ) {
                  
         // ler valor inteiro do teclado
         x = IO.readdouble ( "Entrar com um valor real: " );
          
         if ( x >= 25 && x <= 125 & x % 2 != 0 )
         
           
         IO.println ( "Valor lido = " + x );
         
         contador = contador + 1;
         } //fim repetir
        
                      
        } //fim metodo08( )

// ---------------------------------------------- definicao de metodo auxiliar - 09
         public static void metodo09 ( )
         {
         //definir dados
         double x;
         int y;
                  
         // definir dado para guardar o resultado
         int quantidade = 0;
         
         // definir contador
         int contador;
          
         // identificar o metodo
         IO.println ( "Metodo 09" );
         
         // ler a quantidade do teclado
         quantidade = IO.readint ( "Entrar com a quantidade: " );
         contador = 0;
         IO.println ( "Valor lido : " + quantidade );
  
          while ( contador < quantidade )
          {
            
         // ler valor inteiro do teclado
         x = IO.readdouble ( "Entrar com um valor: " );
         y = (int) x;
         
         if ( x % 2 == 0 && x < 100 )
         {
            IO.println ( "Valor lido - par e positivo: " + y );
        
             // contar mais um valor lido
             contador = contador + 1;
         } // fim if 
         else {
            IO.println ( "Valor lido impar ou negativo, tente novamente! " );
         } //fim else
         
         }
          
                  
              
        } //fim metodo09( )


      
// ---------------------------------------------- definicao do metodo principal
   /**
   * main() metodo principal
   */
   public static void main ( String [ ] args )
   {
   
   //definir dado
      int opcao;
      
      do
      {
            // identificar
            IO.println ( "EXEMPLO0054 - Programa em Java" );
            IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
            
            //mostrar opcoes 
            IO.println ( "Opcoes: " );
            IO.println ( "0 : Parar" );
            IO.println ( "1 : Metodo 01" );
            IO.println ( "2 : Metodo 02" );
            IO.println ( "3 : Metodo 03" );
            IO.println ( "4 : Metodo 04" );
            IO.println ( "5 : Metodo 05" );
            IO.println ( "6 : Metodo 06" );
            IO.println ( "7 : Metodo 07" );
            IO.println ( "8 : Metodo 08" );
            IO.println ( "9 : Metodo 09" );
            
            //ler opcao do teclado
            opcao = IO.readint( "Qual a sua opcao? " );
            
            //escolher qual metodo executar
            
            switch ( opcao )
            {
               case 0: //nao faz nada
               break;
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
               case 6: metodo06 ( );
               break;
               case 7: metodo07 ( );
               break;
               case 8: metodo08 ( );
               break;
               case 9: metodo09 ( );
               break;
               
               default:
                  IO.println( "ERROR: INVALID OPTION. " );
               
            } // fim switch
          } // fim do
          
          while ( opcao != 0 );  
            
       // encerrar
       IO.pause ( "Apertar ENTER para terminar." );
       
   } // fim main( )
} // fim class Exemplo0054
// ---------------------------------------------- documentacao complementar

// Acrescentar outro metodo com uma repeticao com contagem decrescente
// ler uma certa quantidade de valores inteiros
// na parte principal, editar a chamada para o novo metodo

// Acrescentar outro metodo com uma repeticao com variacao crescente
// comecando em zero, para ler uma certa quantidade de valores inteiros
//
// Incluir o tratamento de uma escolha inválida
//
// Incluir uma repeticao para executar a acao principal tres vezes
//
// Incluir uma repeticao para executar a acao principal qualquer quantidade de vezes
//
// Incluir uma opcao para encerrar o programa quando quiser

// ---------------------------------------------- historico
//
// Versao    Data  Modificacao
// 0.1      21/08   esboco
//
// ---------------------------------------------- testes
//
// Versao Teste
// 0.1 01. (OK) identificacao de programa e leitura
// 0.5 01. (OK) exemplo0045 
// 0.6 01. (OK) exemplo0046
// 0.7 01. (OK) error invalid option
// 0.8 01. (OK) repeticao 
// 0.9 01. (OK) repeticao 