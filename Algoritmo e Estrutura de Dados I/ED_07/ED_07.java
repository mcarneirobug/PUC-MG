/**
  * ---------------------------------------------- Documentacao preliminar
  * Pontificia Universidade Catolica de Minas Gerais
  * Curso de Ciencia da Computacao
  * Algoritmos e Estruturas de Dados I
  *
  * Trabalho pratico: ED_07
  *
  * Objetivo:
  * Modelo de programa para a disciplina AED I
  * Sugestao para montar um trabalho pratico
  *
  * Autor: Matheus Santos R. C.   Matricula: 613414  Nome: Matheus Santos Rosa Carneiro
  * Versao:  1.0                Data: 20/09/2017
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
  * - ED_07.java
  * - ED_07.class
  * - IO.jar    ( por exemplo em C:\java\jre\lib\ext\IO.jar )
  *
  * Forma de compilacao:
  * - acionar o compilador no modo console:
  *
  *   <drive>:>javac   ED_07.java
  *   ou
  *   <drive>:>compile ED_07
  *
  * Forma de uso:
  * - acionar o programa no modo console:
  *
  *   <drive>:>java ED_07
  *   ou
  *   <drive>:>run  ED_07
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
  * ED_07 - modelo para definir uma classe.
  *            Obs.: O nome da classe  (ED_07) deve concordar com
  *                  o nome do arquivo (ED_07.java), inclusive no
  *                  uso de maiusculas e minusculas.
  */
  
public class ED_07
{

/**
* metodo01 - exemplo 1
* guardar dados em arquivo,
* dada a quantidade deles
*/

   public static void metodo01( )
   {
   //1. definir dados
      int n;
      int k;
      String dado;
   
      FILE arquivo;
   
   //2. identificar
      IO.println( "Guardar dados em arquivos." );
   
   //3. ler dado do teclado
      n = IO.readint( "Quantos nomes? " );
   
   //4. testar a quantidade
      if(n <= 0)
      {
         IO.println("ERRO: Quantidade invalida." );
      } 
      else
      {
      //criar arquivo para gravar dados
         arquivo = new FILE(FILE.OUTPUT, "DADOS1.TXT" );
      
      //guardar a quantidade de dados em arquivo
         arquivo.println(" " + n);
      
      //ler os outros dados do teclado
         for(k = 1; k <= n; k = k + 1)
         {
         //ler um dado do teclado
            dado = IO.readString( "Nome: " );
         
         //guardar dado em arquivo
            arquivo.println(" " + dado);
         } //end repeticao
      //fechar o arquivo (INDISPENSAVEL para a gravacao)
         arquivo.close( );
      } //endSe
   
   //5.encerrar
      IO.println( );
      IO.pause( "Apertar ENTER para continuar." ); 
   } //end metodo01( )
   
   /**
   * Metodo 02 - exemplo 2 
   * Consultar dados em arquivo. 
   * Leitura do arquivo: "DADOS1.TXT"
   */
   
   public static void metodo02( )
   {
      //1. definir dados
      String linha;
      FILE arquivo;
      
      //2. identificar
      IO.println( "Consultar dados em arquivos." );
      
      //3. abrir arquivo apra a leitura
      arquivo = new FILE (FILE.INPUT, "DADOS1.TXT");
      
      //4. ler linhas do arquivo
      //tentar ler uma linha do arquivo
      linha = arquivo.readln( ); //para ler toda linha
      
      //repetir enquanto houver dado
      while(!arquivo.eof( ))
      {
         //mostrar dado na tela
         IO.println(" " + linha);
         
         //tentar ler outra linha do arquivo
         linha = arquivo.readln( );
      } //end repeticao
      
      //fechar o arquivo (RECOMENDAVEL para leitura)
      arquivo.close( );
      
      //5. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar." );     
   } //end metodo02( )
   
   /**
   * Metodo03 - exemplo 3
   * Recuperar dados em arquivo,
   * dada a quantidade deles na primeira linha
   */
   
