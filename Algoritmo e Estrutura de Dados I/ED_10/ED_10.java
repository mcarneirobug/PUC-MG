import IO.*;

public class ED_10 {

    /**
     * metodo para chamar function store (armazenar em arranjo valores a partir
     * de determinada posicao)
     */

    public static void exe01() {
        //definir dados
        int tamanho;
        int i;
        Arranjo a1 = null;

        //ler o tamanho para armazenar no arranjo
        tamanho = IO.readint("Informe qual a quantidade para armazenar em a1: ");
        i = IO.readint("A partir de qual posicao deseja armazenar? ");

        //verificar se posicao e tamanho sao validos
        if (i > tamanho ||
                i < 0 ||
                tamanho <= 0) {
            IO.println("ERRO: Tamanho e/o posicao invalida. ");
        } //end
        else //se os dados forem validos
        {
            //criar um arranjo
            a1 = new Arranjo();

            //verificar se a arranjo e' valido
            if (a1 == null) {
                IO.println("ERRO: Arranjo e' nulo. ");
            } //end
            else //se o arranjo for valido
            {
                a1.store(tamanho, i);
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe01( )

    /**
     * Metodo para mostrar certa quantidade de dados
     * armazenados no arranjo em determinada posicao
     */
    public static void exe02() {
        //definir dados
        int i;
        int tamanho;
        Arranjo a2 = null;

        //ler tamanho de dados a serem armazenados
        tamanho = IO.readint("Informe a quantidade de dados a serem armazenados em a2: ");
        i = IO.readint("A partir de qual posicao deseja armazenar? ");

        //verificar se tamanho e posicao sao validas
        if (i > tamanho || i < 0 || tamanho <= 0) {
            IO.println("ERRO: Tamanho e/ou posicoes invalidas. ");
        } //end
        else //se posicao e tamanho validos
        {
            //criar arranjo
            a2 = new Arranjo();

            //verificar a2 e' valido

            if (a2 == null) {
                IO.println("ERRO: Arranjo a2 e' nulo. ");
            } //end
            else //se a2 e' valido
            {
                //armazenar no arranjo
                a2.store(tamanho, i);

                //mostrar o arranjo
                a2.printIntArray(tamanho);
            } //end se
        } //end se
    } //end exe02( )

    /**
     * metodo para ler dados de arquivo, e armazenar em arranjo.
     */

    public static void exe03() {
        // definicao de dados
        Arranjo a3 = null;
        String nome = "";
        String linha = "";
        FILE arquivo = null;
        int quantidade = 0;

        //ler do teclado o nome do arquivo
        nome = IO.readString("Informe o nome do arquivo: ");

        //abre o arquivo para ler os dados
        arquivo = new FILE(FILE.INPUT, nome);

        // verifica se o arquivo e' valido
        if (arquivo == null) {
            IO.println("Erro: Arquivo e' invalido.");
        } //end
        else {
            // tenta ler a primeira linha
            linha = arquivo.readln();

            //verificar se a linha e' valida
            if (linha == null) {
                IO.println("Erro: Arquivo com dados invalidos.");
            } //end
            else {
                // pecorre o arquivo ate encerrar os dados
                while (!arquivo.eof()) {
                    quantidade = quantidade + 1;
                    linha = arquivo.readln();
                } //end repetir
                // fechar o arquivo (indispensavel)
                arquivo.close();

                // cria arranjo a3
                a3 = new Arranjo(quantidade);

                // verifica se o arranjo a3 e' valido

                if (a3 == null) {
                    IO.println("Arranjo a3 e' nulo. ");
                } //end
                else {
                    a3.fromFile(nome, quantidade);
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe03( )

    /**
     * metodo para gravar dados de arranjo em arquivo e gravar tambem o tamanho.
     */

    public static void exe04() {
        //definir dados
        Arranjo a4 = null;
        String nome = "";
        int quantidade = 0;

        //ler do teclado o nome do arquivo a ser lido
        nome = IO.readString("Informe o nome do arquivo: ");
        do {
            quantidade = IO.readint("Informe a quantidade de dados: ");
            //verificar se a quantidade e' valida
            if (quantidade <= 0) {
                IO.println("ERRO: Quantidade invalida. ");
            } //end
        } while (quantidade <= 0);

        //criar novo arranjo
        a4 = new Arranjo(quantidade);

        //verificar se o arranjo criado e' valido
        if (a4 == null) {
            IO.println("ERRO: Arranjo a4 e' invalido. ");
        } //end
        else {
            a4.readIntArray("Entrar com os dados em a4: ", quantidade);
            a4.toFile(nome, quantidade);
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe04( )

    /**
     * metodo que ler certa quantidde de dados de arquivo e armazena em arranjo.
     */

    public static void exe05() {
        //definir dados
        Arranjo a5 = null;
        int quantidade = 0;
        int n;
        String nome;
        String linha;
        FILE arquivo = null;

        //ler do teclado o nome do arquivo
        nome = IO.readString("Informe o nome do arquivo: ");

        //abrir o arquivo para ler dados
        arquivo = new FILE(FILE.INPUT, nome);

        //verificar se o arquivo e' valido
        if (arquivo == null) {
            IO.println("ERRO: Arquivo invalido. ");
        } //end
        else {
            //tentar ler a primeira linha
            linha = arquivo.readln();

            //verificar se a linha lida e' valida
            if (linha == null) {
                IO.println("ERRO: Arquivo sem dados. ");
            } //end
            else {
                //pecorre o arquivo ate o fim dos dados
                while (!arquivo.eof()) {
                    quantidade++;
                    linha = arquivo.readln();
                } //end repetir
                //fechar o arquivo (indispensavel)
                arquivo.close();

                //ler a quantidade de dados
                n = IO.readint("Informe a quantidade de dados: ");

                //verificar se os dados sao maiores que a quantidade
                if (n > quantidade || n <= 0) {
                    IO.println("ERRO: Quantidade invalida. ");
                } //end
                else {
                    //criar arranjo
                    a5 = new Arranjo(n);

                    //verificar se a5 e' valido
                    if (a5 == null) {
                        IO.println("ERRO: Arranjo a5 e' invalido. ");
                    } //end
                    else {
                        a5.readPartial(nome, n);
                        a5.printIntArray(n);
                    } //end se
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe05( )

    /**
     * chamar metodo para gravar certa quantidade de dados de arranjo em arquivo
     */

    public static void exe06() {
        //definir dados
        String nome;
        int n;
        int n2;
        Arranjo a6 = null;

        //ler do teclado o nome do arquivo
        nome = IO.readString("Informe o nome do arquivo: ");

        //ler a quantidade de dados do vetor
        n = IO.readint("Informe a quantidade de dados do vetor: ");

        //verificar se a quantidade e' valida
        if (n <= 0) {
            IO.println("ERRO: Quantidade invalida. ");
        } //end
        else {
            //ler quantidade a ser gravada
            n2 = IO.readint("Informe a quantidade que deseja armazenar: ");
            //verificar se a quantidade a ser gravada e' valida
            if (n2 <= 0 || n2 > n) {
                IO.println("ERRO: Quantidade de armazenar invalida. ");
            } //end
            else {
                //criar arranjo a6
                a6 = new Arranjo(n);

                //verificar se o arranjo a6 e' valido
                if (a6 == null) {
                    IO.println("ERRO: Arranjo a6 e' invalido. ");
                } //end
                else {
                    a6.readIntArray("Entrar com dados em a6: ", n);
                    a6.savePartialToFile(nome, n2);
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe06( )

    /**
     * chamar metodo para ler certa quantidade de dados em arquivo e armazenar em arranjo
     * a partir de determina posicao
     */

    public static void exe07() {
        //definir dados
        int amount = 0;
        int dados;
        int start; //posicao

        Arranjo a7 = null;
        String nameFile;
        String linha;
        FILE arquivo = null;

        //ler do teclado o nome do arquivo
        nameFile = IO.readString("Informe o nome do arquivo: ");

        //abrir o arquivo para ler
        arquivo = new FILE(FILE.INPUT, nameFile);

        //verificar se o arquivo e' valido
        if (arquivo == null) {
            IO.println("ERRO: Arquivo invalido. ");
        } //end
        else {
            //tentar ler a primeira linha
            linha = arquivo.readln();

            //verificar se a linha e' valida
            if (linha == null) {
                IO.println("ERRO: Dados do arquivo invalidos. ");
            } //end
            else {
                //pecorrer no arquivo enquanto nao for o fim
                while (!arquivo.eof()) {
                    amount = amount + 1;
                    //ler linha
                    linha = arquivo.readln();
                } //end repetir
                //fechar arquivo (indispensavel)
                arquivo.close();

                //posicao inicial
                start = IO.readint("Informe a partir de qual posicao: ");

                //verificar se a posicao e' valida
                if (start <= 0 || start > amount) {
                    IO.println("ERRO: Ha' posicao inicial e' invalida. ");
                } //end
                else {
                    dados = IO.readint("Informe a quantidade de dados desejada: ");
                    //verificar se a quantidade de dados e' valida
                    if (dados > amount - start + 1 || dados <= 0) {
                        IO.println("ERRO: Quantidade invalida.");
                    } //end
                    else {
                        //criar arranjo
                        a7 = new Arranjo(dados);

                        //verificar se a7 e' valido
                        if (a7 == null) {
                            IO.println("ERRO: Arranjo a7 e' invalido. ");
                        } //end
                        else {
                            a7.readFilePosition(nameFile, start, dados);
                            a7.printIntArray(dados);
                        } //end se
                    } //end se
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe07( )

    /**
     * chamar metodo para gravar certa quantidade de dados de arranjo em arquivo
     * a partir de determinada posicao
     */

    public static void exe08() {
        //definir dados
        int amount;
        int start;
        int dados;
        String nameFile;
        Arranjo a8 = null;

        //ler do teclado o nome do arquivo
        nameFile = IO.readString("Informe o nome do arquivo: ");

        //ler do teclado a quantidade de dados do arranjo
        amount = IO.readint("Entre com a quantidade de dados no arranjo: ");

        //verificar se a quantidade e' diferente de zero
        if (amount <= 0) {
            IO.println("ERRO: Quantidade invalida. Tente novamente!");
            amount = IO.readint("Entre com a quantidade de dados no arranjo: ");
        } //end
        else {
            //ler a posicao inicial do teclado
            start = IO.readint("A partir de qual posicao deseja iniciar? ");

            //verificar se a posicao inicial e' valida
            if (start <= 0 || start > amount) {
                IO.println("ERRO: Posicao invalida. Tente novamente!");
                start = IO.readint("A partir de qual posicao deseja iniciar? ");
            } //end
            else {
                //entrada de dados pelo teclado
                dados = IO.readint("Informe a quantidade de dados: ");

                //verificar se a quantidade e' valida
                if (dados > amount - start + 1 || dados <= 0) {
                    IO.println("ERRO: Quantidade de dados invalida. Tente novamente!");
                    dados = IO.readint("Informe a quantidade de dados: ");
                } //end
                else {
                    //criar arranjo
                    a8 = new Arranjo(amount);

                    //verificar se o arranjo a8 e' valido
                    if (a8 == null) {
                        IO.println("ERRO: Arranjo a8 e' invalido. ");
                    } //end
                    else {
                        //entrar com dados e guardar no arranjo
                        a8.readIntArray("Entrar com dados em a8: ", amount);
                        a8.partialSaveArrayFromFile(nameFile, start, dados);
                    } //end se
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe08( )

    public static void exe09() {
        //definir dados
        int amount;
        int start;
        Arranjo a9 = null;
        Arranjo invert = null;

        //ler quantidade de dados do teclado
        amount = IO.readint("Informe a quantidade de dados: ");

        //verificar se quantidade e' valida
        if (amount <= 0) {
            IO.println("ERRO: Quantidade de dados e' invalida. ");
        } //end
        else {
            //criar novo arranjo
            a9 = new Arranjo(amount);

            //verificar se a9 e' valido
            if (a9 == null) {
                IO.println("ERRO: Arranjo a9 e' invalido. ");
            } //end
            else {
                a9.readIntArray("Entre com os dados em a9: ", amount);
                invert = a9.invertArray();

                //verificar se invert e' valido
                if (invert == null) {
                    IO.println("ERRO: Arranjo invert e' invalido. ");
                } // end
                else {
                    invert.printIntArray(amount);
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe09( )

    /**
     * chamar funcao para copiar certa quantidade de dados armazenados no arranjo
     * a partir de em determinada posicao.
     */

    public static void exe10() {
        //definir dados
        Arranjo a10 = null;
        Arranjo a11 = null;
        int amount;
        int start;
        int dados;

        //ler do teclado a quantidade de dados
        amount = IO.readint("Informe a quantidade de dados: ");

        //verificar se quantidade e' valida
        if (amount <= 0) {
            IO.println("ERRO: Quantidade e' invalida. ");
        } //end
        else {
            //criar arranjo com quantidade
            a10 = new Arranjo(amount);

            //verificar se a10 e' valido
            if (a10 == null) {
                IO.println("ERRO: Arranjo a10 e' nulo. ");
            } //end
            else {
                a10.readIntArray("Entrar com dados em a10: ", amount);

                //entrar a posicao inicial do teclado
                start = IO.readint("A partir de qual posicao? ");

                //verificar se posicao inicial e' valida
                if (start <= 0 || start > amount) {
                    IO.println("ERRO: Posicao inicial e' invalida. ");
                } //end se
                else {
                    //ler dados a serem armazenados
                    dados = IO.readint("Informe os dados a serem armazenados: ");

                    //verificar se dados em posicao inicial e' valida
                    if (dados <= 0 || dados + start - 1 > amount) {
                        IO.println("ERRO: Dados em posicao inicial sao invalidos. ");
                    } //end
                    else {
                        //criar arranjo
                        a11 = new Arranjo(dados);

                        //verificar se arranjo a11 e' valido
                        if (a11 == null) {
                            IO.println("ERRO: Arranjo a11 e' invalido. ");
                        } //end
                        else {
                            a10.printIntArray(amount);
                            a11 = a10.partialCopy(start, dados);
                            IO.println();
                            IO.print("Arranjo copiado: ");
                            a11.printIntArray(dados);
                        } //end se
                    } //end se
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe10( )

    public static void task01() {
        //definir dados
        Arranjo a12 = null;
        Arranjo a13 = null;
        int amount;
        int dados;
        boolean equal = false;

        //ler quantidade de dados de a12 do teclado

        amount = IO.readint("Informe a quantidade de dados de a12: ");

        //verificar se a quantidade e' invalida
        if (amount <= 0) {
            IO.println("ERRO: Quantidade invalida. ");
        } //end
        else {
            //criar o arranjo
            a12 = new Arranjo(amount);

            //verificar se a12 e' valido
            if (a12 == null) {
                IO.println("ERRO: Arranjo a12 e' invalido. ");
            }  //end
            else {
                a12.readIntArray("Entrar com os dados de a12: ", amount);

                //entrar com a quantidade de dados de a13
                dados = IO.readint("Informe a quantidade de dados de a12: ");

                //verificar se a quantidade e' valida
                if (dados <= 0)
                {
                    IO.println("ERRO: Quantidade de dados e' invalida. ");
                } //end
                else
                {
                    //criar o segundo arranjo
                    a13 = new Arranjo(dados);

                    //verificar se a13 e' valido
                    if (a13 == null) {
                        IO.println("ERRO: Arranjo a3 e' invalido. ");
                    } //end
                    else
                    {
                        a13.readIntArray("Entrar com dados de a13: ", dados);

                        //chamar a funcao da classe Arranjo
                        equal = Arranjo.compareToEquals(a12, a13);
                        //verificar
                        if (equal)
                        {
                            IO.println("Os arranjos sao identicos. ");
                        } //end
                        else
                        {
                            IO.println("Os arranjos sao diferentes. ");
                        } //end se
                    } //end se
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. " );
    } //end task01( )

    public static void task02()
    {
        //definir dados
        int amount;
        Arranjo a14;
        Arranjo a15;

       // do {
            amount = IO.readint("Informe a quantidade de dados de a14: " );

            //verificar se a quantidade de dados e' valida
            if( amount <= 0 )
            {
                IO.println("ERRO: Ha' quantidade e' invalida. " );
            } //end
        //} while ( quantidade <= 0 );

        //criar o primeiro arranjo >> a14 <<
        a14 = new Arranjo( amount );

        //verificar se o arranjo a14 e' valido
        if( a14 == null )
        {
            IO.println("ERRO: Arranjo a14 e' invalido. " );
        } //end
        else //se o valor for valido
        {
            a14.readIntArray("Entrar com dados em a14: ", amount);

            //criar arranjo clone
            a15 = new Arranjo( amount );

            //verificar se o arranjo a15 e' valido
            if( a15 == null )
            {
                IO.println("ERRO: Arranjo a15 e' invalido. " );
            } //end
            else //se o arranjo for valido
            {
                IO.println();
                IO.print("Clone: " );
                //chamar a funcao clonar
                a15 = Arranjo.clonar(a14);
                a15.printIntArray(amount);
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. " );
    } //end task02( )

    public static void main( String [] args )
    {
        //definir dados
        int opcao;

        do
        {
            //saltar linha
            IO.println( );
            IO.println("Author: Matheus Santos Rosa Carneiro");
            IO.println("ED 10 - Programa em Java: ");
            //saltar linha
            IO.println( );

            IO.println("1 - exe01 |  2 - exe02 ");
            IO.println("3 - exe03 |  4 - exe04 ");
            IO.println("5 - exe05 |  6 - exe06 ");
            IO.println("7 - exe07 |  8 - exe08 ");
            IO.println("9 - exe09 | 10 - exe10 ");
            IO.println("11- task01| 12 - task02 ");
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
                case 11:
                    task01();
                    break;
                case 12:
                    task02();
                    break;
                default:
                    IO.println("ERRO: Opcao invalida. ");
            } //end escolher( )
        } //end do
        while (opcao != 0);
        //encerrar
        IO.pause("Aperte ENTER para pausar. ");
    } //end main( )
} //end class ED_10
