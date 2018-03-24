/**
  * ---------------------------------------------- Documentacao preliminar
  * Pontificia Universidade Catolica de Minas Gerais
  * Curso de Ciencia da Computacao
  * Algoritmos e Estruturas de Dados I
  *
  * Trabalho pratico: Lista de Exercicios para Recuperacao 01
  *
  * Objetivo:
  * Modelo de programa para a disciplina AED I
  * Sugestao para montar um trabalho pratico
  *
  * Autor: Matheus  Matricula: 613414  Nome: Matheus Santos Rosa Carneiro
  * Versao:  1.0                Data: 19/09/2017
  *
  * Dados:
  * - opcao de execucao escolhida pelo usuario
  *
  * Resultados:
  * - execucao de um teste de cada vez a escolha do usuario
  *
  * Condicoes:
  * - so' aceitara' as opcoes oferecidas.
  * - a classe IO devera' estar acessivel.
  *
  * Arquivos:
  *
  * - recuperacao.java
  * - recuperacao.class
  * - IO.jar    ( por exemplo em C:\java\jre\lib\ext\IO.jar )
  *
  * Forma de compilacao:
  * - acionar o compilador no modo console:
  *
  *   <drive>:>javac   recuperacao.java
  *   ou
  *   <drive>:>compile recuperacao
  *
  * Forma de uso:
  * - acionar o programa no modo console:
  *
  *   <drive>:>java recuperacao
  *   ou
  *   <drive>:>run  recuperacao
  *
  * - escolher uma das opcoes oferecidas.
  *
  * Referencias:
  * - Exemplos mostrados em sala de aula
  * - Apostila: Fundamentos de Programacao - Notas de aulas
  *
  */


/**
* @author: Matheus Santos Rosa Carneiro
* Turno: Vespertino 
* Matricula : 613414
*
*/

// ---------------------------------------------- classes nativas

import IO.*;
 
public class recuperacao
{
    
  //------------------------------- definicao de metodo auxiliar 01    
   /**
   * @author: Matheus Santos Rosa Carneiro
   * Matricula: 613414 
   * Objetivo: ler valor inteiro do teclado e retornar os impares indicados pela quantidade
   * n = quantidade de vezes que vai ocorrer o metodo
   * x = igual a quantidade, portanto criando um laco de repeticao
   */
   
   
   public static void metodo01( ){      
    // identificar
      IO.println ( );
      IO.println ( "Metodo01" );
      IO.println ( );
       
      int n = 0; 
      int x = 0;
      // definir a quantidade
      n = IO.readint("Indique a quantidade: ");
      IO.println( "Quantidade: " + n);
      x = n;
      while (x > 0)
      {
         if (x % 2 != 0)
         {
            IO.println ("x = "+x);
         }// end if 
         //IO.println ("n = "+x);
         x = x-1;
         n = n-1;
      }// end while    
   } //end metodo( )      
   
   //------------------------------- definicao de metodo auxiliar 02
   /**
   * @author: Matheus Santos Rosa Carneiro
   * Matricula: 613414
   * Objetivo: Ler um valor inteiro do teclado e somar os valores impares e nao multiplos de 3
   * quantidade = numero de vezes que vai ocorrer a repeticao
   * soma = variavel que vai somar os termos
   * y = variavel que vai armazenar os valores dos termos que respeitem a condicao
   * x = variavel de repeticao
   */
   
   public static void metodo02( )
   {
    //definir dado local
      int x          = 0;
      int y          = 0;
      int quantidade = 0;
      int soma = 0;
   
      //ler quantidade de termos no teclado
      quantidade = IO.readint("Entrar com os termos: " );
      //IO.println( "Valor lido = " + quantidade );
      y = quantidade;
     
        //repetir enquanto valor for maior que zero
      for (x = 1; x <= quantidade; x = x + 1)
      {
         y = IO.readint("termos: " );
         if(y % 2 != 0 && y % 3 != 0)
         {
            IO.println( "Valores: " + y);
            soma += y;
            //IO.println("s: " + soma); 
         } 
         else
         {
            IO.println( "Termos pares ou multiplos de 3 ! " );
         } //endSe
      } //end repeticao
      IO.println("soma: " + soma);
   
       
   } //end metodo02( )

  //------------------------------- definicao de metodo auxiliar 03
   
   /**
   * @author: Matheus Santos Rosa Carneiro
   * Matricula: 613414
   * Objetivo: Ler uma cadeia de caracter e contar quantos simbolos sao digitos
   * x = ler valor no teclado
   * tamanho = ler o tamanho da String
   * posicao = localizar as posicoes dos caracteres
   * count = contar quantos digitos 
   */
   