   public static void metodo03( )
   {
      //1. definir dados
      int n, k;
      String linha;
      FILE arquivo;
      
      //2. identificar
      IO.println("Consultar dados em arquivo: " );
      
      //3. abrir arquivo para a leitura
      arquivo = new FILE(FILE.INPUT, "DADOS1.TXT" );
      
      //4. ler quantidade de dados do arquivo
        //4.1 ler uma linha do arquivo
      linha = arquivo.readln( );
        //4.2 converter conteudo para valor inteiro
      n = IO.getint( linha );
        
      //5. testar quantidade
      if(n <= 0)
      {   
         IO.println("ERRO: Quantidade invalida." );
      } 
      else
      {
         //mostrar quantidade de dados
         IO.println("Quantidade de dados: " + n);
         //ler os outros dados do arquivo
         for(k = 1; k <= n; k++)
         {
            //ler uma linha do arquivo
            linha = arquivo.readln( );
            //mostrar dado na tela
            IO.println(" " + linha);
         } //end repeticao
         //fechar o arquivo (RECOMENDADO para leitura)
         arquivo.close( );
      } //endSe
      
      //6. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar." );      
   } //end metodo03( )
   
   /**
   * Metodo04 - exemplo 4
   * Guardar dados inteiros em arquivo,
   * dada a quantidade deles.
   */
   
   public static void metodo04( )
   {
      //1. definir dados
      int n, k, dado;
      FILE arquivo;
      
      //2. identificar
      IO.println("Guardar dados inteiros em arquivo." );
      
      //3. ler dado no teclado
      n = IO.readint("Fornecer a quantidade de valores: " );
      
      //4. testar a quantidade
      if(n <= 0)
      {
         IO.println("ERRO: Quantidade invalida" );
      }
      else
      {
         //criar arquivo para gravar dados
         arquivo = new FILE(FILE.OUTPUT, "DADOS2.TXT");
         
         //guardar a quantidade de dados
         arquivo.println(" " + n);
         
         //ler os outros dados do teclado
         for(k = 1; k <= n; k++)
         {
            //ler um dado do teclado
            dado = IO.readint("Dado: " );
            
            //guardar dado em arquivo
            arquivo.println(" " + dado);
         } //end repeticao
         //fechar o arquivo(INDISPENSAVEL para a gravacao)
         arquivo.close( );
      } //endSe
      
      //5. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar. " );   
   } //end metodo04( )
   
   
   /**
   * Metodo 05 - exemplo 5
   * recuperar dados inteiros do arquivo,
   * dada a quantidade deles na primeira linha
   */
   
   public static void metodo05( )
   {
      //1. definir dados
      int n, k, dado;
      String linha;
      FILE arquivo;
      
      //2. identificar
      IO.println( );
      IO.println("Consultar dados em arquivos");
      IO.println( );
      
      //3. abrir arquivo para a leitura
      arquivo = new FILE(FILE.INPUT, "DADOS2.TXT" );
      
      //4. ler quantidade de dados do arquivo
       //4.1 ler uma linha do arquivo
      linha = arquivo.readln( );
       //4.2 converter conteudo para valor inteiro
      n = IO.getint( linha );
       
       //5. testar a quantidade
      if(n <= 0)
      {
         IO.println("ERRO: Quantidade invalida.");
      } 
      else
      {
         //mostrar a quantidade de dados
         IO.println("Quantidade de dados: " + n);
         
         //ler os outros dados do arquivo
         for(k = 1; k <= n; k++)
         {
            //ler uma linha do arquivo
            linha = arquivo.readln( );
            
            //converter conteudo para valor inteiro
            dado = IO.getint( linha );
            
            //mostrar dado na tela
            IO.println(" " + dado);
         } //end repeticao
         //fechar o arquivo (RECOMENDAVEL para leitura)
         arquivo.close( );
      } //endSe  
       
       //6. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar." );    
   } //end metodo05( )
   
   /**
   * Metodo06 - exemplo 6
   * Guardar dados reais em arquivo,
   * dada a quantidade deles
   */
   
