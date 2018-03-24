/**
  * ---------------------------------------------- Documentacao preliminar
  * Pontificia Universidade Catolica de Minas Gerais
  * Curso de Ciencia da Computacao
  * Algoritmos e Estruturas de Dados I
  *
  * Trabalho pratico: Recuperacao 03 
  *
  * Objetivo:
  * Modelo de programa para a disciplina AED I
  * Sugestao para montar um trabalho pratico
  *
  * Autor:   Matricula: 613414 Nome: Matheus Santos Rosa Carneiro
  * Versao:  1.0                Data: 30/10/2017
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
  * - Recuperacao_03.java
  * - Recuperacao_03.class
  * - IO.jar    ( por exemplo em C:\java\jre\lib\ext\IO.jar )
  *
  * Forma de compilacao:
  * - acionar o compilador no modo console:
  *
  *   <drive>:>javac   Recuperacao_03.java
  *   ou
  *   <drive>:>compile Recuperacao_03
  *
  * Forma de uso:
  * - acionar o programa no modo console:
  *
  *   <drive>:>java Recuperacao_03
  *   ou
  *   <drive>:>run  Recuperacao_03
  *
  * - escolher uma das opcoes oferecidas.
  *
  * Referencias:
  * - Exemplos mostrados em sala de aula
  * - Apostila: Fundamentos de Programacao - Notas de aulas
  *
  */

// ---------------------------------------------- classes nativas
//                                                ou auxiliares

import IO.*;
import java.util.Arrays;

// ---------------------------------------------- definicao de classe

/**
  * Recuperacao_03 - modelo para definir uma classe.
  *            Obs.: O nome da classe  (Recuperacao_03) deve concordar com
  *                  o nome do arquivo (Recuperacao_03.java), inclusive no
  *                  uso de maiusculas e minusculas.
  */
  
public class Recuperacao_03 {

   /**
   * @author: Matheus Santos Rosa Carneiro
   * @version: 01
   * Objetivo: Determinar se os valores no arranjo estao em ordem decrescente. 
   */
   
   /**
   * funcao para identificar se os valores estao em ordem decrescente
   */
   
   public static boolean decrescente( int [] entrada )
   {
      //definir dados
      int tamanho; 
      int i;
      int maior;
      int ultimo; 
      boolean resultado = true; 
      
      //obter o tamanho do arranjo
      tamanho = entrada.length;
      
      //verificar se o tamanho e' valido
      if( tamanho <= 0 )
      {
         IO.println("ERRO: Tamanho do arranjo e' invalido. " );
      } //end 
      else //se o tamanho for valido
      {
         maior = entrada[0]; 
         for(i = 1; i < tamanho; i++)
         {
            if( entrada[i] >= maior )
            {
               resultado = false;
            } //end se
            else
            {
               maior = entrada[i];
            } //end se
         } //end repetir 
      } //end 
      //retornar resultado booleano
      return( resultado );
   } //end decrescente( )
   
   public static void exe01( )
   {
      int tamanho; 
      int count; 
      int tamanho2;
      int x, y, i, z;
      String linha; 
      FILE arquivo = null; 
      int [] resposta = null; 
      boolean resultado; //chamar funcao booleana 
      
      //ler do teclado o tamanho do arranjo
      tamanho = IO.readint("Informe o tamanho do arranjo: " );
      
      //verificar se o tamanho e' valido
      if( tamanho <= 0 )
      {
         IO.println("ERRO: Tamanho do arranjo nao e' valido. " );
      } //end 
      else //se o tamanho for valido
      {
         arquivo = new FILE(FILE.INPUT, "DADOS1.TXT");
         //ler a primeira linha
         linha = arquivo.readln( );
         //converter a linha para inteiro
         tamanho2 = IO.getint( linha );
         //verificar se o tamanho do arranjo e' maior que o tamanho do arquivo 
         if( tamanho > tamanho2 )
         {
            IO.println("ERRO: Tamanho do arranjo e' invalido. " );
         } //end
         else //se o tamanho for valido
         {
            resposta = new int [ tamanho ];
            for(i = 0; i < tamanho; i++)
            {
               //ler linha do arquivo
               linha       = arquivo.readln( );
               resposta[i] = IO.getint( linha );
            } //end repetir
            resultado = decrescente(resposta);
            if(resultado)
            {
               IO.println("Os valores entao em ordem decrescentes. ");
            } //end 
            else
            {
               IO.println("Os valores nao entao em ordem decrescente. " );
               for(x = 0; x < tamanho; x++)
               {
                  for(y = 0; y < tamanho; y++)
                  {
                     if( resposta[y] < resposta[x] )
                     {
                        z           = resposta[x];
                        resposta[x] = resposta[y];
                        resposta[y] = z;
                     } //end 
                  } //end repetir
               } //end repetir
               FILE arquivo02 = new FILE(FILE.OUTPUT, "DECRESCENTE.TXT" );
               arquivo02.println("" + tamanho); 
               IO.println("Arranjo esta' ordenado. " );
               for(i = 0; i < tamanho; i++)
               {
                  arquivo02.println("" + resposta[i]);
                  IO.println(resposta[i]);
               } //end repetir
               //fechar os arquivos indispensavel
               arquivo.close( );
               arquivo02.close( );
            } //end se
         } //end se
      } //end se
   //encerrar
      IO.pause("Aperte ENTER para continuar. " );     
   } //end exe01( );
   
