/**
* @Author: Matheus Santos Rosa Carneiro
* Matricula: 613414
* Turno: Vespertino
*/

import IO.*;

class Matriz
{
    /**
     * Armazenador generico de dados
     */

    public Object [ ][ ] table;

    /**
     * Construtor padrao
     */

    public Matriz( )
    {
        table = null;
    } //end construtor padrao( )

    /**
     * Construtor alternativo
     */

    public Matriz( int lin, int col )
    {
        if(lin <= 0 || col <= 0 )
        {
            IO.println("ERRO: Quantidade invalida. " );
        } //end
        else
        {
            table = new Object[lin][col];
        } //end se
    } //end construtor alternativo( )

    /**
     * Informar a quantidade de posicoes reservadas (linhas)
     */
    public int lines( )
    {
        int lin = 0;

        if( table != null )
        {
            lin = table.length;
        } //end
        return(lin);
    } //end lines( )

    /**
     * Informar a quantidade de posicoes reservadas (colunas)
     */

    public int columns( )
    {
        int col = 0;

        if( table != null )
        {
            col = table[0].length;
        } //end
        return (col);
    } //end columns( )

    /**
     * Mostrar dados da Matriz
     */

    public void printMatriz( )
    {
        //definir dados
        int lin;
        int col;
        int i;
        int j;

        //verificar se matriz e' valida
        if( table == null )
        {
            IO.println("ERRO: Matriz invalida. " );
        } //end
        else
        {
            //obter dimensoes da matriz
            lin = lines();
            col = columns();
            IO.println("Matriz com "+lin+"x"+col+" posicoes.");
            //pecorrer e mostrar posicoes da matriz
            for(i = 0; i < lin; i++)
            {
                for(j = 0; j < col; j++)
                {
                    IO.print("\t"+table[ i ][ j ]);
                } //end repetir
                IO.println( );
            } //end repetir
        } //end se
    } //end printMatriz( )

    /**
     * Metodo para ler certa quantidade de dados do teclado e armazenar na matriz
     * a partir de determinada posicao
     */

    public void readIntMatriz(String message, int lStart, int cStart, int lAmount, int cAmount)
    {
        //definir dados
        int lin;
        int col;
        int i;
        int j;
        String linha;

        //obter dimensoes da matriz
        lin = lines();
        col = columns();

        //verificar se as dimensoes sao validas
        if( lin <= 0 || col <= 0 )
        {
            IO.println("ERRO: Quantidade(s) invalida(s). ");
        } //end
        else
        {
            //verificar se quantidade de linhas e colunas e' valida
            if(lAmount <= 0 || lAmount > lin ||
                    cAmount <= 0 || cAmount > col   )
            {
                IO.println("ERRO: Quantidade(s) invalida(s). ");
            } //end
            else
            {
                //verificar se as posicoes sao validas
                if(lStart < 0 || cStart < 0 ||
                        lStart > lin|| cStart > col )
                {
                    IO.println("ERRO: Posicoes invalidas. " );
                } //end
                else
                {
                    IO.println(message);
                    for( i = lStart; i < lAmount; i++)
                    {
                        for( j = cStart; j < cAmount; j++)
                        {
                            linha = IO.readln();
                            IO.println("Dados:["+i+"]"+"["+j+"]");
                            table[i][j] = IO.getint(linha);
                        } //end repetir
                    } //end repetir
                } //end se
            } //end se
        } //end se
    } //end readIntMatriz( )

    /**
     * Metodo para ler valores do teclado e guardar em matriz
     */

    public void readMatriz(String message)
    {
        //definir dados
        int i;
        int j;
        int lin;
        int col;
        String linha;

        //obter dimensoes
        lin = lines();
        col = columns();

        //verificar se dimensoes sao validas
        if( lin <= 0 || col <= 0 )
        {
            IO.println("ERRO: Tamanho invalido. " );
        } //end
        else
        {
            //mostrar mensagem antes de ler dados
            IO.println(message);

            //obter tamanho da matriz
            lin = this.lines();
            col = this.columns();

            //repetir para cada posicao da matriz
            for(i = 0; i < lin; i++)
            {
                for(j = 0; j < col; j++)
                {
                    //ler linha do teclado
                    linha = IO.readln();

                    //armazenar em uma posicao da matriz
                    //com objeto em String
                    table[i][j] = linha;
                } //end repetir
            } //end repetir
        } //end se
    } //end readMatriz( )

