/**
  * ---------------------------------------------- Documentacao preliminar
  * Pontificia Universidade Catolica de Minas Gerais
  * Curso de Ciencia da Computacao
  * Algoritmos e Estruturas de Dados I
  *
  * Trabalho pratico: ED_08
  *
  * Objetivo:
  * Modelo de programa para a disciplina AED I
  * Sugestao para montar um trabalho pratico
  *
  * Autor: Matheus Santos R. C.   Matricula: 613414  Nome: Matheus Santos Rosa Carneiro
  * Versao:  1.0                Data: 29/09/2017
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
  * - ED_08.java
  * - ED_08.class
  * - IO.jar    ( por exemplo em C:\java\jre\lib\ext\IO.jar )
  *
  * Forma de compilacao:
  * - acionar o compilador no modo console:
  *
  *   <drive>:>javac   ED_08.java
  *   ou
  *   <drive>:>compile ED_08
  *
  * Forma de uso:
  * - acionar o programa no modo console:
  *
  *   <drive>:>java ED_08
  *   ou
  *   <drive>:>run  ED_08
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

// ---------------------------------------------- definicao de classe

/**
  * ED_08 - modelo para definir uma classe.
  *            Obs.: O nome da classe  (ED_08) deve concordar com
  *                  o nome do arquivo (ED_08.java), inclusive no
  *                  uso de maiusculas e minusculas.
  */
  
public class ED_08
{
  /** 
  * Exemplo0141
  * @author: Matheus Santos Rosa Carneiro
  * @version: 01
  */
  
  /**
  * ler valores inteiros de arquivos e guardar em arranjo
  * @return tabela com os valores lidos de arquivo
  * @param nome do arquivo com os dados
  */
  
   public static int [] lerDoArquivo(String nome)
   {
      //definir dados
      FILE arquivo = new FILE(FILE.INPUT, nome);
      int tamanho; 
      int x; //repeticao
      int [ ] tabela = null; //inicio = nada
      String linha;
      
      //identificar 
      IO.println( "Montar arranjo com valores lidos de arquivo" );
      
      //tentar ler uma linha do arquivo
      linha = arquivo.readln( );
      
      //testar a disponibilidade de dados
      if(linha == null) //essencial fazer o teste
      {
         IO.println("ERRO: Nao ha' dados no arquivo. " );
      }
      else
      {
         //tentar obter a quantidade de dados
         tamanho = IO.getint(linha);
         
         //testar se quantidade valida
         if(tamanho <= 0)
         {
            IO.println("ERRO: Tamanho invalido. " );
         }
         else
         {
            //reservar espaco para os dados
            tabela = new int [ tamanho ];
            
            //repetir para cada dado no arquivo
            for(x = 0; x < tamanho; x++)
            {
               //ler linha do arquivo
               linha = arquivo.readln( );
               
               //armazenar em uma posicao do arranjo
               //valor convertido para inteiro
               tabela [x] = IO.getint(linha);
            } //end repeticao
         } //endSe
      } //endSe
      //fechar arquivo
      arquivo.close( );
      //retornar dados lidos
      return(tabela);
   } //end lerDoArquivo( )
  
  /**
  * recuperar dados de arquivo.
  */
   public static void teste01( )
   {
      //1. definir dados
      int [ ] tabela = null; //nada dentro
      
      //2. identificar 
      IO.println( );
      IO.println("Recuperar dados do arquivo. ");
      IO.println( );
      
      //3.montar dados
      tabela = lerDoArquivo("DADOS.TXT");
      
      //4. testar a existencia de dados
      if(tabela == null)
      {
         IO.println("ERRO: Arranjo nulo. ");
      }   
      else
      {
         if(tabela.length == 0)
         {
            IO.println("ERRO: Arranjo vazio. ");
         }
         else
         {
            IO.println("Arranjo montado com " + 
                        tabela.length + " dados. " );
         } //endSe
      } //endSe   
      
      //5. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar. ");
   } //end teste01( )
   
  
   /** 
  * Exemplo0142
  * @author: Matheus Santos Rosa Carneiro
  * @version: 01
  */
   