   /**
  * Funcao para inverter a ordem de um arranjo
  */
  
   public static int [] inverter( int [] entrada ) 
   {
      //definir dados
      int x;
      int y;
      int tamanho; 
      int i;
      int [] novo = null;
      
      //obter o tamanho do arranjo
      tamanho = entrada.length;
      //verificar se o tamanho e' valido
      if(tamanho <= 0)
      {
         IO.println("ERRO: Tamanho e' invalido.");
      } //end 
      else //se o tamanho for valido
      {  
         for(x = 0; x < tamanho; x++)
         {
            for(y = 0; y < tamanho; y++)
            {
               if(entrada[y] > entrada[x])
               {
                  i          = entrada[x];
                  entrada[x] = entrada[y];
                  entrada[y] = i;
               } //end 
            } //end repetir
         } //end repetir        
         novo = new int [ tamanho ];
         for(x = 0; x < tamanho; x++)
         {
            novo[x] = entrada[x];
         } //end repetir
      } //end se
      //retornar novo arranjo 
      return(novo);
   } //end inverter( )
   
/**
  * Exercicio 02 - Gravar o arranjo invertido em arquivo. 
  * author: Matheus Santos Rosa Carneiro
  * Matricula: 613414
  */
   public static void exe02( )
   {
      //definir dados
      int n;
      int tamanho;
      int i; 
      String linha;
      int[] entrada = null;
      int[] novo = null;
      FILE arquivo = null;
      FILE arquivo02 = null;
      //ler dos teclados os dados a serem lidos
      n = IO.readint("Informe os dados: ");
      //testar se a quantidade e' valida
      if(n <= 0)
      {
         IO.println("ERRO: Quantidade de dados e' invalida. ");
      } //end 
      else //se a quantidade for valida
      {
         //para ler os dados 
         arquivo = new FILE(FILE.INPUT, "DECRESCENTE.TXT");
         //ler a primeira linha
         linha = arquivo.readln();
         tamanho = IO.getint(linha); 
         //verificar se os dados sao validos
         if(n > tamanho)
         {
            IO.println("ERRO: Tamanho e' invalido.");
         }
         else //se for valido
         {
            entrada = new int [ tamanho ];
            for(i = 0; i < tamanho; i++)
            {
               linha = arquivo.readln();
               entrada[i] = IO.getint(linha);
            } //end repetir
            //fechar o arquivo (indispensavel)
            arquivo.close(); 
            novo = inverter(entrada);
            //verificar se o arranjo e' nulo 
            if( novo == null )
            {
               IO.println("ERRO: Arranjo e' nulo.");
            } //end 
            else //se o arranjo for valido
            {
               //para gravar os dados invertidos 
               arquivo02 = new FILE(FILE.OUTPUT, "INVERTIDOS.TXT");
               //verificar se o tamanho e' valido
               if( novo.length <= 0 ) 
               {
                  IO.println("ERRO: Tamanho e' invalido.");
               } //end 
               else //se o tamanho for valido
               {
                  //printar no arquivo o tamanho
                  arquivo02.println("" + novo.length);
                  for(i = 0; i < novo.length; i++)
                  {
                     arquivo02.println(""+ novo[i]);
                     IO.println(novo[i]);
                  } //end repetir
                  //fechar o arquivo (indispensavel)
                  arquivo02.close(); 
               } //end se
            } //end se
         } //end se 
      } //end se 
      //encerrar
      IO.pause("Aperte ENTER para continuar. " );
   } //end exe02( )
   