   public static void metodo06( )
   {
      //1. definir dados
      int n, k;
      double dado;
      FILE arquivo;
      
      //2. identificar
      IO.println("Guardar dados reais em arquivos");
      
      //3. ler dado do teclado
      n = IO.readint("Fornecer a quantidade de valores: " );
      
      //4. testar a quantidade
      if(n <= 0)
      {
         IO.println("ERRO: Quantidade invalida" );
      }
      else
      {
         //criar arquivo para gravar dados
         arquivo = new FILE(FILE.OUTPUT, "DADOS3.TXT" );
         
         //guardar a quantidade de dados
         arquivo.println(" " + n);
         
         //ler os outros dados no teclado
         for(k = 1; k <= n; k++)
         {  
            //ler um dado do teclado
            dado = IO.readdouble("Dado: " );
            
            //guardar dado em arquivo
            arquivo.println("" + dado);
         } //end repeticao
         //fechar o arquivo (INDISPENSAVEL para a gravacao)
         arquivo.close( );
      } //endSe
      
      //5. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar." );    
   } //end metodo06( )
   
   /**
   * Metodo07 - exemplo 7
   * Recuperar dados reais em arquivo,
   * dada a quantidade deles na primeira linha
   */
   
   public static void metodo07( )
   {
      //1. definir dados
      int n, k;
      double dado;
      String linha;
      FILE arquivo;
      
      //2. identificar
      IO.println("Consultar dados em arquivos. " );
      
      //3. abrir arquivo para a leitura
      arquivo = new FILE(FILE.INPUT, "DADOS3.TXT");
      
      //4. ler quantidade de dados do arquivo
        //4.1 ler uma linha do arquivo
      linha = arquivo.readln( );
      
      //4.2 converter conteudo para valor inteiro
      n = IO.getint(linha);
      
      //5. testar a quantidade
      if(n <= 0)
      {
         IO.println("ERRO: Quantidade invalida."); 
      } 
      else
      {
         //mostrar a quantidade de dados
         IO.println("Quantidade de dados: " + n);
         
         //ler os outros dados do arquivo
         for(k = 1; k <= n; k = k + 1)
         {
            //ler uma linha do arquivo
            linha = arquivo.readln( );
            
            //converter conteudo para valor inteiro
            dado = IO.getdouble(linha);
            
            //mostrar dado na tela
            IO.println(" " + dado);
         } //end repeticao
         //fechar o arquivo (RECOMENDAVEL para a leitura)
         arquivo.close( );
      } //endSe
      
      //6. encerrar 
      IO.println( );
      IO.pause("Apertar ENTER para continuar." );
   } //end metodo07( )
   
   /**
   * Metodo08 - exemplo 8
   * Guardar dados em arquivo 
   */
   
   public static void metodo08( )
   {
      //1. definir dados
      String linha;
      FILE arquivo;
      
      //2. identificar
      IO.println( );
      IO.println("Guardar dados em arquivo." );
      IO.println( );
      
      //3. criar arquivo para gravar dados
      arquivo = new FILE(FILE.OUTPUT, "TEXTO.TXT");
      
      //4. ler uma linha do teclado
      linha = IO.readln("");
      
      //5. repetir enquanto quiser guardar dados
      while(!linha.equals("PARAR"))
      {
         //guardar linha em arquivo
         arquivo.println("" + linha);
         
         //ler outra linha do teclado
         linha = IO.readln("");
      } //end repeticao
      
      //6. fechar o arquivo (INDISPENSAVEL para a gravacao)
      arquivo.close( );
      
      //7. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar");      
   } //end metodo08( )
   
   /**
   * Metodo09 - exemplo 9
   * Ler dados de arquivo 
   */
   