    /**
     * Metodo para mostrar certa quantidade de dados armazenados na matriz
     * a partir de determinada posicao.
     */

    public void printIntMatriz(String message, int lStart, int cStart, int lAmount, int cAmount)
    {
        //definir dados
        int lin;
        int col;
        int i;
        int j;

        //obter dimensoes
        lin = lines();
        col = columns();

        //verificar se lin e col e' valido
        if( lin <= 0 || col <= 0 )
        {
            IO.println("ERRO: Quantidade(s) invalida(s). ");
        } //end
        else
        {
            //verficar se quantidade de linhas e colunas sao validas
            if( lAmount > lin || lAmount < 0 || cAmount > col || cAmount < 0 )
            {
                IO.println("ERRO: Tamanho(s) invalido(s). ");
            } //end
            else
            {
                //verificar se posicao inicial e' valida
                if( lStart < 0 || lStart > lin || cStart < 0 || cStart > col)
                {
                    IO.println("ERRO: Posicoe(s) iniciais invalida(s). ");
                } //end
                else
                {
                    //mostrar mensagem antes de ler dados
                    IO.println(message);

                    //repetir para cada posicao
                    for(i = lStart; i < lAmount; i++)
                    {
                        for(j = cStart; j < cAmount; j++)
                        {
                            IO.println("["+i+"]"+"["+j+"]: " + table[i][j]);
                        } //end repetir
                        IO.println();
                    } //end repetir
                } //end se
            } //end se
        } //end se
    } //end printIntMatriz( )

    /**
     * Metodo para ler dados de arquivo, e armazenar em matriz.
     * Ler o tamanho tambem do arquivo e reserver o tamanho de acordo.
     */

    public void fromFile(String fileName)
    {
        //definir dados
        int i;
        int j;
        int lin;
        int col;
        String linha;
        FILE arquivo;

        arquivo = new FILE(FILE.INPUT, fileName);

        //obter dimensoes
        lin = lines();
        col = columns();

        //verificar se dimensoes validas
        if( lin <= 0 || col <= 0 )
        {
            IO.println("ERRO: Tamanho invalido. ");
        } //end
        else
        {
            //verificar se arquivo e' valido
            if( arquivo == null )
            {
                IO.println("ERRO: Arquivo invalido. ");
            } //end
            else
            {
                //ler a primeira linha do arquivo
                linha = arquivo.readln();

                //verificar se ha' dados
                if( linha == null )
                {
                    IO.println("ERRO: Arquivo vazio. ");
                } //end
                else
                {
                    linha = arquivo.readln();
                    for( i = 0; i < lin; i++)
                    {
                        for( j = 0; j < col; j++)
                        {
                            //ler linha do arquivo
                            linha = arquivo.readln();
                            table[ i ][ j ] = linha;
                        } //end repetir
                    } //end repetir
                    //fechar arquivo (indispensavel)
                    arquivo.close();
                } //end se
            } //end se
        } //end se
    } //end fromFile( )

    /**
     * Metodo para gravar dados de matriz em arquivo.
     */