   /** exe03 
   * author: Matheus Santos Rosa Carneiro
   * Matricula: 613414
   * Receber e mostrar o menor valor no metodo que chamar a funcao
   **/
   
   /**
   * funcao para encontrar o menor valor
   */ 
   
   public static int menor ( String nome )
   {
      FILE arquivo;
      arquivo = new FILE( FILE.INPUT, nome );
      int tamanho, i; 
      int menor = 0;
      String linha;
      int [ ] vetor = null;
      //ler a primeira linha do arquivo
      linha = arquivo.readln( );
      //converter para inteiro
      tamanho = IO.getint( linha ); 
      //verificar se o tamanho e' valido
      if( tamanho <= 0 )
      {
         IO.println("ERRO: Tamanho e' invalido." );
      } //se o tamanho for valido
      else
      {
         vetor = new int [ tamanho ];
         for(i = 0; i < tamanho; i = i + 1)
         {
            linha = arquivo.readln();
            //verificar se a linha for diferente de nula
            if( linha != null )
            {
               vetor[i] = IO.getint( linha );
            } //end 
         } //end repetir
         menor = vetor[0];
         for(i = 1; i < tamanho; i = i + 1)
         {
            if(vetor[i] < menor)
            {
               menor = vetor[i];
            } //end se
         } //end repetir
      } //end se 
      //retornar o menor dado
      return( menor );
   } //end menor( )
   
   /**
   * metodo para chamar a funcao
   */
   
   public static void exe03( )
   {
      //definir dados
      int dados; 
      
      //chamar a funcao menor
      dados = menor("DADOS1.TXT");
      
      //mostrar na tela 
      IO.println("Menor: " + dados );
      
      //encerrar
      IO.pause("Aperte ENTER para continuar. " );
   } //end exe03( )
           
   /** exe 04 
   * @author: Matheus Santos Rosa Carneiro
   * Matricula: 613414
   
   * Filtrar e mostrar os elementos comuns aos dois arranjos, 
   * sem repeticoes. 
   **/
   
   public static int [ ] filtrar ( int [] n1, int [] n2 )
   {
      //definir dados
      int tamanho;
      int tamanho1;
      int tamanho2;
      int x, y, w, i;
      int [ ] vetor = null; 
      
      //obter o tamanho dos arranjos de inteiros
      tamanho1 = n1.length;
      tamanho2 = n2.length;
      
      //verificar a validade dos tamanhos
      if( tamanho1 <= 0 || tamanho2 <= 0 )
      {
         IO.println("ERRO: Tamanho(s) invalido(s). " );
      } //end
      else //se os tamanhos forem validos
      {
         vetor = new int [ tamanho1 ];
         w = 0;
         for(x = 0; x < tamanho1; x++)
         {
            for(y = 0; y < tamanho2; y++)
            {
               if(n1[x] == n2[y])
               {
                  vetor[w] = n1[x];
                  w++;
               } //end 
            } //end repetir
         } //end repetir
         //obter o tamanho do vetor
         tamanho = vetor.length;
         //verificar se o tamanho do vetor e' valido
         if( tamanho <= 0 )
         {
            IO.println("ERRO: Tamanho invalido. " );
         } //end
         else //se o tamanho for valido
         {
            i = 0; 
            for(x = 0; x < tamanho; x++)
            {
               for(y = 0; y < tamanho; y++)
               {
                  if(x != y && vetor[x] == vetor[y])
                  {
                     vetor[x] = 0;
                     i++;
                  } //end
               } //end repetir
            } //end repetir
         } //end se
      } //end se
      //retornar o vetor filtrado
      return( vetor );
   } //end filtrar( )
   
   /**
   * funcao para ler dados do arquivo
   **/ 
   
