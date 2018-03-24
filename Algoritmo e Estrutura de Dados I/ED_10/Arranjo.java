import IO.*;

class Arranjo {

        /**
         * armazenador generico dos dados
         */
        public Object [ ] tabela;

        /**
         * construtor padrao
         */

        public Arranjo( )
        {
            tabela = null;
        } //end construtor padrao( )

        /**
         * construtor alternativo
         */

        public Arranjo( int tamanho )
        {
            //verificar se o tamanho e' valido
            if( tamanho <= 0 )
            {
                IO.println("ERRO: Ha' quantidade e' invalida. " );
            } //end
            else
            {
                tabela = new Object [ tamanho ];
            } //end se
        } //end construtor alternativo

        /**
         * informar a quantidade de posicoes reservadas.
         */

        public int length( )
        {
            //definir dados
            int tamanho = 0;

            //verificar se a tabela e' valida
            if( tabela != null )
            {
                tamanho = tabela.length;
            } //end
            //retornar tamanho
            return( tamanho );
        } //end length( )

        /**
         * ler valores inteiros e guardar na tabela
         */

        public void readIntArray( String message, int n )
        {
            //definir dados
            int posicao;
            int tamanho = length();
            String linha;

            //verificar se a quantidade e' valida
            if( tamanho <= 0 || n <= 0 || n > tamanho )
            {
                IO.println("ERRO: Ha' quantidade e' invalida.");
            } //end
            else //se a quantidade for valida
            {
                //mostrar mensagem antes de ler
                IO.println(message);
                //pecorrer para cada posicao na tabela
                for(posicao = 0; posicao < n; posicao++)
                {
                    //ler linha do teclado
                    linha = IO.readln();

                    //armazena em uma posicao da tabela
                    tabela[ posicao ] = IO.getint(linha);
                } //end repetir
            } //end se
        } //end readIntArray( )

         /**
           * Exibir valores na tabela
           */

        public void printIntArray( int n )
        {
            //definir dados
            int posicao;
            int tamanho = length();

            //verificar se a tabela foi montada
            if (tabela == null || n <= 0 || n > tamanho)
            {
                IO.println("ERRO: Tabela nula ou quantidade invalida. ");
            } //end
            else
            {
                IO.println( );
                IO.println("Tabela com "+ "["+ tamanho +"]"+ " posicoes: ");
                IO.println( );
                //pecorre para cada posicao na tabela
                for(posicao = 0; posicao < n; posicao++)
                {
                    IO.println("Posicao: " + (posicao + 1) + " tem valor: " + "["+tabela[ posicao ]+"]");
                } //end repetir
            } //end se
        } //end printIntArray( )

        /**
        * Armazenar dados no arranjo a partir do teclado
        */

        public void store ( int tamanho, int i )
        {
            //definir dados
            int posicao;

            //verificar se a posicao e' valida
            if( i < 0 || i >= tamanho )
            {
                IO.println("ERRO: Ha' posicao e' invalida. " );
            } //end se
            else //se a posicao for valida
            {
                //verificar se o tamanho e' valido
                if( tamanho <= 0 )
                {
                    IO.println("ERRO: Tamanho invalido. " );
                } //end
                else
                {
                    //criar novo arranjo
                    this.tabela = new Object[tamanho];

                    //verificar se a tabela e' valida
                    if (tabela == null) {
                        IO.println("ERRO: Tabela e' invalida. ");
                    } //end
                    else //se a tabela for valida
                    {
                        //pecorrer e preencher o arranjo
                        for (posicao = i; posicao < tamanho; posicao++) {
                            tabela[posicao] = IO.readint("Informe um valor: ");
                        } //end repetir
                    } //end se
                } //end se
            } //end se
        } //end store( )

    /**
     * Ler dados do arquivo, e armazenar em arranjo.
     */