   /** 
   * exibir dados em arranjo
   * @param tabela - arranjo com dados
   */
   
   public static void mostrar( int [] tabela )
   {
      //definir dados
      int tamanho;
      int x;
      
      //identificar
      IO.println( );
      //testar se o arranjo foi montado
      if(tabela == null)
      {
         IO.println("ERRO: Tabela vazia. ");
      }
      else
      {
         //verificar se tamanho valido
         tamanho = tabela.length;
         if(tamanho <= 0)
         {
            IO.println("ERRO: Arranjo vazio. " );
         }
         else
         {
            //mostrar arranjo
            IO.println("Arranjo montado com " +
                        tamanho + " dados. ");
                        
            //repetir para cada dado do arranjo
            for(x = 0; x < tamanho; x++)
            {
               //mostrar dado em um posicao do arranjo
               //convertido para inteiro
               IO.println("Dado em posicao: " + tabela [x] );
            } //end repeticao
            //mudar de linha
            IO.println( );           
         } //endSe
      } //endSe
   } //end mostrar( )
   
   /**
   * recuperar e mostrar dados de arquivo.
   */
   public static void teste02( )
   {
      //1. definir dados
      int [] tabela = null; //vazio
      
      //2. identificar
      IO.println( );
      IO.println("Recuperar e mostrar dados de arquivo. ");
      IO.println( );
      
      //3. montar dados
      tabela = lerDoArquivo("DADOS.TXT");
      
      //4. testar a existencia de dados
      if(tabela == null)
      {
         IO.println("ERRO: Arranjo nulo. ");
      }
      else
      {
         if(tabela.length == 0)
         {
            IO.println("ERRO: Arranjo vazio. ");
         }
         else
         {
            mostrar(tabela);
         } //endSe
      } //endSe
      
      //5. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar. ");
   } //end teste02( )
   
   /** 
  * Exemplo0143
  * @author: Matheus Santos Rosa Carneiro
  * @version: 01
  */

   /**
   * copiar dados em arranjo.
   * @return novo arranho com dados copiados
   * @param tabela - arranjo com dados
   */
   
   public static int [] copiar( int [] tabela )
   {
      //definir dados
      int tamanho;
      int x;
      int [] novo = null;
      
      //testar existencia de dados
      if(tabela == null)
      {
         IO.println("ERRO: Arranjo vazio. ");
      }
      else
      {
         //reservar espaco para novo arranjo de dados
         tamanho = tabela.length;
         novo = new int [ tamanho ];
         
         //testar se espaco reservado
         if(novo == null)
         {
            IO.println("ERRO: Nao ha' espaco. ");
         }
         else
         {
            //reservar espaco para os dados
            novo = new int [tamanho];
            
            //repetir para cada dado no arquivo
            for(x = 0; x < tamanho; x++)
            {
               //copiar cada posicao do arranjo
               novo [x] = tabela [x];
            } //end repeticao
         } //endSe
      } //endSe
      //retornar novo arranho
      return( novo );
   } //end copiar( )
   
   /**
   * recuperar e mostrar dados de arquivo
   */
   
   public static void teste03( )
   {
      //1. definir dados
      int [] tabela1 = null;
      int [] tabela2 = null; //ambas vazias
      
      //2. identificar
      IO.println( );
      IO.println("Recuperar e mostrar dados de arquivo. ");
      IO.println( );
      
      //3. montar dados
      tabela1 = lerDoArquivo("DADOS.TXT");
      
      //4. testar a existencia de dados
      if(tabela1 == null)
      {
         IO.println("ERRO: Arranjo nulo. ");
      }
      else
      {
         if(tabela1.length == 0)
         {
            IO.println("ERRO: Arranjo vazio. ");
         }
         else
         {
            mostrar( tabela1 );
            tabela2 = copiar (tabela1);
            IO.println( );
            
            IO.println("Apos copiar ");
            mostrar( tabela2);
         } //endSe
      } //endSe
      
      //5. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar. ");     
   } //end teste03( )
   
