/**
* Exemplo0061
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @Turno: Vespertino
* @version 01
*/

// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0061
{
// ---------------------------------------------- definicao de metodo auxiliar
public static void metodo01 ( )
{
// definir dados
String x;
// identificar o metodo
IO.println ( "Metodo 01" );
// ler cadeia de caracteres do teclado
x = IO.readString ( "Entrar com uma cadeia de caracteres: " );
IO.println ( "Valor lido = " + x );
} // fim metodo01( )
// ---------------------------------------------- definicao do metodo principal
/**
* main() – metodo principal
*/
public static void main ( String [ ] args )
{
// identificar
IO.println ( "EXEMPLO0061 - Programa em Java" );
IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
// executar o metodo auxiliar
metodo01 ( ); // tratar caracteres
// encerrar
IO.pause ( "Apertar ENTER para terminar." );
} // fim main( )
} // fim class Exemplo0061

// ---------------------------- teste

// Exemplo0061 (OK)
//
// 