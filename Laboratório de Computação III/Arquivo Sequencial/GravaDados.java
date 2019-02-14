import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class GravaDados {

	private static Scanner in = new Scanner(System.in);

	public static String getStringTamanhoFixo(String texto, int tamanho) {
		StringBuffer s1 = new StringBuffer(texto);
		s1.setLength(tamanho);
		return s1.toString();
	} //end getStringTamanhoFixo()

	/**
	 * Funcao responsavel por fazer o backup dos dados
	 * @param arquivo - arquivo original
	 * @param copy - backup do arquivo original
	 * @throws IOException
	 */

	public static void backup(String arquivo, String copy) throws IOException {
		if (arquivo != null) {
			FileInputStream file = new FileInputStream(arquivo);
			DataInputStream entrada = new DataInputStream(file);
			FileOutputStream backup = new FileOutputStream(copy);
			PrintStream saida = new PrintStream(backup);

			while (entrada.available() != 0) {
				String line = entrada.readLine();;
				saida.println(line);
			} // end while
			saida.flush();
			saida.close();
			backup.close();
		} else {
			System.out.println("ERRO: Arquivo invalido.");
		}//end else
	}// end backup()

	public static void main(String[] args) {

		try {
			// Define o nome do arquivo a ser trabalhado
			System.out.print("Informe o nome do Arquivo a ser gravado: ");
			String nomeArquivo = Teclado.readLine();

			// Objetos utilizados na manipulacao do arquivo e seus dados
			FileOutputStream arqSaida = new FileOutputStream(nomeArquivo);
			PrintStream saida = new PrintStream(arqSaida);

			System.out.print("Informe o numero de registros a serem gravados: ");
			int numRegistros = Teclado.readInt();

			// Adiciona os registros desejados
			for (int i = 0; i < numRegistros; i++) {
				System.out.print("Informe o codigo do Veiculo: ");
				int codigo = Teclado.readInt();

				System.out.print("Nome Veiculo: ");
				String nomeVeiculo = Teclado.readLine();

				String linha = codigo + " " + nomeVeiculo;
				saida.println(linha);
			}//end for
			
			saida.flush();
			saida.close();
			arqSaida.close();

			System.out.println("Deseja fazer backup do arquivo? (Y/N)");
			char answer = in.next().toLowerCase().charAt(0);

			if (answer == 'y') {
				System.out.print("Informe o nome do Arquivo a ser gravado: ");
				String nomeBackup = Teclado.readLine();
				backup (nomeArquivo, nomeBackup);
			} else {
				System.out.println("Warning: Backup nao sera realizado!");
			} // end else

			System.out.println("Dados Gravados com sucesso");

		} catch (Exception e) { // Tratamento gen�rico da excess�o ocorrida
			System.out.println("O seguinte erro ocorreu: " + e.toString());
		}//end try 
	}//end main 
}//end class GravaDados()
