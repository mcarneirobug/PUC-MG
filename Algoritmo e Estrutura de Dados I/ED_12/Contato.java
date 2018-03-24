/**
 * Importar dependencias
 */
import IO.*;

/**
 * Classe para tratar contatos.
 */
class Contato
{
    /**
     * Atributos
     */
    public String nome;
    public String fone;
    public String fone2;
    public int fAmount; //quantidade de telefones

    /**
     * Construtor padrao.
     */
    public Contato( )
    {
        //atribuir valores iniciais nulos
        nome    = null;
        fone    = null;
        fone2   = null;
        fAmount = 0;
    } //end construtor padrao

    /**
     * Construtor alternativo
     */
    public Contato( String nameStart, String foneStart)
    {
        setErro(0); //ainda nao ha' erro
        //verificar se nome e' valido (retornar erro 1.)
        if(nome == null)
        {
            setErro(1); //nome invalido - erro 1
        } //end
        else
        {
            //verificar se fone e' valido (retornar erro 2.)
            if(fone == null)
            {
                setErro(2);
            } //end
            else //se ambos forem validos
            {
                //estabelece novo nome
                setNome(nameStart);
                //estabelece novo fone
                setFone(foneStart);
            } //end se
        } //end se
    } //end construor alternativo

    /**
     * Construtor alternativo 2
     */

    public Contato (String nameStart, String foneStart, String fone2Start)
    {
        setErro(0); //ainda nao ha' erro
        if(nome == null)
        {
            setErro(1);
        } //end
        else
        {
            if(fone == null)
            {
                setErro(2);
            } //end
            else
            {
                if(fone2 == null)
                {
                    setErro(3);
                } //end
                else
                {
                    setNome(nameStart);
                    setFone(foneStart);
                    setFone2(fone2Start);
                } //end se
            } //end se
        } //end se
    } //end construtor alternativo 2( )

    /**
     * tratamento de erro.
     * Codigos de erro:
     * 1. Nome invalido.
     * 2. Fone invalido.
     * 3. Fone2 invalido.
     */

    private int erro;

    /**
     * Obter codigo de erro
     */
    public int getErro()
    {
        return (erro);
    } //end getErro( )

    /**
     * Estabelecer novo codigo de erro.
     */

    private void setErro( int codigo )
    {
        erro = codigo;
    } //end setErro( )

    /**
     * Indica a existencia de erro.
     */

    public boolean hasErro( )
    {
        return (getErro() != 0);
    } //ed hasErro( )

    /**
     * Obter nome.
     */

    public String getNome( )
    {
        return (nome);
    } //end getNome( )

    /**
     * Obter o telefone
     */

    public String getFone( )
    {
        return(fone);
    } //end getFone( )

    /**
     * Obter o telefone 2.
     */

    public String getFone2( )
    {
        return (fone2);
    } //end getFone2( )

    /**
     * Estabelecer novo nome.
     */

    public void setNome(String novoNome)
    {
        nome = novoNome;
    } //end setNome

    /**
     * Estabelecer novo telefone.
     */

    public void setFone(String novoFone)
    {
        fone = novoFone;
    } //end setFone( )

    /**
     * Estabelecer novo telefone 2.
     */

    public void setFone2(String novoFone2)
    {
        fone2 = novoFone2;
    } //end setFone2( )

    /**
     * obter os contedos do objeto.
     * @return dados contidos no objeto.
     */

    public String toString( )
    {
        return(""+nome+" - "+fone);
    } //end toString( )

    /** Exemplo0231
     * Ler e atribuir um valor ao nome (atributo do objeto).
     */

    public void readNome(String messageNome)
    {
        String name;
        name = IO.readln(messageNome);
        nome = name;
    } //end readNome( )

    /** Exemplo0232
     *  Ler e atribuir um valor ao telefone (atributo do objeto).
     */

    public void readFone(String messageFone)
    {
        String telefone;
        telefone = IO.readln(messageFone);
        fone     = telefone;
    } //end readFone( )

