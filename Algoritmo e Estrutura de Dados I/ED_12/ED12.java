import IO.*;

public class ED12 {

    /** Exemplo0231
     *  Chamar metodo public para ler e atribuir um valor ao nome (atributo do objeto).
     *  Testar se o nome nao esta' vazio.
     */

    public static void exe01( )
    {
        //definir dados
        Contato c1 = new Contato( );

        //chamar metodo para atribuir um valor ao nome
        c1.readNome("Nome: ");

        //testar se o nome nao esta' vazio
        if(c1.nome == null)
        {
            IO.println("ERRO: Nome esta' vazio. ");
        } //end
        else //se o nome for valido
        {
            IO.println("Nome lido: " + c1.nome);
        } //end se
        //encerrar
        IO.pause("Apertar ENTER para continuar. ");
    } //end exe01( )

    /**
     * Ler e atribuir um valor ao telefone (atributo do objeto).
     * Testar se o telefone nao esta vazio.
     */

    public static void exe02( )
    {
        //definir dados
        Contato c2 = new Contato();

        //chamar metodo para atribuir um valor ao fone
        c2.readFone("Fone: ");

        //verificar se o fone nao esta' vazio
        if(c2.fone == null)
        {
            IO.println("ERRO: Fone esta' vazio. ");
        } //end
        else
        {
            IO.println("Fone lido: " + c2.fone);
        } //end se
        //encerrar
        IO.pause("Aperter ENTER para continuar. ");
    } //end exe02( )

    /**
     * Chamar classe para testar se o valor de um telefone e' valido
     */

    public static void exe03( )
    {
        //1. definir dados
        Contato c3 = new Contato( );
        //2. chamar metodo para ler telefone
        c3.readFone("Fone: ");

        //3. verificar se telefone nao esta' vazio
        if( c3.fone == null )
        {
            IO.println("ERRO: Fone esta' vazio. ");
        } //end
        else
        {
            //verificar se telefone e' valido
            c3.getValidationFone();
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe03( )

    /**
     * Chamar metodo para ler dados de arquivo, e armazenar em um objeto
     * dessa classe.
     */

    public static void exe04( )
    {
        //definir dados
        Contato c4 = new Contato( );
        String fileName;

        //ler nome do arquivo pelo teclado
        fileName = IO.readString("Informe o nome do arquivo: ");

        //verificar se c4 e' valido
        if(c4 == null)
        {
            IO.println("ERRO: Contato c4 e' invalido. ");
        } //end
        else
        {
            //chamar metodo para ler do arquivo
            c4.fromFile(fileName);
            c4.showContact();
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe04( )

    /**
     * Gravar dados de uma pessoa em arquivo, dado o nome do mesmo.
     * Gravar o tamanho tambem do arquivo, antes dos outros dados.
     */

    public static void exe05( )
    {
        //1. definir dados
        Contato c5 = new Contato( );
        String fileName;

        //ler nome do arquivo
        fileName = IO.readString("Informe o nome do arquivo: ");

        //verificar se c5 e' valido
        if( c5 == null )
        {
            IO.println("ERRO: Contato c5 e' invalido. ");
        } //end
        else
        {
            //ler do teclado o nome e telefone
            c5.readNome("Nome: ");
            c5.readFone("Fone: ");
            //chamar metodo para gravar
            c5.toFile(fileName);
        } //end se
        //encerrar
        IO.pause("Apertar ENTER para continuar. ");
    } //end exe05( )

    /**
     * Acrescentar um novo atributo para um segundo telefone e modificar os construtores para lidas com isso
     */

    public static void exe06( )
    {
        //1. definir dados
        Contato c6 = new Contato();

        //verificar se Contato a6 e' valido
        if( c6 == null )
        {
            IO.println("ERRO: Contato a6 e' invalido. ");
        } //end
        else
        {
            c6.readNome("Nome: ");
            c6.readFone("Fone: ");
            c6.readFone2("Fone 2: ");
            c6.showContact();
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe06( )

    /**
     * Chamar metodo para indicar quantos telefones estao associados a cada objeto
     */

    public static void exe07( )
    {
        //1. definir dados
        Contato c7 = new Contato( );
        //verificar se contato c7 e' valido
        if( c7 == null )
        {
            IO.println("ERRO: Contato c7 e' invalido. ");
        } //end
        else
        {
            c7.readNome("Nome: ");
            c7.readFone("Fone: ");
            c7.readFone2("Fone 2: ");
            c7.telefones();
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe07( )

    /**
     * Chamar metodo para perguntar se quer acrescentar mais um numero.
     */

    public static void exe08( )
    {
        //1. definir dados
        Contato c8 = new Contato();

        //verificar se contato e' valido
        if( c8 == null )
        {
            IO.println("ERRO: Contato a8 e' invalido. ");
        } //end
        else
        {
            c8.readNome("Nome: ");
            c8.readFone("Fone: ");
            c8.setFone2a("Fone 2: ");
            c8.showContact();
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe08( )

    /**
     * Alterar o valor apenas do segundo telefone.
     * Se o contato nao tiver dois telefones, uma situacao de erro devera
     * ser indicada.
     */

    public static void exe09( )
    {
        //1. definir dados
        Contato c9 = new Contato();
        int i;

        //verificar se contato e' valido
        if(c9 == null)
        {
            IO.println("ERRO: Contato c9 e' invalido. ");
        } //end
        else
        {
            c9.readNome("Nome: ");
            c9.readFone("Fone: ");
            c9.readFone2("Fone2: ");
            i = c9.telefones();
            if(i < 2)
            {
                IO.println("ERRO: Quantidade de telefones invalida. ");
            } //end
            else
            {
                c9.showContact();
                c9.setFone2b();
                c9.showContact();
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end exe09( )

    /**
     * Chamar metodo que remove apenas o valor do segundo telefone.
     */

    public static void exe10( )
    {
        //1. definir dados
        Contato c10 = new Contato();
        int i;
        //verificar se contato e' valido
        if( c10 == null )
        {
            IO.println("ERRO: Contato c10 e' invalido. ");
        } //end
        else
        {
            c10.readNome("Nome: ");
            c10.readFone("Fone: ");
            c10.readFone2("Fone 2: ");
            i = c10.telefones();
            if(i < 2)
            {
                IO.println("ERRO: Quantidade invalida. ");
            } //end
            else
            {
                 c10.showContact();
                 c10.removeFone2c();
                 c10.showContact();
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
            IO.println("ED 12 - Programa em Java: ");
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
                /*
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
} //end class ED_12
