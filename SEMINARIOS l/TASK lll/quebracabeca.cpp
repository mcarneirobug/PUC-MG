#include<stdio.h>

int main( ){

	//definicao de dados
	int pecas[1000];
	int x;
	int n;
	int i;
	int z = 0;

	scanf( "%d", &n );

	//numeros de pecas
	for(i = 0; i < n; i++)
	{
	   //em cada posicao ficam com o valor 0
	    pecas[i] = 0;
	} //end repetir
	for(i = 0; i < n-1; i++)
	{
	    scanf("%d", &x);
	    pecas[x-1] = x;
	}
	i = 0;
	do {
		if(pecas[i] == 0)
		{
		    printf("%d", i+1);
		    z = 1;
		} //end se
		i++;
	} while(z == 0);
	return 0;
} //end main( )
