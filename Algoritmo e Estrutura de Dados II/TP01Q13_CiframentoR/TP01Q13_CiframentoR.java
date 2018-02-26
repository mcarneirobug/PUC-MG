public class TP01Q13_CiframentoR extends MyIO {
 
  /* Funcao responsavel por modicar o caractere de acordo
     com o valor da chave de encriptacao baseando-se na tabela
     ascii  */  
  public static String encrypt( String cifra, int i ) {

	int key = 3; 
   	int armazenador; 
   	String answer = "";
 
   	if( i < cifra.length() ) { 
	   armazenador = ((int) cifra.charAt(i)) + key; 

	   if( i != cifra.length()-1 ) {
	      answer += ((char) armazenador) + encrypt ( cifra, i+1 );
	   } //end se
           else {
	      answer += ((char) armazenador);
	   } //end else
        } //end se
	return (answer);
  } //end encrypt() 
     
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

  /* Metodo responsavel por executar as funcoes */

   public static void principal ( String cadeia ) {
     
     boolean equals = true;
     String answer = "";
     
     equals = isEquals ( cadeia, "FIM", 0);
     
     if ( equals != true ) { 
            answer = encrypt ( cadeia, 0 ); 
       	    MyIO.println( answer );
            cadeia = MyIO.readLine();
            principal( cadeia );
     } //end se
   } //end principal()

   public static void main( String [] args ) {
      String cadeia = MyIO.readLine();
      principal ( cadeia ); //chamada de todas funcoes
   } //end main()
} //end class TP01Q13_CiframentoR 
