public class TP01Q06_Is extends MyIO {

    /* Funcao responsavel por verificar se uma cadeia existe somente vogais 
     * @param cadeia - string a ser analisada 
     * @return - true se for vogal, caso contrario false.
     */

    public static boolean isVogal(String cadeia ) {
        boolean answer = true;

        /* verifica se o caractere e' uma vogal */
        for( int i = 0; i < cadeia.length(); i++ ) {
            if (    cadeia.charAt(i) == 'a' || cadeia.charAt(i) == 'A' ||
                    cadeia.charAt(i) == 'e' || cadeia.charAt(i) == 'E' ||
                    cadeia.charAt(i) == 'i' || cadeia.charAt(i) == 'I' ||
                    cadeia.charAt(i) == 'o' || cadeia.charAt(i) == 'O' ||
                    cadeia.charAt(i) == 'u' || cadeia.charAt(i) == 'U') {

                answer = true;
            } //end se
            else {
                answer = false;
                i = cadeia.length();
            } //end else
        }// end repeticao
        return(answer);
    } //end isVogal()

    /* Funcao responsavel por verificar se na cadeia existe somente consoantes 
     * @param cadeia - string a ser analisada 
     * @return - true se for consoante, caso contrario false
     */

    public static boolean isConsoante( String cadeia ) {

        boolean answer = true;

        for( int i = 0; i < cadeia.length(); i++ ) {
            if((    cadeia.charAt(i) == 'a' || cadeia.charAt(i) == 'A' ||
                    cadeia.charAt(i) == 'e' || cadeia.charAt(i) == 'E' ||
                    cadeia.charAt(i) == 'i' || cadeia.charAt(i) == 'I' ||
                    cadeia.charAt(i) == 'o' || cadeia.charAt(i) == 'O' ||
                    cadeia.charAt(i) == 'u' || cadeia.charAt(i) == 'U')||
                 !((cadeia.charAt(i) >= 'A' && cadeia.charAt(i) <= 'Z')|| 
                   (cadeia.charAt(i) >= 'a' && cadeia.charAt(i) <= 'z'))) {

                answer = false;
                i = cadeia.length();
            } //end se
            else {
                answer = true;
            } //end else
        } //end repetir
        return (answer);
    } //end isConsoante();

    /* Funcao responsavel por verificar se na cadeia existe somente numeros inteiros 
     * @param cadeia - string a ser analisada 
     * @return - true se for somente int, caso contrario false.
     */

    public static boolean isNumero ( String cadeia ) {

        boolean answer = false;

        for( int i = 0; i < cadeia.length(); i++ ) {
            if(cadeia.charAt(i) >= '0' && cadeia.charAt(i) <= '9') {
                answer = true;
            } //end se
            else {
                answer = false;
                i = cadeia.length();
            } //end se
        } //end repeticao
        return ( answer );
    } //end isNumero()
    
    /* Funcao que verifica se na cadeia existe somente numeros reais 
     * @param cadeia - string a ser analisada 
     * @return - retorna true se for somente real, caso contrario false.
     */

    public static boolean isReal( String cadeia ) {

        boolean answer = false;
        int count = 0;

        for( int i = 0; i < cadeia.length(); i++ ) {
            if( count <= 1 ) {
                if(cadeia.charAt(i) == ',' || cadeia.charAt(i) == '.' ) {
                    count++;
                } //end se

                if((cadeia.charAt(i) >= '0' && cadeia.charAt(i) <= '9') ||
                    cadeia.charAt(i) == '.' || cadeia.charAt(i) == ',' ){
                   
		    answer = true;
                } //end se
                else {
                    answer = false;
                    i = cadeia.length();
                } //end se
            } //end se
            else {
                answer = false;
            } //end else
        } //end repeticao
        return ( answer );
    } //end isReal()

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

    /* Metodo principal - responsavel por verificar todas as funcoes */

    public static void main ( String [ ] args )
    {
        boolean vogal      = true;
        boolean numero     = true;
        boolean consoante  = true;
        boolean real	   = true;
        String  in         = "";

        while ( !isEquals ( in, "FIM" ))
        {
            in = MyIO.readLine ( );
            if (!isEquals ( in, "FIM" ))
            {
                vogal = isVogal ( in );
                if ( vogal )
                {
                    MyIO.println ( "SIM " + "NAO " + "NAO " + "NAO" );
                }//end se
                else
                {
                    consoante = isConsoante ( in );
                    if ( consoante )
                    {
                        MyIO.println ( "NAO " + "SIM " + "NAO " + "NAO" );
                    }//end se
                    else
                    {
                        numero = isNumero ( in );
                        real   = isReal ( in );
                        if ( numero )
                        {
                            if ( numero  && real )
                            {
                                MyIO.println ( "NAO " + "NAO " + "SIM " + "SIM" );
                            }//end se
                            else
                            {
                                MyIO.println ( "NAO " + "NAO " + "SIM " + "NAO" );
                            }//end else
                        }//end se
                        else
                        {
                            real = isReal ( in );

                            if ( real )
                            {
                                if ( numero && real )
                                {
                                    MyIO.println ( "NAO " + "NAO " + "SIM " + "SIM" );
                                }//end se
                                else
                                {
                                    MyIO.println ( "NAO " + "NAO " + "NAO " + "SIM" );
                                }//end else
                            }//end if
                            else
                            {
                                MyIO.println ( "NAO " + "NAO " + "NAO " + "NAO" );
                            }//end else
                        }//end else
                    }//end else
                }//end else
            }//end if
        }//end repetition
    }//end main ( )
} //end class TP01Q06_Is

