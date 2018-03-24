/**
* Classe para tratar cadeias de caracteres.
*
* @author: Matheus Santos Rosa Carneiro PUC MG
* Matricula: 613414 
* Turno: Vespertino 
*
*
* @version 01 12:00:00 (v0.5)
*
* Modelo de classe
* class MyString : MyError << IMyError>>
* - int error
// tratamento de erro
* + boolean hasError ( )
* + int getError ( )
* + void setError ( int codigo )
* -----------------------------------------
* # protected String cadeia
// atributo(s)
* -----------------------------------------
* + MyString EOL
= "\n";
// constantes da classe
* + MyString EMPTY = "" ;
* -----------------------------------------
* + String read ( String msg )
// metodos da classe
* -----------------------------------------
* + MyString ( )
// construtor(es)
* + MyString ( int tamanho )
* -----------------------------------------
* + String toString ( )
// compatibilidade
* + MyString clone ( )
* -----------------------------------------
* + int length ( )
// acesso
* + boolean isEmpty ( )
* + String get ( )
* + void set ( String x )
* + char getchar ( int position )
* + void setchar ( int position, char valor )
*
* + Object getHead ( )
// servicos
* + MyArray getTail ( )
*
// operacoes
* + void append ( String x )
* + void prepend ( String x )
* + boolean equals ( MyString x )
* + int compareTo ( MyString x )
* -----------------------------------------
* + void tests ( )
// testes
* -------------------------------------------
*
*/



/**
 * Lista de dependencias
 */

import java.io.*;
import IO.*;

