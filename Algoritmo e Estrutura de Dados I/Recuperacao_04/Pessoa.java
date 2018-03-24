/**
 * ---------------------------------------------- Documentacao preliminar
 * Pontificia Universidade Catolica de Minas Gerais
 * Curso de Ciencia da Computacao
 * Algoritmos e Estruturas de Dados I
 *
 * Trabalho pratico: REC 04
 *
 * Objetivo:
 * Modelo de programa para a disciplina AED I
 * Sugestao para montar um trabalho pratico
 *
 * Autor: Matheus S. R. C  Matricula: 613414  Nome: Matheus Santos Rosa Carneiro
 * Versao:  1.0                Data: 01/mm/20aa
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
 * - Pessoa.java
 * - Pessoa.class
 * - IO.jar    ( por exemplo em C:\java\jre\lib\ext\IO.jar )
 *
 * Forma de compilacao:
 * - acionar o compilador no modo console:
 *
 *   <drive>:>javac   Pessoa.java
 *   ou
 *   <drive>:>compile Pessoa
 *
 * Forma de uso:
 * - acionar o programa no modo console:
 *
 *   <drive>:>java Pessoa
 *   ou
 *   <drive>:>run  Pessoa
 *
 * - escolher uma das opcoes oferecidas.
 *
 * Referencias:
 * - Exemplos mostrados em sala de aula
 * - Apostila: Fundamentos de Programacao - Notas de aulas
 *
 */

/**
 * Importar dependencias
 */

import IO.*;
import java.io.*;
import java.util.Scanner;

