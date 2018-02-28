import java.io.*;
import java.net.*;

public class teste01 extends MyIO {

    public static String getHTML( String endereco ) throws IOException {
        URL url;
        InputStream is = null;
        BufferedReader br;
        String answer = "", line;

        try {
            url = new URL(endereco);
            is = url.openStream(); //throws an IOException
            br = new BufferedReader (new InputStreamReader(is));

            while((line = br.readLine()) != null) {
                answer += line + "\n";
            } //end repeticao
        } //end tentiva
        catch (MalformedURLException mue) {
            mue.printStackTrace();
        } //end catch

        try {
            is.close();
        } //end tentativa
        catch(IOException ioe) {
            //tratar erro
            //ioe.printStackTrace();
        } //end catch
        return (answer);
    } // end getHtml()

    public static int[] tratamento( String cadeia ) {

        int [] answer = new int[1000];
        int count = 0;


        for(int i = 0; i < cadeia.length(); i++ ) {
            switch(cadeia.charAt(i)) {
                case 'a':
                    answer[0] += 1;
                    break;
                case 'e':
                    answer[1] += 1;
                    break;
                case 'i':
                    answer[2] += 1;
                    break;
                case 'o':
                    answer[3] += 1;
                    break;
                case 'u':
                    answer[4] += 1;
                    break;
                case 'á':
                    answer[5] += 1;
                    break;
                case 'é':
                    answer[6] += 1;
                    break;
                case 'í':
                    answer[7] += 1;
                    break;
                case 'ó':
                    answer[8] += 1; 
                    break;
                case 'ú':
                    answer[9] += 1;
                    break;
                case 'à':
                    answer[10] += 1; 
                    break;
                case 'è':
                    answer[11] += 1;
                    break;
                case 'ì':
                    answer[12] += 1;
                    break;
                case 'ò':
                    answer[13] += 1;
                    break;
                case 'ù':
                    answer[14] += 1;
                    break;
                case 'ã':
                    answer[15] += 1;
                    break;
                case 'õ':
                    answer[16] += 1;
                    break;
                case 'â':
                    answer[17] += 1;
                    break;
                case 'ê':
                    answer[18] += 1;
                    break;
                case 'î':
                    answer[19] += 1;
                    break;
                case 'ô':
                    answer[20] += 1;
                    break;
                case 'û':
                    answer[21] += 1;
                    break;
            } //end switch()
        } //end repeticao
        return( answer );
    } //end tratamento()


    public static int countCons( String cadeia ) {

        int count = 0;

        for(int i = 0; i < cadeia.length(); i++ ) {
            if(cadeia.charAt(i) >= 'a' && cadeia.charAt(i) <= 'z') { //||
                    //cadeia.charAt(i) >= 'A' && cadeia.charAt(i) <= 'Z')
                if((    cadeia.charAt(i) != 'a' && cadeia.charAt(i) != 'e'&&
                        cadeia.charAt(i) != 'i' && cadeia.charAt(i) != 'o'&&
                        cadeia.charAt(i) != 'u')) {
                    count++;
                } //end se
                else {
                    count = count;
                }
            } //end se
        } //end repetir
        return ( count );
    } //end countCons()

    public static int controle (String cadeia) {

        int count = 0;
        for (int i = 0; i < cadeia.length(); i++) {
            if (cadeia.charAt(i) == '<') {
                if(cadeia.charAt(i+1) == 'b') {
                    if(cadeia.charAt(i+2)== 'r') {
                        if(cadeia.charAt(i+3)== '>') {
                            count++;
                        }
                    }
                }
            }
        }
        return (count);
    } //end controle()

    public static int controler (String cadeia) {
        int count = 0;
        for (int i = 0; i < cadeia.length(); i++) {
            if (cadeia.charAt(i) == '<') {
                if(cadeia.charAt(i+1) == 't') {
                    if(cadeia.charAt(i+2) == 'a') {
                        if(cadeia.charAt(i+3) == 'b') {
                            if(cadeia.charAt(i+4)=='l') {
                                if(cadeia.charAt(i+5) == 'e'){                       if(cadeia.charAt(i+6) == '>')
                                {                                                                           count++;
                                }
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    /*
        Funcao responsavel por comparar duas strings 
        @param a1, a2 - strings a serem comparadas entrem si, se sao 		iguais.
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

    public static void main(String [] args) throws IOException {
        String endereco, html;
        int [] in = new int[1000];
        String nome = MyIO.readLine();
        int control = 0, control2 = 0;
        while(!isEquals(nome, "FIM")) {
            endereco = MyIO.readLine();
            html     = getHTML( endereco );
            control  = controler(html);
            control2 = controle (html);
            in = tratamento(html);
            //MyIO.print(("a"+"("+(in[0])-(1*control))+")"+" ");
            //MyIO.print(("e"+"("+(in[1])-(1*control))+")"+" ");
            MyIO.print("a"+"("+((in[0])-(1*control))+")"+" ");
            MyIO.print("e"+"("+((in[1])-(1*control))+")"+" ");
            MyIO.print("i"+"("+(in[2])+")"+" ");
            MyIO.print("o"+"("+(in[3])+")"+" ");
            MyIO.print("u"+"("+(in[4])+")"+" ");
            MyIO.print("\u00E1"+"("+(in[5])+")"+ " ");
            MyIO.print("\u00E9"+"("+(in[6])+")"+ " ");
            MyIO.print("\u00ED"+"("+(in[7])+")"+ " ");
            MyIO.print("\u00F3"+"("+(in[8])+")"+ " ");
            MyIO.print("\u00FA"+"("+(in[9])+")"+ " ");
            MyIO.print("\u00E0"+"("+(in[10])+")"+ " ");
            MyIO.print("\u00E8"+"("+(in[11])+")"+ " ");
            MyIO.print("\u00EC"+"("+(in[12])+")"+ " ");
            MyIO.print("\u00F2"+"("+(in[13])+")"+ " ");
            MyIO.print("\u00F9"+"("+(in[14])+")"+ " ");
            MyIO.print("\u00E3"+"("+(in[15])+")"+ " ");
            MyIO.print("\u00F5"+"("+(in[16])+")"+ " ");
            MyIO.print("\u00E2"+"("+(in[17])+")"+ " ");
            MyIO.print("\u00EA"+"("+(in[18])+")"+ " ");
            MyIO.print("\u00EE"+"("+(in[19])+")"+ " ");
            MyIO.print("\u00F4"+"("+(in[20])+")"+ " ");
            MyIO.print("\u00FB"+"("+(in[21])+")"+ " ");
            MyIO.print("consoante"+"("+((countCons(html))-(3*control))+")"+" ");
            MyIO.print("<br>"+"("+controle(html)+")"+" ");
            MyIO.print("<table>"+"("+controler(html)+")"+ " ");
            MyIO.print(nome+"\n");
            //
            nome = MyIO.readLine();
        } //end repeticao
    } //end main()
} //end teste