   /**
   * somar dados em arranjo.
   * @return novo arranho com dados somados
   * @param tabela1 - arranjo com dados
   * @param tabela2 - arranjo com dados
   */
   
   public static int [] somar ( int [] tabela1, int [] tabela2)
   {
      //definir dados
      int tamanho;
      int x;
      int [] novo = null; //vazio
      
      //testar existencia de dados
      if( tabela1 == null || tabela2 == null)
      {
         IO.println("ERRO: Arranjo vazio. ");
      }
      else
      {
         //testar se tamanhos validos
         if( tabela1.length == 0 ||
             tabela2.length == 0)
         {
            IO.println("ERRO: Tamanho(s) invalido(s). ");
         }
         else
         {
                  //reservar espaco na novo arranjo com dados
            tamanho = tabela1.length;
                  
                  //reserver espaco para os dados
            novo = new int [ tamanho ];
                  
                  //testar o espaco disponivel
            if( novo == null )
            {
               IO.println("ERRO: Nao ha' espaco. ");
            }
            else
            {
                     //repetir para cada dado no arquivo
               for(x = 0; x < tamanho; x++)
               {
                        //somar dados em cada posicao do arranjo
                  novo [x] = tabela1[ x ] + tabela2 [ x ];
               } //end repeticao
            } //endSe
         } //endSe
      } //endSe
      //retornar novo arranho
      return( novo );
   } //end somar( )
   
   /**
   * recuperar, somar e mostrar dados de arquivo.
   * so poderao ser somados arranjos com mesma
   * quantidade de dados
   */
   
   public static void teste04( )
   {
      //1. definir dados
      int [] tabela1 = null;
      int [] tabela2 = null;
      int [] tabela3 = null;
      
      //2. identificar
      IO.println( );
      IO.println("Recuperar, somar e mostrar dados de arquivo. ");
      IO.println( );
      
      //3. montar dados
      tabela1 = lerDoArquivo("DADOS1.TXT" );
      tabela2 = lerDoArquivo("DADOS2.TXT" );
      
      //4. testar a existencia de dados
      if( tabela1 == null || tabela2 == null )
      {
         IO.println("ERRO: Arranjo nulo. ");
      }
      else
      {
         if( tabela1.length == 0 ||
             tabela2.length == 0 )
         {
            IO.println("ERRO: Tamanho invalido. ");
         } 
         else
         {
            IO.println("Somar arranjos: " );
            mostrar( tabela1 );
            IO.println( "\n+" );
            mostrar( tabela2 );
            IO.println( );
            IO.println(" Resultado: " );
            tabela3 = somar (tabela1, tabela2);
            mostrar( tabela3 );
         } //endSe
      } //endSe
      
      //5. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar. " );
   } //end teste04( )
   
   /**
   * somar dados em arranjos
   * @return novo arranjo com dados somados
   * @param tabela1 - arranjo com dados
   * @param constante - constante para escalar dados
   * @param tabela2 - arranjo com dados
   */
   
   public static int [ ] somar ( int [] tabela1, int constante, int [] tabela2)
   {
      //definir dados
      int tamanho;
      int x; 
      int [] novo = null; //vazio
      
      //testar existencia de dados
      if(tabela1 == null || tabela2 == null)
      {
         IO.println("ERRO: Arranjo vazio. ");
      }
      else
      {
         //testar se tamanhos validos
         if(tabela1.length == 0 ||
            tabela2.length == 0 )
         {
            IO.println("ERRO: Tamanho(s) invalido(s). ");
         }
         else
         {
               //reservar espaco para o novo arranjo com dados
            tamanho = tabela1.length;
               
               //reservar espaco para dados
            novo = new int [tamanho];
               
               //testar o tamanho disponivel
            if(novo == null)
            {
               IO.println("ERRO: Nao ha' espaco. ");
            } 
            else
            {
                  //repetir para cada dado no arquivo
               for(x = 0; x < tamanho; x++)
               {
                     //somar dados em cada posicao do arranjo 
                  novo [x] = tabela1 [x] + constante * tabela2 [x];
               } //end repeticao
            } //endSe
         } //endSe
      } //endSe
      //retornar novo arranjo
      return( novo );
   } //end somar( )
   