class Tabela extends MyError
    implements IMyError
{

   /**
    * Codigos e erro na classe MyArray

    0. Nao ha' erro.
    1. Tabela vazia.
    2. Tamanho invalido.
    3. Posicao invalida ao consultar.
    4. Posicao invalida ao atribuir.
    */

   /**
    * Implementaca obrigatoria de IMyError
    * @Override // anotacao para sobrepor metodo
    */

   public String getErrorMsg()
   {
      String txt = "[MyString]: ";
      switch (getError())
      {
         case 0:
            txt = txt+"No errors.";
            break;
         case 1:
            txt = txt+"Tabela vazia.";
            break;
         case 2:
            txt = txt+"Quantidade invalida.";
            break;
         case 3:
            txt = txt+"Pessoa nao encontrada. ";
            break;
         case 4:
            txt = txt+"Arquivo invalido. ";
            break;
         case 5:
            txt = txt+"Nome nao encontrado. ";
         default:
            txt = txt+"Undefined error.";
            break;
      } //end switch( )
      return (txt);
   } //end getErrorMsg( )

   static Scanner input = new Scanner (System.in);

   // atributo
   public Object [ ][ ] tabela = null;

   // construtor padrao
   public Tabela ( )
   {
   } //end construtor padrao()

   // construtor alternativo
   public Tabela ( int linhas, int colunas )
   {
      if ( linhas > 0 && colunas > 0 )
      {
         tabela = new Object [ linhas ] [ colunas ];
      } //end if
   } //end construtor alternativo()

   // quantidade de linhas
   public int linhas ( )
   {
      int resposta = 0;
      if ( tabela != null )
      {
         resposta = tabela.length;
      } //end if
      return ( resposta );
   } //end linhas()

   // quantidade de colunas
   public int colunas ( )
   {
      int resposta = 0;
      if ( tabela != null )
      {
         resposta = tabela[ 0] .length;
      } //end if
      return ( resposta );
   } //end colunas()

   // testar se linha e coluna validos
   private boolean isValid ( int linha, int coluna )
   {
      return (  0 <= linha  && linha  < linhas ( )
             && 0 <= coluna && coluna < colunas( ) );
   } //end isValid()

   // obter valor de certa linha e coluna
   public Object get ( int linha, int coluna )
   {
      Object valor = null;
      if ( isValid ( linha, coluna ) )
      {
         valor = tabela [ linha ][ coluna ];
      } //end if
      return ( valor );
   } //end get()

   // atribuir valor a certa linha e coluna
   public void set ( int linha, int coluna, Object valor )
   {
      if ( isValid ( linha, coluna ) )
      {
         tabela [ linha ][ coluna ] = valor;
      } //end if
   } //end set()

   // mostrar conteudo
   public String toString ( )
   {
      String txt = "";
      int x, y;
      for ( x=0; x<linhas( ); x=x+1 )
      {
         txt = txt + "" + x + ": \n";
         for ( y=0; y<colunas( ); y=y+1 )
         {
            txt = txt + "  " + get ( x, y ) + "\n";
         } //end repetir
         txt = txt + "\n";
      } // end repetir
      return ( txt );
   } //end toString()

   public void printMatrix()
   {
      //definir dados
      int i, j;
      int lin, col;
   
      //identificar
      System.out.println();
   
      //testar se a matriz foi montada
      if( tabela == null )
      {
         setError(1);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         //obter dimensoes da matriz
         lin = linhas();
         col = colunas();
      
         if(lin <= 0 || col <= 0)
         {
            setError(2);
            System.out.println(getErrorMsg());
         } //end
         else
         {
            //mostrar matriz
            System.out.println("Matriz com "+lin+"x"+col+" posicoes:");
         
            //repetir para cada posicao da matriz
            for (i = 0; i < lin; i++)
            {
               for(j = 0; j < col; j++)
               {
                  //mostrar o valor armazenado
                  System.out.print("\t"+tabela[ i ][ j ]);
               } //end repetir
               System.out.println();
            } //end repetir
         } //end se
      } //end se
   } //end printMatriz()

   /**
    * Ler valores do teclado e guardar em uma matriz.
    */
   public void readMatriz()
   {
      //definir dados
      int i;
      int lin, col;
      String linha;
   
      //obter dimensoes
      lin = linhas();
      col = colunas();
   
      //testar se quantidade valida
      if( lin <= 0 || col <= 0 )
      {
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         //obter o tamanho da matriz
         lin = this.linhas();
         col = this.colunas();
      
         //repetir para cada posicao da matriz
         for(i = 0; i < lin; i++)
         {
            //ler no teclado
            linha = IO.readln("Nome: ");
            //armazenar na tabela
            tabela[ i ][ 0 ] = linha;
            //ler endereco
            linha = IO.readln("Endereco: ");
            //armazenar na tabela
            tabela[ i ][ 1 ] = linha;
            //ler aniversario
            linha = IO.readln("Aniversario: ");
            //armazenar na tabela
            tabela[ i ][ 2 ] = linha;
            //ler telefones
            linha = IO.readln("Telefones: ");
            //armazenar na tabela
            tabela[ i ][ 3 ] = linha;
            //ler numeros
            linha = IO.readln("Numeros: ");
            //armazenar na tabela
            tabela[ i ][ 4 ] = linha;
         } //end repetir
      } //end se
   } //end readMatriz()

   public int getMonth( int lin )
   {
      //definir dados
      int month = 0, size;
      String cadeia;
      String aux;
      cadeia = "" + tabela[ lin ][ 2 ];
      size   = cadeia.length();
   
      if ( size == 10 )
      {
         aux   = "" + cadeia.charAt(3) + cadeia.charAt(4);
         month = IO.getint(aux);
      } //end se
      //retornar mes
      return( month );
   } //end getMonth()

   /**
    * Funcao para pegar o dia.
    */
   public int getDay( int lin )
   {
      //definir dados
      String cadeia;
      String aux;
      int day = 0, size;
      cadeia = "" + tabela[ lin ][ 2 ];
      size   = cadeia.length();
   
      if ( size == 10 )
      {
         aux = "" + cadeia.charAt(0) + cadeia.charAt(1);
         day = IO.getint(lin);
      } //end se
      //retornar dia
      return( day );
   } //end getDay()

   /**
    * Metodo para procurar pessoas em certo mes.
    */
   public void findForMonth()
   {
      //definir dados
      int month;
      int i, lin, col;
   
      //ler do teclado o mes desejado
      month = IO.readint("Digite qual mes deseja: ");
   
      //obter dimensoes
      lin = linhas();
      col = colunas();
   
      //verificar se quantidade e' valida
      if( lin <= 0 || col <= 0 )
      {
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         //pecorrer pelas linhas
         for(i = 0; i < lin; i++)
         {
            if( month == this.getMonth(i))
            {
               System.out.println("Nome: "+ tabela[ i ][ 0 ]);
            } //end
         } //end repetir
      } //end se
   } //end findForMonth()

   /**
    * Funcao para comparar - compareTo
    */
   public int compareToString(String s1, String s2)
   {
      //definir dados
      int compare;
      int answer;
   
      //comparar s1 e s2
      compare = s1.compareTo(s2);
   
      if(compare < 0)
      {
         answer = -1;
      } //end
      else
      {
         if(compare > 0)
         {
            answer = 1;
         } //end
         else
         {
            answer = 0;
         } //end se
      } //end se
      //retornar resposta
      return( answer );
   } //end compareToString()

   public boolean Alfabetica()
   {
      //definir dados
      int size;
      int i = 0;
      String value = "";
      boolean answer = true;
      size = tabela.length;
   
      while(i < size)
      {
         if(i == 0)
         {
            value = "" + tabela[ i ][ 0 ];
         } //end
         else
         {
            if(compareToString(value, ("" + tabela[ i ][ 0 ])) == 1)
            {
               answer = false;
               i += size;
            } //end
            else
            {
               value = "" + tabela[ i ][ 0 ];
            } //end se
         } //end se
         i++;
      } //end repetir
      //retornar resposta
      return( answer );
   } //end Alfabetica()

   /**
    * Metodo para ordenar nomes em ordem alfabetica.
    */
   public void ordenarAlbetica()
   {
      //definir dados
      int i;
      int lin, col;
      String ordenar;
   
      //obter dimensoes
      lin = linhas();
      col = colunas();
   
      //verificar se quantidade e' valida
      if( lin <= 0 || col <= 0 )
      {
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         while(!this.Alfabetica())
         {
            for(i = 1; i < lin; i++)
            {
               if(compareToString(("" + tabela[ i ][ 0 ]),
                      (""+ tabela[ i - 1 ][ 0 ])) == -1)
               {
                  ordenar = "" + tabela[ i - 1 ][ 0 ];
                  tabela[ i - 1 ][ 0 ] = tabela[ i ][ 0 ];
                  tabela[ i ][ 0 ] = ordenar;
               
                  ordenar = "" + tabela[ i - 1 ][ 1 ];
                  tabela[ i - 1 ][ 1 ] = tabela[ i ][ 1 ];
                  tabela[ i ][ 1 ] = ordenar;
               
                  ordenar = "" + tabela[ i - 1 ][ 2 ];
                  tabela[ i - 1 ][ 2 ] = tabela[ i ][ 2 ];
                  tabela[ i ][ 2 ] = ordenar;
               
                  ordenar = "" + tabela[ i - 1 ][ 3 ];
                  tabela[ i - 1 ][ 3 ] = tabela[ i ][ 3 ];
                  tabela[ i ][ 3 ] = ordenar;
               
                  ordenar = "" + tabela[ i - 1 ][ 4 ];
                  tabela[ i - 1 ][ 4 ] = tabela[ i ][ 4 ];
                  tabela[ i ][ 4 ] = ordenar;
               } //end
            } //end repetir
         } //end repetir
      } //end se
   } //end ordenarAlfabetica()
} //end class

