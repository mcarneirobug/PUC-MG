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
         // definir dados
      int i = 0, answer = 0;
   
         // testar caso de erro
      if( cadeia == null )
      {
         setError(1);
      } //end
      else
      {
         answer = Integer.parseInt(cadeia);
      
      }// end se
         //return resposta
      return ( answer );
   } //end getInt()

   /**
    * Funcao para converter conteudo
    * para valor real, se possivel.
    * @return valor convertido para real
    */

   public double getDouble ( )
   {
      double answer = 0;
      // verificar se e' valida
      if( cadeia == null )
      {
         setError(1);
      }
      else
      {
         answer = Double.parseDouble(cadeia);
      }// end se
      //return resposta
      return ( answer );
   }// fim do getDouble

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
      // definir dados
      boolean answer = false;
      //verificar 
      if ( get() == null || texto == null )
      {
         setError(1);
      }
      else
      {
         answer = cadeia.contains(texto);
      }// end se
      return ( answer );   
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

   public String encrypt(int key, String str)
   {
      StringBuilder cifra = new StringBuilder();
      int tamanho = str.length();
      int ascii;
      for(int i = 0; i < tamanho; i++)
      {
         ascii = ((int) str.charAt(i)) + key;
         while(ascii > 126)
         {
            ascii = ascii - 94;
         } //end repetir
         cifra.append((char)ascii);
      } //end repetir
      return(cifra.toString());
   } //end encrypt()

   /**
    * Funcao para decodificar o conteudo
    * previamente cifrado pela funcao acima.
    */

   public String decrypt(int key, String text)
   {
      //definir dados
      StringBuilder entrada = new StringBuilder();
      int tamanho;
      int i;
      int convertASCII;
   
      //tamanho a ser decriptado
      tamanho = text.length();
   
      //pecorrer cada caracter por vez
      for(i = 0; i < tamanho; i++)
      {
         convertASCII = ((int) text.charAt(i)) - key;
      
      
         while(convertASCII < 32)
         {
            convertASCII += 94;
         } //end repetir
         entrada.append((char)convertASCII);
      } //end repetir
      return(entrada.toString());
   } //end decrypt()

 //testes
    /**
     * Testes.
     */
   public static void tests()
   {
      //01. definir dados
      MyString ms1 = new MyString ( "" );
      MyString ms2 = new MyString ( "" );
      MyString ms3 = new MyString ( "" );
      MyString ms4 = new MyString ( "" );
      MyString ms5 = new MyString ( "" );
      MyString ms6 = new MyString ( "" );
      MyString ms7 = new MyString ( "" );
      MyString ms8 = new MyString ( "" );
      MyString ms9 = new MyString ( "" );
      MyString ms10 = new MyString ( "" );
   
   
      int i           = 0;
      int metodo1     = 0;
      double metodo2  = 0;
      boolean metodo3 = false, metodo4 = false;
      String metodo5  = "";
      String metodo6  = "";
      String metodo7  = "";
      String metodo9  = "";
      String metodo10 = "";
      String [ ]metodo8;
     
      //identificar
      System.out.println("ED_14: ");
      System.out.println();
   
        //02. testar metodo getint()
      ms1.set("3");
      metodo1 = ms1.getInt();
      IO.println("Metodo getint() Set(3): ");
      IO.println("ms1 = " + metodo1);
      
        //03. testar metodo getDouble()
      ms2.set("278.78");
      metodo2 = ms2.getDouble();
      IO.println("Metodo getDouble() set (278.78): ");
      IO.println("ms2 = " + metodo2);
   
       //04. testar metodo getBoolean()
      ms3.set("true");
      metodo3 = ms3.getBoolean();
      IO.println("Metodo getDouble() (true): ");
      IO.println("ms2 = " + metodo3);
      ms3.set("T");
      metodo3 = ms3.getBoolean();
      IO.println("Metodo getDouble() (T): ");
      IO.println("ms2 = " + metodo3);
      ms3.set("1");
      metodo3 = ms3.getBoolean();
      IO.println("Metodo getDouble() (1): ");
      IO.println("ms3 = " + metodo3);
      ms3.set("false");
      metodo3 = ms3.getBoolean();
      IO.println("Metodo getDouble() (false): ");
      IO.println("ms3 = " + metodo3);
      ms3.set("F");
      metodo3 = ms3.getBoolean();
      IO.println("Metodo getDouble() (F): ");
      IO.println("ms3 = " + metodo3);
      ms3.set("0");
      metodo3 = ms3.getBoolean();
      IO.println("Metodo getDouble() (0): ");
      IO.println("ms3 = " + metodo3);
   
   //05. testar metodo contains()
      ms4.set("texto");
      metodo4 = ms4.contains("texto");
      IO.println("Metodo contains(ins) set (textoinserido): ");
      IO.println("ms4 = " + metodo4);
   
   //06. testar metodo toUpperCase()
      ms5.set("tExTo");
      metodo5 = ms5.toUpperCase();
      IO.println("Metodo toUpperCase (tExTo): ");
      IO.println("ms5 = " + metodo5);
   
   //07. testar metodo toLowerCase()
      ms6.set("tExTo");
      metodo6 = ms6.toLowerCase();
      IO.println("Metodo toUpperCase (tExTo): ");
      IO.println("ms6 = " + metodo6);
   
   
   //08. testar metodo replace()
      ms7.set("arara");
      metodo7 = ms7.replace('a','b');
      IO.println("Metodo replace(a,b) (arara): ");
      IO.println("ms7 = " + metodo7);
      
   //09. testar metodo split()
      ms8.set("teste de separar");
      metodo8 = ms8.split();
      IO.println("Metodo split() (teste de separar): ");
      for ( i = 0; i < metodo8.length; i = i + 1)
         IO.println("ms8["+ i +"] = "+ metodo8[i]);
   
   //10. testar metodo encrypt()
      ms9.set("abcdef");
      metodo9 = ms9.encrypt(1 , ms9.cadeia );
      IO.println("Metodo encrypt(abcdef): ");
      IO.println("ms9 = " + metodo9);
      
    
   //10. testar metodo decrypt()
      ms10.set("bcdefg");
      metodo10 = ms10.decrypt(1 , ms10.cadeia );
      IO.println("Metodo decrypt(bcdefg): ");
      IO.println("ms10 = " + metodo10);
    
   } //end tests()
/**
* Acao principal.
*/
   public static void main ( String [ ] args )
   {
   // testar
      MyString.tests ( );
   } // end main ( )
 
} //end MyString