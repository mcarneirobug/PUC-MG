import java.util.Random;
          
public class TP01Q04_AlteracaoAleatoria extends MyIO {
     private static Random gerador = new Random(); 
     /*
     * Funcao responsavel por comparar duas strings 
     * @param a1, a2 - strings a serem comparadas entrem si, se sao iguais.
     * @return - retorna true se forem iguais, caso contrario false.
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
   
  /*
   * @param cadeia - string que ira alterar uma letra
   * @return - string com letra aleatoria
  */
  public static String Randomico ( String cadeia ) {
  
  String answer = "";
  char x, y;
  int i = 0, size = cadeia.length();
  
  //gerador de letras aleatorias  
  x = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
  y = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));

  while( i < size ) { //condicao de parada 
    if( cadeia.charAt(i) == x ) {
       answer += y; 
    } else {
       answer += cadeia.charAt(i);
    } //end se
    i++;
  } //end repeticao
    return ( answer );
  } //end aleatory()
  
   public static void main( String [] args ) {
        
     String answer = "";
     String str    = "";
     gerador.setSeed(4);

     while(!isEquals(str, "FIM")) {
	str = MyIO.readLine();
        if(!isEquals(str, "FIM")) {
	   answer = Randomico ( str );
           MyIO.println( answer );
        } //end se
     } //end repetir
   } //end main()
} //end class TP01Q04_AlteracaoAleatoria()