public class Pessoa extends Tabela
{
   // quantidade de pessoas
   public int tamanho = 0;

   // construtor padrao
   public Pessoa ( )
   {
   } //end construtor padrao()

   // construtor alternativo
   public Pessoa ( int tamanho )
   {
      super ( tamanho, 5 );
      this.tamanho = 0;
   } //end construtor alternativo()

   // quantidade de dados
   public int tamanho ( )
   {
      return ( tamanho );
   } //end tamanho()

   // mostrar conteudo
   public String toString ( )
   {
      String txt = "";
      int x, y;
      for ( x=0; x<tamanho( ); x=x+1 )
      {
         txt = txt + "Pessoa " + (x + 1) + ": \n";
         for ( y=0; y<colunas( ); y=y+1 )
         {
            txt = txt + "  " + get ( x, y ) + "\n";
         } //end repetir
         txt = txt + "\n";
      } //end repetir
      return ( txt );
   } //end toString()

   // adicionar dados de uma pessoa
   public void adicionarPessoa ( )
   {
      String nome, endereco, aniversario;
      int    telefones;
      String numeros;
   
      // entrada de dados
      nome        = IO.readln ( "Nome       : " );
      endereco    = IO.readln ( "Endereco   : " );
      aniversario = IO.readln ( "Aniversario: " );
      telefones   = IO.readint( "Telefones  : " );
      // caso separado
      if (  telefones == 1 )
      {
         numeros     = IO.readln ( "Numeros    : " );
         set ( tamanho, 4, numeros     );
      } //end if
   
      // caso do telefones tratado separadamente
      if ( telefones > 1 )
      {
         numeros = concatenar_tells( telefones );
         set ( tamanho, 4, numeros     );
      } //end if
      // armazenamento
      set ( tamanho, 0, nome        );
      set ( tamanho, 1, endereco    );
      set ( tamanho, 2, aniversario );
      set ( tamanho, 3, telefones   );
   
      // aumentar tamanho dos dados
      tamanho = tamanho + 1;
   } //end adicionarPessoa()

