
public class TP01Q02_Palindromo extends MyIO {

  /*
     Funcao responsavel por testar se a cadeia de caracteres e' um palindromo.
     @param cadeia - palavra a ser testada se e' um palindromo.
     @return - retorna true se for palindromo, caso contrario false.
  */
  public static boolean isPalindromo ( String cadeia ) {
	int middle = cadeia.length( )/2;
        boolean answer = true;
        /* variando ate a metade da cadeia estamos verificando as duas 		   metades de uma vez */
	for (int i = 0; i < middle; i++)
	{
		
		if (cadeia.charAt(i) != cadeia.charAt(cadeia.length( )-1 -i)) 
	        {
		   answer = false;
		} //end se
	} //end repetir
	return (answer);
  } //end isPalindromo()

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

       if(count == tamanho)
       {
         answer = true;
       } else {
        answer = false;
      } //end else
    } //end else
     return (answer);
 } //end isEquals()

   public static void main(String [] args) {

      String str       = "";
      String cadeia    = "";
      boolean answer = true;

      while (!isEquals(str, "FIM")) 
      {
         str = MyIO.readLine(); 
         if ( !isEquals(str, "FIM"))
         {
	    answer = isPalindromo( str );
            if(answer)
            {
	      MyIO.println("SIM");
            } else {
	      MyIO.println("NAO");
            } //end else 
        } //end se
     } //end repetir
   } //end main
} //end class tp1