   public static void metodo09( )
   {
      //1. definir dados
      String dado;
      
      FILE arquivo;
      
      //2. identificar
      IO.println( );
      IO.println("Ler dados de arquivo. " );
      IO.println( );
      
      //3. abrir arquivo para ler dados
      arquivo = new FILE(FILE.INPUT, "TEXTO.TXT");
      
      //4. tentar ler um dado do teclado
      dado = arquivo.read( );
      
      //5. repetir enquanto houver dados
      while(!arquivo.eof())
      {
         //mostrar dado lido de arquivo
         IO.println(" " + dado);
         
         //ler outro dado do teclado
         dado = arquivo.read( );
      } //end repeticao
      
      //6. fechar o arquivo(RECOMENDAVEL para a leitura)
      arquivo.close( );
      
      //7. encerrar
      IO.println( );
      IO.pause("Apertar ENTER para continuar.");      
   } //end metodo09( )
   
   /**
   * Metodo10 - exemplo 10
   * Ler dados de arquivo 
   */
   
   public static void metodo10( )
   {
      //1. definir dados
      String dado;
      int valor;
      FILE arquivo;
      
      //2. identificar
      IO.println( );
      IO.println("Ler dados de arquivo. ");
      IO.println( );
      
      //3. abrir arquivo para ler dados
      arquivo = new FILE(FILE.INPUT, "TEXTO.TXT");
      
      //4. tentar ler um dado do teclado
      dado = arquivo.read( );
      
      //5. repetir enquanto houver dados
      while(!arquivo.eof())
      {
         //mostrar dado lido de arquivo
         if(dado != null && 
            dado.length( ) > 0)
         {
            IO.println(" "+ IO.getint(dado));
         } //endSe
            
            //ler outro dado do teclado
         dado = arquivo.read( );
      } //end repeticao
      
      //6. fechar o arquivo (RECOMENDAVEL para leitura)
      arquivo.close( );
      
      //7. encerrar
      IO.println( ); 
      IO.pause("Apertar ENTER para continuar." );
   } //end metodo10( )
   
    /**
   * exe01 - exercicio 1
   * Para ler um valor inteiro do teclado e,
   * gravar essa quantidade em valores impares
   * em ordem decrescente terminando em 3
   */
   
   public static void exe01( )
   {
      //definir dados
      int dados;
      int n    = 1; 
      FILE arquivo;
      
      //identificar
      IO.println("Guardar dados inteiros em arquivo");
     
      //ler valor do teclado
      dados = IO.readint("Entrar com valores do teclado: "); 
      
      //testar quantidade
      if(dados <= 0)
      {
         IO.println("ERRO: Quantidade invalida." );
      } 
      else
      {
          //criar arquivo para gravar dados
         arquivo = new FILE(FILE.OUTPUT, "EXE01.TXT");
          //guardar a quantidade de dados
         arquivo.println("Dados: " + dados);
          
         while(dados > 0)
         {     
            n += 2; 
            dados = dados - 1;
         } //end repeticao
          
         while(n >= 3)
         {
            arquivo.println("" + n);
            n = n - 2;
         } //end repeticao
         //fechar o arquivo
         arquivo.close( ); 
      } //endSe
      
      //5.encerrar
      IO.println( );
      IO.pause("Aperte ENTER para continuar. " );   
   } //end exe01( )
   
   /**
   * exe02 - exercicio 2
   * Para ler um valor inteiro do teclado e,
   * gravar essa quantidade em multiplos de 3
   * em ordem crescente comecando em 3
   */
   
   public static void exe02( )
   {
      //definir dados
      int x; 
      int dados = 0;
      FILE arquivo; 
      
      //ler valor inteiro do teclado
      x = IO.readint("Entrar com valores inteiros: " );
      //criar arquivo para gravar dados
      arquivo = new FILE(FILE.OUTPUT, "EXE02.TXT" );
      
      while(x > 0)
      {
         dados = dados + 3;
         arquivo.println("Dados: " + dados);
         x = x - 1;
      } //end repeticao
       //fechar arquivo
      arquivo.close( );
      
      //5.encerrar
      IO.println( );
      IO.pause("Aperte ENTER para continuar. " );   
   } //end exe02( )
   
   /**
   * exe03 - exercicio 3
   * Para ler um valor inteiro do teclado e,
   * gravar essa quantidade em valores da sequencia
   * 1 3 6 9 12 15
   */
   