   // adicionar dados de uma pessoa
   public void adicionarPessoa ( String nome, String end,
                                 String aniv, int telefones, String numeros)
   {
   
      // armazenamento
      set ( tamanho, 0, nome        );
      set ( tamanho, 1, end         );
      set ( tamanho, 2, aniv        );
      set ( tamanho, 3, telefones   );
      set ( tamanho, 4, numeros     );
   
      tamanho = tamanho + 1;
   } //end adicionarPessoa()

   // alterar dados de uma pessoa
   public void alterarPessoa ( int posicao, String nome, String end,
                               String aniv, int telefones, String numeros)
   {
   
      // armazenamento
      set ( posicao, 0, nome        );
      set ( posicao, 1, end         );
      set ( posicao, 2, aniv        );
      set ( posicao, 3, telefones   );
      set ( posicao, 4, numeros     );
   } //end alterarPessoa()

   // alterar dados de uma pessoa
   public void alterarPessoa ()
   {
      // definir dados
      String nome, endereco, aniversario;
      int    telefones, posicao;
      String numeros="";
      String nome_procurado;
   
      // procurar nome para ser alterado
      nome_procurado = IO.readln("Digite o nome da pessoa para alterar: ");
      posicao = findPessoa(nome_procurado);
   
      if ( posicao < 0 )
      {
         //IO.println("Pessoa nao encontrada!");
         setError(3);
         System.out.println(getErrorMsg());
      } //end if
      else // caso pessoa encontrada
      {
         // entrada de dados
         nome        = IO.readln ( "Nome       : " );
         endereco    = IO.readln ( "Endereco   : " );
         aniversario = IO.readln ( "Aniversario: " );
         telefones   = IO.readint( "Telefones  : " );
         // caso separado
         if (  telefones == 1 )
         {
            numeros     = IO.readln ( "Numeros    : " );
         } //end if
         else //(teste)
         {
         
            // caso do telefones tratado separadamente
            if ( telefones > 1 )
            {
               numeros = concatenar_tells( telefones );
            }  //end
         } //end se
         // chamar metodo e alterar
         alterarPessoa( posicao, nome, endereco, aniversario, telefones, numeros );
      } // fim do else
   } // fim do alterarPessoa()

