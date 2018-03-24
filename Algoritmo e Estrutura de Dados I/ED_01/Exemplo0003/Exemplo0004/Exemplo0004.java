/**
*PUC MINAS - Pontifica Universidade Catolica de Minas Gerais
* Exemplo0004
* AED - Algoritmos e Estrutura de Dados
* @Matheus Santos Rosa Carneiro
* Matricula: 613414
* Turno: Vespertino
* @version 02
*/

// ---------------------------------------------- dependencias

import IO.*;

// ---------------------------------------------- definicao da classe principal
public class Exemplo0004
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

IO.println ( "EXEMPLO0004 - Programa em Java" );
IO.println ( "Autor: ________________________" );

// x = 5; //atribuir novo valor ao dado

IO.println ( "x (inicial)= " + x); //exibir valor do dado antes de modificar

x = 5;   //atribuir valor ao dado 

IO.println ( "x (atual) = " + x); //exibir valor do dado depois de modificar

IO.pause ( "Apertar ENTER para terminar." ); //erro 

} // fim main( )
} // fim class Exemplo0004

/**
Erro " `` " acentos, ao inves de aspas duplas


   Exemplo0001.java:30: error: not a statement
   IO.pause ( ôApertar ENTER para terminar.ö ); 
*/


// ---------------------------------------------- documentacao complementar
// Mudança de versão 
// Mudança de nome classe principal
// Compilando normalmente, sem nenhum erro 
// Definicao de dados sem nenhum erro
// Atribuicao de novos dados, sem nenhum erro
// ---------------------------------------------- historico
//
// Versao Data    Modificacao
// 0.1   09/08    esboco
// 0.2   09/08    mudança de versao    
// 0.2   09/08    deficao de dados 
// 0.2   09/08    atribuicao de novos dados
// ---------------------------------------------- testes
//
// Versao   Teste
// 0.1      01. (OK) identificacao de programa
// 0.2      01. (OK) identificacao de programa
//          02. (OK) deficao de dados 
//          03. (OK) atribuicao de novos dados
//          04. (OK) introducao de dado inteiro