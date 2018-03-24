 /**
 * Dependencias
 */
import IO.*;


/**
 * Classe para tratar matriz de objetos.
 */

class Matriz
    extends MyError
    implements IMyError
{

   /**
    * Tratamento de erro
    */

   /**

    0. Nao ha' erro.
    1. Tabela vazia.
    2. Quantidade invalida.
    3. Arquivo invalido
    */

   /**
    * Implementacao obrigatoria de IMyError
    * @Override // anotacao para sobrepor metodo
    */

   public String getErrorMsg()
   {
      String txt = "[MyString]: ";
      switch (getError())
      {
         case 0:
            txt = txt+"No errors.";
            break;
         case 1:
            txt = txt+"Tabela vazia.";
            break;
         case 2:
            txt = txt+"Quantidade invalida.";
            break;
         case 3:
            txt = txt+"Arquivo invalido.";
         default:
            txt = txt+"Undefined error.";
            break;
      } //end switch()
      //retornar txt
      return( txt );
   } //end getErrorMsg()


   /**
    * Armazenador generico de dados
    */

   public Object [ ][ ] table;

   /**
    * Construtor padrao.
    */

   public Matriz()
   {
      table = null;
   } //end construtor padrao()

   /**
    * Construtor alternativo.
    */

   public Matriz (int lin, int col)
   {
      if(lin <= 0 || col <= 0)
      {
         System.out.println("ERRO: Quantidade invalida. ");
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         table = new Object[ lin ][ col ];
      } //end se
   } //end construtor alternativo()

   /**
    * Construtor alternativo 2.
    */

   public Matriz( int lin )
   {
      int col = 5;
   
      if( lin <= 0 )
      {
         System.out.println("ERRO: Quantidade invalida. ");
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         table = new Object[ lin ][ col ];
      } //end se
   } //end construtor alternativo 2()

   /**
    * Informar a quantidade de posicoes reservadas (linhas)
    */

   public int lines()
   {
      //definir dados
      int lin = 0;
   
      if(table != null)
      {
         lin = table.length;
      } //end
      //retornar linhas
      return( lin );
   } //end lines()

   /**
    * Informar a quantidade de posicoes reservadas (colunas)
    */

   public int columns()
   {
      //definir dados
      int col = 0;
   
      if(table != null)
      {
         col = table[0].length;
      } //end
      //retornar colunas
      return( col );
   } //end columns()

   /**
    * Exibir dados em matriz.
    */

   public void printMatrix()
   {
      //definir dados
      int i, j;
      int lin, col;
   
      //identificar
      System.out.println();
   
      //testar se a matriz foi montada
      if( table == null )
      {
         System.out.println("ERRO: Matriz vazia.");
         setError(1);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         //obter dimensoes da matriz
         lin = lines();
         col = columns();
      
         //mostrar matriz
         System.out.println("Matriz com "+lin+"x"+col+" posicoes:");
      
         //repetir para cada posicao da matriz
         for (i = 0; i < lin; i++)
         {
            for(j = 0; j < col; j++)
            {
               //mostrar o valor armazenado
               System.out.print("\t"+table[ i ][ j ]);
            } //end repetir
            System.out.println();
         } //end repetir
      } //end se
   } //end printMatriz()

   /**
    * Ler valores do teclado e guardar em uma matriz.
    */

   public void readMatriz()
   {
      //definir dados
      int i;
      int lin, col;
      String linha;
   
      //obter dimensoes
      lin = lines();
      col = columns();
   
      //testar se quantidade valida
      if( lin <= 0 || col <= 0 )
      {
         System.out.println("ERRO: Tamanho invalido. ");
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         //obter o tamanho da matriz
         lin = this.lines();
         col = this.columns();
      
         //repetir para cada posicao da matriz
         for(i = 0; i < lin; i++)
         {
            //ler no teclado
            linha = IO.readln("Nome: ");
            //armazenar na tabela
            table[ i ][ 0 ] = linha;
            //ler endereco
            linha = IO.readln("Endereco: ");
            //armazenar na tabela
            table[ i ][ 1 ] = linha;
            //ler aniversario
            linha = IO.readln("Aniversario: ");
            //armazenar na tabela
            table[ i ][ 2 ] = linha;
            //ler telefones
            linha = IO.readln("Telefones: ");
            //armazenar na tabela
            table[ i ][ 3 ] = linha;
            //ler numeros
            linha = IO.readln("Numeros: ");
            //armazenar na tabela
            table[ i ][ 4 ] = linha;
         } //end repetir
      } //end se
   } //end readMatriz()

   /**
    * Metodo para ler dados de arquivo e
    * armazenar em matriz.
    * @param nameFile - arquivo que sera lido
    */

   public void fromFile( String nameFile )
   {
      //definir dados
      int i, j;
      int sizeL;
      int sizeC;
      FILE arquivo;
   
      //obter dimensoes
      sizeL = lines(); 
      sizeC = columns();  
      //verificar se quantidade e' valida
      if( sizeL <= 0 || sizeC <= 0 )
      {
         System.out.println("ERRO: Quantidade invalida. ");
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         //abrir arquivo para leitura
         arquivo = new FILE (FILE.INPUT, nameFile);
      
         //verificar se o arquivo e' valido
         if( arquivo == null )
         {
            System.out.println("ERRO: Arquivo invalido. ");
            setError(3);
            System.out.println(getErrorMsg());
         } //end
         else
         {
            for(i = 0; i < sizeL; i++)
            {
               for(j = 0; j < sizeC; j++)
               {
                  table[ i ][ j ] = arquivo.readln();
               } //end repetir
            } //end repetir
            //fechar arquivo (indispensavel)
            arquivo.close();
         } //end se
      } //end se
   } //end fromFile()





   /**
    * Metodo para gravar dados de matriz em arquivo.
    * @param nameFile - nome do arquivo que sera passado
    */

   public void toFile( String nameFile )
   {
      //definir dados
      int i, j;
      int sizeL;
      int sizeC;
      FILE arquivo;
   
      //obter dimensoes
      sizeL = lines();
      sizeC = columns();
   
      //verificar se quantidade e' valida
      if( sizeL <= 0 || sizeC <= 0 )
      {
         System.out.println("ERRO: Quantidade invalida. ");
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         //abrir arquivo para gravar
         arquivo = new FILE (FILE.OUTPUT, nameFile);
      
         //verificar se o arquivo e' valido
         if( arquivo == null )
         {
            System.out.println("ERRO: Arquivo invalido. ");
            setError(3);
            System.out.println(getErrorMsg());
         } //end
         else
         {
            for( i = 0; i < sizeL; i++ )
            {
               for ( j = 0; j < sizeC; j++ )
               {
                  arquivo.println(""+table[ i ][ j ]);
               } //end repetir
            } //end repetir
            //fechar arquivo (indispensavel)
            arquivo.close();
         } //end se
      } //end se
   } //end toFile()

   /**
    * Metodo para procurar telefone de certa
    * pessoa dado o nome completo dessa pessoa.
    */

   public void findFone()
   {
      //definir dados
      int i;
      int lin;
      int col;
      int Error = 0;
      String linha;
   
      //obter dimensoes
      lin = lines();
      col = columns();
   
      //ler do teclado o nome que deseja procurar
      linha = IO.readln("Digite o nome: ");
   
      //verificar se quantidade e' valida
      if( lin <= 0 || col <= 0 )
      {
         System.out.println("ERRO: Quantidade invalida. ");
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         for(i = 0; i < lin; i++)
         {
            if(linha.equals(table[ i ][ 0 ]))
            {
               System.out.println("Telefone: " + table[ i ][ 4]);
               i += lin;
               Error = 1;
            } //end
         } //end repetir
         if(Error == 0)
         {
            System.out.println("ERRO: Nome nao encontrado. ");
         } //end
      } //end se
   } //end findFone()

   /**
    * Funcao para pegar o mes.
    */

   public int getMonth( int lin )
   {
      //definir dados
      int month = 0, size;
      String cadeia;
      String aux;
      cadeia = "" + table[ lin ][ 2 ];
      size   = cadeia.length();
   
      if(size != 8)
      {
         System.out.println("ERRO: Data invalida. ");
      } //end
      else
      {
         aux   = "" + cadeia.charAt(3) + cadeia.charAt(4);
         month = IO.getint(aux);
      } //end se
      //retornar mes
      return( month );
   } //end getMonth()

   /**
    * Funcao para pegar o dia.
    */

   public int getDay( int lin )
   {
      //definir dados
      String cadeia;
      String aux;
      int day = 0, size;
      cadeia = "" + table[ lin ][ 2 ];
      size   = cadeia.length();
   
      if(size != 8)
      {
         System.out.println("ERRO: Data invalida. ");
      } //end
      else
      {
         aux = "" + cadeia.charAt(0) + cadeia.charAt(1);
         day = IO.getint(lin);
      } //end se
      //retornar dia
      return( day );
   } //end getDay()

   /**
    * Metodo para procurar pessoas em certo mes.
    */

   public void findForMonth()
   {
      //definir dados
      int month;
      int i, lin, col;
   
      //ler do teclado o mes desejado
      month = IO.readint("Digite qual mes deseja: ");
   
      //obter dimensoes
      lin = lines();
      col = columns();
   
      //verificar se quantidade e' valida
      if( lin <= 0 || col <= 0 )
      {
         System.out.println("ERRO: Quantidade invalida. ");
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         //pecorrer pelas linhas
         for(i = 0; i < lin; i++)
         {
            if( month == this.getMonth(i))
            {
               System.out.println("Nome: "+ table[ i ][ 0 ]);
            } //end
         } //end repetir
      } //end se
   } //end findForMonth()

   /**
    * Funcao para comparar - compareTo
    */

   public int compareToString(String s1, String s2)
   {
      //definir dados
      int compare;
      int answer;
   
      //comparar s1 e s2
      compare = s1.compareTo(s2);
   
      if(compare < 0)
      {
         answer = -1;
      } //end
      else
      {
         if(compare > 0)
         {
            answer = 1;
         } //end
         else
         {
            answer = 0;
         } //end se
      } //end se
      //retornar resposta
      return( answer );
   } //end compareToString()

   public boolean Alfabetica()
   {
      //definir dados
      int size;
      int i = 0;
      String value = "";
      boolean answer = true;
      size = table.length;
   
      while(i < size)
      {
         if(i == 0)
         {
            value = "" + table[ i ][ 0 ];
         } //end
         else
         {
            if(compareToString(value, ("" + table[ i ][ 0 ])) == 1)
            {
               answer = false;
               i += size;
            } //end
            else
            {
               value = "" + table[ i ][ 0 ];
            } //end se
         } //end se
         i++;
      } //end repetir
      //retornar resposta
      return( answer );
   } //end Alfabetica()

   /**
    * Metodo para ordenar nomes em ordem alfabetica.
    */

   public void ordenarAlbetica()
   {
      //definir dados
      int i;
      int lin, col;
      String ordenar;
   
      //obter dimensoes
      lin = lines();
      col = columns();
   
      //verificar se quantidade e' valida
      if( lin <= 0 || col <= 0 )
      {
         System.out.println("ERRO: Quantidade invalida. ");
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         while(!this.Alfabetica())
         {
            for(i = 1; i < lin; i++)
            {
               if(compareToString(("" + table[ i ][ 0 ]),
                      (""+ table[ i - 1 ][ 0 ])) == -1)
               {
                  ordenar = "" + table[ i - 1 ][ 0 ];
                  table[ i - 1 ][ 0 ] = table[ i ][ 0 ];
                  table[ i ][ 0 ] = ordenar;
               
                  ordenar = "" + table[ i - 1 ][ 1 ];
                  table[ i - 1 ][ 1 ] = table[ i ][ 1 ];
                  table[ i ][ 1 ] = ordenar;
               
                  ordenar = "" + table[ i - 1 ][ 2 ];
                  table[ i - 1 ][ 2 ] = table[ i ][ 2 ];
                  table[ i ][ 2 ] = ordenar;
               
                  ordenar = "" + table[ i - 1 ][ 3 ];
                  table[ i - 1 ][ 3 ] = table[ i ][ 3 ];
                  table[ i ][ 3 ] = ordenar;
               
                  ordenar = "" + table[ i - 1 ][ 4 ];
                  table[ i - 1 ][ 4 ] = table[ i ][ 4 ];
                  table[ i ][ 4 ] = ordenar;
               } //end
            } //end repetir
         } //end repetir
      } //end se
   } //end ordenarAlfabetica()

   public boolean Aniversario()
   {
      //definir dados
      int size;
      int i          = 0;
      double value   = 0.0;
      boolean answer = true;
      size = table.length;
   
      while (i < size)
      {
         if(i == 0)
         {
            value = getMonth(i)+ 1.0*getDay(i)/100;
         } //end
         else
         {
            if(value > (getMonth(i)+ 1.0*getDay(i)/100))
            {
               answer = false;
               i += size;
            } //end
            else
            {
               value = getMonth(i)+ 1.0*getDay(i)/100;
            } //end se
         } //end se
         i++;
      } //end repetir
      //retornar resposta
      return( answer );
   } //end Aniversario()

   /**
    * Metodo para ordenar pela ordem das datas de aniversario.
    */

   public void ordenarAniversario()
   {
      //definir dados
      String ordenar;
      int i;
      int lin, col;
      double x, y;
   
      //obter dimensoes
      lin = lines();
      col = columns();
   
      //verificar se quantidade e' valida
      if( lin <= 0 || col <= 0 )
      {
         System.out.println("ERRO: Quantidade invalida. ");
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         while(!this.Aniversario())
         {
            for(i = 1; i < lin; i++)
            {
               x = getMonth(i - 1)+ 1.0*getDay(i - 1)/100;
               y = getMonth(i) + 1.0*getDay(i)/100;
            
               if(x > y)
               {
                  ordenar = "" + table[ i - 1 ][ 0 ];
                  table[ i - 1 ][ 0 ] = table[ i ][ 0 ];
                  table[ i ][ 0 ] = ordenar;
               
                  ordenar = "" + table[ i - 1 ][ 1 ];
                  table[ i - 1 ][ 1 ] = table[ i ][ 1 ];
                  table[ i ][ 1 ] = ordenar;
               
                  ordenar = "" + table[ i - 1 ][ 2 ];
                  table[ i - 1 ][ 2 ] = table[ i ][ 2 ];
                  table[ i ][ 2 ] = ordenar;
               
                  ordenar = "" + table[ i - 1 ][ 3 ];
                  table[ i - 1 ][ 3 ] = table[ i ][ 3 ];
                  table[ i ][ 3 ] = ordenar;
               
                  ordenar = "" + table[ i - 1 ][ 4 ];
                  table[ i - 1 ][ 4 ] = table[ i ][ 4 ];
                  table[ i ][ 4 ] = ordenar;
               } //end
            } //end repetir
         } //end repetir
      } //end se
   } //end ordenarAniversario()

   /**
    * Funcao para procurar pessoa.
    * @return - resposta
    */

   public int findPeople( String name )
   {
      //definir dados
      int i;
      int answer = - 1;
      int lin;
   
      //obter dimensao
      lin = lines();
   
      //verificar se quantidade e' valida
      if( lin <= 0 )
      {
         System.out.println("ERRO: Quantidade invalida. ");
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         for(i = 0; i < lin; i++)
         {
            if(name.equals(table[ i ][ 0 ]))
            {
               answer = i;
               i += lin;
            } //end
         } //end repetir
      } //end se
      //retornar resposta
      return ( answer );
   } //end findPeople()

   /**
    * Metodo para mudar informacoes.
    */

   public void changeInfo()
   {
      //definir dados
      int aux;
      String option = "";
      String nome;
   
      //ler do teclado o nome
      nome = IO.readln("Digite o nome: ");
   
      //chamar function
      aux = findPeople(nome);
   
      //verificar
      if( aux < 0 )
      {
         System.out.println("ERRO: Nome nao foi encontrado. ");
      } //end
      else
      {
         option = IO.readln("Informe o que deseja alterar: ");
      
         if(option.equals("nome"))
         {
            table[ aux ][ 0 ] = IO.readln("Nome: ");
         } //end
         if(option.equals("endereco"))
         {
            table[ aux ][ 1 ] = IO.readln("Endereco: ");
         } //end
         if(option.equals("aniversario"))
         {
            table[ aux ][ 2 ] = IO.readln("Aniversario: ");
         } //end
         if(option.equals("telefones"))
         {
            table[ aux ][ 3 ] = IO.readln("Telefones: ");
         } //end
         if(option.equals("numeros"))
         {
            table[ aux ][ 4 ] = IO.readln("Numero(s): ");
         } //end
      } //end se
   } //end changeInfo()

   /**
    * Metodo para inserir informacoes.
    */

   public Matriz inserirInfo()
   {
      //definir dados
      int i, j;
      int lin, col;
      String linha;
      Matriz m2 = null;
   
      //obter dimensoes
      lin = lines() + 1;
      col = columns();
   
      //verificar se quantidade e' valida
      if( lin <= 0 || col <= 0 )
      {
         System.out.println("ERRO: Quantidade invalida. ");
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         //criar m2
         m2 = new Matriz (lin);
      
         //verificar se m2 e' valido
         if(m2 == null)
         {
            System.out.println("ERRO: Matriz m2 e' invalida. ");
            setError(1);
            System.out.println(getErrorMsg());
         } //end
         else
         {
            for(i = 0; i < lin - 1; i++)
            {
               for(j = 0; j < col; j++)
               {
                  m2.table[ i ][ j ] = table[ i ][ j ];
               } //end repetir
            } //end repetir
            linha = IO.readln("Nome: ");
            m2.table[ lin - 1 ][ 0 ] = linha;
         
            linha = IO.readln("Endereco: ");
            m2.table[ lin - 1 ][ 1 ] = linha;
         
            linha = IO.readln("Aniversario: ");
            m2.table[ lin - 1 ][ 2 ] = linha;
         
            linha = IO.readln("Telefones: ");
            m2.table[ lin - 1 ][ 3 ] = linha;
         
            linha = IO.readln("Numeros: ");
            m2.table[ lin - 1 ][ 4 ] = linha;
         } //end se
      } //end se
      //retornar m2
      return( m2 );
   } //end inserirInfo()

   /**
    * Metodo para remover informacoes.
    */

   public Matriz removeInfo()
   {
      //definir dados
      int i, j, x = 0;
      int lin, col;
      int find;
      Matriz m2 = null;
      String pessoa = "";
   
      //ler do teclado o nome da pessoa
      pessoa = IO.readln("Informe o nome da pessoa: ");
   
      //obter dimensoes
      lin = lines();
      col = columns();
   
      //verificar se quantidade e' valida
      if( lin <= 0 || col <= 0 )
      {
         System.out.println("ERRO: Quantidade invalida. ");
         setError(2);
         System.out.println(getErrorMsg());
      } //end
      else
      {
         //procurar pessoa
         find = findPeople(pessoa);
         if(find < 0)
         {
            System.out.println("ERRO: Pessoa nao foi encontrada. ");
         } //end
         else
         {
            lin = lin - 1;
         } //end se
         //criar m2
         m2 = new Matriz(lin);
      
         //verificar se m2 e' valida
         if(m2 == null)
         {
            System.out.println("ERRO: Matriz m2 e' invalida. ");
            setError(1);
            System.out.println(getErrorMsg());
         } //end
         else
         {
            for(i = 0; i < lin; i++)
            {
               if( i != find )
               {
                  for(j = 0; j < col; j++)
                  {
                     m2.table[ x ][ j ] = table[ i ][ j ];
                  } //end repetir
                  x++;
               } //end
            } //end repetir
         } //end se
      } //end se
      //retornar m2
      return( m2 );
   } //end removeInfo()
} //end class