   // metodo para ler arquivo com Pessoas no modelo abaixo
   public Pessoa fromFile( String nome_arq )
   {
      // definir dados
      String nome, endereco, aniversario;
      int    telefones;
      String numeros;
      FILE arquivo = new FILE ( FILE.INPUT, nome_arq );
      String linha="";
      int posicao = 0;
      Pessoa resp= this;
   
      // testar se arquivo existe e nao vazio
      if ( arquivo != null && arquivo.length() != 0 )
      {
         while (  ! arquivo.eof() )
         {
            // testar qual opcao ( I R A )
            linha = arquivo.readln( );
         
            // opcao I
            if( linha != null && linha.equals("I") )
            {
               // Inserir dados
               nome        = arquivo.readln ( );
               endereco    = arquivo.readln ( );
               aniversario = arquivo.readln ( );
               telefones   = Integer.parseInt(arquivo.readln ( ) );
               numeros     = arquivo.readln ( );
            
               adicionarPessoa( nome, endereco, aniversario, telefones, numeros );
            } //end if
            // opcao R
            else if( linha != null && linha.equals("R") )
            {
               // Inserir dados
               nome = arquivo.readln ( );
               resp = resp.removePessoa(nome);
            } //end if se
            // opcao A
            else
            {
               if( linha != null && linha.equals("A") )
               {
               
                  // Inserir dados
                  nome = arquivo.readln ( );
                  posicao = findPessoa( nome );
                  nome = arquivo.readln ( );
                  endereco    = arquivo.readln ( );
                  aniversario = arquivo.readln ( );
                  telefones   = Integer.parseInt(arquivo.readln ( ) );
                  numeros     = arquivo.readln ( );
                  // chamar metodo para alterar
                  alterarPessoa( posicao, nome, endereco, aniversario, telefones, numeros );
               } //end if
            } //end
         } //end repetir
         //fechar arquivo (indispensavel)
         arquivo.close();
      } //end
      return resp;
   } //end fromFile();

   /**
    * Metodo para gravar dados de matriz em arquivo.
    */

   public void toFile( String nameFile )
   {
      //definir dados
      int i, j;
      int sizeL;
      int sizeC;
      FILE arquivo;
   
      //obter dimensoes
      sizeL = linhas();
      sizeC = colunas();
   
      //verificar se quantidade e' valida
      if( sizeL <= 0 || sizeC <= 0 )
      {
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         //abrir arquivo para gravar
         arquivo = new FILE (FILE.OUTPUT, nameFile);
      
         //verificar se o arquivo e' valido
         if( arquivo == null )
         {
            setError(4);
            System.out.println(getErrorMsg());
         } //end
         else
         {
            for( i = 0; i < tamanho; i++ )
            {
               arquivo.println("I"); // parametro para carregar arquivo com fromFile()
               for ( j = 0; j < sizeC; j++ )
               {
                  arquivo.println(""+tabela[ i ][ j ]);
               } //end repetir
            } //end repetir
            //fechar arquivo (indispensavel)
            arquivo.close();
         } //end se
      } //end se
   } //end toFile()

   // metodo para procurar uma pessoa pelo nome
   public int findPessoa( String entrada )
   {
      int i;
      int answer = - 1;
      int lin;
   
      //obter dimensao
      lin = linhas();
   
      //verificar se quantidade e' valida
      if( lin < 0 )
      {
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         for(i = 0; i < lin; i++)
         {
            if(entrada.equals(get(i, 0)))
            {
               answer = i;
               i += lin;
            } //end
         } //end repetir
      } //end se
      //retornar resposta
      return ( answer );
   } //end findPeople()