   /**
   * recuperar, somar e mostrar dados de arquivo
   */
   
   public static void teste05( )
   {
      //1. definir dados
      int [] tabela1 = null;
      int [] tabela2 = null;
      int [] tabela3 = null;
      
      //2. identificar
      IO.println( );
      IO.println("Recuperar, somar e mostrar dados de arquivo " );
      IO.println( );
      
      //3. montar dados
      tabela1 = lerDoArquivo("DADOS1.TXT" );
      tabela2 = lerDoArquivo("DADOS2.TXT" );
      
      //4. testar a existencia de dados
      if( tabela1 == null || tabela2 == null )
      {
         IO.println("ERRO: Arranjo nulo.");
      } 
      else
      {
         if(tabela1.length == 0 ||
            tabela2.length == 0 )
         {
            IO.println("ERRO: Tamanho(s) invalido(s) ");
         }
         else
         {
            IO.println("Somar arranjos: ");
            mostrar( tabela1 );
            IO.println( "\n+" );
            mostrar( tabela2 );
            IO.println( );
            IO.println("Resultado: " );
            tabela3 = somar( tabela1, -1, tabela2 );
            mostrar( tabela3 );
         } //endSe
      } //endSe
      
      //5. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar. ");
   } //end teste05( )
   
   /**
   * comparar dados em arranjos
   * @return se arranjos iguais, ou nao
   * @param tabela1 - arranjo com dados
   * @param tabela2 - arranjo com dados
   */
   
   public static boolean comparar ( int [] tabela1, int [] tabela2 )
   {
      //definir dados
      boolean resposta = true;
      int tamanho; 
      int x;
      
      //testar existencia de dados
      if( tabela1 == null ||
          tabela2 == null )
      {
         IO.println("ERRO: Arranjo vazio. ");
      }
      else
      {
            //testar se tamanhos validos
         if( tabela1.length == 0 ||
             tabela2.length == 0 )
         {
            IO.println("ERRO: Tamanho(s) invalido(s) ");
         } 
         else
         {
            //repetir para cada posicao dos arranjos
            tamanho = tabela1.length;
            
            for(x = 0; x < tamanho; x++)
            {
               //comparar cada posicao dos arranjos
               resposta = resposta && (tabela1 [x] == tabela2 [x]);
            } //end repeticao
         } //endSe
      } //endSe
          
          //retornar novo arranjo
      return( resposta );
   } //end comparar( )
   
   /**
   * recuperar e comparar dados de arquivo
   */
   
   public static void teste06( )
   {
      //1. definir dados
      int [] tabela1 = null;
      int [] tabela2 = null;
      String nome1, nome2;
      boolean resposta; 
      
      //2. identificar 
      IO.println( );
      IO.println("Recuperar e comparar dados de arquivo. ");
      IO.println( );
      
      //3. montar dados
      IO.println("Arquivos disponiveis: DADOS.TXT - DADOS1.TXT - DADOS2.TXT ");
      nome1 = IO.readString("Qual o nome do primeiro arquivo? ");
      nome2 = IO.readString("Qual o nome do segundo arquivo? ");
      
      tabela1 = lerDoArquivo (nome1);
      tabela2 = lerDoArquivo (nome2);
      
      //4. testar a existencia de dados
      if( tabela1 == null || tabela2 == null)
      {
         IO.println("Arranjo nulo. ");
      }
      else
      {
         if(tabela1.length == 0 ||
            tabela2.length == 0 )
         {
            IO.println("ERRO: Tamanho(s) invalido(s) ");
         }
         else
         {
            IO.println("Somar arranjos: ");
            mostrar( tabela1 );
            IO.println( "\n+" );
            mostrar( tabela2 );
            IO.println( );
            IO.println("Resultado: ");
            resposta = comparar( tabela1, tabela2 );
               
            if(resposta)
            {
               IO.println("Arranjos iguais. ");
            }
            else
            {
               IO.println("Arranjos diferentes. ");
            } //endSe
         } //endSe
      } //endSe
      
      //5. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar. ");
   } //end teste06( )
   
