public class Lista03 {

    private static Scanner in = new Scanner (System.in);
    private static Random gerador = new Random();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    
            private static CFila ConcatenaFila(CFila F1, CFila F2) {

                //define data
                CFila F1maisF2 = new CFila();
                int amount, amount2;
                Object data, aux;

                /*
                while(amount > 0){
                    data = F1.desenfileira();
                    aux  = F2.desenfileira();
                    F1masF2.enfileira(data);
                    F1masF2.enfileira(aux);
                    amount--;
                }
                */

                //define amount F1
                amount  = F1.quantidade();
                while (amount > 0){
                    data = F1.desenfileira();
                    F1maisF2.enfileira(data);
                    amount--;
                } //end while

                //define amount F2
                amount2 = F2.quantidade();
                while (amount2 > 0){
                    aux = F2.desenfileira();
                    F1maisF2.enfileira(aux);
                    amount2--;
                } //end while

                //mostrar a fila concatenada
                F1maisF2.mostra();

                return (F1maisF2);
        } //end ConcatenaFila()

        private static void task05() throws IOException {

            //define data
            CFila f         = new CFila();
            CFila faux      = new CFila();
            Object in, in2;

            /*for(int i = 0; i < 5; i++) {
                System.out.println("Entre para in: ");
                in  = br.readLine();
                System.out.println("Entre para in2: ");
                in2 = br.readLine();
                f.enfileira(in);
                faux.enfileira(in2);
            } //end for
            */

            System.out.println("Entre com 5 valores para f: ");
            for (int i = 0; i < 5; i++) {
                in = br.readLine();
                f.enfileira(in);
            } //end for

            System.out.println("Entre com 5 valores para faux: ");
            for (int i = 0; i < 5; i++) {
                in2 = br.readLine();
                faux.enfileira(in2);
            } //end for

            //chamada do metodo concatena
            ConcatenaFila(f, faux);
        } //end task05()
    
        private static void invertePilha(CPilha P) {

            //define data
            CFila F = new CFila();
            int amount, amount2;
            Object data;

            //define amount P
            amount = P.quantidade();

            //unpack P to F
            while(amount > 0) {
                data = P.desempilha();
                System.out.println("[" + data + "]");
                F.enfileira(data);
                amount--;
            }//end while

            //define amount F
            amount2 = F.quantidade();

            //unpack F to P again
            while(amount2 > 0) {
                data = F.desenfileira();
                P.empilha(data);
                amount2--;
            } //end while
    } //end invertePilha(OK)

    private static void task18() throws IOException {
        CPilha P = new CPilha();
        Object in;

        System.out.println("\nEntre com 10 valores: ");

        for(int i = 0; i < 10; i++){
            in = br.readLine();
            System.out.println("Valor digitado: " + in);
            P.empilha(in);
        } //end for

        //chamada do metodo inverte pilha
        invertePilha(P);

        System.out.println("Elemento no topo: "+ P.peek());

    } //end task18(OK)

    private static void inverteFila(CFila F) {

        CPilha p = new CPilha();
        Object data;
        int amount, amount2;

        amount = F.quantidade();
        F.mostra();
        while(amount > 0){
            data = F.desenfileira();
            p.empilha(data);
            amount--;
        } //end while

        amount2 = p.quantidade();
        while (amount2 > 0){
            data = p.desempilha();
            F.enfileira(data);
            amount2--;
        } //end while
    } //end inverteFila(OK)

    private static void task19() throws IOException {

        CFila f = new CFila();
        Object in;

        System.out.println("\nEntre com 10 valores: ");

        for(int i = 0; i < 10; i++) {
            in = br.readLine();
            System.out.println("Valor digitado: "+ in);
            f.enfileira(in);
        } //end for

        //chamada do metodo para inverter
        inverteFila(f);

        //mostrar a fila invertida
        f.mostra();

        System.out.println("\nPrimeiro elemento da fila: "+ f.peek());
    } //end task19(OK)

