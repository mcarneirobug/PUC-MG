public class TP01Q12_PalindromoR extends MyIO {

    /* Funcao responsavel por retornar se duas strings sao iguais
     * @param a1, a2 - strings a serem comparadas
     * @param aux, o que vai variar
     * @return - true se forem iguals, false se forem diferentes.
     */

    public static boolean isEquals( String a1, String a2, int aux ) {

        boolean answer = true;

        if( a1.length() != a2.length() ) {
            answer = false;
        } //end se
        else {
            if( aux < a1.length() ) {
                if( a1.charAt(aux) == a2.charAt(aux) ) {
                    answer = isEquals ( a1, a2, aux+1 );
                } //end se
                else {
                    answer = false;
                } //end else
            } //end se
        } //end else
        return ( answer );
    } //end isEquals()

    /* Funcao responsavel para verificar se uma palavra e' palindromo
    * @param a1 - string a ser verificada
    * @param aux - auxiliar variante
    * @return - true, se for palindro, caso contrario false.
    */

    public static boolean isPalindromo ( String a1, int aux ) {

        boolean answer = true;
        if( aux < a1.length()/2 ) { //verificando ate a metade, se analisa as duas metades
            if( a1.charAt(aux) == a1.charAt(a1.length()-1 -aux)) {
                answer = isPalindromo( a1, aux+1 );
            } //end se
            else {
                answer = false;
            } //end else
        } //end se
        return ( answer );
    } //end isPalindromo()


    /* Metodo responsavel por executar as funcoes */

    public static void principal( String cadeia ) {
        boolean answer = true;
        boolean equals = true;

        equals = isEquals( cadeia, "FIM", 0 );
        if( !equals ) {
            answer = isPalindromo( cadeia, 0 );
            if( answer ) {
                MyIO.println("SIM");
            } //end se
            else {
                MyIO.println("NAO");
            } //end else
            cadeia = MyIO.readLine();
            principal ( cadeia );
        } //end se
    } //end principal()


    public static void main(String [] args) {
        String in = MyIO.readLine();
        principal ( in );
    } //end main()
} //end class TP01Q12_PalindromoR
