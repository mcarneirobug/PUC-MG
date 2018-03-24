/**
 * Classe para tratar cadeias de caracteres.
 *
 * @author: Matheus Santos Rosa Carneiro PUC MG
 * Matricula: 613414
 * Turno: Vespertino
 * ED 14
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
      boolean resp = false; 
      if(cadeia == null || cadeia.equals(""))
      {
         resp = true;
      }
      return ( resp );    } //end hasData( )

    /**
     * Funcao para obter
     * o tamanho da cadeia de caracteres armazenada.
     * @return tamanho do conteudo da cadeia, se houver dados;
     *         zero, caso cotrario.
     */
   public int length()
   {
        // definir dados
      int x = 0;
      
      x = get().length();
   // retornar
      return ( x );   
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
   // retornar
      return ( x );    
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
      int k, tamanho = length();
      if(position >= 0 && position < tamanho)
      {
         for(k = 0; k < tamanho; k = k+1)
         {
            if(k == position)
            {
               nova = nova + value;
            } //end 
            else
            {
               nova = nova + getCharAt(k);
            } //end se
         } //end repetir
         set(nova);
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
         x = ""+getCharAt(0);
      }
   // retornar
      return ( x );   
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
      int k, tamanho = length();      
      if(!isEmpty())
      {
         for(k = 1; k < tamanho; k = k+1)
         {
            x.set( x.get()+getCharAt(k));
         }
      }
   // retornar
      return ( x );	
   }
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
      int response = 0;
   
      if (this.cadeia == null || valor.cadeia == null)
      {
         setError(1);
         System.out.println(this.getErrorMsg());
      }
      else
      {
         response = this.cadeia.compareTo(valor.get());
      }
   
      return (response);
   }
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

   /**
    * Funcao para converter conteudo
    * para valor inteiro, se possivel.
    * @return valor convertido em inteiro
    */

   public int getInt()
   {
      //definir dados
      int value = 0;
      int x;

      if(cadeia == null)
      {
         setError(1);
      } //end
      else
      {
         for(x = 0; x < cadeia.length(); x++)
         {
            value += (int)get().charAt(x);
         } //end repetir
      } //end se
      return(value);
   } //end getInt()

   /**
    * Funcao para converter conteudo
    * para valor real, se possivel.
    * @return valor convertido para real
    */

   public double getDouble()
   {
      //definir dados
      double value = 0.0;
      int i;

      if(cadeia == null)
      {
         setError(1);
      } //end
      else
      {
         for(i = 0; i < cadeia.length(); i++)
         {
            value += (double)get().charAt(i);
         } //end repetir
      } //end se
      return (value);
   } //end getDouble()

   /**
    * Funcao para converter conteudo
    * para valor lo'gico, se possivel.
    * Nota: Considerar va'lidos: {true, false, T, F, 0, 1}
    * @return valor booleano convertido
    */

   public boolean getBoolean()
   {
      //definir dados
      boolean answer = false;

      if(!isEmpty())
      {
         if(get().equals("true") || get().equals("T") ||
            get().equals("1"))
         {
            answer = true;
         } //end
         else
         {
            if(get().equals("false") || get().equals("F") ||
               get().equals("0"))
            {
               answer = false;
            } //end
         } //end se
      } //end
      else
      {
         setError(1);
      } //end se
      return (answer);
   } //end getBoolean()

   /**
    * Funcao para verificar se o parametro
    * esta' contido no conteudo
    * @return false se nao estiver contido,
    * true caso estiver contido.
    * @param texto conteudo a ser analisado.
    */

   public boolean contains( String texto )
   {
      //definir dados
      boolean answer = false;
      int i, j;
      int x = 0;

      if(get() == null || texto == null)
      {
         setError(1);
      } //end
      else
      {
         for(i = 0; i < cadeia.length(); i++)
         {
            for(j = 0; j < texto.length(); j++)
            {
               if(get().charAt(i) == texto.charAt(j))
               {
                  x++;
               } //end
            } //end repetir
         } //end repetir
      } //end se
      if(x == texto.length())
      {
         answer = true;
      } //end
      else
      {
         answer = false;
      } //end se
      return (answer);
   } //end contains()

   /**
    * Funcao para converter letras para maiusculas.
    */

   public String toUpperCase()
   {
      //definir dados
      //String str = "";
      StringBuilder str = new StringBuilder();
      int i;

      if(cadeia == null)
      {
         setError(1);
      } //end
      else
      {
         int tamanho = cadeia.length();
         for(i = 0; i < tamanho; i++)
         {
            //verificar letra minuscula
            if(cadeia.charAt(i) >= 'a' && cadeia.charAt(i) <= 'z')
            {
               str.append ((char)(cadeia.charAt(i)-32));
               //caractere alfabetico minusculo '-32' tabela ASCII
               //define como resultado maiusculo: 'a' -32 --> 'A'
            } //end
            else
            {
               str.append(cadeia.charAt(i));
            } //end se
         } //end repetir
      } //end se
      return(str.toString());
   } //end toUpperCase()

   /**
    * Funcao para converter letras para minusculas.
    */
   public String toLowerCase()
   {
      StringBuilder str = new StringBuilder();
      int i;

      if(cadeia == null)
      {
         setError(1);
      } //end
      else
      {
         int tamanho = cadeia.length();
         for(i = 0; i < tamanho; i++)
         {
            if(cadeia.charAt(i) >= 'A' && cadeia.charAt(i) <= 'Z')
            {
               str.append((char)(cadeia.charAt(i)+32));
               //caracterer maiusculo: 'A' +32 ---> 'a'
            } //end
            else
            {
               str.append(cadeia.charAt(i));
            } //end se
         } //end repetir
      } //end se
      return (str.toString());
   } //end toLowerCase()

   /**
    * Funcao para trocar todas as ocorrencias
    * de certo caractere por outro novo.
    */

   public String replace(char original, char novo)
   {
      //definir dados
      StringBuilder str = new StringBuilder();
      int i;

      if(cadeia == null)
      {
         setError(1);
      } //end
      else
      {
         int tamanho = cadeia.length();
         for(i = 0; i < tamanho; i++)
         {
            if(cadeia.charAt(i) == original)
            {
               str.append(novo);
            } //end
            else
            {
               str.append(cadeia.charAt(i));
            } //end se
         } //end repetir
      } //end se
      return(str.toString());
   } //end replace()

   /**
    * Funcao para isolar todas as sequencias
    * separadas por espacos em branco.
    */

   public String [ ] split ( )
   {
      //definir dados
      int i, j = 0, count = 0, tamanho = cadeia.length();
      String [] vet = null;

      if(!isEmpty())
      {
         for(i = 0; i < tamanho; i++)
         {
            //verificar delimitador
            if(cadeia.charAt(i) == ' ')
            {
               count++; //contador de delimitador
            } //end
         } //end repetir
         vet = new String [count+1];
         //pecorrer o vetor
         for(i = 0; i < count+1; i++)
         {
            vet[i] = "";
         } //end repetir
         for(i = 0; i < tamanho; i++)
         {
            if(cadeia.charAt(i) != ' ')
            {
               vet[j] += cadeia.charAt(i);
            } //end
            else
            {
               //passar para proxima posicao
               j++;
            } //end se
         } //end repetir
      } //end
      return(vet);
   } //end split()

   /**
    * Funcao para codificar o conteudo segundo a cifra de Ce'sar
    */

   public String encrypt()
   {
      StringBuilder encryp = new StringBuilder();
      int tamanho = length();
      int i;
   } //end encrypt()

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