   /**
   * comparar se dados em arranjos sao nulos.
   * @return se dados na arranjo sao iguais a zero, ou nao
   * @param tabela - arranjo com dados
   */ 
   
   public static boolean eNulo ( int [] tabela)
   {
      //definir dados
      boolean resposta = true;
      int tamanho; 
      int x; 
      
      //testar existencia de dados
      if( tabela == null )
      {
         IO.println("ERRO: Arranjo vazio. ");
      }
      else
      {
         //testar se tamanhos validos
         if( tabela.length == 0 )
         {
            IO.println("ERRO: Tamanho invalido. ");
         } 
         else
         {
            //repetir para cada posicao dos arranjos
            tamanho = tabela.length;
            
            for(x = 0; x < tamanho; x++)
            {
               //comparar cada posicao do arranjo
               resposta = resposta && (tabela [x] == 0 );
            } //end repeticao
         } //endSe
      } //endSe
      
      //retornar resultado
      return( resposta );
   } //end eNulo
   
   /**
   * recuperar e comparar dados de arquivo.
   */
   
   public static void teste07( )
   {
      //1. definir dados
      int [] tabela = null;
      String nome; 
      boolean resposta;
      
      //2. identificar
      IO.println( );
      IO.println("Recuperar e comparar dados de arquivo." );
      IO.println( );
      
      //3. montar dados
      IO.println("Arquivos disponiveis: DADOS.TXT - DADOS1.TXT - DADOS2.TXT ");
      nome = IO.readString("Qual o nome do arquivo? ");
      tabela = lerDoArquivo( nome );
      
      //4. testar a existencia de dados
      if( tabela == null )
      {
         IO.println("ERRO: Arranjo vazio. ");
      }
      else
      {
         if( tabela.length == 0 )
         {
            IO.println("ERRO: Tamanho invalido. ");
         }
         else
         {
            IO.println("Testar se arranjo nulo: ");
            mostrar ( tabela );
            IO.println( );
            IO.println("Resultado: ");
            resposta = eNulo( tabela );
            
            if(resposta)
            {
               IO.println("Arranjo nulo. ");
            }
            else
            {
               IO.println("Arranjo nao e' nulo. ");
            } //endSe
         } //endSe
      } //endSe
      
      //5. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar. ");
   
   } //end teste07( )
   
   /**
   * comparar se dados em arranjos sao positivos
   * @return se arranjo igual a' identifica
   * @param tabela - arranjo com dados
   */
   
   public static boolean ePositivo ( int [] tabela )
   {
      //definir dados
      int tamanho;
      int x;
      boolean resposta = true;
      
      //testar existencia de dados
      if( tabela == null )
      {
         IO.println("ERRO: Arranjo vazio. ");
      }
      else
      {
         //testar se tamanhos validos
         if( tabela.length == 0 )
         {
            IO.println("ERRO: Tamanho invalido. ");
         }
         else
         {
            //repetir para cada posicao do arranjo
            tamanho = tabela.length;
            
            for(x = 0; x < tamanho; x++)
            {
               //verificar cada posicao do arranjo
               if(tabela [x] >= 0)
               {
                  //se ha' valor positivo
                  resposta = resposta && (tabela [x] >= 0);
               } //endSe
            } //end repeticao
         } //endSe
      } //endSe
      
      //retornar resultado
      return ( resposta );
      
   } //end ePositivo( )
   
   /**
   * recuperar e comparar dados de arquivo.
   */
   