    public void toFile (String nameFile)
    {
        //definir dados
        int i, j;
        int lin;
        int col;
        FILE arquivo;

        //obter dimensoes
        lin = lines();
        col = columns();

        //verificar se as dimensoes sao validas
        if( lin <= 0 || col <= 0 )
        {
            IO.println("ERRO: Tamanho(s) invalido(s). ");
        } //end
        else
        {
            //verificar se tabela e' valida
            if( table == null )
            {
                IO.println("ERRO: Matriz invalida. " );
            } //end
            else
            {
                arquivo = new FILE(FILE.OUTPUT, nameFile);
                arquivo.println(""+ lin);
                arquivo.println(""+ col);

                //pecorre para preencher a matriz
                for( i = 0; i < lin; i++)
                {
                    for(j = 0; j < col; j++)
                    {
                        arquivo.println("" + table[ i ][ j ]);
                    } //end repetir
                } //end repetir
                //fechar arquivo (indispensavel)
                arquivo.close();
            } //end se
        } //end se
    } //end toFile( )

    /**
     * Metodo para ler certa quantidade de dados de arquivo, e armazenar em matriz.
     * Ler o tamanho tambem do arquivo e reserver o tamanho de acordo, apenas se as
     * quantidades forem validas.
     */

    public void partialFromFile(String nameFile, int lAmount, int cAmount)
    {
        //definir dados
        int i, j;
        int lin;
        int col;
        FILE arquivo;
        String linha;

        //verificar se matriz (table) e' valida
        if( table == null )
        {
            IO.println("ERRO: Matriz invalida. ");
        } //end
        else
        {
            //obter dimensoes
            lin = lines();
            col = columns();

            //verificar se ambas dimensoes sao validas
            if( lin <= 0 || col <= 0 )
            {
                IO.println("ERRO: Tamanho(s) invalido(s). ");
            } //end
            else
            {
                arquivo = new FILE(FILE.INPUT, nameFile);

                //verificar se arquivo e' valido
                if (arquivo == null) {
                    IO.println("ERRO: Arquivo invalido. ");
                } //end
                else
                {
                    //tentar ler a primeira linha do arquivo
                    linha = arquivo.readln();

                    //verificar se a linha e' valida
                    if( linha == null )
                    {
                        IO.println("ERRO: Arquivo vazio. ");
                    } //end
                    else
                    {
                        lin = IO.getint(linha);
                        linha = arquivo.readln();
                        col   = IO.getint(linha);

                        //verificar se coluna e' valida
                        if( col <= 0 )
                        {
                            IO.println("ERRO: Quantidade de colunas invalida. ");
                        } //end
                        else
                        {
                            //verificar quantidade
                            if( lAmount <= 0 || lAmount > lin ||
                                    cAmount <= 0 || cAmount > col   )
                            {
                                IO.println("ERRO: Quantidade(s) de col/lin invalida(s). ");
                            } //end
                            else
                            {
                                for( i = 0; i < lAmount; i++)
                                {
                                    for( j = 0; j < cAmount; j++)
                                    {
                                        linha = arquivo.readln();
                                        table[ i ][ j ] = linha;
                                    } //end repetir
                                } //end repetir
                                //fechar arquivo (indispensavel)
                                arquivo.close();
                            } //end se
                        } //end se
                    } //end se
                } //end se
            }// end se
        } //end se
    } //end partialFromFile( )

    /**
     * Metodo para gravar em arquivo, certa quantidadede de dados em matriz.
     * Gravar o tamanho tambem do arquivo, primeiro, antes dos outros dados;
     */

    public void partialToFile(String nameFile, int lAmount, int cAmount)
    {
        //definir dados
        int i, j;
        int lin;
        int col;
        FILE arquivo;
        String linha;

        //abrir arquivo
        arquivo = new FILE(FILE.OUTPUT, nameFile);

        //verificar se arquivo e' valido
        if( arquivo == null )
        {
            IO.println("ERRO: Arquivo invalido. ");
        } //end
        else
        {
            //obter dimensoes de lin e col
            lin = lines();
            col = columns();

            //verificar se dimensoes e matriz (table) e' valida
            if( lin <= 0 || col <= 0 || table == null )
            {
                IO.println("ERRO: Matriz e/ou linhas/colunas invalida(s).");
            } //end
            else
            {
                //verifica se quantidades sao validas
                if( lAmount <= 0 || lAmount > lin || cAmount <= 0 || cAmount > col)
                {
                    IO.println("ERRO: Quantidade(s) de linhas e colunas invalida(s). ");
                } //end
                else
                {
                    //gravar
                    arquivo.println(""+ lAmount);
                    arquivo.println(""+ cAmount);

                    //pecorrer e gravar os dados
                    for( i = 0; i < lAmount; i++)
                    {
                        for( j = 0; j < cAmount; j++)
                        {
                            arquivo.println(""+table[ i ][ j ]);
                        } //end repetir
                    } //end repetir
                    //fechar arquivo (indispensavel)
                    arquivo.close();
                } //end se
            } //end se
        } //end se
    } //end partialToFile( )