   public static void metodo03( )
   {
      String x;
      int tamanho;
      int posicao;
      int count = 0;
            
      x = IO.readString( "Entrar com uma cadeia de caracter: " );
      tamanho = x.length( ); 
      for(posicao = 0; posicao < tamanho; posicao++)
      {
         if(x.charAt(posicao) >= '0' &&
            x.charAt(posicao) <= '9')
         {
               
            IO.println("Digitos: " + x.charAt(posicao) + " posicao : " 
                           + posicao);
            count++;
         }
         else
         {
            IO.println( "Valor digitado nao e um digito! " );
         } //endSe 
      }//end repeticao
      IO.println("Quantidade de digitos: " + count);
   } //end metodo03( )
      
   //------------------------------- definicao de metodo auxiliar 04
   
   /**
   * @author: Matheus Santos Rosa Carneiro
   * Matricula: 613414
   * Objetivo: Ler uma cadeia de caracteres, testar cada simbolo por vezes, e dizer quantos nao sao digitos, nem letras
   * x = ler valor no teclado
   * tamanho = identificar tamanho da string
   * posicao = identificar o posicionamento do caracter
   * count = contar quantos nao sao digitos e nem letras
   * funcao boolean digito para verificar se foi digitado um digito
   * funcao boolean letras para verificar se foi digitado letras
   */
   
   
   public static void metodo04( )
   {
      String x;
      int tamanho;
      int posicao;
      int count = 0;
         
      x = IO.readString( "Entrar com uma cadeia de caracteres: " );
         
      tamanho = x.length( );
      for(posicao = 0; posicao < tamanho; posicao++)
      {
         if(digito(x.charAt(posicao)))
         {
            IO.println( "Digitos: " + x.charAt(posicao) );
         }
         else
         {
            if(letras(x.charAt(posicao)))
            {
               IO.println( "Letras: " + x.charAt(posicao) );
            }
            else
            {
               count++;
               IO.println( "Nao sao digitos e nem letras: " + x.charAt(posicao) + ", quantidade : " + count);
            } //endSe
         }
      }//end repeticao
            
   } //end metodo04( )
      
      
   public static boolean digito(char simbolo)
   {
      boolean resposta = false;
      if(simbolo >= '0' &&
            simbolo <= '9')
      { resposta = true; }
        //retornar
      return(resposta);
   } //end digito( )
      
   public static boolean letras(char simbolo)
   {
      
      boolean resposta = false;
      
      if( simbolo >= 'a' &&
          simbolo <= 'z' ||
          simbolo >= 'A' &&
          simbolo <= 'Z'  )
      {
         resposta = true;
      } //endSe
         //retornar resposta
      return(resposta);
   } //end minuscula
      
   //------------------------------- definicao de metodo auxiliar 05
   
   /**
   * @author: Matheus Santos Rosa Carneiro
   * Matricula: 613414
   * Objetivo: ler valores inteiros, um por vez, ate que seja -1 (...)
   * soma = para somar os inversos dos multiplos de 3 ou de 5
   * a, b = ler valores do teclado
   * input = faz a comparacao com os valores lidos no teclado 
   */
   
   
   public static void metodo05( )
   {   
      double soma = 0.0;
      int a, b, input; 
       //input = 0;
   
      a = IO.readint("Entrar com valor de a: " );
      b = IO.readint("Entrar com valor de b: " );
      if(a >= b)
      {
         IO.println( "A deve ser maior que B! " );
      } 
      else
      {
         input = IO.readint( "Entrar com valor do input: " ); 
            
         while(input != -1)
         {
            if((input!= 0 && input > a && input < b) && (input % 3 == 0 || input % 5 == 00))
            {
               soma += 1.0/(double)input;           
            } //endSe
            else
            {
               IO.println( "Valor nao e multiplo de 3 nem de 5, ou -1" );
            }
            input = IO.readint( "Entrar com valor do input: " );
         } //end repeticao
      } //endSe   
      IO.println( "Soma total: " + soma);            
   }//end metodo05( ) 
   
  //------------------------------- definicao de metodo auxiliar 06
  
  /**
  * @author: Matheus Santos Rosa Carneiro
  * Matricula: 613414
  * Objetivo: ler valores reais, contar quantos tem o valores primeiro menor que o segundo
  * a, b = valores lidos pelo teclado
  * quantidade = quantas vezes vai ocorrer a repeticao
  * count = contador 
  */
  
  
   public static void metodo06( )
   {
      double a, b;
      int quantidade = 0;
      double count = 0.0;
      
      quantidade = IO.readint ( "Entrar com a quantidade de repeticoes: " );  
      
      while(quantidade > 0) 
      {
      
         a = IO.readdouble( "Entrar com um valor real: " );
         b = IO.readdouble( "Entrar com outro valor real: " );
                  
         if(b > a)
         {
            count++;          
         } //endSe 
         quantidade = quantidade - 1;  
      } //end while      
      IO.println("Primeiro valor menor que o segundo: " + (int)count );          
   } //end metodo06( ) 
   
