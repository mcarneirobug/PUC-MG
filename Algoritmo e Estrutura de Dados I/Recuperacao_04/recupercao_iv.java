import IO.*;
class recuperacao_iv extends Matriz
{
   public static void main ( String [ ] args )
   {
      int opcao = -1;
      int resposta = 2;
      // identificar
      IO.println ( "           Recuperacao IV " );
      IO.println ( "Autor: Matheus Santos Rosa Carneiro - 613414" );
      IO.println("                         ");
   
      // executar o metodo auxiliar
      Matriz tabela = new Matriz ( 5 );
      tabela.fromFile("tabela01.txt");
      
      while(opcao != 0)
      {
         IO.println("                         ");
         IO.println("         OPCOES:         ");
         IO.println("                         ");
         IO.println("1 - Encontrar telefone                       ");
         IO.println("2 - Pessoas que fazem aniversario por mes    ");
         IO.println("3 - Mostrar tabela de ordem alfabetica       ");
         IO.println("4 - Mostrar tabela na ordem de aniversarios  ");
         IO.println("5 - Gravar as informacoes em um arquivo texto");
         IO.println("6 - Ler informacoes gravadas em um arquivo   ");
         IO.println("7 - Alterar informacoes de uma pessoa        ");
         IO.println("8 - Inserir nova pessoa                      ");
         IO.println("9 - Remover uma pessoa                       ");
         IO.println("0 - Encerrar                                 ");
         IO.println("                         ");
         IO.println("                         ");
      
         opcao = IO.readint("OPCAO: ");
      
         switch(opcao)
         {
            case 0:
               { 
                  IO.println("Encerrado!!!");
                  break;
               }
            case 1:
               { 
                  tabela.findFone();
                  break;
               }
            case 2: 
               {
                  tabela.findForMonth();
                  break;
               }
            case 3: 
               {
                  tabela.ordenarAlbetica ();
                  tabela.printMatrix     ();
                  break;
               }
            case 4:
               { 
                  tabela.ordenarAniversario ();
                  tabela.printMatrix        ();
                  break;
               }
            case 5: 
               {
                  String nome_do_arquivo = IO.readString("Digite o nome do arquivo para salvar:");
                  tabela.toFile(nome_do_arquivo);
                  break;
               }
            case 6: 
               {
                  String nome_do_arquivo = IO.readString("Digite o nome do arquivo para carregar:");
                  tabela.fromFile(nome_do_arquivo);
                  break;
               }
            case 7:
               { 
                  tabela.changeInfo();
                  break;
               }
            case 8: 
               {
                  tabela = tabela.inserirInfo();
                  tabela.toFile("tabela01.txt");
                  break;
               }
            case 9:
               { 
                  tabela = tabela.removeInfo();
                  tabela.toFile("tabela01.txt");
                  break;
               }
            default:
               IO.println("Error opcao invalida!!!");
         }
      }
      // encerrar
      IO.pause ( "Apertar ENTER para terminar." );
   } // fim main( )
}// fim do recuperacao_iv