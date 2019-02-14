import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

class PesquisaObjetos {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//Define o nome do arquivo a ser trabalhado		
		System.out.print("Informe o nome do Arquivo a ser pesquisado: ");
		String nomeArquivo = Teclado.readLine();
		
		int numRegPesquisados = 0;

		try {

			//Objetos utilizados na manipula��o do arquivo e seus dados			
			FileInputStream arqEntrada = new FileInputStream(nomeArquivo);
			ObjectInputStream entrada = new ObjectInputStream(arqEntrada);
			
			System.out.print("Digite o nome da Empresa a ser pesquisada: ");
			String nome = Teclado.readLine();

			//Realiza a pesquisa no arquivo			
			while (arqEntrada.available() != 0) {
				
				Empresa empr = (Empresa) entrada.readObject();
				
				//empr.getClass().getMethod("get" + "Nome",  );
				
				numRegPesquisados++;
				if(empr.getNome().startsWith(nome) ) {
					System.out.println(empr);
					break;
				} //end if
			} //end while
			System.out.println("Registro encontrado!\n");
			
		} //end try
		catch(FileNotFoundException e) {
			System.out.println("O Arquivo informado n�o existe.\n" + e.toString());
		} //end catch
		catch(EOFException e) {
			System.out.println("Registro nao encontrado!\n");
		} //end catch

		System.out.println("Num. Registros Pesquisados: " + numRegPesquisados);
	} //end main()
} //end PesquisaObjetos()