   public static void exe03( )
   {
      int x; 
      int dados = 1; 
      FILE arquivo;  
      
      arquivo = new FILE(FILE.OUTPUT, "EXE03.TXT" );
      
      x = IO.readint("Entrar com valores inteiros: " );
        
      while(x > 0)
      {  
         if(dados == 1)
         {
            arquivo.println(""+ dados);
            dados += 2;
         }
         else
         {
            dados = dados + 3;
         }
         arquivo.println("" + dados);
         x = x - 1;
      } //end repeticao  
               
       //fechar arquivo
      arquivo.close( );
           
      //5.encerrar
      IO.println( );
      IO.pause("Aperte ENTER para continuar. " );     
   } //end exe03( )
   
    /**
   * exe04 - exercicio 4
   * Para ler um valor inteiro do teclado e,
   * gravar essa quantidade em valores decrescentes
   * 1/81 1/27 1/9 1/3 1
   */
   
   public static void exe04( )
   {
      //definir dados
      int x;
      int dados = 3; 
      FILE arquivo;
      //criar arquivo para gravar dados
      arquivo = new FILE(FILE.OUTPUT, "EXE04.TXT");
      
      //ler valor inteiro do teclado
      x = IO.readint("Entrar com valor inteiro: " );
      
      while(x > 0)
      {
         dados = dados * 3;
         x = x - 1;
      } //end repeticao
      
      while(dados >= 3)
      {  
         dados = dados/3;
         if(dados == 1)
         {
            arquivo.println("1"); 
         } //endSe
         else
         {
            arquivo.println("1" + "/" + dados);
         } //endSe
      } //end repeticao
      
         //close file
      arquivo.close( );  
      
      //5.encerrar
      IO.println( );
      IO.pause("Aperte ENTER para continuar. " );       
      
   } //end exe04( )
   
    /**
   * exe05 - exercicio 5
   * Para ler uma cadeia de caracteres,
   * para gravar cada simbolo separadamente
   * e na ordem inversa
   */
   
   public static void exe05( )
   {
      //definir dados
      String x;
      FILE arquivo;
      //criar arquivo para gravar dados
      arquivo = new FILE(FILE.OUTPUT, "EXE05.TXT");
      
      x = IO.readString("Entrar com uma cadeia de caracteres: " );
      int tamanho = x.length( );
      //ordem inversa
      for(int p = tamanho - 1; p >= 0; p = p - 1)
      { 
         arquivo.println("X: " + x.charAt(p));
      } //end repeticao       
         //close file
      arquivo.close( ); 
      
      //5.encerrar
      IO.println( );
      IO.pause("Aperte ENTER para continuar. " );   
   } //end exe05( )
   
   /**
   * exe06 - exercicio 6
   * Fazer uma funcao para calcular a soma dos primeiros pares positivos,
   * comecando em 2, gravar cada termo e resultado
   */
      
   public static int somar(int x)
   {
   
     //2 + 4 + 6 + 8 + 10
   
       //definir dados
      int soma = 0;
      int valor = 2;
      FILE arquivo;
      //criar arquivo para gravar dados    
      arquivo = new FILE(FILE.OUTPUT, "EXE06.TXT");
      
      while(x > 0)
      {
         soma = soma + valor;
         valor = valor + 2;
         arquivo.println("Valor: " + valor + " Soma: " + soma);
         x = x - 1;       
      } //end repeticao
      
      //close file
      arquivo.close( );
      
      //retornar resultado
      return(soma);
   } //end somar( )
   
   public static void exe06( )
   {
      //definir dados
      int x;
      int result; 
               
      //identificar
      IO.println("Guardar dados inteiros em arquivo. ");
      
      //ler valor do teclaod
      x = IO.readint("Informe os termos: " );
      
      result = somar(x);
      IO.println("Resultado: " + result);
      
      //5.encerrar
      IO.println( );
      IO.pause("Aperte ENTER para continuar. " ); 
      
   } //end exe06( )
   
   /**
   * exe07 - exercicio 7
   * Fazer uma funcao para calcular a soma dos inversos impares positivos,
   * começando em 5, gravar cada termo e resultado
   */
   