   public static int [ ] lerDadosDoArquivo( String nome )
   {
      //definir dados
      int tamanho;
      int i;
      FILE arquivo;
      int [ ] array = null;
      String linha;
      //ler os dados do arquivo
      arquivo = new FILE(FILE.INPUT, nome);
      
      //ler a primeira linha do arquivo
      linha = arquivo.readln( );
      
      //verificar se a linha e' valida
      if( linha == null )
      {
         IO.println("ERRO: Ha' linha e' invalida. " );
      } //end
      else //se a linha for valida
      {
         //converter a linha para inteiro
         tamanho = IO.getint( linha );
         array = new int [ tamanho ];
         for(i = 0; i < tamanho; i++)
         {
            //ler linha do arquivo
            linha = arquivo.readln( );
            //verificar se a linha e' valida
            if( linha != null )
            {
               array[i] = IO.getint( linha );
            } //end 
         } //end repetir
         //fechar arquivo (indispensavel)
         arquivo.close( );
      } //end se 
      //retornar o arranjo
      return( array );
   } //end lerDadosDoArquivo( )
   
   /**
   * metodo para chamar as funcoes
   **/
   
   public static void exe04( )
   {
      //definir dados
      int tamanho; 
      int tamanho1;
      int tamanho2;
      int contador;
      int i;
      int [ ] vetor   = null;
      int [ ] array   = null; 
      int [ ] filtrar = null;
      FILE arquivo;
      
      //chamar a funcao para ler dados do arquivo
      vetor = lerDadosDoArquivo("DADOS1.TXT");
      array = lerDadosDoArquivo("DADOS2.TXT");
      
      //verificar se os dados lidos sao validos
      if( vetor == null || array == null )
      {
         IO.println("ERRO: Arranjo(s) nulo(s). " );
      } //end 
      else //se os arranjos forem validos
      {
         //chamar a funcao para filtrar os dois vetores
         filtrar = filtrar( vetor, array );
         //verificar se o arranjo filtrar e' valido
         if( filtrar == null )
         {
            IO.println("ERRO: Arranjo e' nulo. " );
         } //end  
         else //se o arranjo for valido
         {
            //obter o tamanho do arranjo
            tamanho = filtrar.length;
            
            //verificar se o tamanho e' valido
            if( tamanho <= 0 )
            {
               IO.println("ERRO: Tamanho e' invalido. " );
            } //end 
            else //se o tamanho for valido
            {
               IO.println("Os elementos em comum, sao: " );
               contador = 0;
               for(i = 0; i < tamanho; i++)
               {
                  if(filtrar[i] != 0)
                  {
                     IO.println(filtrar[i]);
                     contador++;
                  } //end 
               } //end repetir
               //para gravar dentro do arquivo txt
               arquivo = new FILE(FILE.OUTPUT, "FILTRADOS.TXT");
              //printar o contador de dados no arquivo
               arquivo.println("" + contador ); 
               for(i = 0; i < tamanho; i++)
               {
                  if(filtrar[i] != 0)
                  {
                     arquivo.println("" + filtrar[i]);
                  } //end
               } //end repetir
              //fechar o arquivo (indispensavel)
               arquivo.close( );
            } //end se
         } //end se
      } //end se    
      //encerrar
      IO.pause("Aperte ENTER para continuar. " );
   } //end exe04( )
   
   /**
   * exe 05 
   * author: Matheus Santos Rosa Carneiro
   * Matricula: 613414
   *
   * Supondo serem digitos de um numero binario, 
   * converte-los para decimal mediante o uso de uma funcao.
   **/
   
   public static int [ ] binarios ( int i )
   {
      //definir dados
      int x, y;
      int [ ] array = null;
      int value; 
      
      //verificar se a quantidade e' valida
      if( i <= 0 )
      {
         IO.println("ERRO: Quantidade e' invalida. " );
      } //end 
      else
      {
         x     = 0;
         array = new int [ i ]; 
         
         while(x < i)
         {
            //ler valor binario do teclado
            value = IO.readint("Informe o valor em binario: " );
            //se o numero for diferente de 0 e 1 e' invalido
            if(value != 1 && value != 0 )
            {
               IO.println("ERRO: Numeros aceitos: '0' e '1'. " );
            } //end se
            else //se os valores forem validos
            {
               array[x] = value;
               x++;
            } //end se
         } //end repetir
      } //end se
      //retornar o arranjo
      return( array );
   } //end binarios( )
   
   /**
   * funcao para converter o binario para decimal
   **/
   
   public static int conversor( int [ ] entrada )
   {
      //definir dados
      int tamanho; 
      int i; 
      int decimal = 0;
      
      //obter o tamanho da entrada 
      tamanho = entrada.length;
      
      //verificar se o tamanho e' valido
      if( tamanho <= 0 )
      {
         IO.println("ERRO: Tamanho e' invalido. " );
      } //end 
      else //se o tamanho for valido
      {
         for(i = 0; i < tamanho; i++)
         {
            decimal += (entrada[i] * (int) Math.pow(2, (tamanho -(i+1))));
         } //end se
      } //end se
        //retornar decimal
      return( decimal );    
   } //end conversor( )
   