    /**
     * Metodo para ler certa quantidade de dados em arquivo e armazenar em matriz
     * a partir de determinada posicao.
     */

    public void readFromFileStartP(String nameFile, int lStart, int cStart, int lAmount, int cAmount)
    {
        //definir dados
        int lin;
        int col;
        int i, j;
        FILE arquivo;
        String linha;

        //abrir arquivo
        arquivo = new FILE(FILE.INPUT, nameFile);

        //verificar se arquivo e' valido
        if( arquivo == null )
        {
            IO.println("ERRO: Arquivo invalido. ");
        } //end
        else
        {
            //tentar ler a primeira linha do arquivo
            linha = arquivo.readln( );

            //verificar se ha' dados na linha
            if( linha == null )
            {
                IO.println("ERRO: Arquivo vazio. ");
            } //end
            else
            {
                lin = IO.getint(linha);

                //verificar se lin e' valida
                if( lin <= 0 )
                {
                    IO.println("ERRO: Quantidade de linhas invalida. ");
                } //end
                else
                {
                    linha = arquivo.readln();
                    col   = IO.getint(linha);

                    //verificar se coluna e' valida
                    if( col <= 0 )
                    {
                        IO.println("ERRO: Quantidade de colunas invalida. ");
                    } //end
                    else
                    {
                        //verificar se quantidade e' valida
                        if( lAmount <= 0 || lAmount > lin || cAmount <= 0 || cAmount > col )
                        {
                            IO.println("ERRO: Quantidade de colunas/linhas invalida(s).");
                        } //end
                        else
                        {
                            if( lStart < 0 || lStart > lin || cStart < 0 || cStart > col ||
                                    lStart > (lin - lAmount)   || cStart > (col - cAmount) )
                            {
                                IO.println("ERRO: Posicoe(s) iniciais invalida(s). ");
                            } //end
                            else
                            {
                                //repetir para cada posicao
                                for(i = lStart; i < lAmount; i++)
                                {
                                    for(j = cStart; j < cAmount; j++)
                                    {
                                        linha = arquivo.readln();
                                        table[ i ][ j ] = linha;
                                    } //end repetir
                                } //end repetir
                                //fechar arquivo (indispensavel)
                                arquivo.close();
                            } //end se
                        } //end se
                    } //end se
                } //end se
            } //end se
        } //end se
    } //end readFromFileStartP( )

    /**
     * Metodo para gravar certa quantidade de dados de matriz em arquivo
     * a partir de determinada posicao desta.
     */