   public Pessoa removePessoa( String pessoa )
   {
      //definir dados
      int i, j, x = 0;
      int lin, col;
      int find;
      Pessoa m2 = null;
   
      //obter dimensoes
      lin = linhas();
      col = colunas();
   
      //verificar se quantidade e' valida
      if( lin <= 0 || col <= 0 )
      {
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         //procurar pessoa
         find = findPessoa(pessoa);
         if(find < 0)
         {
            setError(3);
            System.out.println(getErrorMsg());
            IO.println("" + find);
         } //end if
         else
         {
            tamanho = tamanho - 1; //apaga a pessoa
            System.out.println("Pessoa removida com sucesso: "+ pessoa);
            //criar m2
            m2 = new Pessoa (10); // mantem tamanho padrao de 10 pessoas
            m2.tamanho = tamanho;
         
            //verificar se m2 e' valida
            if(m2 == null)
            {
               setError(1);
               System.out.println(getErrorMsg());
            } //end
            else
            {
               for(i = 0; i < tamanho + 1 ; i++)
               {
                  if( i != find )
                  {
                     for(j = 0; j < col; j++)
                     {
                        m2.tabela[x][j] = tabela[i][j];
                     } //end repetir
                     x++;
                  } //end
               } //end repetir
            } //end se
         } //end se
      } //enf se
      //retornar m2
      return( m2 );
   } //end removeInfo()

   public boolean Aniversario(  )
   {
      //definir dados
      int size;
      int i          = 0;
      double value   = 0.0;
      boolean answer = true;
      size = tamanho;
   
      while (i < size)
      {
         if(i == 0)
         {
            value = getMonth(i)+ 1.0*getDay(i)/100;
         } //end
         else
         {
            if(value > (getMonth(i)+ 1.0*getDay(i)/100))
            {
               answer = false;
               i += size;
            } //end
            else
            {
               value = getMonth(i)+ 1.0*getDay(i)/100;
            } //end se
         } //end se
         i++;
      } //end repetir
      //retornar resposta
      return( answer );
   } //end Aniversario()

   /**
    * Metodo para ordenar pela ordem das datas de aniversario.
    */

   public void ordenarAniversario()
   {
      //definir dados
      String ordenar;
      int i;
      int lin, col;
      double x, y;
   
      //obter dimensoes
      lin = tamanho;
      col = colunas();
   
      //verificar se quantidade e' valida
      if( lin <= 0 || col <= 0 )
      {
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         while(!this.Aniversario())
         {
            for(i = 1; i < lin; i++)
            {
               x = getMonth(i - 1)+ 1.0*getDay(i - 1)/100;
               y = getMonth(i) + 1.0*getDay(i)/100;
            
               if(x > y)
               {
                  ordenar = "" + tabela[ i - 1 ][ 0 ];
                  tabela[ i - 1 ][ 0 ] = tabela[ i ][ 0 ];
                  tabela[ i ][ 0 ] = ordenar;
               
                  ordenar = "" + tabela[ i - 1 ][ 1 ];
                  tabela[ i - 1 ][ 1 ] = tabela[ i ][ 1 ];
                  tabela[ i ][ 1 ] = ordenar;
               
                  ordenar = "" + tabela[ i - 1 ][ 2 ];
                  tabela[ i - 1 ][ 2 ] = tabela[ i ][ 2 ];
                  tabela[ i ][ 2 ] = ordenar;
               
                  ordenar = "" + tabela[ i - 1 ][ 3 ];
                  tabela[ i - 1 ][ 3 ] = tabela[ i ][ 3 ];
                  tabela[ i ][ 3 ] = ordenar;
               
                  ordenar = "" + tabela[ i - 1 ][ 4 ];
                  tabela[ i - 1 ][ 4 ] = tabela[ i ][ 4 ];
                  tabela[ i ][ 4 ] = ordenar;
               } //end
            } //end repetir
         } //end repetir
      } //end se
   } //end ordenarAniversario()