  //------------------------------- definicao de metodo auxiliar 07 
   
   /**
   * @author: Matheus Santos Rosa Carneiro
   * Matricula: 613414
   * Objetivo ler 3 valores reais do teclado, ate que sejam iguais a zero
   * x, y,z = valores lidos do teclado
   * resultado que sera retornado da funcao
   * funcao mValor para comparar as possibilidades
   * quantidade = quantidade de vezes que o metodo sera executado
   */
   
   public static void metodo07( )
   { 
      double x, y, z;
      double resultado = 0.0;
      
            
      // todos = 0
      int quantidade = IO.readint( "Entrar com quantidade: " );
      
      
      while(quantidade > 0)
      {
         x = IO.readdouble( "Entrar com valor real x: " );
         y = IO.readdouble( "Entrar com valor real y: " );
         z = IO.readdouble( "Entrar com valor real z: " );
      
         resultado += mValor(x, y, z);
         quantidade = quantidade - 1;
      } //end repeticao
                 
      
   } //end metodo07( ) 
   
   
   public static double mValor(double x, double y, double z)
   {
      double resultado = 0.0;
      double count = 0.0;
      double count1 = 0.0;
      double count2 = 0.0;
      
      if(x > y && x > z)
      {
         count++;
         resultado += x;
         IO.println("O maior valor e x: " + x );
      } //endSe  
      else
      {
         if(y > x && y > z)
         {
            count1++;
            resultado += y;
            IO.println( "O maior valor e y: " + y);
         } //endSe
         else
         {
            if(z > x && z > y)
            {
               resultado += z;
               count2++;
               IO.println( "O maior valor e z: " + z);
            }//endSe
         }
      }
      if(count > count1 && count > count2)
      {
         count++;
         resultado += count;
         IO.println( "Contador de x: " + count); 
      }//endSe
      else
      {
         if(count1 > count && count1 > count2)
         {
            count1++;
            resultado += count1;
            IO.println( "Contador de y: " + count1);
         }//endSe
         else
         {
            if(count2 > count && count2 > count1)
            {
               count2++;
               resultado += count2;
               IO.println( "Contador de z: " + count2);
            } //endSe
         }
      }
      return(resultado); 
   } //end mValor( )
   
   //------------------------------- definicao de metodo auxiliar 08
  /**
  * @author: Matheus Santos Rosa Carneiro
  * Matricula: 613414
  * Objetivo: ler tres valores reais do teclado, ate que todos sejam iguais a zero, mostra a soma dos dois maiores.
  * x, y,z = valores lidos do teclado
  * do = metodo de repeticao do/while
  * funcao min = para comparar os valores 
  */
  
  
   public static void metodo08( )
   { 
      double x,y,z;
      double soma;
      double menor;
    
      do
      {
         x = IO.readdouble("Entrar com valor para 'x': ");
         y = IO.readdouble("Entrar com valor para 'y': ");
         z = IO.readdouble("Entrar com valor para 'z': ");            
         
         if(x!=0 && y!=0 && z!=0)
         {
            menor = min(x,y);
            menor = min(menor,z);
            IO.println("Menor dos '3': " + menor); 
            soma = x+y+z - menor;
            IO.println("Soma dois maiores dos '3': "+soma);
         }
      }
       while(x!=0 && y!=0 && z!=0);   
   } //end metodo08( )
   
   public static double min (double x, double y)
   {
      double resposta; //para return
      if (x<y)
      {
         resposta = x;
      }
      else
      {
         resposta = y;
      }           
      return (resposta);
   }   
   //------------------------------- definicao de metodo auxiliar 09
   /**
   * @author: Matheus Santos Rosa Carneiro
   * Matricula: 613414
   * Objetivo: ler valores do teclado, mostrar em ordem crescente
   * x, y,z = valores a serem lidos no teclado
   * m1, m2, m3 = variaveis que vao armazenar x,y,z
   * s = funcao logica para comparar qual valor e maior
   */
   