   public static void teste08( )
   {
      //1. definir dados
      int [] tabela = null;
      String nome; 
      boolean resposta;
      
      //2. identificar
      IO.println( );
      IO.println("Recuperar e comparar dados de arquivo." );
      IO.println( );
      
      //3. montar dados
      IO.println("Arquivos disponiveis: DADOS.TXT - DADOS1.TXT - DADOS2.TXT ");
      nome = IO.readString("Qual o nome do arquivo? ");
      tabela = lerDoArquivo ( nome );
      
      //4. testar a existencia de dados
      if( tabela == null )
      {
         IO.println("ERRO: Arranjo vazio. ");
      }
      else
      {
         if(tabela.length == 0)
         {
            IO.println("ERRO: Tamanho invalido. ");  
         }
         else
         {
            IO.println("Testar se arranjo positivo: " );
            mostrar (tabela);
            IO.println( );
            IO.println("Resultado: ");
            resposta = ePositivo( tabela );
               
            if(resposta)
            {
               IO.println("Arranjo positivo. ");
            }
            else
            {
               IO.println("Arranjo nao e' positivo. ");
            } //endSe
         } //endSe
      } //endSe
      
      //5. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar. ");
      
   } //end teste08( )
   
   /**
   * comparar dados em arranjos.
   * @return se arranjos diferentes, ou nao
   * @param tabela1 - arranjo com dados
   * @param tabela2 - arranjo com dados
   */
   
   public static boolean eSimetrico ( int [] tabela1, int [] tabela2 )
   {
      //definir dados
      boolean resposta = true;
      int tamanho;
      int x;
      
      //testar existencia de dados
      if( tabela1 == null || tabela2 == null )
      {
         IO.println("ERRO: Arranjos vazios. ");
      }
      else
      {
         //testar se tamanhos validos
         if( tabela1.length == 0 ||
             tabela2.length == 0 )
         {
            IO.println("ERRO: Tamanho(s) invalido(s). ");
         } 
         else
         {
                  //repetir para cada posicao do arranjo
            tamanho = tabela1.length;
                  
            for(x = 0; x < tamanho; x++)
            {
                     //comparar cada posicao dos arranjos
               resposta = resposta && (tabela1 [x] == (-1) * tabela2[x] );
            } //end repeticao
         } //endSe
      } //endSe
      
      //retornar resultado
      return ( resposta );
      
   } //end eSimetrico( )
   
   /**
   * recuperar e comparar dados de arquivo.
   */
   
   public static void teste09( )
   {
      //1. definir dados
      int [] tabela1 = null;
      int [] tabela2 = null;
      String nome1, nome2;
      boolean resposta;
      
      //2. identificar
      IO.println( );
      IO.println("Recuperar e comparadar dados de arquivo. " );
      IO.println( );
      
      //3. montar dados
      IO.println("Arquivos disponiveis: DADOS.TXT - DADOS1.TXT - DADOS2.TXT ");
      nome1 = IO.readString("Qual o nome do primeiro arquivo? ");
      nome2 = IO.readString("Qual o nome do segundo arquivo? ");
      tabela1 = lerDoArquivo( nome1 );
      tabela2 = lerDoArquivo( nome2 );
      
      //4. testar a existencia de dados
      if(tabela1 == null || tabela2 == null)
      {
         IO.println("ERRO: Arranjo(s) vazio(s). ");
      }
      else
      {
         //testar se tamanhos validos
         if( tabela1.length == 0 ||
             tabela2.length == 0 )
         {
            IO.println("ERRO: Tamanho(s) invalido(s). ");
         }
         else
         {
            IO.println("Testar se arranjos diferentes: ");
            mostrar ( tabela1 );
            IO.println( );
            mostrar ( tabela2 );
            IO.println( );
            IO.println("Resultado: ");
            resposta = eSimetrico( tabela1, tabela2);
                  
            if(resposta)
            {
               IO.println("Arranjos simetricos. ");
            }
            else
            {
               IO.println("Arranjos nao sao simetricos. ");
            } //endSe
         } //endSe
      } //endSe
      
      //5. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar. ");
   } //end teste09( )
   
