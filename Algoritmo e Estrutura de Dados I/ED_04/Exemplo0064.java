/**
* Exemplo0064
* Matricula: 613414
* @Matheus Santos Rosa Carneiro
* @Turno: Vespertino
* @version 04
*/

// ---------------------------------------------- dependencias
import IO.*;
// ---------------------------------------------- definicao da classe principal
public class Exemplo0064
{
// ---------------------------------------------- definicao de metodo auxiliar 01
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

// ---------------------------------------------- definicao de metodo auxiliar 02
public static void metodo02 ( )
{
// definir dados
String x;
int tamanho;

// identificar o metodo
IO.println ( "Metodo 02" );

// ler cadeia de caracteres do teclado
x = IO.readString ( "Entrar com uma cadeia de caracteres: " );
IO.println ( "Valor lido = " + x );

//obter tamanho da cadeia
tamanho = x.length( ); //calcular quantos caracteres foram digitados

//mostrar o tamanho da cadeia
IO.println( "tamanho de " + x + " = " + tamanho );

} // fim metodo02( )

// ---------------------------------------------- definicao de metodo auxiliar 03
public static void metodo03 ( )
{
// definir dados
String x;
int tamanho;
int posicao; 

// identificar o metodo
IO.println ( "Metodo 03" );

// ler cadeia de caracteres do teclado
x = IO.readString ( "Entrar com uma cadeia de caracteres: " );
IO.println ( "Valor lido = " + x );

//obter tamanho da cadeia
tamanho = x.length( ); //calcular quantos caracteres foram digitados

//mostrar o tamanho da cadeia
IO.println( "tamanho de " + x + " = " + tamanho );

//mostrar cada simbolo separadamente
for( posicao = 0; posicao < tamanho; posicao = posicao + 1 )
{
   IO.println( "posicao = " + posicao + " contem " + x.charAt( posicao ) );
} //fim repetir

} // fim metodo03( )

// ---------------------------------------------- definicao de metodo auxiliar 04
public static void metodo04 ( )
{
// definir dados
String x;
int tamanho;
int posicao; 

// identificar o metodo
IO.println ( "Metodo 04" );

// ler cadeia de caracteres do teclado
x = IO.readString ( "Entrar com uma cadeia de caracteres: " );
IO.println ( "Valor lido = " + x );

//obter tamanho da cadeia
tamanho = x.length( ); //calcular quantos caracteres foram digitados

//mostrar o tamanho da cadeia
IO.println( "tamanho de " + x + " = " + tamanho );

//mostrar cada simbolo separadamente
//em ordem INVERSA
for( posicao = tamanho - 1; posicao >= 0; posicao = posicao - 1 )
{
   IO.println( "posicao = " + posicao + " contem " + x.charAt( posicao ) );
} //fim repetir

} // fim metodo04( )



// ---------------------------------------------- definicao do metodo principal
/**
* main() – metodo principal
*/
public static void main ( String [ ] args )
{
// identificar
IO.println ( "EXEMPLO0064 - Programa em Java" );
IO.println ( "Autor: Matheus Santos Rosa Carneiro" );
// executar o metodo auxiliar

//metodo01 ( ); // tratar caracteres
//metodo02 ( ); 
//metodo03 ( );
metodo04 ( );

// encerrar
IO.pause ( "Apertar ENTER para terminar." );
} // fim main( )
} // fim class Exemplo0064

// ---------------------------- teste

// Exemplo0061 (OK)
// Exemplo0062 (OK)
// Exemplo0063 (OK) 
// Exemplo0064 (OK)