    /**
     * Ler e atribuir um valor ao telefone 2 (atributo do objeto).
     */

    public void readFone2(String messageFone2)
    {
        String telefone2;
        telefone2 = IO.readln(messageFone2);
        fone2     = telefone2;
    } //end readFone2( )

    /**
     * Metodo privado para testar se o valor de um telefone e' valido
     * testar se as posicoes contem apenas algarismos e o simbolo '-'
     */

    private boolean checkFone(String messageFone)
    {
        //1. definir dados
        boolean answer = true;
        int i;
        int tamanho;

        //2. verificar existencia
        if( fone == null )
        {
            setErro(2); //fone invalido
            IO.println("ERRO: Telefone invalido. ");
        } //end
        else
        {
            //obter tamanho
            tamanho = fone.length();

            //verificar se quantidade de digitos
            if(tamanho < 10)
            {
                IO.println("ERRO: Telefone invalido. ");
                setErro(2);
            } //end
            else
            {
                //repetir ate' a posicao 5 para verificar
                for (i = 0; i < 5; i++)
                {
                    if(fone.charAt(i) < '0' || fone.charAt(i) > '9')
                    {
                        answer = false;
                        IO.println("ERRO: Telefone invalido. ");
                    } //end
                } //end repetir
                if(answer)
                {
                    if(fone.charAt(5) != '-')
                    {
                        answer = false;
                        IO.println("ERRO: Telefone invalido. ");
                    } //end
                    else
                    {
                        for(i = 6; i < 10; i++)
                        {
                            if(fone.charAt(i) < '0' ||
                                    fone.charAt(i) > '9')
                            {
                                answer = false;
                                IO.println("Telefone invalido. ");
                            } //end
                        } //end repetir
                        if(answer)
                        {
                            IO.println("Telefone valido. ");
                        } //end
                    } //end se
                } //end
            } //end se
        } //end se
        //retornar resposta
        return( answer );
    } //end checkFone( )

    /**
     * Metodo publico para testar essa nova caracteristica
     */

    public void getValidationFone()
    {
        //1. verificar existencia
        if( fone == null )
        {
            setErro(2);
        } //end
        else
        {
            checkFone("Telefone valido. ");
        } //end se
    } //end getValidationFone( )

    /**
     * Ler dados de arquivo, e armazenar em um objeto dessa classe.
     */

    public void fromFile(String fileName)
    {
        //1. definir dados
        FILE arquivo;
        String linha;

        //verificar se nome passado por param e' valido
        if( fileName == null )
        {
            IO.println("ERRO: Nome do arquivo e' invalido. ");
        } //end
        else
        {
            //criar o arquivo para receber o nome
            arquivo = new FILE(FILE.INPUT, fileName);

            //verificar se arquivo e' valido
            if( arquivo == null )
            {
                IO.println("ERRO: Arquivo invalido. ");
            } //end
            else
            {
                //tentar ler a primeira linha
                linha = arquivo.readln();

                //verificar se linha e' valida
                if( linha == null )
                {
                    IO.println("ERRO: Arquivo vazio. ");
                } //end
                else
                {
                    nome = linha;
                    //verificar se nome e' valido
                    if( nome == null )
                    {
                        IO.println("ERRO: Nome invalido. ");
                        setErro(1);
                    } //end
                    else
                    {
                        linha = arquivo.readln();
                        //fechar arquivo (indispensavel)
                        arquivo.close();
                        fone = linha;
                    } //end se
                } //end se
            } //end se
        } //end se
    } //end fromFile( )

    /**
     * Metodo para mostrar dados de arquivo
     */

    public void showContact( )
    {
        IO.println("Nome: " + nome);
        IO.println("Fone: " + fone);
        if(fone2 != null)
        {
            IO.println("Fone 2: " + fone2);
        } //end
    } //end showContact( )

    /**
     * Gravar dados de uma pessoa em arquivo, dado o nome do mesmo.
     */