    private static void FuraFila(CFila F, Object element) {
            //define data
            int amount = F.quantidade();
            CCelula aux = new CCelula();
            aux.prox = new CCelula(element, aux);
            aux      = aux.prox;
            F.enfileira(aux.item);
            while(amount > 0) {
                F.enfileira(F.desenfileira());
                amount--;
            }
    } //end FuraFila(OK)

    private static void task28() throws IOException {

        //define data
        CFila F = new CFila();
        Object data;
        System.out.println("Entre com 5 valores: ");
        for(int i = 0; i < 5; i++) {
            data = br.readLine();
            F.enfileira(data);
        } //end for

        System.out.println("\nFila antes de ser furada: ");
        F.mostra();

        System.out.println("\nEntre com o valor para furar fila: ");
        data = br.readLine();
        FuraFila(F, data);

        System.out.println("\nFila depois de ser furada: ");
        F.mostra();

    } //end task28(OK)

    private static void task29() throws IOException {
        //define data
        CFila F    = new CFila();
        Object in;

        System.out.println("Entre com 5 valores: ");

        //repeticao para enfileirar os elementos
        for(int i = 0; i < 5; i++) {
            in = br.readLine();
            F.enfileira(in);
        } //end for

        System.out.println("Fila antes de ser furada: ");
        F.mostra();

        System.out.println("Entre com algum elemento para furar a fila: ");
        in = br.readLine();
        F.cutTheQueue(in);

        System.out.println("Fila apos ser furada: ");
        F.mostra();
    } //end task29(OK)
    
    public static void main(String [] args) throws IOException {

        System.out.println("Lista03 - Programa em Java");
        System.out.println("Autor: Matheus Santos Rosa Carneiro.");


        int option;

        do {

            System.out.println("\nOpcoes: ");
            System.out.println();
            System.out.println("00 - break");
            System.out.println("01 - task01 - 02 - task02");
            System.out.println("03 - task03 - 04 - task04");
            System.out.println("05 - task05 - 06 - task06");
            System.out.println("07 - task07 - 08 - task08");
            System.out.println("09 - task09 - 10 - task10");
            System.out.println("11 - task11 - 12 - task12");
            System.out.println("13 - task13 - 14 - task14");
            System.out.println("15 - task15 - 16 - task16");
            System.out.println("17 - task17 - 18 - task18");
            System.out.println("19 - task19 - 20 - task20");
            System.out.println("21 - task21 - 22 - task22");
            System.out.println("23 - task23 - 24 - task24");
            System.out.println("25 - task25 - 26 - task26");
            System.out.println("27 - task27 - 28 - task28");
            System.out.println("29 - task29 - 30 - task30");
            System.out.println("31 - task31 - 32 - task32");

            System.out.println("\nEntre com a opcao desejada: ");
            option = in.nextInt();
            switch (option) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    task03();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    task07();
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    task18();
                    break;
                case 19:
                    task19();
                    break;
                case 20:
                    break;
                case 21:
                    break;
                case 22:
                    break;
                case 23:
                    break;
                case 24:
                    break;
                case 25:
                    break;
                case 26:
                    break;
                case 27:
                    break;
                case 28:
                    task28();
                    break;
                case 29:
                    task29();
                    break;
                case 30:
                    break;
                case 31:
                    break;
                case 32:
                    task32();
                    break;
                    default:
                        System.out.println("ERROR: Opcao invalida. ");
                        break;
            } //end switch
        } while (option != 0);
        System.exit(0);
    }  //end main()
} //end class Lista03

class CFila {

   // question 29
   // Insere o elemento no inicio da fila
   //@param element - elemento a ser adicionado
   public void cutTheQueue (Object element) {
      if(frente != tras) { //verificar se ha elementos
         frente.prox = new CCelula(element, frente.prox);
         qtde++;
      } //end if
   } //end cutTheQueue()
} //end class CFila
    
