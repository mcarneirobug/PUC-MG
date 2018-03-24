/**
  * ---------------------------------------------- Documentacao preliminar
  * Pontificia Universidade Catolica de Minas Gerais
  * Curso de Ciencia da Computacao
  * Algoritmos e Estruturas de Dados I
  *
  * Trabalho pratico: Refação - Prova 02
  *
  * Objetivo:
  * Modelo de programa para a disciplina AED I
  * Sugestao para montar um trabalho pratico
  *
  * Autor: Matheus Matricula: 613414  Nome: Matheus Santos Rosa Carneiro
  * Versao:  1.0                Data: 10/10/2017
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
  * - Refacao_02.java
  * - Refacao_02.class
  * - IO.jar    ( por exemplo em C:\java\jre\lib\ext\IO.jar )
  *
  * Forma de compilacao:
  * - acionar o compilador no modo console:
  *
  *   <drive>:>javac   Refacao_02.java
  *   ou
  *   <drive>:>compile Refacao_02
  *
  * Forma de uso:
  * - acionar o programa no modo console:
  *
  *   <drive>:>java Refacao_02
  *   ou
  *   <drive>:>run  Refacao_02
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

   public class Refacao_02{

   /**
   * exe01. Fazer uma tabela (mapa da memoria) com o valor de cada
   * variavel e indicar suas alteracoes
   */
   
   public static int f1(int v, int w, int x, int y, int z)
   {
      //definir dados 
      int result = x; 
      
      if(0 < v && v <= w)
      {
         IO.pause(" "+v+" "+w+" "+x+" "+y+" "+z);
         result = f1(v+1, w-1, x+y, y+z, z+2);
      } //end se
      //retornar dados 
      return(result);
   } //ennd f1( )
   
   /**
   * metodo01 - recebe a funcao recursiva
   */
   
   public static void metodo01( )
   {
      IO.println("Questao_01");
      //chamada do metodo recursivo
      IO.println("f1( ): "+f1(1, 12, 0, 1, 1));    
      //encerrar
      IO.pause("Apertar ENTER para continuar." );
   } //end metodo01( )
   
    /**
   mapa da memoria
   v w  x y z result
   1 12 0 1 1 = 0 ------> v + 1 / w - 1 / x + y / y + z / z + 2
   2 11 1 2 3 = 0
   2 11 1 2 3 = 1 
   3 10 3 5 5 = 1 
   3 10 3 5 5 = 3 
   4 9  8 10 7 = 3 
   4 9  8 10 7 = 8 
   5 8 18 17 9 = 8
   5 8 18 17 9 = 18 
   6 7 35 26 11 = 18 
   6 7 35 26 11 = 35 
   7 6 61 37 13 = 35  v > 0 && v <= w // v > w - para aqui a condicional 
   7 6 61 37 13 = 61 // resposta = 61
   
   Como o result, retorna o valor de x, a ultima vez que a condicao
   if satisfeita, ele vai retornar o valor final 61.   
   */
   
   /**
   * exe02. Definir uma funcao - receber uma cadeia de caracteres e dois valores inteiros (x,y)
   * retornar outra cadeia com (y) caracteres a partir da posicao (x)
   */
   
   public static String separador(String cadeia, int posicao, int tamanho)
   {
      //1. definir dados
      String resposta = "";
      
      while(posicao <= tamanho)
      {
         resposta = resposta + cadeia.charAt(posicao);
         posicao++;
      } //end repeticao
      //retornar resposta
      return(resposta);
   } //end separador( )
   
   /**
   * metodo para chamar a funcao separador
   */
   
   public static void metodo02( )
   {
      //1. definir dados
      String cadeia; 
      String resultado;
      int posicao;
      int tamanho; 
      
      //2. ler cadeia de caracteres do teclado
      cadeia = IO.readString("Informe uma cadeia de caracteres: ");
      
      //3. verificar a existencia de dados
      if(cadeia == null)
      {
         IO.println("ERRO: Cadeia vazia. ");
         cadeia = IO.readString("Informe uma cadeia de caracteres: ");
      }  
      else
      {
          posicao   = IO.readint("Informe a posicao de inicio: ");
          tamanho   = cadeia.length( )-1;
          resultado = separador(cadeia, posicao, tamanho);
          IO.println("Resultado: " + resultado);
      } //end se
      
      //4. encerrar
      IO.pause("Apertar ENTER para continuar. ");
   } //end metodo02( )
   
   /**
   * exe03. Receber o nome de um arquivo
   * copiar a segunda metade desse arquivo para outro arquivo de nome "METADE.TXT"
   */
   
   public static void metodo03(String nome)
   {
      //1. definir dados
      String linha; 
      FILE arquivo;
      String armazenador; 
      int count = 0;
      int metade; 
      
      //2. ler o parametro nome
      arquivo = new FILE(FILE.INPUT, nome);
      
      //3.verificar se o arquivo esta' vazio
      if(arquivo == null)
      {
         IO.println("ERRO: Arquivo vazio. ");
      }
      else
      {
         //se o arquivo nao for invalido
         //repeticao enquanto nao for o fim do arquivo  
         while(!arquivo.eof())
         {
            //ler linha do arquivo
            linha = arquivo.readln( );
            //printar na tela a linha lida
            IO.println(" " + linha);
            //contador para localizar quantos elementos 
            count++;
         } //end repeticao
         //fechar arquivo (indispensavel)
         arquivo.close( );
         //abrir o arquivo novamente
         arquivo = new FILE(FILE.INPUT, nome);
         //criar o arquivo para gravar a metade dos dados lidos
         FILE meio = new FILE(FILE.OUTPUT, "METADE.TXT" );
         //para pegar a metade 
         metade = count - count/2; //divide por 2, para pegar o meio 
         //repeticao para preencher o arquivo
         while(count >= 0)
         {
            //ler dados
            armazenador = arquivo.readln( );
            if(metade >= count)
            {
               //escrever dentro do arquivo
               meio.println(armazenador);
            } //end se
            count = count - 1;
         } //end repeticao 
         //fechar o arquivo METADE.TXT (indispensavel)
         arquivo.close( );
         meio.close( );
      } //end se   
       //5. encerrar
      IO.pause("Aperte ENTER para continuar. ");
   } //end metodo03( )
   
   /**
   * exe04. Receber um arranjo de inteiros como parametro.
   * retornar os limites de intervalo que contenha todos
   * os valores no arranjo
   */
   
   public static int [] limites (int [] arranjo)
   {
      //1. definir dados
      int tamanho; 
      int posicao = 0;
      int resposta; 
      int maior;
      int menor;
      int [] resultado = new int [2];
      
      //2. definicao de tamanho do arranjo
      tamanho = arranjo.length;
      resposta = resultado.length;
      
      //3. testar se o tamanho do arranjo e' valido
      if(tamanho == 0)
      {
         IO.println("ERRO: Tamanho invalido. ");
      }
      else
      {
         //se o tamanho for valido
         menor = arranjo[posicao];
         maior = arranjo[posicao];
         
         //passar pelo arranjo e verificar limites
         for(posicao = 0; posicao < tamanho; posicao++)
         {
            IO.println("Numero: " + arranjo[posicao]);
            if(arranjo[posicao] > maior)
            {
               IO.println("Maior arranjo: " + arranjo[posicao]);
               maior = arranjo[posicao];
            }
            else
            {
               if(arranjo[posicao] < menor)
               {
                  IO.println("Menor arranjo: " + arranjo[posicao]);
                  menor = arranjo[posicao];  
               }
            } //end se
         } //end repeticao
         resultado [0] = menor;
         resultado [1] = maior;
      } //end se
         //retornar resultado
         return(resultado);
   } //end limites()
   
   public static void metodo04( )
   {
      //1. definir dados
      int [] arranjo;
      int [] resultado;
      int [] preenchido; 
      
      int limite;
      int posicao; 
      int tamanho;
      int resposta;
      
      //2. definir o tamanho do arranjo pelo teclado
      preenchido = new int [IO.readint("Informe os valores para guardar dentro do arranjo: ")];
      //3. definir o tamanho do arranjo
      tamanho = preenchido.length;
      //4. verificar se o tamanho e' valido
      if(tamanho == 0)
      {
         IO.println("ERRO: Tamanho invalido. ");
      }
      else
      {
         //se o tamanho for valido
         //preencher o arranjo com dados lidos
         for(posicao = 0; posicao < tamanho; posicao++)
         {
            preenchido[posicao] = IO.readint("Informe o valor na posicao: "+posicao+" :");
         } //end repeticao
         resultado = limites(preenchido);
         resposta  = resultado.length;
         //repeticao para mostrar os limites 
         for(posicao = 0; posicao < resposta; posicao++)
         {
            limite = resultado[posicao];
            //printar o limite na tela
            IO.println("Limite do arranjo: " + limite);
         } //end repeticao
      } //end se     
       //5. encerrar
      IO.pause("Aperte ENTER para continuar. ");
   } //end metodo04( )
   
   /**
   * exe05. Dizer se duas cadeias de caracteres correspondem a uma determinada senha
   * a senha e' composta de duas palavras que tambem nao devem ser ambas nulas ou vazias
   * empregar a funcao em uma situacao ate 3 tentativas para acertar a senha
   */
   
   public static boolean pass (String x, String y)
   {
      //1. definir dados
      //para contar quantas vezes o usuario digitou a senha
      int count = 2;
      boolean resposta = false;
      
      //testar se ambas as strings sao validas
      if(x.equals(null) || y.equals(null))
      {
         IO.println("Senha(s) invalida(s).");
      }
      else
      {
         //se a senha for valida
         while(count > 0)
         {
            if(x.equals("bola") && y.equals("preta"))
            {
               count = 0; 
               resposta = true;
            }
            else
            {
               IO.println("ERRO: Senha(s) invalida(s). Insira novamente. ");
               //se a senha for invalida ler novamente para verificacao
               x = IO.readString("Entre com a primeira senha: ");
               y = IO.readString("Entre com a segunda parte: ");
               resposta = false;
               //diminuir a tentativa ate dar 3 
               count = count - 1;
            } //end se
         } //end repeticao
      } //end se
      //retornar resposta
      return(resposta);
   } //pass
   
   public static void metodo05( )
   {
      //1. definir dados
      String x; 
      String y;
      boolean resposta;
      
      //2. ler senhas do teclado
      x = IO.readString("Informe a senha: " );
      y = IO.readString("Informe a segunda parte da senha: ");
      
      //3. chamar a funcao para verificar senha
      resposta = pass(x, y);
      
      //4. testar a senha 
      if(resposta == false)
      {
         IO.println("ERRO: Senha(s) invalida(s). ");
         IO.println("Voce excedeu 3 tentativas.");
      }
      else
      {
         IO.println("Acesso autorizado! Bem vindo. ");
      } //end se   
      
      //5. encerrar
      IO.pause("Aperte ENTER para continuar. ");   
   } //end metodo05( )
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
            IO.println ( "Refacao_02 - v.0.0 - 10/10/2017" );
            IO.println ( "Matricula: 613414 Nome: Matheus Santos R. C" );
            IO.println ( );   // para saltar linha

         // mostrar opcoes
            IO.println ( "Opcoes:" );
            IO.println ( "0 - parar" );
            IO.println ( "1 - metodo 01" );
            IO.println ( "2 - metodo 02" );
            IO.println ( "3 - metodo 03" );
            IO.println ( "4 - metodo 04" );
            IO.println ( "5 - metodo 05" );
            IO.println ( );

         // ler opcao
            opcao = IO.readint ( "Qual a sua opcao? " );

         // escolher acao
            switch ( opcao )
            {
               case 0:
                  break;
               case 1:
                  metodo01 ( );
                  break;
               case 2:
                  metodo02 ( );
                  break;
               case 3:
                  //receber o nome do arquivo definido como parametro no metodo
                  String nome = "";
                  nome = IO.readString("Informe o nome do arquivo: ");
                  metodo03 (nome);
                  break;
                  case 4:
                  metodo04( );
                  break;
                  case 5:
                  metodo05( );
                  break;
               default:
                  IO.println("ERRO: Opcao invalida. ");
                  break;
            } // fim escolher
         }
         while ( opcao != 0 );

      // encerrar execucao
         IO.println ( );
         IO.pause   ( "Apertar ENTER para terminar." );

      } // end main ( )

   } // fim Refacao_02 
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
// 0.1      01. ( OK )      metodo02( )
// 0.1      01. ( OK )      metodo03( )
// 0.1      01. ( OK )      metodo04( )
// 0.1      01. ( OK )      metodo05( )
// ----------------------------------------------
*/