   public static void metodo09( )
   {
      char x, y, z;
      char m1,m2,m3;
      boolean s; 
   
   
      x = IO.readchar("Entrar com o valor da caractere: " );
      y = IO.readchar("Entrar com o valor da caractere: " );
      z = IO.readchar("Entrar com o valor da caractere: " );
          
      if ( boole(x,y) )
      {
         if ( boole(x,z) )
         {
            m1 = x;
            if ( boole(y,z) )
            {
               m2 = y; m3 = z;
            } 
            else
            {
               m2 = z; m3 = y;
            } 
         } 
         else
         {
            if ( boole(y,z) )
            {
               m1 = y; m2 = z; m3 = x;
            } 
            else
            {
               m1 = z; m2 = x; m3 = y;
            } 
         } 
      }
      else
      {
         if ( boole(y,z) )
         {
            m1 = y;
            if ( boole(x,z) )
            {
               m2 = x; m3 = z;
            } 
            else
            {
               m2 = z; m3 = x;
            } 
         }  
         else
         {
            m1  = z;
            if ( boole(x,z) )
            {
               m2 = x; m3 = y;
            } 
            else
            {
               m2 = y; m3 = x;
            } 
         } 
      } 
      IO.println ( ""+m1+" "+m2+" "+m3 );
   } //end
     
   public static boolean boole(char simbolo, char simbolo2)
   {
      boolean resposta = false;
      if(simbolo < simbolo2)
      {
         resposta = true;
      }
      return(resposta);
   }//end boole
      
    //------------------------------- definicao de metodo auxiliar 10
   /**
   * @author: Matheus Santos Rosa Carneiro
   * Matricula: 613414
   * Objetivo: ler valores no teclado, dizer quais estao em ordem crescente, decrescente ou nenhuma ordem (...)
   * s1, s2, s3 = valores lidos no teclado
   * Utilizamos o compareTo( ) para comparar strings
   */
   
   public static void metodo10( )
   {
      String s1, s2, s3;
      s1 = IO.readString("Entrar com cadeia de caracteres s1: " );
      s2 = IO.readString("Entrar com cadeia de caracteres s2: " );
      s3 = IO.readString("Entrar com cadeia de caracteres s3: " );
   
      if(s1.compareTo(s2) >= 0 && s2.compareTo(s3) >= 0) //crescente 
      {
         IO.println("Ordem decrescente! ");
      }//endSe      
      
      else if(s1.compareTo(s2) <= 0 && s2.compareTo(s3) <= 0) //dcrescente
      {
         IO.println("Ordem crescente! " );
      } //endSE
      else
      {
         IO.println("Ordem aleatoria ! " );
      } //endSe
   } //end metodo10( )
   //------------------------------- definicao de metodo principal
   public static void main(String [] args)
   {      
         //definir dados
      int opcao;
      
      do{
         IO.println( "0 - parar "  );
         IO.println( "1 - metodo01 " );
         IO.println( "2 - metodo02 " );
         IO.println( "3 - metodo03 " );
         IO.println( "4 - metodo04 " );
         IO.println( "5 - metodo05 " );
         IO.println( "6 - metodo06 " );
         IO.println( "7 - metodo07 " );
         IO.println( "8 - metodo08 " );
         IO.println( "9 - metodo09 " );
         IO.println("10 - metodo10 " );
         
         opcao = IO.readint( "Informe a opcao: " );
         
         switch( opcao )
         {
            case 0:
               break;
            case 1:
               metodo01( );
               break;
            case 2:
               metodo02( );
               break;  
            case 3:
               metodo03( );
               break;   
            case 4:
               metodo04( );
               break;   
            case 5:
               metodo05( );
               break; 
            case 6:
               metodo06( );
               break;  
            case 7:
               metodo07( );
               break;  
            case 8:
               metodo08( );
               break; 
            case 9:
               metodo09( );
               break; 
            case 10:
               metodo10( );
               break;  
            default:
               IO.println( "Error " );
               break;
           
         } //endEscolher     
      } //end
      while( opcao != 0);
      
        
   //encerrar
      IO.pause( "Aperte ENTER para parar ! " );      
   } //end main( )      
} //end class( )

/*
// ---------------------------------------------- Documentacao complementar
//
// ---------------------------------------------- Historico
//
// Versao	Data	 Modificacao
// 0.0		01/mm	 esboco
//
// ---------------------------------------------- Testes
//
// Versao	Teste
// 0.0		01. ( OK )      teste do modelo
// 0.1      01. ( OK )      metodo01( ) 
// 0.2      01. ( OK )      metodo02( )
// 0.3      01. ( OK )      metodo03( )  
// 0.4      01. ( OK )      metodo04( )
// 0.5      01. ( OK )      metodo05( )
// 0.6      01. ( OK )      metodo06( )
// 0.7      01. ( OK )      metodo07( )
// 0.8      01. ( OK )      metodo08( )
// 0.9      01. ( OK )      metodo09( )
// 10       01. ( OK )      metodo10( )
//                          
// ----------------------------------------------
*/
