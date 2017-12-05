/*
###########################
##    MAGIC SQUARE	 ##
###########################
*/

#include <stdio.h>

int main( ) {

	//definir dados
	int n;
	int i;
	int j;
	int valueM       = 0; //maior value na matrix
	int somaRows     = 0;
	int somaColumns  = 0;
	int somaDiagonal = 0;

	//ler variavel do teclado >> n <<
	scanf("%d", &n);

	//criar uma matriz de n por n values
	int matrix[ n ][ n ];


	//pecorrer a matriz
	for( i = 0; i < n; i++ ) //rows
	{
	    for( j = 0; j < n; j++ ) //columns
	    {
		scanf("%d", &matrix[i][j]);

		//tentar pegar o maior numero da matrix
		if( matrix[i][j] > valueM )
		{
		    valueM = matrix[i][j];
		} //end se
	    } //end repetir
	} //end repetir

	//somar a primeira linha da matrix
	for( i = 0; i < n; i++ )
	{
	    somaRows += matrix [ 0 ][ i ];
	} //end repetir

	//somar a primeira coluna
	for( i = 0; i < n; i++ )
	{
	   somaColumns += matrix [ i ][ 0 ];
	} //end repetir

	//somar a diagonal
	for( i = 0; i < n; i++ )
	{
	   somaDiagonal += matrix [ i ][ i ];
	} //end repetir

	//verificar se as somas sao iguais e se o maior valor e' o quadrado de n
	if(( somaRows == somaColumns    &&
	     somaRows == somaDiagonal ) &&
	     valueM   == n * n	      )
	{
	    printf("%d\n", somaRows);
	} //end
	else
	{
	   printf("0\n");
	} //end se
	return (0);
} //end main( )