   public static double inverso(int x)
   {
      //definir dados
      int numerador = 1;
      double soma = 0.0;
      double denominador = 3.0;
      FILE arquivo; 
      //criar arquivo para gravar dados
      arquivo = new FILE(FILE.OUTPUT, "EXE07.TXT");
      
      while(x > 0)
      {
         denominador = denominador + 2; //começando em 5.0
         soma = soma + numerador/denominador; // 1/5.0
         arquivo.println("Soma dos inversos: " + soma);
         
         //parada
         x = x - 1;
      } //end repeticao
      
      //close file (INDISPENSAVEL)
      arquivo.close( );
      
      //retornar soma
      return(soma);
   } //end inverso
   
   public static void exe07( )
   {  
      //definir dados
      int x; //quantidade do teclado
      double resultado;
      
      //ler valor no teclado
      x = IO.readint("Informe um valor inteiro: " );
      
      resultado = inverso(x);
      IO.println("Soma dos inversos: " + resultado);
      
      //5.encerrar
      IO.println( );
      IO.pause("Aperte ENTER para continuar. " ); 
      
   } //end exe07( )
   
    /**
   * exe08 - exercicio 8
   * Para calcular certo termo par,
   * da serie de fibonacci
   * e na ordem inversa
   */
   
   public static int fibonacci(int fibo)
   {  
      //definir dados
      int resultado = 0;
      
      if(fibo == 1 || fibo == 2)
      {
         resultado = 1;
      }
      else
      {
         if(fibo > 1)
         {
            resultado = fibonacci(fibo - 1) + fibonacci(fibo - 2);
         } //endSe
      } //endSe
      //retornar resultado
      return(resultado);
   } //end fibonacci( )
   
   public static void exe08( )
   {
      //definir dados
      int x; //quantidade lida no teclado
      int resultado; 
      int count = 0;
      FILE arquivo;
      
      //ler quantidade no teclado
      x = IO.readint("Informe um valor inteiro: " );
      //criar arquivo para gravar dados
      arquivo = new FILE(FILE.OUTPUT, "EXE08.TXT");
      
      while(x > 0)
      {
         resultado = fibonacci(x * 3);
         if(resultado % 2 == 0)
         {
            arquivo.println("Termos: " + resultado);
            count++;
            arquivo.println("Quantidade de termos: " + count);
         } //endSe
         x = x - 1;
      } //end repeticao
      //close file (INDISPENSAVEL)
      arquivo.close( );
      
      //5.encerrar
      IO.println( );
      IO.pause("Aperte ENTER para continuar. " );
      
   } //end exe08( )
   
   /**
   * exe09 - exercicio 9
   * Para calcular a quantidade de maiusculas em uma cadeia,
   * testar essa funcao com quantidade diferentes
   */
   
   public static int countM(String cadeia)
   {
      //definir dados
      int tamanho; 
      int posicao;
      int count = 0;
      FILE arquivo;
      
      tamanho = cadeia.length( );
      //criar arquivo para gravar dados
      arquivo = new FILE(FILE.OUTPUT, "EXE09.TXT");
      
      for(posicao = 0; posicao < tamanho; posicao++)
      {
         if(cadeia.charAt(posicao) >= 'A' &&
            cadeia.charAt(posicao) <= 'Z')
         {
            count++;
            arquivo.println(""+count + " Caracter valido: " + cadeia.charAt(posicao) + " em posicao: " + posicao +"\n");
         } //endSe
         else if(cadeia.charAt(posicao) >= 'a' || cadeia.charAt(posicao) <= 'z' ||
                 cadeia.charAt(posicao) >= '0' || cadeia.charAt(posicao) <= '0')
         {
            count = count + 0;
            arquivo.println("Caracter invalido em posicao: " + posicao +"\n");
         } //endSe
      } //end repeticao
               //close file
      arquivo.close( );
      //retornar resultado
      return(count);  
   } //end count( )
   
