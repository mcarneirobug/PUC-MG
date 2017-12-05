#include <stdio.h>

int main( ) {

    //definir dados
    int n;
    int tam;
    int contador = 0;

    scanf("%d", &n);

    for(int i = 0; i < n; i++)
    {
        scanf("%d", &tam);
	//pega os tamanhos e subtrai -1 de todos
	contador = contador + tam - 1;
    } //end repetir

/*
* printa na tela o numero de pedacos armazenados
*/
    printf("%d", contador);

    /* retornar */

    return 0;
} //end main( )


