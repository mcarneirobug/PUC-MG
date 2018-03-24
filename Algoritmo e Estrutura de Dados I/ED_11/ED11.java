/**
* @Author: Matheus Santos Rosa Carneiro
* Matricula: 613414
* Turno: Vespertino
*/

import IO.*;

public class ED11 {

    /**
     * Chamar metodo para ler certa quantidade de dados do teclado e armazenar em matriz
     * a partir de determinada posicao
     */
    public static void exe01( )
    {
        int lin;
        int col;
        int lStart; //linha inicial
        int cStart; //coluna inicial
        int cAmount;
        int lAmount;
        Matriz m1 = null;

        //ler quantidade de linhas do teclado
        lin = IO.readint("Digite a quantidade de linhas desejada: " );

        //verificar se quantidade de linhas e' valida
        if( lin <= 0 )
        {
            IO.println("ERRO: Quantidade de linhas invalida. " );
        } //end
        else
        {
            //ler quantidade de colunas do teclado
            col = IO.readint("Digite a quantidade de colunas desejada: " );

            //verificar se quantidade e' valida
            if ( col <= 0 )
            {
                IO.println("ERRO: Quantidade de colunas invalida. " );
            } //end
            else
            {
                //criar matriz
                m1 = new Matriz(lin, col);

                //verificar se m1 e' valida
                if( m1 == null )
                {
                    IO.println("ERRO: Matriz m1 e' invalida. " );
                } //end
                else
                {
                    //ler a posicao inicial do teclado
                    lStart = IO.readint("Digite a partir de qual linha iniciar - '0': ");

                    //verificar se linha inicial e' valida
                    if( lStart < 0 )
                    {
                        IO.println("ERRO: Posicao inicial invalida (linha). " );
                    } //end
                    else
                    {
                        //ler posicao inicial de colunas do teclado
                        cStart = IO.readint("Digite a partir de qual coluna inicial - '0': ");

                        //verificar se coluna inicial e' valida
                        if( cStart < 0 )
                        {
                            IO.println("ERRO: Posicao inicial invalida (coluna). ");
                        } //end
                        else
                        {
                            lAmount = IO.readint("Defina a quantidade de dados por linha: " );

                            //verificar se quantidade e' valida
                            if( lAmount <= 0 || lAmount > lin )
                            {
                                IO.println("ERRO: Quantidade de dados invalida (linha). ");
                            } //end
                            else
                            {
                                cAmount = IO.readint("Difina a quantidade de dados por coluna: " );

                                //verificar se quantidade e' valida
                                if( cAmount <= 0 || cAmount > col )
                                {
                                    IO.println("ERRO: Quantidade de dados invalida (coluna). ");
                                } //end
                                else
                                {
                                    m1.readIntMatriz("Matriz 1: ",lStart, cStart, lAmount, cAmount);
                                    //mostrar dados em matriz
                                    m1.printMatriz();
                                }
                            } //end se
                        } //end se
                    } //end se
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. " );
    } //end exe01( )

    /**
     * Chamar metodo para mostrar certa quantidade de dados armazenados na matriz
     * a partir de determinada posicao.
     */

    public static void exe02( )
    {
        //definir dados
        int lAmount;
        int cAmount;
        int lStart;
        int cStart;
        int lin;
        int col;
        Matriz m2 = null;

        //ler do teclado a quantidade de linhas
        lin = IO.readint("Digite a quantidade de linhas: " );

        //verificar se as linhas sao validas
        if( lin <= 0 )
        {
            IO.println("ERRO: Quantidade de linhas invalida. " );
        } //end
        else
        {
            col = IO.readint("Digite a quantidade de colunas: " );

            //verificar se a quantidade e' valida
            if( col <= 0 )
            {
                IO.println("ERRO: Quantidade de colunas invalida. " );
            } //end
            else
            {
                //cria matriz
                m2 = new Matriz(lin, col);

                //verificar se m2 e' valida
                if( m2 == null )
                {
                    IO.println("ERRO: Matriz m2 e' invalida. " );
                } //end
                else
                {
                    //chamar o metodo para ler os dados do teclado
                    m2.readMatriz("Entre com os dados de m2: ");
                    //exibe matriz
                    m2.printMatriz();

                    //ler do teclado a posicao inicial
                    lStart = IO.readint("Digite a partir de qual linha inicial - '0': ");

                    //verificar se posicao inicial e' valida
                    if( lStart < 0 )
                    {
                        IO.println("ERRO: Posicao inicial invalida (linha). ");
                    } //end
                    else
                    {
                        //ler do teclado a coluna inicial
                        cStart = IO.readint("Digite a partir de qual coluna inicial - '0': ");

                        //verificar se posicao e' valida
                        if( cStart < 0 )
                        {
                            IO.println("ERRO: Posicao inicial invalida (coluna). ");
                        } //end
                        else
                        {
                            //ler quantidade de dados na linha pelo teclado
                            lAmount = IO.readint("Digite a quantidade de dados por linha: ");

                            //verificar se quantidade e' valida
                            if( lAmount <= 0 || lAmount > lin )
                            {
                                IO.println("ERRO: Quantidade de dados invalida. ");
                            } //end
                            else
                            {
                                //ler quantidade de dados na coluna pelo teclado
                                cAmount = IO.readint("Digite a quantidade de dados por coluna: ");

                                //verificar se quantidade e' valida
                                if( cAmount <= 0 || cAmount > col )
                                {
                                    IO.println("ERRO: Quantidade de dados invalida. ");
                                } //end
                                else
                                {
                                    m2.printIntMatriz("Matriz 2: ", lStart, cStart, lAmount, cAmount);
                                } //end se
                            } //end se
                        } //end se
                    } //end se
                } //end
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para pausar. " );
    } //end exe02( )

    /**
     * Chamar metodo para ler dados de arquivo, e armazenar em matriz.
     * Ler o tamanho tambem do arquivo e reserve o tamanho de acordo
     */

    public static void exe03( )
    {
        //definir dados
        String linha;
        String nameFile;
        int lin;
        int col;
        FILE arquivo;
        Matriz m3 = null;

        //ler do teclado o nome do arquivo
        nameFile = IO.readString("Digite o nome do arquivo: " );

        //abrir o arquivo para ler nome
        arquivo = new FILE(FILE.INPUT, nameFile);

        //verificar se arquivo lido e' valido
        if(arquivo == null )
        {
            IO.println("ERRO: Arquivo invalido. ");
        } //end
        else
        {
            //tentar ler linha do arquivo
            linha = arquivo.readln();

            //verificar se linha e' valida
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
                    IO.println("ERRO: Quantidade invalida. ");
                } //end
                else
                {
                    linha = arquivo.readln();
                    //fechar arquivo (indispensavel)
                    arquivo.close();
                    col = IO.getint(linha);
                    //verificar se col e' valida
                    if( col <= 0 )
                    {
                        IO.println("ERRO: Quantidade invalida. ");
                    } //end
                    else
                    {
                        m3 = new Matriz(lin, col);
                        //verificar se m3 e' valido
                        if( m3 == null )
                        {
                            IO.println("ERRO: Matriz m3 e' invalido. ");
                        } //end
                        else
                        {
                            //preencher matriz com dados do arranjo
                            m3.fromFile(nameFile);
                            //exibe matriz na tela
                            m3.printMatriz();
                        } //end se
                    } //end se
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para pausar. ");
    } //end exe03( )

    /**
     * Chamar metodo para gravar dados de matriz em arquivo.
     * Dica: Gravar o tamanho tambem do arquivo, primeiro, antes dos outros dados.
     */

    public static void exe04( )
    {
        //definir dados
        int lAmount; //quantidade linha
        int cAmount; // '' '' ''  coluna
        String nameFile;
        Matriz m4 = null;

        //ler nome do arquivo do teclado
        nameFile = IO.readString("Digite o nome do arquivo: ");

        //ler a quantidade de linhas da matriz
        lAmount = IO.readint("Digite a quantidade de linhas de m4: ");

        //verificar se quantidade e' valida
        if( lAmount <= 0 )
        {
            IO.println("ERRO: Quantidade de (linhas) invalida. " );
        } //end
        else
        {
            //ler quantidade de colunas da matriz
            cAmount = IO.readint("Digite a quantidade de colunas de m4: ");

            //verificar se quantidade e' valida
            if( cAmount <= 0 )
            {
                IO.println("ERRO: Quantidade de (colunas) invalida. ");
            } //end
            else
            {
                //criar matriz com quantidades
                m4 = new Matriz(lAmount, cAmount);

                //verificar se m4 e' valido
                if( m4 == null )
                {
                    IO.println("ERRO: Matriz m4 e' invalida. ");
                } //end
                else
                {
                    //ler dados na matriz
                    m4.readMatriz("Entre com dados em matriz: ");
                    //armazena dados da matriz no arquivo
                    m4.toFile(nameFile);
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. " );
    } //end exe04( )

    /**
     * Chamar metodo para ler certa quantidade de dados de arquivo, e armazenar em matriz.
     * Ler o tamanho tambem do arquivo e reservar o tamanho de acordo, apenas se as quantidades
     * forem validas.
     */

    public static void exe05( )
    {
        //definir dados
        int lAmount;
        int cAmount;
        int lin;
        int col;
        FILE arquivo;
        String linha;
        String nameFile;
        Matriz m5 = null;

        //ler nome do arquivo do teclado
        nameFile = IO.readString("Digite o nome do arquivo: ");

        //abrir o arquivo para receber nameFile
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

            //verificar se linha e' valida
            if( linha == null )
            {
                IO.println("ERRO: Arquivo vazio. ");
            } //end
            else
            {
                lin   = IO.getint(linha);
                linha = arquivo.readln( );
                col   = IO.getint(linha);

                //verificar se linha e coluna e' valida
                if( lin <= 0 || col <= 0 )
                {
                    IO.println("ERRO: Quantidade(s) invalida(s). ");
                } //end
                else
                {
                    //fechar arquivo (indispensavel)
                    arquivo.close( );

                    //criar matriz
                    m5 = new Matriz(lin, col);

                    //verificar se m5 e' valida
                    if( m5 == null )
                    {
                        IO.println("ERRO: Matriz m5 e' invalida. ");
                    } //end
                    else
                    {
                        lAmount = IO.readint("Digite a quantidade de linhas: ");

                        //verificar se quantidade e' valida
                        if( lAmount <= 0 )
                        {
                            IO.println("ERRO: Quantidade de linhas invalida. ");
                        } //end
                        else
                        {
                            cAmount = IO.readint("Digite a quantidade de colunas: ");

                            //verificar se quantidade e' valida
                            if( cAmount <= 0 )
                            {
                                IO.println("ERRO: Quantidade de colunas invalida. ");
                            } //end
                            else
                            {
                                m5.partialFromFile(nameFile, lAmount, cAmount);
                                //exibir matriz
                                m5.printMatriz();
                            } //end se
                        } //end se
                    } //end se
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe05( )

    /**
     * Chamar metodo para gravar em arquivo, certa quantidade em matriz.
     * Gravar o tamanho tambem do arquivo, primeiro, antes dos outros dados;
     */

    public static void exe06( )
    {
        //definir dados
        int lin;
        int col;
        int lAmount;
        int cAmount;
        String nameFile;
        Matriz m6 = null;

        //ler do teclado o nome do arquivo
        nameFile = IO.readString("Digite o nome do arquivo: ");

        //ler do teclado a quantidade de linhas
        lin = IO.readint("Informe a quantidade de linhas de m6: ");

        //verificar se linha e' valida
        if( lin <= 0 )
        {
            IO.println("ERRO: Quantidade de linhas invalida. ");
        } //end
        else
        {
            //ler do teclado a quantidade de colunas
            col = IO.readint("Informe a quantidade de colunas de m6: ");

            //verificar se quantidade e' valida
            if( col <= 0 )
            {
                IO.println("ERRO: Quantidade de colunas invalida. ");
            } //end
            else
            {
                //criar matriz
                m6 = new Matriz (lin, col);

                //verificar se m6 e' valida
                if( m6 == null )
                {
                    IO.println("ERRO: Matriz m6 e' invalida. ");
                } //end
                else
                {
                    //ler dados da matriz
                    m6.readMatriz("Entre com dados na matriz: ");

                    //ler do teclado a quantidade de linhas a serem gravadas
                    lAmount = IO.readint("Digite a quantidade de linhas que deseja armazenar em arquivo: ");

                    //verificar se dados sao validos
                    if( lAmount <= 0 )
                    {
                        IO.println("ERRO: Dados de linha invalidos. ");
                    } //end
                    else
                    {
                        //ler do teclado a quantidade de colunas a serem gravadas
                        cAmount = IO.readint("Digite a quantidade de colunas que deseja armazenar em arquivo: ");

                        //verificar se quantidade e' valida
                        if( cAmount <= 0 )
                        {
                            IO.println("ERRO: Dados de coluna invalidos. ");
                        } //end
                        else
                        {
                            //chamar metodo para gravar dados para arquivo
                            m6.partialToFile(nameFile, lAmount, cAmount);
                        } //end se
                    } //end se
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe06( )

    /**
     * Chamar metodo para ler certa quantidade de dados de arquivo, e armazenar em matriz
     * a partir de determinada posicao desta.
     * Dica: Ler o tamanho tambem do arquivo e  reservar o tamanho de acordo, apenas se as
     * posicoes iniciais e as quantidades forem validas.
     */

    public static void exe07( )
    {
        //definir dados
        int lin;
        int col;
        int lStart;
        int cStart;
        int lAmount;
        int cAmount;
        FILE arquivo;
        String linha;
        String nameFile;
        Matriz m7 = null;

        //ler do teclado o nome do arquivo .txt
        nameFile = IO.readString("Digite o nome do arquivo: ");

        //abrir arquivo para ler
        arquivo = new FILE(FILE.INPUT, nameFile);

        //verificar se arquivo e' valido
        if( arquivo == null )
        {
            IO.println("ERRO: Arquivo invalido. ");
        } //end
        else
        {
            //tentar ler a primeira linha
            linha = arquivo.readln( );

            //verificar ha' validade da linha
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

                    //verificar se col e' valido
                    if( col <= 0 )
                    {
                        IO.println("ERRO: Quantidade de colunas invalida. ");
                    } //end
                    else
                    {
                        //fechar arquivo
                        arquivo.close();

                        //criar matriz
                        m7 = new Matriz (lin, col);

                        //verificar se m7 e' valido
                        if( m7 == null )
                        {
                            IO.println("ERRO: Matriz m7 e' invalido. ");
                        } //end
                        else
                        {
                            //ler do teclado quantidade de linhas a ser gravadas
                            lAmount = IO.readint("Digite a quantidade de linhas a serem gravadas: ");

                            //verificar se quantidade e' valida
                            if( lAmount <= 0 || lAmount > lin )
                            {
                                IO.println("ERRO: Quantidade de linhas invalida. ");
                            } //end
                            else
                            {
                                //ler do teclado quantidade de colunas a serem gravadas
                                cAmount = IO.readint("Digite a quantidade de colunas a serem gravadas: ");

                                //verificar se quantidade e' valida
                                if( cAmount <= 0 || cAmount > col )
                                {
                                    IO.println("ERRO: Quantidade de colunas invalida. ");
                                } //end
                                else
                                {
                                    //ler do teclado a posicao inicial
                                    lStart = IO.readint("Digite a partir de qual posicao deseja iniciar a linha '0': ");

                                    //verificar se posicao inicial e' valida
                                    if( lStart < 0 )
                                    {
                                        IO.println("ERRO: Posicao da linha inicial e' invalida. ");
                                    } //end
                                    else
                                    {
                                        //ler do teclado a posicao inicial
                                        cStart = IO.readint("Digite a partir de qual posicao deseja iniciar a coluna '0': ");

                                        //verificar se posicao e' valida
                                        if( cStart < 0 )
                                        {
                                            IO.println("ERRO: Posicao da coluna inicial e' invalida. ");
                                        } //end
                                        else
                                        {
                                            //chamar metodo para armazenar em matriz
                                            m7.readFromFileStartP(nameFile, lStart, cStart, lAmount, cAmount);
                                            //mostrar matriz
                                            m7.printMatriz();
                                        } //end se
                                    } //end se
                                } //end se
                            } //end se
                        } //end se
                    } //end se
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe07( )

    /**
     * Chamar metodo para gravar certa quantidade de dados de matriz em arquivo
     * a partir de determinada posicao desta.
     * Gravar tambem o tamanho do arquivo, primeiro, antes dos outros dados;
     */

    public static void exe08( )
    {
        //definir dados
        int lin;
        int col;
        int lStart;
        int cStart;
        int lAmount;
        int cAmount;
        String linha;
        String nameFile;
        Matriz m8 = null;

        //ler do teclado o nome do arquivo
        nameFile = IO.readString("Digite o nome do arquivo: ");

        //ler do teclado a quantidade de linhas da matriz
        lin = IO.readint("Digite a quantidade de linhas desejada: ");

        //verificar se linha e' valida

        if( lin <= 0 )
        {
            IO.println("ERRO: Quantidade de lin e' invalida. ");
        } //end
        else
        {
            //ler do teclado a quantidade de colunas
            col = IO.readint("Digite a quantidade de colunas desejada: ");

            //verificar se coluna e' valida
            if ( col <= 0 )
            {
                IO.println("ERRO: Quantidade de col e' invalida. ");
            } //end
            else
            {
                //criar matriz
                m8 = new Matriz(lin, col);

                //verificar se m8 e' valido
                if( m8 == null )
                {
                    IO.println("ERRO: Matriz m8 e' invalido. ");
                } //end
                else
                {
                    //ler dados da matriz
                    m8.readMatriz("Entre com os dados da matriz: ");

                    //mostar matriz
                    m8.printMatriz();

                    //ler do teclado a quantidade de dados a serem gravados
                    lAmount = IO.readint("Digite a quantidade que deseja gravar linhas: ");

                    //verificar se quantidade e' valida
                    if( lAmount <= 0 )
                    {
                        IO.println("ERRO: Quantidade invalida de linhas. ");
                    } //end
                    else
                    {
                        //ler do teclado a quantidde de dados a serem gravados
                        cAmount = IO.readint("Digite a quantidade que deseja gravar colunas: ");

                        //verificar se quantidade e' valida
                        if( cAmount <= 0 )
                        {
                            IO.println("ERRO: Quantidade invalida de colunas. ");
                        } //end
                        else
                        {
                            //ler do teclado a posicao inicial
                            lStart = IO.readint("A partir de qual posicao deseja gravar a linha - '0': ");

                            //verificar se posicao e' valida
                            if( lStart < 0 )
                            {
                                IO.println("ERRO: Posicao inicial linha e' invalida. ");
                            } //end
                            else
                            {
                                //ler do teclado a posicao inicial
                                cStart = IO.readint("A partir de qual posicao deseja gravar a coluna - '0': ");

                                //verificar se posicao e' valida
                                if( cStart < 0 )
                                {
                                    IO.println("ERRO: Posicao inicial coluna e' invalida. ");
                                } //end
                                else
                                {
                                    //armazenar dados de arquivo em matriz
                                    m8.savePartialMatrizInFile(nameFile, lStart, cStart, lAmount, cAmount);
                                } //end se
                            } //end se
                        } //end se
                    } //end se
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe08( )

    /**
     * Chamar funcao para copiar certa quantidade de dados armazenados em matriz
     * a partir de determinada posicao.
     */

    public static void exe09( )
    {
        //definir dados
        int lStart;
        int cStart;
        int lAmount;
        int cAmount;
        int lin;
        int col;
        Matriz m9a = null;
        Matriz m9b = null;

        //ler a quantidade de linhas
        lin = IO.readint("Digite a quantidade de linhas: ");

        //verificar se quantidade e' valida
        if( lin <= 0 )
        {
            IO.println("ERRO: Quantidade de linhas e' invalida. ");
        } //end
        else
        {
            //ler a quantidade de colunas
            col = IO.readint("Digite a quantidade de colunas: ");

            //verificar se quantidade e' valida
            if( col <= 0 )
            {
                IO.println("ERRO: Quantidade de colunas e' invalida. ");
            } //end
            else
            {
                //criar matriz
                m9a = new Matriz(lin, col);

                //verificar se m9a e' valida
                if( m9a == null )
                {
                    IO.println("ERRO: Matriz m9 e' invalida. ");
                } //end
                else
                {
                    m9a.readMatriz("Digite os dados da matriz: ");
                    IO.println("Matriz original: ");
                    m9a.printMatriz();

                    //ler do teclado quantas linhas
                    lAmount = IO.readint("Digite quantas linhas deseja copiar: ");

                    //verificar se quantidade e' valida
                    if( lAmount <= 0 )
                    {
                        IO.println("ERRO: Quantidade linhas copiadas invalida. ");
                    } //end
                    else
                    {
                        //ler do teclado quantas colunas
                        cAmount = IO.readint("Digite quantas colunas deseja copiar: ");

                        //verificar se quantidade e' valida
                        if( cAmount <= 0 )
                        {
                            IO.println("ERRO: Quantidade de colunas copiadas invalida. ");
                        } //end
                        else
                        {
                            //ler posicoes iniciais
                            lStart = IO.readint("A partir de qual posicao deseja copiar linha - '0': ");

                            //verificar se posicao inicial e' valida
                            if( lStart < 0 )
                            {
                                IO.println("ERRO: Posicao linha inicial invalida. ");
                            } //end
                            else
                            {
                                cStart = IO.readint("A partir de qual posicao deseja copiar coluna - '0': ");

                                //verificar se posicao e' valida
                                if( cStart < 0 )
                                {
                                    IO.println("ERRO: Posicao coluna inicial invalida. ");
                                } //end
                                else
                                {
                                    //copia dados para outro matriz
                                    m9b = m9a.copyMatriz(lStart, cStart, lAmount, cAmount);
                                    //mostrar matriz copia
                                    m9b.printMatriz();
                                } //end se
                            } //end se
                        } //end se
                    } //end se
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe09( )

    /**
     * Chamar funcao para testar a igualdade de matrizes
     * testar dimensoes e dados sao validos.
     */

    public static void exe10( )
    {
        //definir dados
        boolean answer;
        int lin;
        int col;
        int lin2;
        int col2;
        Matriz m10a = null;
        Matriz m10b = null;

        //ler do teclado quantidade de linhas
        lin = IO.readint("Digite a quantidade de linhas de m10a: ");

        //verificar se quantidade e' valida
        if( lin <= 0 )
        {
            IO.println("ERRO: Quantidade de linhas invalida. ");
        } //end
        else
        {
            //ler do teclado quantidade de colunas
            col = IO.readint("Digite a quantidade de colunas de m10a: ");

            //verificar se quantidade e' valida
            if( col <= 0 )
            {
                IO.println("ERRO: Quantidade de colunas invalida. ");
            } //end
            else
            {
                //criar matriz
                m10a = new Matriz (lin, col);

                //verificar se m10a e' valida
                if( m10a == null )
                {
                    IO.println("ERRO: Matriz m10a e' invalido. ");
                } //end
                else
                {
                    //ler dados da matriz
                    m10a.readMatriz("Entre com dados em m10a: ");
                    //mostrar dados em matriz
                    m10a.printMatriz();

                    //ler dados no teclado da matriz m10b
                    lin2 = IO.readint("Digite a quantidade de linhas de m10b: ");

                    //verificar se e' valido
                    if( lin2 <= 0 )
                    {
                        IO.println("ERRO: Quantidade de linhas de m10b e' invalida. ");
                    } //end
                    else
                    {
                        //ler dados do teclado das colunas
                        col2 = IO.readint("Digite a quantidade de colunas de m10b: ");

                        //verificar se quantidade e' valida
                        if( col2 <= 0 )
                        {
                            IO.println("ERRO: Quantidade de colunas de m10b e' invalida. ");
                        } //end
                        else
                        {
                            //criar matriz m10b
                            m10b = new Matriz(lin2, col2);

                            //verificar se m10b e' valida
                            if( m10b == null )
                            {
                                IO.println("ERRO: Matriz m10b e' invalida. ");
                            } //end
                            else
                            {
                                //ler dados da matriz
                                m10b.readMatriz("Entre com dados em m10b: ");
                                //mostrar dados de m10b
                                m10b.printMatriz();

                                //verificar se as matrizes sao iguais
                                answer = m10a.equals(m10b);
                                //verificar se e' igual
                                if(answer)
                                {
                                    IO.println("Matrizes iguais. ");
                                } //end
                                else
                                {
                                    IO.println("Matrizes diferentes. ");
                                } //end se
                            } //end se
                        } //end se
                    } //end se
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe10( )

    public static void main( String [] args )
    {
        //definir dados
        int opcao;

        do
        {
            //saltar linha
            IO.println( );
            IO.println("Author: Matheus Santos Rosa Carneiro");
            IO.println("ED 11 - Programa em Java: ");
            //saltar linha
            IO.println( );
            IO.println("-------------------------");
            IO.println("|1 - exe01 |  2 - exe02 |");
            IO.println("|3 - exe03 |  4 - exe04 |");
            IO.println("|5 - exe05 |  6 - exe06 |");
            IO.println("|7 - exe07 |  8 - exe08 |");
            IO.println("|9 - exe09 | 10 - exe10 |");
            IO.println("|11- task01| 12 - task02|");
            IO.println("-------------------------");
            IO.println("0 - parar. ");
            IO.println( );

            opcao = IO.readint("Informe a opcao desejada: ");
            //saltar linha
            IO.println( );
            //escolher a opcao
            switch (opcao)
            {
                case 0:
                    break;
                case 1:
                    exe01();
                    break;
                case 2:
                    exe02();
                    break;
                case 3:
                    exe03();
                    break;
                case 4:
                    exe04();
                    break;
                case 5:
                    exe05();
                    break;
                case 6:
                    exe06();
                    break;
                case 7:
                    exe07();
                    break;
                case 8:
                    exe08();
                    break;
                case 9:
                    exe09();
                    break;
                case 10:
                exe10();
                break;
                /*
            case 11:
                task01();
                break;
            case 12:
                task02();
                break;
                */
                default:
                    IO.println("ERRO: Opcao invalida. ");
            } //end escolher( )
        } //end do
        while (opcao != 0);
        //encerrar
        IO.pause("Aperte ENTER para pausar. ");
    } //end main( )
} //end class ED_11