   /**
   * metodo para chamar as duas funcoes
   **/
   
   public static void exe05( )
   {
      //definir dados
      int quantidade;
      int tamanho; 
      int i;
      int decimal; 
      int [ ] array = null; 
      
      //ler a quantidade do teclado 
      quantidade = IO.readint("Informe a quantidade de valores: " );
      //chamar a funcao 
      array = binarios ( quantidade );
      
      //verificar se o arranjo e' valido
      if( array != null )
      {
         tamanho = array.length;
         //verificar se o tamanho e' valido
         if( tamanho <= 0 )
         {
            IO.println("ERRO: Tamanho e' invalido. " );
         } //end
         else //se o tamanho for valido
         {
            IO.println("Os numeros binarios, sao: " );
            //pecorrer o arranjo
            for(i = 0; i < tamanho; i++)
            {
               IO.println("" + array[i]);
            } //end repetir
            //chamar a funcao conversor
            decimal = conversor( array );
            IO.println("Binario convertido para decimal: " + decimal );
         } //end se
      } //end
     //encerrar
      IO.pause("Aperte ENTER para continuar. " );
   } //end exe05( )
   
   /**
   * exe 06 
   * author: Matheus Santos Rosa Carneiro
   * Matricula: 613414
   **/
      
   public static void mostrar ( int [ ][ ] matriz )
   {
      //definir dados
      int i;
      int j;
      int linhas;
      int colunas;
      
      //obter o tamanho da matriz
      linhas  = matriz.length;
      colunas = matriz [ 0 ].length;
      //pecorrer pela matriz    
      for( i = 0; i < linhas; i = i + 1 )
      {
         for ( j = 0; j < colunas; j = j + 1 )
         {
            IO.print(" " + matriz [ i ][ j ] );  
         }//end repetir
         IO.print( "\n" );
      }//end repetir
   }//end mostrar( )
   
   public static void exe06( )
   {
      //definir dados
      int [ ][ ] matrix = null; 
      int n;
      int x;
      int i, j;
      
      //ler do teclado a quantidade de linhas e colunas
      n = IO.readint("Informe a quantidade de linhas e colunas (matriz quadrada): " );
      
      //testar se a quantidade e' valida
      if( n <= 0 )
      {
         IO.println("ERRO: Quantidade(s) invalida(s). " );
      } //end 
      else //se a quantidade for valida
      {
         matrix = new int [ n ][ n ]; 
         
         //verificar se a matriz e' valida
         if( matrix == null )
         {
            IO.println("ERRO: Matriz e' invalida. " );
         } //end
         else //se a matriz for valida
         {
            x = 1;
            for(i = 0; i < n; i++)
            {
               for(j = 0; j < n; j++)
               {
                  matrix[i][j] = x;
                  x++;
               } //end repetir
            } //end repetir 
            //chamar metodo
            //matriz( matrix );
            mostrar( matrix );
         } //end se
      } //end se
      //encerrar
      IO.pause("Aperte ENTER para continuar. " );
   } //end exe06( )
   
   /**
   * exe 07 
   * @author: Matheus Santos Rosa Carneiro
   * Matricula: 613414
   **/
   
   public static void exe07( )
   {
      //definir dados
      int [ ][ ] matriz = null;
      int n; 
      int i, j;
      int x;
      
      //ler do teclado uma matriz quadrada 
      n = IO.readint("Informe a quantidade de linhas e colunas (matriz quadrada): " );
      
      //verificar se a quantidade e' valida
      if( n <= 0 )
      {
         IO.println("ERRO: Quantidade(s) invalida(s). " );
      } //end 
      else // se as quantidades forem validas
      {
         matriz = new int [ n ][ n ];
         
         //verificar se a matriz e' valida
         if( matriz == null )
         {
            IO.println("ERRO: Matriz e' invalida. " );
         } //end se
         else //se a matriz for valida
         {
            x = 1;
            for(i = 0; i < n; i++)
            {
               for(j = 0; j < n; j++)
               {
                  matriz[j][i] = x; 
                  x++;      
               } //end repetir
            } //end repetir
            
            //chamar metodo
            mostrar(matriz);
         } //end se
      } //end se
      //encerrar
      IO.pause("Aperte ENTER para continuar. " );
   } //end exe07( )
   