 /*
    public String concatenar_tells( int telefones )
  {
  //definir dados
     String resp = "";
     StringBuilder str = new StringBuilder();
     int i = 1;
     if ( telefones > 1 )
     {
        IO.println("ATENCAO!!!");
        IO.println("Formato do telefone: 1234-1234");
        for (i = 1; i <= telefones; i = i + 1 )
        {
           resp = resp + IO.readString("Digite o " + i + " telefone: ");
           resp = resp + " ";
        }
     }
     return resp;
  }// fim do concatenar_tells()
  */

 /*
 * metodo para concatenar telefones
 * formato do telefone xxxx-xxxx
 */

   public String concatenar_tells( int telefones )
   {
      //definir dados
      StringBuilder str = new StringBuilder();
      int i = 1;
      if ( telefones > 1 )
      {
         System.out.println("Formato do telefone: xxxx-xxx");
         for (i = 1; i <= telefones; i = i + 1 )
         {
            str.append(IO.readString("Digite o " + i + " telefone: "));
            str.append(" ");
         } //end repetir
      } //end if
      return (str.toString());
   }// end concatenar_tells()

   /*
  * metodo para separar telefones
  */
   public  String [ ] separar_tells( int telefones, String numeros )
   {
      // definir dados
      int i = 0, j = 0;
      String [ ] resp = null;
      String aux = "";
      int k = 0;
   
      if ( telefones > 1 )
      {
         // separar local na memoria pra alocar os telefones
         resp = new String [ telefones ];
      
         // testar se espaco alocado
         if ( resp != null && resp.length != 0 )
         {
            // repetir pelo numero de telefones
            for ( j = 0; j < telefones; j = j + 1 )
            {
               aux = "";
               for( i = 0; i < 9; i = i + 1 )
               {
                  aux = aux + numeros.charAt(k);
                  k = k + 1;
               }// fim do for (i)
               resp[ j ] = aux;
               k = k + 1; // pula o espaco em branco
            }// fim do for (j)
         } // fim do resp valido
      }// fim do telefones > 1
      // retorna numeros
      return resp;
   }// fim do separar tells

   /**
    * Metodo para achar o telefone a partir do nome.
    */

   public void findFone()
   {
      //definir dados
      int i;
      int lin;
      int col;
      int Error = 0;
      String linha, numeros;
      String [ ] numeros_separados;
   
      //obter dimensoes
      lin = linhas();
      col = colunas();
   
      //ler do teclado o nome que deseja procurar
      linha = IO.readln("Digite o nome: ");
   
      //verificar se quantidade e' valida
      if( lin <= 0 || col <= 0 )
      {
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         for(i = 0; i < tamanho; i++)
         {
         
            if( linha.equals( tabela[ i ][ 0 ] ) )
            {
               System.out.println("Telefone(s): " + tabela[ i ][ 4 ]);
               i += lin;
               Error = 1;
            } //end
         } //end repetir
         if(Error == 0)
         {
            setError(5);
            System.out.println(getErrorMsg());
         } //end
      } //end se
   } //end findFone()

   /**
    * Definicao do metodo principal - main ()
    * @param args
    */

