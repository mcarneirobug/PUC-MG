public class TP01Q11_AquecimentoR extends MyIO {


	/* Funcao responsavel por contar quantas letras maiusculas tem
	 * a cadeia de caracteres. 
	 * @param cadeia - string a ser analisada
         * @param aux    - variador auxiliar 
         * @param count  - contador de maiusculas
         * @return - quantidade de maiusculas
	 */
	
	public static int countM ( String cadeia, int aux, int count ) {
	int out = 0;

	if ( aux < cadeia.length() ) {
	    if( cadeia.charAt(aux) >= 65 && cadeia.charAt(aux) <= 95 ) { //de acordo com a tabela ascii
		out += countM( cadeia, aux+1, count+1);
		out++; 
	    } //end se 
	    else {
		out += countM( cadeia, aux+1, count );
	    } //end se
	} //end se
	   return ( out );
	} //end countM()
	
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

   /* Metodo recursivo responsavel por chamar a funcao 
	contador e ser executada no main */
	
   public static void exec ( String cadeia ) {
	
	boolean equals = true;
	int in; 
	equals = isEquals( cadeia, "FIM", 0 );

           if( equals != true ) {
	      in = countM( cadeia, 0, 0 );
	      MyIO.println( in );
	      cadeia = MyIO.readLine();
	      exec( cadeia );
	   } //end se
   } //end exec()
 
   public static void main(String [] args) {
	String in = MyIO.readLine();
	exec( in );
   } //end main()
} //end class TP01Q11_AquecimentoR