        public void fromFile( String nome, int n )
        {
            //definir dados
            int tamanho = length( );
            int i = 0;
            String linha;
            FILE arquivo;

            //criar arquivo para ler
            arquivo = new FILE(FILE.INPUT, nome);

            //verificar se o arquivo e' valido
            if( arquivo == null )
            {
                IO.println("ERRO: Arquivo e' invalido. " );
            } //end
            else //se o arquivo for valido
            {
                //tentar ler a primeira linha
                linha = arquivo.readln();

                //verificar se a primeira linha e' valida
                if( linha == null )
                {
                    IO.println("ERRO: Arquivo sem dados. " );
                } //end
                else //se a linha conter dados
                {
                    //verificar se o tamanho e' valido
                    if( tamanho <= 0 || n <= 0 || n > tamanho )
                    {
                        IO.println("ERRO: Quantidade e' invalida. " );
                    } //end
                    else //se a quantidade for valida
                    {
                        //enquanto for diferente do fim do arquivo
                        while(! arquivo.eof())
                        {
                            //converter linha para inteiro
                            tabela[ i ] = IO.getint(linha);
                            i++;

                            //ler linha novamente
                            linha = arquivo.readln();
                        } //end repetir
                        //fechar o arquivo (indispensavel)
                        arquivo.close();
                    } //end se
                } //end se
            } //end se
        } //end fromFile( )

        /**
        * Gravar dados de arranjo em aquivo, dado o nome do mesmo.
        */

        public void toFile( String nome, int quantidade )
        {
            //definir dados
            FILE arquivo = new FILE(FILE.OUTPUT, nome);
            int i        = 0;
            int tamanho  = length();

            //verificar se arquivo e' valido
            if( arquivo == null )
            {
                IO.println("ERRO: Arquivo invalido. " );
            } //end
            else
            {
                //verificar se a quantidade e' valida
                if( tamanho <= 0 || quantidade <= 0 || quantidade > tamanho )
                {
                    IO.println("ERRO: Ha' quantidade e' invalida. " );
                } //end
                else
                {
                    //grava tamanho do arranjo no arquivo
                    arquivo.println("" + tamanho);

                    //pecorrer no arranjo para gravar dados
                    for(i = 0; i < tamanho; i++)
                    {
                        arquivo.println("" + tabela[i]);
                    } //end repetir
                    //fechar o arquivo (indispensavel)
                    arquivo.close();
                } //end se
            } //end se
        } //end toFile( )

         /**
        * Ler certa quantidade de dados de arquivo e armazenar em arranjo
        */

         public void readPartial( String nome, int quantidade )
         {
             //definir dados
             int i       = 0; //posicao
             int tamanho = length();
             FILE arquivo;
             String linha;

             //criar arquivo para ler
             arquivo = new FILE(FILE.INPUT, nome);

             //verificar se o arquivo e' valido
             if( arquivo == null )
             {
                 IO.println("ERRO: Arquivo invalido. " );
             } //end
             else
             {
                 //tentar ler a priemira linha
                 linha = arquivo.readln( );

                 //verificar se a linha e' valida
                 if( linha == null )
                 {
                     IO.println("ERRO: Dados em arquivo invalidos. " );
                 } //end
                 else
                 {
                     //verificar se a quantidade e' valida
                     if( tamanho <= 0 || quantidade > tamanho || quantidade <= 0 )
                     {
                         IO.println("ERRO: Ha' quantidade e' invalida. " );
                     } //end
                     else
                     {
                         //pecorrer ate a posicao requerida
                         while (i < quantidade)
                         {
                             //converter linha para inteiro
                              tabela[ i ] = IO.getint(linha);
                               i++;
                              //ler linha
                             linha = arquivo.readln();
                         } //end repetir
                         //fechar arquivo (indispensavel)
                         arquivo.close( );
                     } //end se
                 } //end se
             } //end se
         } //end readPartial( )

        /**
        * Metodo para gravar certa quantidade de dados de arranjo em arquivo.
        */