   /**
   * produto escalar de dois arranjos.
   * @return novo arranjo com o produto
   * @param tabela1 - arranjo com dados
   * @param tabela2 - arranjo com dados
   */
   
   public static int produtoEscalar( int [] tabela1, int [] tabela2 )
   {
      //definir dados
      int tamanho;
      int x;
      int soma = 0;
      
      //testar existencia de dados
      if( tabela1 == null || tabela2 == null )
      {
         IO.println("ERRO: Arranjo(s) vazio(s). ");
      }
      else
      {
         //testar se tamanho valido
         if( tabela1.length == 0 ||
             tabela2.length == 0 )
         {
            IO.println("ERRO: Tamanho(s) invalido(s). ");
         }
         else
         {
                  //testar para cada dado no arquivo
            tamanho = tabela1.length;
                  
            for(x = 0; x < tamanho; x++)
            {
                     //acumular o produto cada posicao do arranjo
               soma = soma + tabela1 [x] * tabela2 [x];
            } //end repeticao                  
         } //endSe
      } //endSe
      
      //retorna resultado
      return( soma );
   } //end produtoEscalar()
   
   /**
   * recuperar, multiplicar e mostrar dados de arquivo.
   */
   
   public static void teste10( )
   {
      //1. definir dados
      int [] tabela1 = null;
      int [] tabela2 = null;
      int produto;
      
      //2. identificar
      IO.println( );
      IO.println("Recuperar, multiplicar e mostrar dados de arquivo. " );
      IO.println( );
      
      //3. montar dados
      tabela1 = lerDoArquivo("DADOS1.TXT" );
      tabela2 = lerDoArquivo("DADOS2.TXT" );
      
      //4. testar existencia de dados
      if( tabela1 == null || tabela2 == null )
      {
         IO.println("ERRO: Arranjo nulo. ");
      }
      else
      {
         //testar se tamanho valido
         if( tabela1.length == 0 ||
             tabela2.length == 0 )
         {
            IO.println("Tamanho(s) invalido(s). ");
         }
         else
         {
            IO.println("Produto escalar de arranjos: " );
            mostrar ( tabela1 );
            IO.println( "\n+" );
            mostrar ( tabela2 );
            IO.println( );
            IO.println("Resultado: " );
            produto = produtoEscalar(tabela1, tabela2);
            IO.println("Produto escalar: " + produto );
         } //endSe
      } //endSe
      
      //5. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar. ");
      
   } //end teste10( )
   
   /** ################################################## **/
   
   /**
   * Exemplo0151
   */
   
   public static void exe01( )
   {
      //1. definir dados
      int [] tabela = null; 
      
      //2. identificar
      IO.println( );
      IO.println("Recuperar dados, ler e mostra-los na tela." );
      IO.println( );
      
      //3. montar dados
      tabela = lerDoArquivo("DADOS.TXT");
      
      //4. verificar dados existentes
      if( tabela == null )
      {
         IO.println("ERRO: Arranjo vazio. ");
      } 
      else
      {
         if( tabela.length == 0 )
         {
            IO.println("ERRO: Tamanho invalido. ");
         }  
         else
         {
            IO.println("Mostrar dados: ");
            mostrar ( tabela );
         } //endSe
      } //endSe
      
      //5. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar. ");
      
   } //end exe01( )
   
   /**
   * Exemplo0152
   */
   
   public static void exe02( )
   {
   
   } //end exe02( )
   
   /**
   * Exemplo0153
   */
   
