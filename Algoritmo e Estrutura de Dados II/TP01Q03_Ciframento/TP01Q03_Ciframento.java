public class TP01Q03_Ciframento extends MyIO { 
   /*
      Funcao responsavel por criptografar uma string
      @param cifra - cadeia de caracteres a ser criptografada
      @return - string criptografada	
   */
    public static String encrypt ( String cifra ) {
      int size = cifra.length();
      int key  = 3;
      int armazenador;
      String answer   = "";

      for( int i = 0; i < size; i++ )
      {
          armazenador = ((int) cifra.charAt(i)) + key; //converte para ascii e desloca 3 casas
          answer += ((char) armazenador); //concatena a cifra e converte para caractere
      } //end repeticao
        return ( answer );
    } //end encrypt()

   /*
        Funcao responsavel por comparar duas strings 
        @param a1, a2 - strings a serem comparadas entrem si, se sao iguais.
        @return - retorna true se forem iguais, caso contrario false.
     */
     public static boolean isEquals( String a1, String a2 ){
       int tamanho    = a1.length();
       int size       = a2.length();
       boolean answer = false;
       int count      = 0;

       if(tamanho != size)
       {
          answer = false;
       } else {
          for(int i = 0; i < tamanho; i++)
          {
             if(a1.charAt(i) == a2.charAt(i)) 
             {
	     answer = true;
             count++;
             } else {
	         answer = false;
             } //end else
          } //end repetir
          if(count == tamanho) //condicao de parada
          {
            answer = true;
          } else {
            answer = false;
          } //end else
      } //end else
     return (answer);
 } //end isEquals() 

  public static void main( String [] args ) {
    String answer = "";
    String str    = "";

    while(!isEquals(str, "FIM")) 
     {
  	str = MyIO.readLine();
        if(!isEquals(str, "FIM"))
        {
	   answer = encrypt ( str );
           MyIO.println( answer );
        } //end se
    } //end repeticao 
  } //end main()
} //end class cifraDeCesar