        public void savePartialToFile( String nome, int quantidade )
        {
            //definir dados
            int i       = 0; //posicao
            int tamanho = length( );
            FILE arquivo;

            //criar arquivo para gravar
            arquivo = new FILE(FILE.OUTPUT, nome);

            //verificar se o arquivo e' valido
            if( arquivo == null )
            {
                IO.println("ERRO: Arquivo invalido. " );
            } //end
            else
            {
                //verificar se a quantidade e' valida
                if( tamanho <= 0 || quantidade <= 0 || quantidade > tamanho )
                {
                    IO.println("ERRO: Quantidade invalida. " );
                } //end
                else
                {
                    //gravar o tamanho no arranjo
                    arquivo.println("" + quantidade);

                    //pecorrer para gravar dados
                    for(i = 0; i < quantidade; i++)
                    {
                        arquivo.println("" + tabela[i]);
                    } //end repetir
                    //fechar arquivo (indispensavel)
                    arquivo.close( );
                } //end se
            } //end se
        } //end savePartialtoFile( )

        /**
         *  ler certa quantidade de dados de arquivo e armazenar em arranjo
         * a partir de determinada posicao
        */

        public void readFilePosition( String nameFile, int inicio, int amount )
        {
            //definir dados
            int count;
            int i    = 0; //position
            int size = length( );
            FILE arquivo;
            String linha;

            //criar arquivo para ler
            arquivo = new FILE(FILE.INPUT, nameFile);

            //verificar se o arquivo e' valido
            if( arquivo == null )
            {
                IO.println("ERRO: Arquivo invalido. " );
            } //end
            else
            {
                //tentar ler a primeira linha
                linha = arquivo.readln( );

                //verificar se a linha e' valida
                if( linha == null )
                {
                    IO.println("ERRO: Dados de arquivo invalidos. " );
                } //end
                else
                {
                    //verificar se a quantidade e' valida
                    if( amount <= 0 || amount > size + 1)
                    {
                        IO.println("ERRO: Quantidade invalida. " );
                    } //end
                    else
                    {
                        //verificar se a posicao e' valida
                        if( inicio <= 0 || inicio > size )
                        {
                            IO.println("ERRO: Posicao inicial invalida. " );
                        } //end
                        else
                        {
                            count = 1;
                            //enquanto a posicao desejada
                            while( i < amount )
                            {
                                if(count < inicio)
                                {
                                    //ler linha
                                    linha = arquivo.readln( );
                                    count++;
                                } //end
                                else
                                {
                                    tabela[ i ] = IO.getint(linha);
                                    i++;
                                    //ler linha
                                    linha = arquivo.readln();
                                } //end se
                            } //end repetir
                        } //end se
                    } //end se
                } //end se
                //fechar arquivo (indispensavel)
                arquivo.close( );
            } //end se
        } //end readPartialPosition( )

        /**
        * Grava arranjo de inteiros em arquivo .txt
        */

        public void partialSaveArrayFromFile (String nameFile, int inicio, int amount )
        {
            //definir dados
            int i    = 0; //position
            int size = length();
            FILE arquivo;

            //criar arquivo para gravar a partir do nome
            arquivo = new FILE(FILE.OUTPUT, nameFile);

            //verificar se arquivo e' valido
            if( arquivo == null )
            {
                IO.println("ERRO: Arquivo e' invalido. " );
            } //end
            else
            {
                //verificar se a quantidade e a posicao sao validas
                if( size <= 0 || amount <= 0 ||
                    amount + inicio > size   ||
                    inicio > size )
                {
                    IO.println("ERRO: Quantidade e/ou posicao inicial sao invalidas. " );
                } //end
                else
                {
                    //gravar tamanho do arranjo em arquivo
                    arquivo.println("" + amount);

                    //pecorrer para gravar dados em arquivo
                    for(i = inicio - 1; i < amount - 1 + inicio; i++)
                    {
                        arquivo.println(""+ tabela[i] );
                    } //end repetir
                    //fechar arquivo (indispensavel)
                    arquivo.close( );
                } //end se
            } //end se
        } //end partialSaveArrayFromFile( )