public class MyString
extends MyError
implements IMyError
{

    //---------------- tratamento de erro

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
            txt = txt+"Tamanho invalido.";
            break;
         case 3:
            txt = txt+"Posicao invalida ao consultar.";
            break;
         case 4:
            txt = txt+"Posicao invalida ao atribuir.";
            break;
         default:
            txt = txt+"Undefined error.";
            break;
      } //end switch( )
      return (txt);
   } //end getErrorMsg( )

    //constante(s) da classe
    /**
     * Constante da classe.
     */
   public static final MyString EMPTY = new MyString("");

    //atributo(s)
    /**
     * Armazenador para cadeia de caracteres.
     */
   private String cadeia = new String ("");

    //construtor(es)
    /**
     * Construtor padrao.
     */
   public MyString()
   {
        //armazenador inicialmente vazio
      cadeia = "";
   } //end construtor padrao( )

    /**
     * Construtor alternativo.
     * @param x - valor inicial
     */
   public MyString(String x)
   {
      if( x == null )
      {
         setError(1);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         cadeia = x;
      } //end se
   } //end construtor alternativo( )

    /**
     * Mostrar cadeia de caracteres automaticamente.
     * @return conteudo da cadeia
     */
   public String toString()
   {
      String msg = "";
      msg = get(); //return cadeia
      if(msg.equals(""))
      {
         msg = "\"\"";
      } //end
      return (msg);
   } //end toString()

    /**
     * Clonar cadeia de caracteres.
     * @return copia do conteudo da cadeia
     */
   public MyString clone()
   {
      MyString copia = new MyString();
      copia = this;
      return (copia);
   } //end clone()

    //acesso
    /**
     * Funcao para testar
     * se armazenador vazio.
     * @return true, se vazio;
     *        false, caso contrario
     */
   public boolean isEmpty()
   {
      boolean answer = false; 
      if(cadeia == null || cadeia.equals(""))
      {
         answer = true;
      }
      return ( answer );    
   } //end hasData( )

    /**
     * Funcao para obter
     * o tamanho da cadeia de caracteres armazenada.
     * @return tamanho do conteudo da cadeia, se houver dados;
     *         zero, caso cotrario.
     */
   public int length()
   {
      //definir dados
      int x = 0;
      
      x = get().length();
   // retornar
      return (x);   
   } //end length()

    /**
     * Funcao para obter
     * o valor armazenado.
     * @return conteudo da cadeia, se houver dados;
     * vazio, caso contrario.
     */
   public String get()
   {
      return (cadeia);
   } //end get( )

    /**
     * Metodo para
     * armazenar valor.
     * @param x conteudo para a cadeia
     */
   public void set(String x)
   {
      cadeia = x;
   } //end set

    /**
     * Funcao para obter
     * caractere de posicao valida.
     * @return caractere da posicao indicada ou
     *         espaco, caso contrario
     * @param position do caractere desejado
     */
   public char getCharAt( int position )
   {
       // definir dado
      char x = '_';
      
      if(position < length() && position >= 0)
      {
         x = get().charAt(position);
      } //end 
      else
      {
         setError(4);
      } //end se
   //retornar x
      return (x);    
   } //end getCharAt( )

    /**
     * Metodo para alterar
     * caractere em posicao valida.
     * @param position - local do caractere a ser alterado
     * @param value    - novo valor
     */

   public void setCharAt(int position, char value)
   {
      String nova = ""; 
      StringBuilder str = new StringBuilder();
      int i;
      int tamanho = length();
      if(position >= 0 && position < tamanho)
      {
         for(i = 0; i < tamanho; i++)
         {
            if(i == position)
            {
               str.append(value);
            } //end 
            else
            {
               str.append(getCharAt(i));
            } //end se
         } //end repetir
         set(str.toString());
      } //end
      else
      {
         setError(4);
      } //end se
   } //end setCharAt( )

    /**
     * Funcao para obter
     * o primeiro caractere armazenado.
     * @return primeiro caractere da cadeia, se houver;
     *         vazio, caso contrario
     */
   public String getHead()
   {
      // definir dados
      String x = "";
      
      if(!isEmpty())
      {
         x = ""+ getCharAt(0);
      }
   //retornar x
      return (x);   
   } //end getHead( )

    /**
     * Funcao para obter
     * o restante do conteudo armazenado,
     * @return restante da cadeia, se houver;
     *         vazio, caso contrario.
     */
   public MyString getTail()
   {
      // definir dados
      MyString x = new MyString ( );
      int i;
      int tamanho = length();      
      
      if( ! isEmpty())
      {
         for(i = 1; i < tamanho; i++)
         {
            x.set(x.get()+getCharAt(i));
         } //end repetir
      } //end 
   //retornar x
      return ( x );	
   } //end getTail()
   
    /**
     * Funcao para remover espacos em branco.
     * @return cadeia de caracteres sem espaco em branco, se houver;
     *         vazio, caso contrario
     */
   public MyString trim()
   {
        //definir dados
      MyString x = new MyString();
      int y, tamanho = length();
   
      for(y = 0; y < tamanho; y++)
      {
         if(getCharAt(y) == ' ')
         {
            x.set(x.get()+"");
         }
         else
         {
            x.set(x.get()+getCharAt(y));
         } //end se
      } //end repetir
        //retornar
      return (x);
   } //end trim()

    //servicos
    /**
     * Funcao para comparar
     * conteudo com o de outro objeto desta classe.
     * @return true, se iguais;
     *         false, caso contrario
     * @param valor com o qual testar
     */
   public boolean equals(MyString valor)
   {
        //definir dados
      boolean result = false;
   
      if(this.cadeia == null || valor.cadeia == null)
      {
         setError(1);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         result = valor.cadeia.equals(this.cadeia);
      } //end se
        //retornar
      return(result);
   } //end equals()

    /**
     * Funcao para comparar
     * conteudo com o de outro objeto desta classe.
     * @return zero, se iguais;
     *         valor positivo, se primeiro maior que o segundo;
     *         valor negativo, se primeiro menor que o segundo.
     */
   public int compareTo(MyString valor)
   {
      //definir dados
      int answer = 0;
      
      if (this.cadeia == null || valor.cadeia == null)
      {
         setError(1);
         System.out.println(this.getErrorMsg());
      } //end 
      else
      {
         answer = this.cadeia.compareTo(valor.get());
      } //end se
      //retornar 
      return (answer);
   } //end compareTo()
   
    /**
     * Funcao para concatenar
     * conteudo com o de outro objeto desta classe.
     * @return cadeia atual concatenada com outro valor,
     *         vazio caso contrario
     * @param valor conteudo para concatenar
     */
   public MyString append(MyString valor)
   {
        //definir dados
      MyString x = new MyString();
      x.set(cadeia+valor.cadeia);
      
      //retornar
      return(x);
   } //end append()

    /**
     * Funcao para concatenar
     * conteudo de outro objeto com o desta classe.
     * @return outro valor concatenado com cadeia atual,
     *         vazio caso contrario
     * @param valor conteudo para concatenar
     */
   public MyString prepend(MyString valor)
   {
        //definir dado
      MyString x = new MyString();
      x.set(valor.get()+get());
       
       //retornar
      return (x);
   } //end prepend()

    //testes
    /**
     * Testes.
     */
   public static void tests()
   {
        //01. definir dados
      MyString ms1 = new MyString ( );
      MyString ms2 = new MyString ( "de" );
      MyString ms3 = new MyString ( );
      MyString ms4 = null;
      MyString ms5 = null;
      MyString ms6 = new MyString ( "0" );
      MyString ms7 = new MyString ( "" );
   
      int c;
   
        //identificar
      System.out.println("Modulo de testes da classe MyString: ");
      System.out.println();
   
        //02. testar atribuicao
      ms1.set("   a bc   ");
   
        //03. testar concatenacao posterior
      ms3 = ms1.append(ms2);
   
        //04. testar concatenacao anterior
      ms4 = ms1.prepend(ms2);
   
        //05. testar clone
      ms5 = ms3.clone();
   
        //06. testar clone
      ms6.setCharAt(0,'1');
   
        //07. testar exibicao
      System.out.println ( "01. ms1 = "+ms1.get( ) );
      System.out.println ( "02. ms2 = "+ms2.toString( ) );
      System.out.println ( "03. ms3 = ms1+ms2 = "+ms3 );
      System.out.println ( "04. ms4 = ms2+ms1 = "+ms4 );
      System.out.println ( "05. ms5 = ms3 = " +ms5 );
      System.out.println ( "06. ms6 = "+ms6 );
      System.out.println ( "07. ms7 = "+ms7 );
   
        //08. testar existencia de dado
      System.out.println ( "08. isEmpty (ms6) = "+ms6.isEmpty( ) );
      System.out.println ( "09. isEmpty (ms7) = "+ms7.isEmpty( ) );
      System.out.println ( "10. ms6 == ms6? "+(ms6.equals ( ms6 ) ) );
      System.out.println ( "11. ms6 == ms6? "+(ms6.compareTo ( ms6 )==0) );
      System.out.println ( "12. ms6 > ms7? "+(ms6.compareTo ( ms7 )> 0) );
      System.out.println ( "13. ms5 > ms6? "+(ms5.compareTo ( ms6 )> 0) );
   
        //09. testar consumo unitario
      System.out.println ( " " );
      while ( ! ms5.isEmpty( ) )
      {
         c = ms5.getCharAt( 0 );
         System.out.println ( "ms5 = "+ms5.getHead( )
                    + " + "+ms5.getTail( ).toString( )
                    + " ("+(ms5.length( )-1)+")" );
         ms5 = ms5.getTail( );
      } // end while
   
        //10. testar erros
      System.out.println ( );
      System.out.println ( "ms5 == \"\" -> "+ms5.isEmpty( ) );
      System.out.println ( "ms5[ 0 ] = '" +ms5.getCharAt( 0 ) + "'" );
      System.out.println ( "ms5[ 0 ] = \"" +ms5.getHead( ) + "\"" );
      System.out.println ( "ms5[1:n] = " +ms5.getTail( ) );
   
   } //end tests()


    /**
     * Acao principal.
     */

} //end MyString