   /**
   * exe 08
   * @author: Matheus Santos Rosa Carneiro
   * Matricula: 613414
   **/
   
   public static int [ ][ ] lerDoArquivo ( String nome )
   {
   // definir dados
      FILE arquivo = new FILE ( FILE.INPUT, nome );
      int linhas, colunas;
      int x, y;
      int [ ][ ] tabela = null;
      String linha;
      
   // tentar ler uma linha do arquivo
      linha = arquivo.readln ( );
   // testar a disponibilidade de dados
      if ( linha == null )
      {
         IO.println ( "ERRO: Nao ha' dados no arquivo." );
      }
      else
      {
      // tentar obter a quantidade de linhas
         linhas = IO.getint ( linha );
      // tentar obter a quantidade de colunas
         linha = arquivo.readln ( );
         colunas = IO.getint ( linha );
      // testar se quantidade valida
         if ( linhas <= 0 || colunas <= 0 )
         {
            IO.println ( "ERRO: Tamanho invalido." );
         }
         else
         {
         // reservar espaco para os dados
            tabela = new int [ linhas ] [ colunas ];
         // repetir para cada dado no arquivo
            for ( x = 0; x < linhas; x = x + 1 )
            {
               for ( y = 0; y < colunas; y = y + 1 )
               {
               // ler linha do arquivo
                  linha = arquivo.readln ( );
               // armazenar em um posicao da matriz
               // valor convertido para inteiro
                  tabela [ x ][ y ] = IO.getint ( linha );
               } // fim for
            } // fim for
         } // fim se
      } // fim se
   // fechar arquivo
      arquivo.close ( );
   // retornar matriz montada
      return ( tabela );
   } // fim lerDoArquivo ( )
   
   public static boolean caracteristica ( int [ ][ ] matrix )
   {
      //definir dados
      int linhas; 
      int colunas;
      int i, j;
      boolean resposta = true;
      
      //verificar se a matriz e' valida
      if( matrix == null )
      {
         IO.println("ERRO: Matriz e' invalida. " );
      } //end 
      else //se a matriz for valida
      {
         //obter o tamanho de linhas e colunas
         linhas  = matrix.length;
         colunas = matrix[0].length;
         
         //verificar se o tamanho e' valido
         if( linhas <= 0 || colunas <= 0 )
         {
            IO.println("ERRO: Tamanho(s) invalido(s). " );
         } //end 
         else //se os tamanhos forem validos
         {
            //pecorrer pela matrix
            for(i = 0; i < linhas; i++)
            {
               for(j = 0; j < colunas; j++)
               {
                  //verificar se a matriz na posicao inical e' igual a 1
                  if( matrix[0][0] != 1 )
                  {
                     resposta = false;
                  } //end se
                  else if( i % 2 != 0 && matrix[i][j] != (int) Math.pow((j + 1), i))
                  {
                     resposta = false;
                  } //end se
                  else if( i % 2 == 0 && matrix[i][j] != (int) Math.pow((j+1), i))
                  {
                     resposta = false;
                  } //end se
               } //end repetir
            } //end repetir
         } //end se
      } //end se
      //retornar resposta
      return ( resposta );
   } //end caracteristica( )
   
   public static void exe08( )
   {
      //definir dados
      int [ ][ ] resposta = null;
      boolean resp; 
      
      //chamar funcao para ler a matriz
      
      resposta = lerDoArquivo("MATRIZ1.txt");
      
      //verificar se a matriz e' valida
      if( resposta == null )
      {
         IO.println("ERRO: Matriz e' invalida. " );
      } //end 
      else // se a matriz for valida
      {
         //chamar metodo para mostrar 
         mostrar( resposta );
         //chamar a funcao para verificar a caracteristica
         resp = caracteristica ( resposta );
         if(resp)
         {
            IO.println("A matriz analisada apresenta as caracteristicas solicitadas. " );
         } //end
         else
         {
            IO.println("A matriz analida nao apresenta as caracteristicas previstas. " );
         } //end se
      } //end se
      //encerrar
      IO.pause("Aperte ENTER para continuar. " );
   } //end exe08( )
   
   /**
   * exe 09 
   * @author: Matheus Santos Rosa Carneiro
   * Matricula: 613414
   **/
  
