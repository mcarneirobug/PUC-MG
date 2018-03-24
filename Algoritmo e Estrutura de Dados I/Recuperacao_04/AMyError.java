/**
 *  Classe abstrata para tratar erro.
 */

abstract class AMyError {

   /**
    * Funcao para testar
    * se ha' erro.
    * @return true, se houver;
    * false, caso contrario.
    */

   abstract public boolean hasError();

   /**
    * Funcao para obter
    * codigo de erro.
    * @return codigo de erro.
    */

   abstract public int getError();

   /**
    * Metodo para guardar
    * codigo de erro.
    * @param codigo a ser guardado
    */

   abstract protected void setError(int codigo);
} //end abstract class

/**
 * Classe abstrata sao modelos de classes, nao podem ser instanciadas
 * diretamente com new, elas sempre devem ser herdadas por classes concretas.
 */

/**
 * Os metodos abstratos devem obrigatoriamente ser implementados em uma
 * classe concreta.
 */