    public void toFile(String fileName)
    {
        //1. definir dados
        FILE arquivo;
        String linha;
        int fAmount = 2; //tamanho do arquivo e' 2 porque e' o nome e telefone

        //verificar se o nome do arquivo e' valido
        if( fileName == null )
        {
            IO.println("ERRO: Nome do arquivo invalido. ");
        } //end
        else
        {
            //abrir arquivo para gravar
            arquivo = new FILE(FILE.OUTPUT, fileName);

            //verificar se arquivo e' valido
            if( arquivo == null )
            {
                IO.println("ERRO: Arquivo invalido. ");
            } //end
            else
            {
                //printar no arquivo
                arquivo.println(""+ fAmount);
                arquivo.println(""+ nome);
                arquivo.println(""+fone);
                //fechar arquivo (indispensavel)
                arquivo.close();
            } //end se
        } //end se
    } //end toFile( )

    /**
     * Metodo para saber quantos telefones estao associados a cada objeto.
     */

    public int telefones()
    {
        //1.definir dados
        int count  = 0;

        //verificar se fone e' valido
        if(fone != null)
        {
            count++;
        } //end
        if(fone2 != null)
        {
            count++;
        } //end

        //obtem a quantidade de telefones
        fAmount = count;
        IO.println("Quantidade de telefones associados: " + fAmount);

        //retornar contador
        return(fAmount);
    } //end telefones( )

    /**
     * obter quantidade total de telefones associada ha' objetos
     */

    public int getfAmount( )
    {
        return (fAmount);
    } //end getfAmount()

    /**
     * Metodo para atribuir o valor do segundo telefone.
     * Se o contato so tiver um telefone, perguntar se quer acrescentar mais
     * um numero, e mudar automaticamente a quantidade deles.
     */

    public void setFone2a(String message)
    {
        //1. definir dados
        char answer = 'a';

        //verificar se nome e' valido
        if( nome == null )
        {
             IO.println("ERRO: Nome invalido. ");
        } //end
        else
        {
            if(fone != null)
            {
                answer = IO.readchar("Deseja acrescentar outro numero? (S/n) ");
                while( answer != 'S' && answer != 's' &&
                       answer != 'N' && answer != 'n');
                if (answer == 'S' || answer == 's')
                {
                    fone2 = IO.readln(message);
                } //end
            } //end
        } //end se
    } //end read

    /**
     * Metodo para alterar o valor apenas do segundo telefone.
     * Se o contato nao tiver dois telefones, uma situacao de erro devera
     * ser indicada.
     */

    public void setFone2b()
    {
        char answer = 'a';
        //verificar se nome e' telefone sao validos
        if(nome == null || fone == null)
        {
            IO.println("ERRO: Nome e/ou fone invalidos. ");
        } //end
        else
        {
            //verificar se o telefone 2 e' invalido
            if(fone2 != null)
            {
                answer = IO.readchar("Deseja modificar o telefone 2? (S/n) ");
                if(answer == 's' || answer == 'S')
                {
                    fone2 = IO.readln("Informe o telefone 2 modificado: ");
                } //end
            } //end
        } //end se
    } //end setFone2b( )

    /**
     * Chamar metodo para remover apenas o valor do segundo telefone.
     */

    public void removeFone2c( )
    {
        //1. definir dados
        char answer = 'a';

        //verificar se nome e telefone sao validos
        if( nome == null || fone == null )
        {
            IO.println("ERRO: Nome e/ou telefone invalidos. ");
        } //end
        else
        {
            //verificar se o telefone 2 e' valido
            if( fone2 == null )
            {
                IO.println("ERRO: Telefone 2 vazio. ");
            } //end
            else
            {
                answer = IO.readchar("Deseja remover o telefone 2? (S/n) ");
                if(answer == 's' || answer == 'S')
                {
                    fone2 = null;
                } //end
            } //end se
        } //end se
    } //end removeFone2c( )

} //end class Contato
