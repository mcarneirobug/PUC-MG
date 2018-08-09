/* Dependencias */

import java.io.IOException;
import java.util.*;

/* Definicao da classe principal */

public class Lista0 {


    /* metodo global scanner para manipular variaveis */
    public static Scanner in = new Scanner (System.in);

    /* definicao do metodo principal  */
    public static void main ( String [] args ) throws IOException {

        /* Definicao de variaveis */

        String nome        = "";
        String sexo        = "";
        int idade          = 0;
        int contadorM      = 0;
        int contadorF      = 0;
        double porcentagem = 0.0;
        double altura      = 0.0;
        double peso        = 0.0;
        double IMC         = 0.0;

        System.out.println("Insira a quantidade de pessoas: ");
        int quantidade = in.nextInt();

        /* Repetir enquanto numero de pessoas for maior que 0 */
        while ( quantidade > 0 ) {

            System.out.println("\nInforme seu nome: ");
            nome = in.next();

            System.out.println("Informe sua idade: ");
            idade = in.nextInt();

            System.out.println("Informe sua altura: ");
            altura = in.nextDouble();

            System.out.println("Informe seu peso: ");
            peso = in.nextDouble();

            System.out.println("Informe seu sexo [F/M]: ");
            sexo = in.next();

            if(sexo.equals("f")) {
                contadorF++;
            } //end se (1)
            else if (sexo.equals("F")) {
                contadorF++;
            } //end else se (2)

            /* segundo caso se for masculino */
            else if(sexo.equals("m")) {
                contadorM++;
            } //end else se (3)
            else if(sexo.equals("M")) {
                contadorM++;
            } //end else se (4)

            /* Equacao responsavel por calcular o imc */
            IMC = (peso/Math.pow(altura, (int)2));
            System.out.printf("Seu IMC = %.2f %n", IMC);

            /* Condicional para calcular a porcentagem de mulheres abaixo do imc ideal */
            if ( IMC < 20.0 ) {
                if (sexo.equals("f") || sexo.equals("F")) {
                    porcentagem = (100.0 * contadorF)/100.0; /* multiplique a porcentagem pelo valor e divida por 100 */
                } //end se
            } //end se

            if ( sexo.equals("M") && sexo.equals("m")) {
                if (idade > 0 && idade < 120) {
                    //System.out.println("Homem mais velho: " + nome +", "+ idade + " anos.");
                } //end se (second)
            } //end se (main)

            if( sexo.equals("F") && sexo.equals("f")) {
                if(idade > 0 && idade < 120) {
                    //System.out.println("Mulher mais velha: " + nome + ", "+ idade + " anos.");
                } //end se (second)
            } //end se (main)

            /* para nao dar looping */
            quantidade--;
        } //end while

        /* b.) Qtde de homens e mulheres estrevistados */
        System.out.println("\nQuantidade de H entrevistados: " + contadorM);
        System.out.println("Quantidade de M entrevistadas: " + contadorF);

        /* c.) Percentual de mulheres com peso abaixo do ideal (IMC < 20 ) entre todas entrevistadas */
        System.out.println("\nPercentual de mulheres com peso abaixo do ideal: "+ (int)porcentagem + "%");

        /* d. Nome do homem mais velho e da mulher mais velha, e respectivas idades */

        System.out.println("Homem mais velho: " + nome +", "+ idade + " anos.");
        System.out.println("Mulher mais velha: " + nome + ", "+ idade + " anos.");
    } //end main
} //end class
