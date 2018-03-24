package TarefaExtrax;

import IO.*;
import java.util.Scanner;

public class TarefaExtra {

    static Scanner input = new Scanner (System.in);
     
    public static void Tarefa01()
    {
        //definir dados
        int lin, col;
        int i, j;
        boolean answer = false;
        Matriz t1 = null;
        
        System.out.println("Digite a quantidade de linhas: ");
        lin = input.nextInt();
        
        System.out.println("Digite a quantidade de colunas: ");
        col = input.nextInt();
        
        //verificar 
        if(lin <= 0 || col <= 0)
        {
            System.out.println("Quantidade de linhas e/ou colunas invalida. ");
        } //end
        else
        {
            //criar matriz se for valido 
            t1 = new Matriz(lin, col);
            
            //verificar se matriz e' valida
            if(t1 == null)
            {
                System.out.println("ERRO: Matriz t1 e' invalida. ");
            } //end
            else
            {
                //entrar com dados 
                t1.readMatriz("Entre com dados na matriz: ");
                //mostrar matriz
                t1.printMatriz();
                //chamar funcao lt
                answer = t1.lt();
                if(answer)
                {
                    System.out.println("Matriz e' triangular inferior. ");
                } //end
                else
                {
                    System.out.println("Matriz nao e' triangular inferior. ");
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end Tarefa01()
    
    public static void Tarefa02()
    {
         //definir dados
        boolean answer = false;
        int lin, col;
        Matriz t2 = null;
        
        //ler do teclado a quantidade de linhas
        System.out.println("Digite a quantidade de linhas: ");
        lin = input.nextInt();
        
        //ler do teclado a quantidade de colunas
        System.out.println("Digite a quantidade de colunas: ");
        col = input.nextInt();
        
        //verificar se sao validos
        if( lin <= 0 || col <= 0 )
        {
            System.out.println("Quantidade(s) invalidas. ");
        } //end
        else
        {
            //criar matriz se a quantidade for valida
            t2 = new Matriz(lin, col);
            
            //verificar se Matriz t2 e' valida
            if(t2 == null)
            {
                System.out.println("ERRO: Matriz t2 e' invalida. ");
            } //end
            else
            {
                //entrar com dados
                t2.readMatriz("Entre com dados na matriz:");
                //mostrar matriz
                t2.printMatriz();
                //chamar funcao
                answer = t2.ut();
                if(answer)
                {
                    System.out.println("Matriz e' triangular superior. ");
                } //end
                else
                {
                    System.out.println("Matriz nao e' triangular superior. ");
                } //end se
            } //end se
        } //end se
        //encerrar
        IO.pause("Aperte ENTER para continuar. ");
    } //end Tarefa02()
    
    
    /**
     * @param args the command line arguments 
     */
    
    public static void main(String[] args) {
       
        //definir dados
        int opcao = 0;
        
        do {
            //identificar
            System.out.println("Author: Matheus Santos Rosa Carneiro. ");
            System.out.println("TarefaExtra - Programa feito em Java");
            System.out.println(); //saltar linha
            System.out.println("--------------------------------");
            System.out.println("|1 - Tarefa 01 | 2 - Tarefa 02 |");
            System.out.println("|\t0 - parar...           |");
            System.out.println("--------------------------------");
            
            //ler do teclado a opcao
            System.out.println("Digite a opcao: ");
            opcao = input.nextInt();
           switch(opcao)
           {
               case 0:
                   break;
               case 1:
                   Tarefa01();
                   break;
               case 2:
                   Tarefa02();
                   break;
               default: 
                   System.out.println("ERRO: Opcao invalida. ");
                   break;
           } //end escolher
        } //end do while()
        while(opcao != 0);
    } //end main()
} //end class TarefaExtra