   public static void exe09( )  
   {
      //definir dados
      String x = "";
      int resposta; 
      
      //ler valor no teclado
      x = IO.readString("Entrar com uma cadeia de caracteres: " );
      resposta = countM(x);
      IO.println("Quantidade de maiusculas: " + resposta);
      
      //5.encerrar
      IO.println( );
      IO.pause("Aperte ENTER para continuar. " );
      
   } //end exe09( )
   
   /**
   * exe10 - exercicio 10
   * Para contar digitos em uma cadeia de caracteres,
   * testar essa funcao com quantidade diferentes
   */
   
   public static int countD(String cadeia)
   {
      //definir dados
      int posicao;
      int tamanho;
      FILE arquivo;
      int count = 0;
      
      tamanho = cadeia.length( );
      
      //criar arquivo para gravar dados
      arquivo = new FILE(FILE.OUTPUT, "EXE10.TXT");
      
      for(posicao = 0; posicao < tamanho; posicao++)
      {
         if(cadeia.charAt(posicao) >= '0' &&
            cadeia.charAt(posicao) <= '9')
         {
            count++;
            arquivo.println(""+ count + " Digitos: " + cadeia.charAt(posicao) + " em posicao: " + posicao);
         } //endSe
         else if(cadeia.charAt(posicao) >= 'a' || cadeia.charAt(posicao) >= 'A' ||
                    cadeia.charAt(posicao) <= 'z' || cadeia.charAt(posicao) <= 'Z')
         {
            count = count + 0;
            arquivo.println("Caracter invalido em posicao: " + posicao);
         } //endSe
      } //end repeticao
      //close file
      arquivo.close( );
      
      //retornar count
      return(count);
   } //end countD( )
   
   public static void exe10( )
   {
      //definir dados
      String x = "";
      int resposta; 
      
      //ler valor do teclado
      x = IO.readString("Entrar com uma cadeia de caracteres: " );
      //receber funcao
      resposta = countD(x);
      //printar na tela
      IO.println("Quantidade de digitos: " + resposta);
      
      //5.encerrar
      IO.println( );
      IO.pause("Aperte ENTER para continuar. " );
   
   } //end exe10( )
                      
   /**
   * Definicao do metodo principal 
   * main( )
   */
   
         
   public static void main(String [] args)
   {
   //identificar
      IO.println("ED_07 - Programa em Java ");
      IO.println("Autor: Matheus Santos Rosa Carneiro" );
   
   //definir dados
      int opcao;
   
      do
      {
         IO.println( "0 - parar" );
         IO.println( "1 - metodo 01" );
         IO.println( "2 - metodo 02" );
         IO.println( "3 - metodo 03" );
         IO.println( "4 - metodo 04" );
         IO.println( "5 - metodo 05" );
         IO.println( "6 - metodo 06" );
         IO.println( "7 - metodo 07" );
         IO.println( "8 - metodo 08" );
         IO.println( "9 - metodo 09" );
         IO.println("10 - metodo 10" );
         //exercicios
         IO.println("11 - exe01 " );
         IO.println("12 - exe02 " );
         IO.println("13 - exe03 " );
         IO.println("14 - exe04 " );
         IO.println("15 - exe05 " );
         IO.println("16 - exe06 " );
         IO.println("17 - exe07 " );
         IO.println("18 - exe08 " );
         IO.println("19 - exe09 " );
         IO.println("20 - exe10 " );
                               
         opcao = IO.readint( "Informe a opcao: " );
         switch(opcao)
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
               //exercicios
            case 11:
               exe01( );
               break;
            case 12:
               exe02( );
               break;
            case 13:
               exe03( );
               break;
            case 14:
               exe04( );
               break;
            case 15:
               exe05( );
               break;
            case 16:
               exe06( );
               break;
            case 17:
               exe07( );
               break;
            case 18:
               exe08( );
               break;
            case 19:
               exe09( );
               break;
            case 20:
               exe10( );
               break;         
            default:
               IO.println("ERROR - INVALID OPTION" );
               break;
         } //end switch( )
      } //end do
      while(opcao != 0);
   
   //encerrar 
      IO.pause( "Aperte ENTER para parar" );
   } //end main( )
} //end class ED_07