   public static void exe09( )
   {
      //definir dados
      int [ ][ ] a1 = null;
      int [ ][ ] a2 = null;
      boolean resposta; 
      
      //ler dados do arquivo
      a1 = lerDoArquivo("MATRIZ1.txt");
      a2 = lerDoArquivo("MATRIZ2.txt");
      //mostrar ambas matrizes
      mostrar(a1);
      mostrar(a2);
     
      //verificar se os dados sao validos
      if( a1 == null || a2 == null )
      {
         IO.println("ERRO: Matrize(s) nula(s). " );
      } //end se9
      
      else //se as matrizes forem validas
      {
         resposta = equal(a1, a2);
         if(resposta)
         {
            IO.println("As matrizes sao iguais. " );
         } //end se
         else
         {
            IO.println("As matrizes sao diferentes. " );
         } //end se
      } //end se      
      //encerrar
      IO.pause("Aperte ENTER para continuar. " );
   } //end exe09( )
            
   public static boolean equal (int [ ][ ] a1, int[ ][ ] a2)
   {
      //definir dados
      boolean resposta = true;
      int linhas;
      int colunas;
      int i, j;
      
      //verificar se as matrizes sao validas
      if( a1 == null )
      {
         IO.println("ERRO: Matriz a1 e' invalida. " );
      } //end  
      else //se a matriz a1 for valida, verificar a a2
      {
         if( a2 == null )
         {
            IO.println("ERRO: Matriz a2 e' invalida. " );
         } //end se
         else //se ambas as matrizes forem validas
         {
            if(a1.length == 0 || a2.length == 0 ||
            a1[0].length == 0 || a2[0].length == 0 ||
            a1.length != a2.length )
            {
               IO.println("ERRO: Tamanho(s) invalido(s). " );
            } //end se
            else //se os tamanho(s) forem validos
            {
               //obter o tamanho de linhas e colunas
               linhas  = a1.length; 
               colunas = a2[0].length;
               
               //pecorrer por toda matriz
               for(i = 0; i < linhas; i++)
               {
                  for(j = 0; j < colunas; j++)
                  {
                     if(a1[i][j] == a2[i][j])
                     {
                        resposta = true;
                     } //end se
                     else
                     {
                        resposta = false; 
                        break;
                     } //end se
                  } //end repetir
               } //end repetir
            } //end se
         } //end se
      } //end se
      //retornar resposta
      return( resposta );
   } //end equal( )  
      
     
// ---------------------------------------------- definicao do metodo principal

   public static void main ( String [ ] args )
   {
   // definir dados
      int opcao;
   
   // repetir ate' desejar parar
      do
      {
      // identificar
         IO.println ( );   // para saltar linha
         IO.println ( "Recuperacao_03 - v.0.1 - 30/10/2017" );
         IO.println ( "Matricula: 613414 Nome: Matheus Santos Rosa Carneiro" );
         IO.println ( );   // para saltar linha
      
      // mostrar opcoes
         IO.println ( "Opcoes:" );
         IO.println ("0 - parar" );
         IO.println ("1 - exe 01" );
         IO.println ("2 - exe 02" );
         IO.println ("3 - exe 03" );
         IO.println ("4 - exe 04" );
         IO.println ("5 - exe 05" );
         IO.println ("6 - exe 06" );
         IO.println ("7 - exe 07" );
         IO.println ("8 - exe 08" );
         IO.println ("9 - exe 09" );
         IO.println ( );
      
      // ler opcao
         opcao = IO.readint ( "Qual a sua opcao? " );
      
      // escolher acao
         switch ( opcao )
         {
            case 0:
               break;
            case 1:
               exe01( );
               break;
            case 2:
               exe02( );
               break;
            case 3:
               exe03( );
               break;
            case 4:
               exe04( );
               break;
            case 5:
               exe05( );
               break;
            case 6:
               exe06( );
               break;
            case 7:
               exe07( );
               break;
            case 8:
               exe08( );
               break;
            case 9:
               exe09( );
               break;
            default:
               IO.println("ERRO: Opcao invalida. " );
               break;
         } // fim escolher
      }
      while ( opcao != 0 );
   // encerrar execucao
      IO.println ( );
      IO.pause   ( "Apertar ENTER para terminar." );
   } // end main ( )
} // fim Recuperacao_03 class

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
//
// ----------------------------------------------
*/