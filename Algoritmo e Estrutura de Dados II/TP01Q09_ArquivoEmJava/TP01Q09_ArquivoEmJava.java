import java.io.*;

public class TP01Q09_ArquivoEmJava extends MyIO {
    
    static long x; 	
    /* arquivo que sera manipulado */
    private static RandomAccessFile file;
   
    /* Funcao responsavel por ler no arquivo e 
       retornar o valor de n valores a serem lidos e salvos */
    public static int readFile () throws IOException {

        file = new RandomAccessFile("in.txt", "rw"); //parametro rw, (leitura, escrita)
        double in; 
        int n = MyIO.readInt(), i; 
        for(i = 0; i < n; i++) {
            in = MyIO.readDouble(); 
            file.writeDouble(in); //escreve os valores reais no arquivo txt
        } //end repeticao
	x = file.getFilePointer() - 8;
        file.close();
        return( n );
    } //end readFile()

    /* Metodo responsavel por printar inverso */

    public static void printFile (int n) throws IOException { //tratamento de excessoes na instanciacao

        file = new RandomAccessFile("in.txt", "r"); 
        double in; //8 bytes
        int i;
        for (i = 0; i < n; i++) {
            file.seek(x); 
            in = file.readDouble();
            if(in == (int) in) {
                MyIO.println((int)in);
            } //end se
            else {
                MyIO.println(in);
            } //end else
	    x = x - 8; //a cada interacao subtrai 8 bytes
        } //end repeticao
        file.close();
    } //end printFile()
    
    public static void main(String [] args) {
        try {
            int in = readFile();
            printFile(in);
        } catch (IOException e) {
            System.exit(0);
        }
    } //end main()
} //end class ArquivoEmJava()

