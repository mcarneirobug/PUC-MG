import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.*;

public class GravaObjetos {

	private static Scanner in = new Scanner (System.in);

	/**
	 * Funcao responsavel por fazer o backup dos dados
	 * @param arquivo - arquivo original
	 * @param copy - backup do arquivo original
	 * @throws IOException
	 */

	public static void backup(String arquivo, String copy) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(arquivo);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		FileOutputStream fileOutputStream = new FileOutputStream(copy);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		while(fileInputStream.available() != 0) {
			Empresa empr = (Empresa) objectInputStream.readObject();
			objectOutputStream.writeObject(empr);
			objectOutputStream.flush();
		} //end while
		objectInputStream.close();
		objectOutputStream.close();
		fileInputStream.close();
	} //end backup()

	public static void main(String[] args) {
		
		try {
			
			//Define o nome do arquivo a ser trabalhado		
			System.out.print("Informe o nome do arquivo a ser gravado: ");
			String nomeArquivo = Teclado.readLine();

			//Objetos utilizados na manipulacao do arquivo e seus dados

			//Gera o arquivo para armazenar o objeto
			FileOutputStream arqSaida = new FileOutputStream(nomeArquivo);

			//Classe responsavel por inserir os objetos
			ObjectOutputStream saida = new ObjectOutputStream(arqSaida);
			
			System.out.print("Informe o numero de registros a serem gravados: ");
			int numRegistros = Teclado.readInt();			

			//Adiciona os registros desejados
			for(int i=0;i<numRegistros;i++) {
				System.out.print("Informe o codigo da Pessoa: ");
				int codigo = Teclado.readInt();
				
				System.out.print("Informe o nome da Pessoa: ");
				String nomeEmpresa = Teclado.readLine();
				
				Empresa e = new Empresa(codigo, nomeEmpresa);
				//grava o objeto empresa no arquivo
				saida.writeObject(e);	
			} //end for

			System.out.println("Deseja fazer backup do arquivo? (Y/N)");
			char answer = in.next().toLowerCase().charAt(0);

			if (answer == 'y') {
				System.out.print("Informe o nome do Arquivo a ser gravado: ");
				String nomeBackup = Teclado.readLine();
				backup (nomeArquivo, nomeBackup);
			} else {
				System.out.println("Warning: Backup nao sera realizado!");
			} // end else
			//Finaliza��o da manipula��o dos dados no arquivo			
			saida.flush();
			saida.close();
			arqSaida.close();
			
			System.out.println("Dados Gravados com sucesso");			
			
		} //end try
		catch(FileNotFoundException e) {
			System.out.println("O Arquivo informado nao existe.\n" + e.toString());
		} //end catch
		catch(IOException e) {
			System.out.println("O seguinte erro de I/O ocorreu:\n" + e.toString());
		} //end catch
		catch(Exception e) { //Tratamento gen�rico da excess�o ocorrida
			System.out.println("O seguinte erro ocorreu: " + e.toString());
		} //end catch
	} //end main()
}//end class GravaObjetos()