   public static void main ( String [ ] args )
   {  // definir dados
      Pessoa dados = new Pessoa ( 10 );
      //int opcao = -1;
      int opcao = 0;
      int i = 0;
   
      System.out.println("Author: Matheus Santos Rosa Carneiro - 613414");
      System.out.println("REC 04 - Programa feito em Java\n");
   
      // ler dados da tabela teste.txt
      dados = dados.fromFile("teste.txt");
   
      do {
         IO.println("----------------------------------------------");
         IO.println("|1 - Encontrar telefone                       |");
         IO.println("|2 - Pessoas que fazem aniversario por mes    |");
         IO.println("|3 - Mostrar tabela de ordem alfabetica       |");
         IO.println("|4 - Mostrar tabela na ordem de aniversarios  |");
         IO.println("|5 - Gravar as informacoes em um arquivo texto|");
         IO.println("|6 - Ler informacoes gravadas em um arquivo   |");
         IO.println("|7 - Alterar informacoes de uma pessoa        |");
         IO.println("|8 - Inserir nova pessoa                      |");
         IO.println("|9 - Remover uma pessoa                       |");
         IO.println("|0 - Pausar...                                |");
         IO.println("-----------------------------------------------");
      
         System.out.println("Qual a opcao desejada? ");
         opcao = input.nextInt();
      
         switch(opcao)
         {
            case 0:
               break;
            case 1: // (OK)
               System.out.println(""+dados);
               dados.findFone();
               break;
            case 2:
               System.out.println(""+dados);
               dados.findForMonth();         // (OK)
               break;
            case 3:
               dados.ordenarAlbetica ();   // (OK)
               IO.println ( "" + dados );
               break;
            case 4:
               dados.ordenarAniversario ();  // (OK)
               IO.println ( "" + dados );
               break;
            case 5:
               String fileName = IO.readString("Digite o nome do arquivo para salvar: ");
               dados.toFile(fileName);  // (OK)
               break;
            case 6:
               String nameFile = IO.readString("Digite o nome do arquivo para carregar: ");
               dados = dados.fromFile(nameFile);
               System.out.println("" + dados);  //(OK)
               break;
            case 7:
               System.out.println("" + dados); // (OK)
               dados.alterarPessoa();
               dados.toFile("teste.txt");
               IO.println ( "" + dados );
               break;
            case 8:
               dados.adicionarPessoa(); // (OK)
               dados.toFile("teste.txt");
               IO.println ( "" + dados );
               break;
            case 9:
               System.out.println("" + dados);  // (OK)
               String leitura;
               leitura = IO.readln("Digite o nome da pessoa para remover: ");
               dados   = dados.removePessoa(leitura);
               IO.println ( "" + dados );
               dados.toFile("teste.txt");
               break;
            default:
               IO.println("ERROR: Opcao invalida. ");
         } //end escolher
      } //end do()
      while(opcao != 0);
      // encerrar
      IO.pause ("Apertar ENTER para terminar.");
   } //end main()
} //end class Pessoa

/*
  Testes

  Modelo para arquivo para testes

  I = Incluir
  A = Alterar
  R = Remover

  _______________________________
  I
  "Aaa Bbb Ccc"
  "Rua A, 1"
  "01/01/2000"
  1
  "99999-9999"
  I
  "Ddd Eee Fff"
  "Rua D, 1"
  "01/01/2001"
  1
  "99999-9998"
  I
  "Ggg Hhh Iii"
  "Rua G, 1"
  "01/01/2002"
  1
  "99999-9997"
  A
  "Ggg Hhh Iii"
  "Ggg Hhh Jjj"
  "Rua H, 2"
  "01/01/2002"
  1
  "99999-9997"
  R
  "Ddd Eee Fff"


DADOS de incializacao para testes

 // inicializando alguns nomes de teste
 //dados.adicionarPessoa ( "Aaa Bbb Ccc", "Rua A, 01", "01/01/2000", 1, "99999-9999" );
 //dados.adicionarPessoa ( "Ddd Eee Fff", "Rua B, 02", "01/01/2001", 1, "99999-9998" );
 //dados.adicionarPessoa ( "Ggg Hhh Iii", "Rua C, 03", "01/01/2002", 1, "99999-9997" );
 //dados.adicionarPessoa ( "Jjj Kkk Lll", "Rua D, 04", "01/01/2003", 1, "99999-9996" );
 //dados.adicionarPessoa ( "Mmm Nnn Ooo", "Rua E, 05", "01/01/2004", 1, "99999-9995" );
 //dados.adicionarPessoa ( "Ppp Qqq Rrr", "Rua F, 06", "01/01/2005", 1, "99999-9994" );

*/