       /**
        * funcao para inverter a ordem dos dados armazenados em arranjo
        * e retornar um novo arranjo com a ordem invertida
        */

       public Arranjo invertArray( )
       {
           //definir dados
           int size;
           int i; //posicao
           int ultimo;
           Arranjo novo = null;

           //verificar se tabela e' valida
           if( tabela == null )
           {
               IO.println("ERRO: Tabela invalida. " );
           } //end
           else
           {
               size = length( );

               //criar arranjo
               novo = new Arranjo( size );

               //verificar se o arranjo novo e' valido
               if( novo == null )
               {
                   IO.println("ERRO: Arranjo novo e' invalido. " );
               } //end
               else
               {
                   ultimo = size - 1;

                   //pecorrer para inverter
                   for( i = 0; i < size; i++ )
                   {
                       novo.tabela[i] = tabela[ultimo - i];
                   } //end repetir
               } //end se
           } //end se
           //retornar novo arranjo
           return( novo );
       } //end invertArray( )

        /**
        * Copiar certa quantidade de dado armazenados no arranjo a partir de
         * determinada posicao
        */

        public Arranjo partialCopy( int start, int amount )
        {
            //definir dados
            int size = length();
            Arranjo copy = null;
            int i, j;

            //verificar se a tabela e' valida
            if( tabela == null || amount <= 0 || amount > size )
            {
                IO.println("ERRO: Tabela invalida. " );
            } //end
            else
            {
                //criar arranjo
                copy = new Arranjo( amount );

                //verificar se arranjo copy e' valido
                if( copy == null )
                {
                    IO.println("ERRO: Arranjo copy e' invalido. " );
                } //end
                else
                {
                    j = start - 1;

                    //pecorrer o arranjo
                    for(i = 0; i < amount; i++)
                    {
                        copy.tabela[i] = tabela[j];
                        j++;
                    } //end repetir
                } //end se
            } //end se
            //retornar copy
            return( copy );
        } //end partialCopy( )

        /**
        * Comparar se os dois arranjos sao iguais
        */

        public static boolean compareToEquals(Arranjo a1, Arranjo a2)
        {
            //definir dados
            int i;
            boolean equal = false;
            String s1 = null;
            String s2 = null;

            //verificar se os arranjos sao validos
            if( a1 == null || a2 == null )
            {
                IO.println("ERRO: Arranjo(s) invalido(s). ");
            } //end
            else //se os arranjos forem validos
            {
                if(a1.length( ) == a2.length())
                {
                    for (i = 0; i < a1.length(); i++)
                    {
                        s1 = "" + a1.tabela[i];
                        s2 = "" + a2.tabela[i];
                    } //end repetir
                    equal = (s1.equals(s2));
                } //end
            } //end se
            //retornar boolean
            return(equal);
        } //end equals( )

        /**
        * Funcao para clonar um array
        */

        public static Arranjo clonar ( Arranjo a1 )
        {
            //definir dados
            int i;
            int tamanho;
            Arranjo clone = null;

            //verificar se o vetor e' valido
            if( a1 == null )
            {
                IO.println("ERRO: Tabela nula. ");
            } //end
            else //se a tabela for valida
            {
                //obter o tamanho da tabela
                tamanho = a1.length();

                //tentar reserver espaco
                clone = new Arranjo( tamanho );

                //verificar se o clone e' valido
                if( clone == null )
                {
                    IO.println("ERRO: Arranjo clone e' invalido. ");
                } //end
                else //se o arranjo for valido
                {
                    //pecorrer por arranjo
                    for(i = 0; i < clone.length(); i++)
                    {
                        //copiar dados
                        clone.tabela[i] = a1.tabela[i];
                    } //end repetir
                } //end se
            } //end se
            //retornar clone
            return( clone );
        } //end clone( )
} //end class Arranjo

