/**
*PUC MINAS - Pontifica Universidade Catolica de Minas Gerais
* Exemplo0003
* AED - Algoritmos e Estrutura de Dados
* @Matheus Santos Rosa Carneiro
* Matricula: 613414
* Turno: Vespertino
* @version 02
*/

// ---------------------------------------------- dependencias

import IO.*;

// ---------------------------------------------- definicao da classe principal
public class Exemplo0003
{

// ---------------------------------------------- definicao de metodos

// ---------------------------------------------- definicao do metodo principal

/**
* ## main() – metodo principal ##
*/
public static void main ( String [ ] args )
{
//deficao de dados (colocar deficao de dados proximo aos metodos ou da classe)
int x = 0; //valor inicial definido 

IO.println ( "EXEMPLO0003 - Programa em Java" );
IO.println ( "Autor: ________________________" );

IO.println ( "x= " + x); //exibir valor do dado de x

IO.pause ( "Apertar ENTER para terminar." ); //erro 

/**
Erro " `` " acentos, ao inves de aspas duplas


   Exemplo0001.java:30: error: not a statement
   IO.pause ( ôApertar ENTER para terminar.ö ); 
*/

} // fim main( )
} // fim class Exemplo0003

// ---------------------------------------------- documentacao complementar
// Mudança de versão 
// Mudança de nome classe principal
// Compilando normalmente, sem nenhum erro. 
// Definicao de dados sem nenhum erro. 
// ---------------------------------------------- historico
//
// Versao Data    Modificacao
// 0.1   09/08    esboco
// 0.2   09/08    mudança de versao    
//       09/08    deficao de dados 
// ---------------------------------------------- testes
//
// Versao   Teste
// 0.1      01. (OK) identificacao de programa
// 0.2      01. (OK) identificacao de programa
//          02. (OK) deficao de dados 