    public void savePartialMatrizInFile(String nameFile, int lStart, int cStart, int lAmount, int cAmount)
    {
        //definir dados
        int lin;
        int col;
        int i, j;
        FILE arquivo;
        String linha;

        //obter dimensoes de linha e coluna
        lin = lines();
        col = columns();

        //abrir arquivo para gravar
        arquivo = new FILE(FILE.OUTPUT, nameFile);

        //verificar se arquivo e' valido
        if( arquivo == null )
        {
            IO.println("ERRO: Arquivo invalido. ");
        } //end se
        else
        {
            //verificar se dimensoes e table (matriz) e' valida
            if( table == null || lin <= 0 || col <= 0 )
            {
                IO.println("ERRO: Matriz invalida. ");
            } //end
            else
            {
                //verificar se a quantidade de linhas e/ou colunas sao validas
                if( lAmount <= 0 || lAmount > lin ||
                        cAmount <= 0 || cAmount > col )
                {
                    IO.println("ERRO: Quantidade de linhas/colunas invalida(s). ");
                } //end
                else
                {
                    //verificar se posicao inicial e' valida
                    if( lStart < 0 || lStart > lin || lStart > (lin - lAmount) ||
                            cStart < 0 || cStart > col || cStart > (col - cAmount))
                    {
                        IO.println("ERRO: Posicoe(s) iniciais invalida(s). ");
                    } //end
                    else
                    {
                        //gravar a quantidade
                        arquivo.println("" + lAmount);
                        arquivo.println("" + cAmount);

                        //repete para gravar os dados
                        for( i = 0; i < lAmount; i++)
                        {
                            for(j = 0; j < cAmount; j++)
                            {
                                arquivo.println(""+ table[ i ][ j ]);
                            } //end repetir
                        } //end repetir
                        //fechar arquivo (indispensavel)
                        arquivo.close();
                    } //end se
                } //end se
            } //end se
        } //end se
    } //end savePartialMatrizInFile( )

    /**
     * Funcao para copiar certa quantidade de dados armazenados em matriz
     * a partir de determinada posicao.
     */

    public Matriz copyMatriz(int lStart, int cStart, int lAmount, int cAmount)
    {
        //definir dados
        int lin;
        int col;
        int i, j;
        Matriz copy = null;

        //obter dimensoes
        lin = lines();
        col = columns();

        //verificar se dimensoes sao validas
        if( table == null || lin <= 0 || col <= 0 )
        {
            IO.println("ERRO: Matriz invalida. ");
        } //end
        else
        {
            //verificar quantidades
            if( lAmount <= 0 || lAmount > lin || lAmount > (lin - lStart) ||
                    cAmount <= 0 || cAmount > col || cAmount > (col - cStart) ||
                    lStart  <  0 || lStart  > lin || cStart  < 0 || cStart > col )
            {
                IO.println("ERRO: Posicoe(s)/Quantidade(s) invalida(s). ");
            }
            else
            {
                copy = new Matriz (lAmount, cAmount);

                //verificar se copia e' valida
                if( copy == null )
                {
                    IO.println("ERRO: Matriz copy e' invalida. ");
                } //end
                else
                {
                    //copia para todas as posicoes iniciais
                    for( i = lStart; i < lAmount; i++)
                    {
                        for(j = cStart; j < cAmount; j++)
                        {
                            copy.table[ i ][ j ] = table[ i ][ j ];
                        } //end repetir
                    } //end repetir
                } //end se
            } //end se
        } //end se
        //return copy
        return( copy );
    } //end copyMatriz( )

    /**
     * Funcao para testar a igualdade de matrizes.
     */

    public boolean equals( Matriz matriz2 )
    {
        //definir dados
        boolean answer = true;
        int lin;
        int col;
        int lin2;
        int col2;
        int i, j;
        int x, y;

        //verificar se matrizes sao validas
        if( table == null || matriz2 == null )
        {
            IO.println("ERRO: Matrize(s) invalida(s). ");
        } //end
        else
        {
            //obter dimensoes
            lin  = lines();
            col  = columns();
            lin2 = lines();
            col2 = columns();

            //verificar se dimensoes sao validas

            if( lin <= 0 || col <= 0 || lin2 <= 0 || col2 <= 0 )
            {
                IO.println("ERRO: Tamanhos invalidos. ");
            } //end
            else
            {
                if( lin == lin2 && col == col2 )
                {
                    for (i = 0; i < lin; i++)
                    {
                        for (j = 0; j < col; j++)
                        {

                            x = IO.getint(matriz2.table[i][j]);
                            y = IO.getint(table[i][j]);
                            if(x != y)
                            {
                                answer = false;
                            } //end
                        } //end repetir
                    } //end repetir
                } //end
                else
                {
                    answer = false;
                } //end se
            } //end se
        } //end se
        //retornar resposta
        return ( answer );
    } //end equals( )


} //end class Matrix