   /**
    * exe03.
    */
      public static void exe3 ( )
      {
       // definir dados
          int quantidade  = 0;
          int [ ] arranjo = null;
          int x;
          int inferior, superior;

       // identificar
          IO.println ( );
          IO.println ( "Exe 03" );
          IO.println ( );

       // definir acoes
          quantidade = IO.readint ( "Quantos elementos? " );

       // tentar reservar espaco
          arranjo = new int [ quantidade ]; // reservar espaco

       // testar se ha' espaco reservado
          if ( arranjo == null )
          {
             IO.println ( "ERRO: Nao ha' espaco suficiente." );
          }
          else
          {
           // preencher cada posicao
              arranjo = new int [ quantidade ];
              if ( arranjo == null )
              {
                 IO.println ( "ERRO: Nao ha' espaco suficiente." );
              }
              else
              {
               // ler limites de intervalo
                  inferior = IO.readint ( "Qual o limite inferior? " );
                  superior = IO.readint ( "Qual o limite superior? " );

               // testar se limites validos
                  if ( inferior >= superior )
                  {
                     IO.println ( "ERRO: Limites invalidos." );
                  }
                  else
                  {
                   // preencher com valores aleatorios dentro do intervalo
                      for ( x=0;  x < arranjo.length; x++ )
                      {
                          arranjo [ x ] = (int) ( inferior
                         + Math.random( )*(superior-inferior) );
                      } // fim
                  } // fim
               // mostrar o conteudo de cada posicao
                  IO.println ( "Arranjo com "
                             +arranjo.length+" elementos" );
                  for ( x=arranjo.length-1; x>=0; x=x-1 )
                  {
                      IO.println ( ""+x+": "+arranjo [ x ] );
                  } // fim
             } // fim
          } // fim

       // encerrar
          IO.pause   ( "Apertar ENTER para continuar." );
      } // fim metodo03 ( )

   
   
  /**
   * Definicao do metodo principal 
   * main( )
   */
   
   public static void main(String [] args)
   {
      
      //identificar
      IO.println("ED_08 - Programa em Java ");
      IO.println("Autor: Matheus Santos Rosa Carneiro" );
         
      //definir dados
      int opcao; 
      
      do
      {
         IO.println( ); 
         IO.println(" 0 - parar " );
         IO.println(" 1 - teste 01 " );
         IO.println(" 2 - teste 02 " );
         IO.println(" 3 - teste 03 " );
         IO.println(" 4 - teste 04 " );
         IO.println(" 5 - teste 05 " );
         IO.println(" 6 - teste 06 " );
         IO.println(" 7 - teste 07 " );
         IO.println(" 8 - teste 08 " );
         IO.println(" 9 - teste 09 " );
         IO.println("10 - teste 10 " );
         //exercicios
         IO.println("11 -  exe  01 " );
         IO.println( );
         
         
         //ler opcao do teclado 
         opcao = IO.readint( "Informe a opcao: " );
         
         //switch
         switch(opcao) 
         {
            case 0:
               break; 
            case 1:
               teste01( );
               break;
            case 2:
               teste02( );
               break;
            case 3:
               teste03( );
               break;
            case 4:
               teste04( );
               break;
            case 5:
               teste05( );
               break;
            case 6:
               teste06( );
               break;
            case 7:
               teste07( );
               break;
            case 8: 
               teste08( );
               break;
            case 9:
               teste09( );
               break;
            case 10:
               teste10( );
               break;
               //exercicios
            case 11:
               exe01( );
               break;
               //caso nenhuma das opcoes forem selecionadas
            default: 
               IO.println( "ERRO: Opcao invalida. ");
               break;
         } //end switch
      } //endDo   
       while(opcao != 0);
       
       //encerrar 
      IO.pause("Aperte ENTER para parar." ); 
         
   } //end main( )
  
} //end class ED_08

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
// 0.1      01. ( OK )      teste01
// 0.2      01. ( OK )      teste02 
// 0.3      01. ( OK )      teste03
// 0.4      01. ( OK )      teste04
// 0.5      01. ( OK )      teste05
// 0.6      01. ( OK )      teste06
// 0.7      01. ( OK )      teste07
// 0.8      01. ( OK )      teste08
// 0.9      01. ( OK )      teste09
// 0.10     01. ( OK )      teste10
//
// ----------------------------------------------
*/