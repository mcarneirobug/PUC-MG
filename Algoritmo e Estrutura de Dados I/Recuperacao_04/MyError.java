/**
 * Classe para tratar erro.
 */

public class MyError
extends AMyError //heranca
implements IMyError//interface
{

/**
* Constante da classe.
*/

   public final static String NO_ERROR = "No_error";

/**
* Atributo para guardar
* codigo de erro.
*/

   protected int error;

/**
* Atributo para guardar
* codigo de erro.
*/

   public MyError()
   {
      setError(0); //valor inicial
   } //end construtor( )

   /**
    * Funcao para obter
    * codigo de erro.
    * @return codigo de erro.
    */

   public String toString()
   {
      return (""+error);
   } //end toString()

   /**
    * Funcao para obter
    * codigo de erro.
    * @return codigo de erro
    */

   public int getError()
   {
      return (error);
   } //end getError()

   /**
    * Metodo para guardar
    * codigo de erro.
    * @param codigo a ser guardado
    */

   protected void setError(int codigo)
   {
      error = codigo;
   } //end setError()

   /**
    * Funcao para testar
    * se ha' erro.
    * @return true, se houver;
    * false, caso contrario
    */

   public boolean hasError()
   {
      return(error != 0);
   } //end hasError()

   /**
    * Funcao para implementar
    * o metodo da interface IMyError.
    * @return mensagem sobre o erro
    */

   public String getErrorMsg()
   {
      return(NO_ERROR);
   } //end getErrorMsg()

} //end class MyError( )
