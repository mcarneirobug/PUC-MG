import java.util.Random;

public class TP04Q14_AlteracaoAleatoriaR extends MyIO {
   private static Random gerador = new Random();

  /* Funcao responsavel por retornar se duas strings sao iguais 
    * @param a1, a2 - strings a serem comparadas
    * @param aux, o que vai variar 
    * @return - true se forem iguals, false se forem diferentes.
    */
   
   public static boolean isEquals( String a1, String a2, int aux ) {
	
	boolean answer = true;     
        if( a1.length() != a2.length() ) {
	   answer = false;
        } else {
	    if( aux < a1.length() ) {
		if( a1.charAt(aux) == a2.charAt(aux) ) {
		    answer = isEquals( a1, a2, aux+1 );
                } else {
		   answer = false;
		} //end se
	    } //end se 
        } //end se
	  return ( answer );
   } //end isEquals()

/* Funcao responsavel por gerar caracteres aleatorios e 
 * fazer a alteracao numa cadeia de caracteres 
*/
   public static String randomico ( String cadeia, int i,
				    char x, char y ) {
    String answer = "";
    int size = cadeia.length();

    if( i < size ) { //condicao de parada recursiva
	if( cadeia.charAt(i) == x ) {
	   answer += y + randomico ( cadeia, i+1, x, y );
        } else {
	   answer += cadeia.charAt(i) + randomico ( cadeia, i+1, x, y );
        } //end se
    } //end se
      return ( answer );
   } //end randomico()

 /* Metodo responsavel por executar todas as funcoes */

   public static void principal ( String cadeia ) {
     boolean equals = true;
     String answer  = "";

     //gerador de caracteres aleatorios
     char a1 = ((char) ('a' + (Math.abs(gerador.nextInt()) % 26)));
     char a2 = ((char) ('a' + (Math.abs(gerador.nextInt()) % 26)));

     equals = isEquals ( cadeia, "FIM", 0 );
     if( equals != true ) { //condicao de parada 
	answer = randomico ( cadeia, 0, a1, a2 );
        MyIO.println( answer );
        cadeia = MyIO.readLine();
        principal( cadeia );
     } //end se
   } //end principal()

  public static void main( String [] args ) {
     gerador.setSeed(4); 
     String answer = MyIO.readLine();
     principal ( answer );
  } //end main()
} //end class TP04Q14()
